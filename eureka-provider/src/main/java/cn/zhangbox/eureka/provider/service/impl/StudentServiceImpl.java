package cn.zhangbox.eureka.provider.service.impl;

import cn.zhangbox.eureka.provider.dao.StudentDao;
import cn.zhangbox.eureka.provider.service.StudentService;
import cn.zhangbox.eureka.provider.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wangl
 * @since 2017-07-06
 *
 */
@Service("StudentService")
@Transactional(readOnly = true, rollbackFor = Exception.class)
public class StudentServiceImpl implements StudentService {

	@Autowired
    StudentDao studentDao;

	@Override
	public List<Student> getStudentList(String sname, Integer age) {
		return studentDao.getStudentList(sname,age);
	}
}
