package stringclassDemo;

public class Equals {

	public static void main(String[] args) {

		String s1=new String("Shree");
		String s2=new String("Shree");
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		
		StringBuffer sb=new StringBuffer("Shree");
		StringBuffer sb1=new StringBuffer("Shree");
		
		System.out.println(sb==sb1);
		System.out.println(sb.equals(sb1));
		
		
	}

}
