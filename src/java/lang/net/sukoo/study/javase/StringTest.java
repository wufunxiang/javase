package net.sukoo.study.javase;

import org.junit.Test;

public class StringTest {

	@Test
	public void testStringFormat() {
		byte[] bytes = "2343abcdÎâ·¼Ïé£¡£¡".getBytes();
		StringBuilder sb = new StringBuilder();
		for (byte b : bytes)
			sb.append(String.format("%2X", b));
		System.out.println(sb);
	}

}
