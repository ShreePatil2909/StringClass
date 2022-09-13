package stringclassDemo;

public class Stringrev {
public static void main(String[] args) {
	
	String s=new String("Jyoti Vahini");
	System.out.println(s);
	
//	System.out.println(s.substring(6));
	String s2=s.substring(6);
	System.out.println(s2);
	
	StringBuffer sb=new StringBuffer(s2);
	 StringBuffer sb1=sb.reverse();
	 System.out.println(sb1);
 }
}  