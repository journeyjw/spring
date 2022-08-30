package com.itwill.user.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itwill.user.UserDao;

public class UserDaoImplMyBatisMapperInterfaceTestMain {

	public static void main(String[] args)throws Exception {
		System.out.println("-----Spring Container초기화시작[ApplicationContext객체생성시작]------------------");
		ApplicationContext applicationContext=
				new ClassPathXmlApplicationContext("com/itwill/user/user_dao_mybatis_mapper_interface.xml");
		System.out.println("-----Spring Container초기화끝[ApplicationContext객체생성끝]--------------------");
		UserDao userDao=(UserDao)applicationContext.getBean("userDao");
		System.out.println("----findUser----");
		System.out.println(userDao.findUser("guard1"));
		System.out.println("----findUserList----");
		System.out.println(userDao.findUserList());
		System.out.println("----create----");
		System.out.println("----update----");
		System.out.println("----remove----");
		System.out.println("----existedUser----");
	}
}
