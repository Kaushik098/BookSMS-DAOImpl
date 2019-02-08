package com.kaushik.bookSMS.test;

import com.kaushik.bookSMS.dao.PurchaseDAO;
import com.kaushik.bookSMS.dao.impl.PurchaseDAOImpl;
import com.kaushik.bookSMS.model.Purchase;
import com.kaushik.bookSMS.validate.RandomNumbers;

public class PurchaseTest {
	
	public static void main(String args[]){
		
		
		Purchase purchase = new Purchase();
		
	    RandomNumbers rn = new RandomNumbers();
		int value = rn.getRandomNumber(1200, 8900);
		
		purchase.setPurchaseID(value);
		purchase.setCustomerID(1);
		purchase.setCustomerName("Anushya");
		purchase.setTotalAmount(1000);
		purchase.setBillStatus("Not Paid Yet! Cash on Delivery method");
	
		
		PurchaseDAO p = new PurchaseDAOImpl();
	    p.updatePurchase(purchase);    
		
		
	}
	
}
