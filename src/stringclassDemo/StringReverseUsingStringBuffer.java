package stringclassDemo;

public class StringReverseUsingStringBuffer {
	public static void main(String[] args) {
		String s = "i love my country";
		String s1 = s.substring(0, 1);
		String s2 = s.substring(1, 6);
		s2 = s2.concat(" ");
		String s3 = s.substring(6, 9);
		String s4 = s.substring(10, 17);
		
		StringBuffer sb = new StringBuffer(s4);
		sb =sb.reverse();
		String s5=new String (sb);
		
		
		System.out.println(s4.concat(s3).concat(s2).concat(s1));
		
	System.out.println(s5);
		
		


	}

}
