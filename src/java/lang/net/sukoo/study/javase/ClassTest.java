/*
 * @(#) ClassTest.java  2012-6-14
 *
 * Copyright 2012  woodman  
 *   All rights reserved.
 */
package net.sukoo.study.javase;

import org.junit.Test;

/**
 * @author <a href="mailto:wufunxiang@gmail.com">woodman</a>
 * 
 *         功能:
 */
public class ClassTest extends WfxTest {

	@Test
	public void test1() {
		System.out.println(this.getClass().getSuperclass());
		System.out.println(Object.class.getSuperclass());
	}
}
