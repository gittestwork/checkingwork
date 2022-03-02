package com.sales.pojo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SalesOrderTest {
	int i;
	int j;
	int expectedAddPositive;
	int a;
	int b;
	int expectedPositivemul;

	SalesOrder salesOrder;

	@Before
	public void setup() {
		i = 10;
		j = 20;
		expectedAddPositive = 30;
		a = 10;
		b = 30;
		expectedPositivemul = 300;
		salesOrder = new SalesOrder();
	}

	@Test
	public void testAddPositive() {
		int actualAddPositive;

		actualAddPositive = salesOrder.add(i, j);
		System.out.println("actual addpositve: "+actualAddPositive);
		assertEquals(expectedAddPositive, actualAddPositive);
	}

	@Test
	public void testPositvbeMul() {
		int actualPositvemul;
		actualPositvemul = salesOrder.mul(a, b);
		assertEquals(expectedPositivemul, actualPositvemul);
	}

	@After
	public void tearDown() {
		salesOrder = null;
	}
}
