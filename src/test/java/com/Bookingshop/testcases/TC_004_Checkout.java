package com.Bookingshop.testcases;

import org.testng.annotations.Test;

import com.Bookingshop.pageobjects.ProceedCheckout;

public class TC_004_Checkout extends BaseClass {
	
	@Test(priority=8)
	public void checkoutpage()
	{
		ProceedCheckout checkout=new ProceedCheckout();
		checkout.checkout();
	}

}
