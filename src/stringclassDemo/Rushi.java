package stringclassDemo;

public class Rushi {
	public static void main(String args[]) {
		final String s="durga";
		String s1= s.intern();
		String s2=s.concat(s);
		String s3="software";
		String s4=new String("durgasoftware");
		String s5= s.concat(s3);
		s3=s5.intern();
		
		
		
		System.out.println(s4==s2);
		System.out.println(s==s1);
		System.out.println(s3==s5);
		System.out.println(s4==s3);
	}
	

}