package com.mybatis3.deep;




import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


import com.mybatis3.domain.Student;

public class MyBatisMapperInterfaceFlowMain {

	public static void main(String[] args) throws Exception{
		/*
		 * 0.mybatis-config-mapper-interface.xml --> InputStream
		 */
		InputStream mybatisConfigInputStream = 
				Resources.getResourceAsStream("mybatis-config-mapper-interface.xml");
		/*
		 * 1. SqlSessionFactoryBuilder
		 */
		SqlSessionFactoryBuilder sqlSessionFactoryBuilder=new SqlSessionFactoryBuilder();
		/*
		 * 2. SqlSessionFactory
		 */
		SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(mybatisConfigInputStream);
		/*
		 * 3. SqlSession open
		 */
		SqlSession sqlSession=sqlSessionFactory.openSession();
		/*
		 * autocommit true
		 */
		/*
		 * 4. StudentMapper[MapperInterface]객체생성
		 */
	
			/*
			org.apache.ibatis.binding.MapperProxy
			 */
		/*
		 * 5. StudentMapper[MapperInterface]객체사용[CRUD]
		 */
		/*
		 * 5. SqlSession close
		 */
		
	}
}













