package stringclassDemo;

public class StringScenario {

	public static void main(String[] args) {
		
		String s="shree";
		String s1=new String("shree");
		String s3=s1.trim();
		String s4=s1.intern();
		String s5=s1.toString();
		String s6=s.intern();
		
		System.out.println(s5==s);    
		System.out.println(s1==s3);   
		System.out.println(s4==s6);   
		System.out.println(s==s6);   
		
	}
}