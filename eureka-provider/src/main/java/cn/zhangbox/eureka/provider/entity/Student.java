package cn.zhangbox.eureka.provider.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author wangl
 * @since 2017-10-31
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Student {

    private static final long serialVersionUID = 1L;

	/**
     * 主键id
     */
	private Integer sno;
    /**
     * 学生姓名
     */
	private String sname;
    /**
     * 性别
     */
	private Integer sex;
    /**
     * 生日
     */
	private Date birth;
    /**
     * 年龄
     */
	private Integer age;
    /**
     * 简介
     */
	private String dept;

}
