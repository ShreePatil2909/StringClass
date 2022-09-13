package stringclassDemo;

public class Reverse {

	public static void main(String[] args) {

		String s=new String("RADAR");
		
		
		  StringBuffer sb=new StringBuffer(s);
		  System.out.println(sb.reverse());
		  
		  System.out.println(sb.equals(s));
		  
		
		
	}

}
