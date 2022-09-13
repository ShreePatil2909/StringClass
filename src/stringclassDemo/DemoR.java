package stringclassDemo;

public class DemoR {
	
	
	public static void main(String[] args) {

		String s=new String("shree");
		String s1=new String("SHREE");
		String s2=s.replace('e', 'E');
		String s3=s1.toLowerCase();
		String s4=s2.intern();
		
		System.out.println(s3==s);
		
	}

}