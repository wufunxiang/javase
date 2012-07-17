/*
 * @(#) IHi.java  2012-6-16
 *
 * Copyright 2012  woodman  
 *   All rights reserved.
 */
package net.sukoo.study.guice.demo1;

/**
 * @author <a href="mailto:wufunxiang@gmail.com">woodman</a>
 *
 * 功能:
 */
public class HiImpl implements IHi {

	/* (non-Javadoc)
	 * @see net.sukoo.study.guice.demo1.Hi#sayHi()
	 */
	@Override
	public void sayHi() {
		// TODO Auto-generated method stub
		System.out.println("hi wufunxiang");
	}

}
class HiImpl2 implements IHi {

	/* (non-Javadoc)
	 * @see net.sukoo.study.guice.demo1.Hi#sayHi()
	 */
	@Override
	public void sayHi() {
		// TODO Auto-generated method stub
		System.out.println("hi wufunxiang 2");
	}

}
class NoName{
	/**
	 * 
	 */
	public void list() {
		System.out.println("list");
	}
}