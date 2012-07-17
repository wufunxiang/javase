/*
 * @(#) ServerSocketTest.java  2012-6-14
 *
 * Copyright 2012  woodman  
 *   All rights reserved.
 */
package net.sukoo.study.javase;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import org.junit.Test;

import com.google.common.net.InetAddresses;

/**
 * @author <a href="mailto:wufunxiang@gmail.com">woodman</a>
 * 
 */
public class ServerSocketTest extends WfxTest {

	@Test
	public void test1() throws IOException {
		String ip = "0.0.0.0";
		ServerSocket serverSocket = new ServerSocket(12345, 100,
				InetAddresses.forString(ip));
		Socket s = serverSocket.accept();
		System.out.println("dddd");
	}

	@Test
	public void test2() throws IOException {
		String ip = "192.168.1.14";
		ServerSocket serverSocket = new ServerSocket(12345, 100,
				InetAddresses.forString(ip));
		Socket s = serverSocket.accept();
		System.out.println("dddd");
	}
}
