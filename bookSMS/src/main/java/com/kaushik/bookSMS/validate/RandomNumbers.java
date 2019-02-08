package com.kaushik.bookSMS.validate;

import java.util.Random;

public class RandomNumbers extends Random {

	  public int getRandomNumber(int min, int max) {
	        return nextInt(max - min + 1) + min;
	    }
}
