/*
 * @(#) HiTest.java  2012-6-16
 *
 * Copyright 2012  woodman  
 *   All rights reserved.
 */
package net.sukoo.study.guice.demo1;

import org.junit.Test;

import com.google.inject.Binder;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;

/**
 * @author <a href="mailto:wufunxiang@gmail.com">woodman</a>
 *         <hr/>
 *         功能:
 */
public class HiTest {

	@Test
	public void testSayHi() {
		Injector inj = Guice.createInjector(new Module() {
			@Override
			public void configure(Binder binder) {
				binder.bind(IHi.class).to(HiImpl.class);
				// binder.bind(HiImpl2.class).to(HiImpl2.class);
			}
		});
		IHi hw = inj.getInstance(IHi.class);
		hw.sayHi();
		IHi hw2 = inj.getInstance(IHi.class);
		System.out.println(hw == hw2);

	}

	@Test
	public void testDefalut() {
		Injector inj = Guice.createInjector();

		NoName d = inj.getInstance(NoName.class);
		System.out.println(d.getClass().getName());
		d.list();
	}

	@Test
	public void testInstance() {
		Injector inj = Guice.createInjector(new Module() {
			@Override
			public void configure(Binder binder) {
				binder.bind(IHi.class).toInstance(new IHi() {
					@Override
					public void sayHi() {
						System.out.println(this.getClass().getName());
					}
				});
			}
		});
		IHi hw = inj.getInstance(IHi.class);
		IHi hw2 = inj.getInstance(IHi.class);
		hw.sayHi();
		System.out.println(hw == hw2);
	}

	@Test
	public void testAnnotation() {
		Injector inj = Guice.createInjector();
		xx2 hw = inj.getInstance(xx2.class);
		hw.xxx();
	}
}

// @ImplementedBy(value = xx2.class)
interface xxxx {
	void xxx();
}

class xx implements xxxx {

	public void xxx() {
		System.out.println("xxx");
	}

}

class xx2 {

	public void xxx() {
		System.out.println("xx2");
	}

}