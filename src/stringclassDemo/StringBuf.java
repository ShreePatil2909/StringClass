package stringclassDemo;

public class StringBuf {

	public static void main(String[] args) {

			String s=new String("Komal");
			System.out.println(s);
			
			StringBuffer sb=new StringBuffer(s);
			StringBuffer sb1=sb.reverse();
			System.out.println(sb1);
			System.out.println(sb);
			
			System.out.println(sb==sb1);
			
	}
}