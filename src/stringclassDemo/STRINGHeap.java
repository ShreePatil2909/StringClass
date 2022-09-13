package stringclassDemo;

public class STRINGHeap {

	public static void main(String[] args) {
		String s="Shree";
		s.concat("Patil");
		
		System.out.println(s);
		
		StringBuffer sb=new StringBuffer(s);
		StringBuffer sb2=sb.reverse();
		System.out.println(sb2);
		System.out.println(sb);
		
		
	}
}