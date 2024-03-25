package methods;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner in = new Scanner (System.in);
		
		boolean loggedIn=false;
		int attempt=3;
		
		while(loggedIn=true&& attempt!=0) {
			System.out.print("enter username: ");
			String username = in.next();
			
			System.out.print("enter password: ");
			String password = in.next();
			
		if(username.equals("james")  && password.equals("hello123")) {
			System.out.println("hello," + username);
			loggedIn=true;
				
		}else {	System.out.println("try again");
				System.out.println(attempt-1 + " attempts left");
				
				attempt--;
	}//else ends here
	}//while ends here
		 System.out.println("you are locked out");//iteration for attempts ends when attempts =0
	}
		

	

}
