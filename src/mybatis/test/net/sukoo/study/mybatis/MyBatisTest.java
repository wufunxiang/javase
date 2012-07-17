/*
 * @(#) MyBatisTest.java  2012-6-24
 *
 * Copyright 2012  woodman @ http://www.sukoo.net 
 *   All rights reserved.
 */
package net.sukoo.study.mybatis;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.ibatis.builder.StaticSqlSource;
import org.apache.ibatis.builder.xml.XMLMapperBuilder;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.SqlSource;
import org.apache.ibatis.parsing.XNode;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;
import org.junit.Test;

import com.jolbox.bonecp.BoneCP;
import com.jolbox.bonecp.BoneCPConfig;
import com.jolbox.bonecp.BoneCPDataSource;

/**
 * @author <a href="mailto:wufunxiang@gmail.com">woodman</a>
 *         <hr/>
 *         ¹¦ÄÜ:
 */
public class MyBatisTest {

	private DataSource getDS() {

		BoneCPDataSource ds = new BoneCPDataSource();
		ds.setDriverClass("com.mysql.jdbc.Driver");
		ds.setJdbcUrl("jdbc:mysql://localhost:3306/db_wufx");
		ds.setUsername("root");
		ds.setPassword("1234");
		return ds;
	}

	@Test
	public void test2() throws IOException {
		Reader reader = Resources
				.getResourceAsReader("net/sukoo/study/mybatis/conf.xml");
		SqlSessionFactory sqlMapper = new SqlSessionFactoryBuilder()
				.build(reader);
		SqlSession session = sqlMapper.openSession(false);

		Configuration ddd = sqlMapper.getConfiguration();
		Object ss = ddd.getVariables().get("dialect");
		System.out.println(ss);
		Connection c = session.getConnection();
		System.out.println(session.getClass());
		Object dddd = session.selectOne("sukoo.test");
		System.out.println(dddd.getClass().getName());
	}

	@Test
	public void testXX() throws IOException {
		Reader reader = Resources
				.getResourceAsReader("net/sukoo/study/mybatis/conf.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder()
				.build(reader);
		Properties ddd = sqlSessionFactory.getConfiguration().getVariables();
		System.out.println(ddd);
	}

	public void test1() throws IOException {

		TransactionFactory transactionFactory = new JdbcTransactionFactory();
		Environment env = new Environment(this.getClass().getName(),
				transactionFactory, getDS());
		Configuration conf = new Configuration(env);
		String url = "net/sukoo/study/mybatis/TMapper.xml";
		File f = Resources.getResourceAsFile(url);
		url = new File(f.getCanonicalPath()).toURI().toURL().toString();
		InputStream inputStream = Resources.getUrlAsStream(url);
		XMLMapperBuilder mapperParser = new XMLMapperBuilder(inputStream, conf,
				url, conf.getSqlFragments());
		mapperParser.parse();

		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder()
				.build(conf);
		SqlSession session = sqlSessionFactory.openSession(false);

		// session.se
		Connection c = session.getConnection();
		System.out.println(session.getClass());
		Object dddd = session.selectOne("sukoo.test");
		System.out.println(dddd.getClass().getName());

		// conf.get
		Collection<MappedStatement> sqls = conf.getMappedStatements();
		Iterator<MappedStatement> iter = sqls.iterator();
		while (iter.hasNext()) {
			MappedStatement mappedStatement = (MappedStatement) iter.next();
			SqlSource src = mappedStatement.getSqlSource();
			System.out.println(src.getClass());
			String s = src.getBoundSql(null).getSql();

			System.out.println(s);
		}
	}

}
