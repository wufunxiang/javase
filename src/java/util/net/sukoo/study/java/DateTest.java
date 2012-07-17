package net.sukoo.study.java;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import javax.xml.ws.Endpoint;

import org.apache.commons.lang.time.DateUtils;
import org.junit.BeforeClass;
import org.junit.Test;

public class DateTest {

	@BeforeClass
	public static void beforeClass() {
		TimeZone.setDefault(TimeZone.getTimeZone("GMT+8:00"));
	}

	private DateFormat df = new SimpleDateFormat("HH:mm:ss");
	private DateFormat df2 = new SimpleDateFormat("yyyyMMdd");

	@Test
	public void testDate1() {
		System.out.println(df.format(new Date()));
		Endpoint ddd = Endpoint.publish("", "");
//		ddd.
	}
	@Test
	public void testDate2() throws ParseException {
		System.out.println(df.parse("23:59:59").getTime());
		System.out.println(24L*60*60*1000);
		System.out.println(df2.parse(df2.format(new Date())).getTime());
		//10 4 15
	}
}
