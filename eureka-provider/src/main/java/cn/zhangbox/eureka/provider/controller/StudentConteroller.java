package cn.zhangbox.eureka.provider.controller;

import cn.zhangbox.eureka.provider.service.StudentService;
import cn.zhangbox.eureka.provider.entity.Student;
import com.alibaba.fastjson.JSON;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by zhangyuan on 2018/07/06
 */
@Controller
@RequestMapping("/student")
@Api(value = "eureka-provider", description = "学生查询接口")
public class StudentConteroller {
    private static final Logger LOGGER = LoggerFactory.getLogger(StudentConteroller.class);

    @Autowired
    protected StudentService studentService;

    /**
     * 查询所有的学生信息
     *
     * @param sname
     * @param age
     * @param modelMap
     * @return
     */
    @ResponseBody
    @GetMapping("/list")
    public String list(
                    @ApiParam(value = "学生姓名") @RequestParam(required = false) String sname,
                    @ApiParam(value = "年龄") @RequestParam(required = false) Integer age,
                       ModelMap modelMap) {
        String json = null;
        try {
            List<Student> studentList = studentService.getStudentList(sname, age);
            modelMap.put("ren_code", "0");
            modelMap.put("ren_msg", "查询成功");
            modelMap.put("studentList", studentList);
            json = JSON.toJSONString(modelMap);
        } catch (Exception e) {
            e.printStackTrace();
            modelMap.put("ren_code", "0");
            modelMap.put("ren_msg", "查询失败===>" + e);
            LOGGER.error("查询失败===>" + e);
            json = JSON.toJSONString(modelMap);
        }
        return json;
    }
}
