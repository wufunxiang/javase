package net.sukoo.study.javase;

import org.junit.Test;

public class LongTest {

	@Test
	public void testLongBaseInfo() {
		System.out.println(String.valueOf(Long.MAX_VALUE).length());
		System.out.println(Long.MAX_VALUE / (1000000000L * 3600 * 24 * 365));
	}
}
