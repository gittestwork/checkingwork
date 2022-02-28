package com.sales.pojo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PaymentReturn {
static Logger logger=LoggerFactory.getLogger(PaymentReturn.class);
public static void main(String[] args) {
	logger.trace("entered into sl4j main() method");
	int a=60;
	int b=80;
	int c=b-a;
	logger.debug("computational value for c {}",c);
	logger.info("return vlaue {}",c);
}
}
