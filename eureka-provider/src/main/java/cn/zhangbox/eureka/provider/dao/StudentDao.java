package cn.zhangbox.eureka.provider.dao;

import cn.zhangbox.eureka.provider.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
  *  Mapper 接口
 * </p>
 *
 * @author zhangyuan
 * @since 2017-07-06
 */
public interface StudentDao {

	List<Student> getStudentList(@Param("sname")String sname, @Param("age")Integer age);

}