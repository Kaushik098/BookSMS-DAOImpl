package com.kaushik.bookSMS.validate;

import java.util.regex.Pattern;

import org.springframework.jdbc.core.JdbcTemplate;

import com.kaushik.bookSMS.model.User;
import com.kaushik.bookSMS.util.ConnectionUtil;
import com.kaushik.bookSMS.util.StringUtil;

public class RegisterValidate {

	
	JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();
	
	public String validate(User user){
		
		int invalid = 0;
        String str = "";
        
//a.) Username 		
		StringUtil st = new StringUtil();
		
		String un = user.getUsername();
		
		boolean un1 = st.isValid(un);
		boolean un2 = st.isValid2(un);
		
		if(un1 != true && un2 != true){
			 str = "enter a valid username";
			 invalid++;
			 System.out.println(str);
		}

//b.) Password
		String pwd = user.getPassword();
		
		boolean pwd1 = st.isValid(pwd);
		boolean pwd2 = st.isValid(pwd);
		
		if(pwd1 != true && pwd2 != true){
			 str = str + "enter a valid password";
			 invalid++;
			 System.out.println(str);
		}
		
		if(!Pattern.matches("[a-zA-Z]{8,}+[0-9]{1,}",pwd)){
		    str = str + "Please enter a valid password which has atleast eight characters and with atleast one number";
			invalid++;
			 System.out.println(str);
		}
		
		
		 StringUtil checkUsername = new StringUtil();
		 boolean rs = checkUsername.isValid(user.getUsername());
		   
		   
		     if(rs){
		    	    
		    	    
				try {
					String sql = "Select count(*) from book_user where user_name = ?";
					//String usernameCheckCopy = null;
				    String usernameCheckCopy = jdbcTemplate.queryForObject(sql, new Object[] {user.getUsername()}, (result, rowNo) ->{
				    	 return  result.getString(1);
				    });
			  
			        int val1 = Integer.parseInt(usernameCheckCopy);

			        if(val1 >= 1) {
			        	System.out.println("Username already Exists, please change and try");
			        	invalid++;
			        }
				    
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		      } 
		    else{
			   System.out.println("Please enter a valid username");
			   invalid++;
		    }  // end of usernameCheck
		     
		   //e.)Checking Password
		     
		     StringUtil checkPassword = new StringUtil();
		     boolean password = checkPassword.isValid(user.getPassword());
		       
		     if(password){
		       
		        try {
		        	
					String sql = "Select count(*) from book_user where user_password = ?";
					/*preparedStatement = conn.prepareStatement(passwordQuery);
					preparedStatement.setString(1, user.getPassword());
				    result = preparedStatement.executeQuery();
				    */    
					String passwordCheckCopy = jdbcTemplate.queryForObject(sql, new Object[] {user.getPassword()}, (result,rowNo)->{
						return result.getString(1);
					}); 
				   
					int val2 = Integer.parseInt(passwordCheckCopy);

					if (val2 >= 1) {
						System.out.println("Password already exists, please change and try");
						invalid++;
					}
					
				// Regular Expression pattern (Atleast 8 characters and one number")
					
			     	if(!Pattern.matches("[a-zA-Z]{8,}+[0-9]{1,}", user.getPassword()))
			   	   {
			   		  System.out.println("Please enter valid password which has 8 characters with atleast 1 number ");
			   		  invalid++;
			   	   }

				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		      }
		     else{
		    	 System.out.println("Please enter a valid password with atleast 8 charcters and 1 number");
		         invalid++;
		     }
				
		            
		
//final 
		
		if(invalid == 0){
			return "Success";
		}
		else{
			return str;
		}
		
	}
	
}
