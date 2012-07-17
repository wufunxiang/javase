/*
 * @(#) JsonLibTest.java  2012-6-19
 *
 * Copyright 2012  woodman  
 *   All rights reserved.
 */
package net.sukoo.study.json;

import net.sf.json.JSON;
import net.sf.json.xml.XMLSerializer;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

import net.sf.json.JSON;
import net.sf.json.JSONArray;
import net.sf.json.JSONException;
import net.sf.json.JSONFunction;
import net.sf.json.JSONNull;
import net.sf.json.JSONObject;
import net.sf.json.util.JSONUtils;
import nu.xom.Attribute;
import nu.xom.Builder;
import nu.xom.Document;
import nu.xom.Element;
import nu.xom.Elements;
import nu.xom.Node;
import nu.xom.Serializer;
import nu.xom.Text;

import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @author <a href="mailto:wufunxiang@gmail.com">woodman</a>
 *         <hr/>
 *         功能:
 */
public class JsonLibTest {

	public static void main(String[] args) {
		String xml = "<ROOT><mac>00-50-56-AE-00-1F</mac><items class=\"array\">"
				+ "<d><transtype>A018001</transtype><tellerno>2360653</tellerno><bankno>104</bankno><netno>236109</netno><dealtime>201206180000</dealtime><busno>12061880001207</busno><accounttype>A05</accounttype><dealnum>20120607693361193509</dealnum><supaccount>232523454235243543252435</supaccount><dealsum type=\"number\">248474.00</dealsum></d>"
				+ "<d><transtype>A018001</transtype><tellerno>2360653</tellerno><bankno>104</bankno><netno>236109</netno><dealtime>201206180000</dealtime><busno>12061880001207</busno><accounttype>A05</accounttype><dealnum>20120607693361193509</dealnum><supaccount>232523454235243543252435</supaccount><dealsum type=\"number\">248474.00</dealsum></d>"
				+ "<d><transtype>A018001</transtype><tellerno>2360653</tellerno><bankno>104</bankno><netno>236109</netno><dealtime>201206180000</dealtime><busno>12061880001207</busno><accounttype>A05</accounttype><dealnum>20120607693361193509</dealnum><supaccount>232523454235243543252435</supaccount><dealsum type=\"number\">248474.00</dealsum></d>"
				+ "<d><transtype>A018001</transtype><tellerno>2360653</tellerno><bankno>104</bankno><netno>236109</netno><dealtime>201206180000</dealtime><busno>12061880001207</busno><accounttype>A05</accounttype><dealnum>20120607693361193509</dealnum><supaccount>232523454235243543252435</supaccount><dealsum type=\"number\">248474.00</dealsum></d>"
				+ "<d><transtype>A018001</transtype><tellerno>2360653</tellerno><bankno>104</bankno><netno>236109</netno><dealtime>201206180000</dealtime><busno>12061880001207</busno><accounttype>A05</accounttype><dealnum>20120607693361193509</dealnum><supaccount>232523454235243543252435</supaccount><dealsum type=\"number\">248474.00</dealsum></d>"
				+ "<d><transtype>A018001</transtype><tellerno>2360653</tellerno><bankno>104</bankno><netno>236109</netno><dealtime>201206180000</dealtime><busno>12061880001207</busno><accounttype>A05</accounttype><dealnum>20120607693361193509</dealnum><supaccount>232523454235243543252435</supaccount><dealsum type=\"number\">248474.00</dealsum></d>"
				+ "<d><transtype>A018001</transtype><tellerno>2360653</tellerno><bankno>104</bankno><netno>236109</netno><dealtime>201206180000</dealtime><busno>12061880001207</busno><accounttype>A05</accounttype><dealnum>20120607693361193509</dealnum><supaccount>232523454235243543252435</supaccount><dealsum type=\"number\">248474.00</dealsum></d>"
				+ "<d><transtype>A018001</transtype><tellerno>2360653</tellerno><bankno>104</bankno><netno>236109</netno><dealtime>201206180000</dealtime><busno>12061880001207</busno><accounttype>A05</accounttype><dealnum>20120607693361193509</dealnum><supaccount>232523454235243543252435</supaccount><dealsum type=\"number\">248474.00</dealsum></d>" // json_type=\"string\"
				+ "</items><respcode>00</respcode><respmsg>查询成功</respmsg></ROOT>";
		xml = "<ROOT><mac>00-50-56-AE-00-1F</mac><items class=\"array\"><d><transtype>A018001</transtype><buyeraccount>232523454235243543252435</buyeraccount><bankno>104</bankno><dealtime>201206180000</dealtime><buyeraccountname/><supaccount>232523454235243543252435</supaccount><dealsum>181720.00</dealsum><supbankno/><tellerno>2360653</tellerno><netno>236109</netno><busno>12061880001216</busno><accounttype>A05</accounttype><buyerbank class=\"ddd\"></buyerbank><dealnum>20120607216995193514</dealnum></d></items><respcode>00</respcode><respmsg>查询成功</respmsg></ROOT>";

		xml = "<ROOT><A type=\"string\"/></ROOT>";
		System.out.println(xml2Json(xml));
	}

	private static String xml2Json(String ret) {
		XMLSerializer xmlserializer = new XMLSerializer();
		JSON json = xmlserializer.read(ret);
		return json.toString();
	}
}
