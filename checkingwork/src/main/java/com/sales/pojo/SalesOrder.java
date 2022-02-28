package com.sales.pojo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SalesOrder {
	static Logger logger = LogManager.getLogger(SalesOrder.class);

	public static void main(String[] args) {
		System.out.println("executing");
		logger.trace("entered into main() method");
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println(c);
		logger.debug("produced value of c {} ",c);
		logger.info("returning value of c {}",c);
	}
}
