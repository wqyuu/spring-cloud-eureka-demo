package cn.zhangbox.eureka.consumer.controller;

import cn.zhangbox.eureka.consumer.service.StudentConsumerService;
import com.alibaba.fastjson.JSON;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

/**
 * Created by zhangyuan on 2018/07/06
 */
@Controller
@RequestMapping("/student")
@Api(value = "eureka-consumer", description = "学生查询接口")
public class StudentConteroller {
    private static final Logger LOGGER = LoggerFactory.getLogger(StudentConteroller.class);

    @Autowired
    StudentConsumerService studentService;

    /**
     * 查询所有的学生信息
     *
     * @param sname
     * @param age
     * @param modelMap
     * @return
     */
    @ResponseBody
    @GetMapping("/consumer/list")
    public String list(
            @ApiParam(value = "学生姓名") @RequestParam(required = false) String sname,
            @ApiParam(value = "年龄") @RequestParam(required = false) Integer age,
            ModelMap modelMap) {
        String json = null;
        try {
            json = studentService.getStudentList(sname, age);
        } catch (Exception e) {
            e.printStackTrace();
            modelMap.put("ren_code", "0");
            modelMap.put("ren_msg", "查询失败===>" + e);
            LOGGER.error("查询失败===>" + e);
            json = JSON.toJSONString(modelMap);
        }
        return json;
    }
    @ResponseBody
    @RequestMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
        return studentService.hello(name);
    }
}
