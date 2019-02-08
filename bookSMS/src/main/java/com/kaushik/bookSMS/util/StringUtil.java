package com.kaushik.bookSMS.util;

public class StringUtil {
	 
    public boolean isValid(String input) {
 
        if (input == null) {
            return false;
        } else if (input.equals("")) {
            return false;
        } else if (input.trim().equals("")) {
            return false;
        } else {
            return true;
        }
         
    }
     
    public boolean isValid2(String input){
        return input != null && !"".equals(input.trim());
    }
}
