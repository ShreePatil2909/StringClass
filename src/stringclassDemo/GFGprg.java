package stringclassDemo;

import java.util.Scanner;
//10110007526  
public class GFGprg {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Account Number ");
		String s=sc.nextLine();
		System.out.println("Enter your IFSC Number ");
		String s1=sc.nextLine();
		if(s.contains("BOI")&& s1.contains("BKID000928"))
            System.out.println("Valid User");
        else
    	  System.out.println("Not Valid User");
	}

}
