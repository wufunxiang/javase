/*
 * @(#) Dom4jTest.java  2012-6-21
 *
 * Copyright 2012  woodman  
 *   All rights reserved.
 */
package net.sukoo.study.dom4j;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.dom4j.xpath.DefaultXPath;
import org.junit.Test;

/**
 * @author <a href="mailto:wufunxiang@gmail.com">woodman</a>
 *         <hr/>
 *         功能:
 */
public class Dom4jTest {

	@Test
	public void testXpath() throws DocumentException {
		Map<String, String> map = new HashMap<String, String>();
		map.put("beansns", "http://www.springframework.org/schema/beans");
		SAXReader reader = new SAXReader();
		reader.getDocumentFactory().setXPathNamespaceURIs(map);
		Document document = null;
		document = reader
				.read("F:\\code\\java\\javase\\src\\dom4j\\net\\sukoo\\study\\dom4j\\dest.xml");
		DefaultXPath beansPath = new DefaultXPath("/beans");
		List<Element> beans = beansPath.selectNodes(document);
		if (beans.size() == 0) {
			System.out.println("---error--insertSpringService() no find beans");
			return;
		}
		Element _beans = beans.get(0);
		System.out.println(_beans.getName());

		List<Element> beanEs = _beans.selectNodes("beansns:bean");
		System.out.println(beanEs.size());
		boolean isExit = false;
		String table = "";
		String findId = table.toLowerCase() + "Service";
		for (Element mapping : beanEs) {
			if (mapping.attributeValue("id").equals(findId)) {
				isExit = true;
				break;
			}
		}
	}
}
