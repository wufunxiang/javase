/*
 * @(#) M_SMapperTest.java  2012-6-24
 *
 * Copyright 2012  woodman @ http://www.sukoo.net 
 *   All rights reserved.
 */
package net.sukoo.study.mybatis;

import org.junit.Test;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;

/**
 * @author <a href="mailto:wufunxiang@gmail.com">woodman</a>
 * <hr/>
 * ����:
 */
public class M_SMapperTest {

	
	@Test
	public void testFactory(){
		SqlSessionFactoryBean factory= new SqlSessionFactoryBean();
//		factory.
		
	}
	@Test
	public void testMapper(){
		System.out.println(getClass().getPackage().getName());
		MapperScannerConfigurer conf= new MapperScannerConfigurer();
		conf.setBasePackage(getClass().getPackage().getName());
		
		
	}
}
