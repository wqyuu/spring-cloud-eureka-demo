package cn.zhangbox.eureka.provider.service;

import cn.zhangbox.eureka.provider.entity.Student;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author zhangyuan
 * @since 2018-07-06
 */
public interface StudentService {

    /**
     * 查询所有的学生信息
     *
     * @param sname
     * @param age
     * @return
     */
    List<Student> getStudentList(String sname, Integer age);
}
