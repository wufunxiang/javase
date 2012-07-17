/*
 * @(#) WfxTest.java  2012-6-14
 *
 * Copyright 2012  woodman  
 *   All rights reserved.
 */
package net.sukoo.study.javase;

import org.junit.After;
import org.junit.Before;

/**
 * @author <a href="mailto:wufunxiang@gmail.com">woodman</a>
 * 
 *         功能:
 */
public class WfxTest {

	@Before
	public void before() {
		System.out.println("before");
	}

	@After
	public void after() {
		System.out.println("after");

	}
}
