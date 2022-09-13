package stringclassDemo;

public class StringDemo1 {
	
	public static void main(String[] args) {
		String s=new String("abcd wxyz");
		
		StringBuffer sb=new StringBuffer(s);
		StringBuffer sb1=sb.reverse();
		System.out.println(sb1==sb);
	//	System.out.println(s==s2);
		
		String s1=sb1.substring(5)+" ";
		String s2=sb1.substring(0,5);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.concat(s2));
	
	}
	
	
	
	

}
