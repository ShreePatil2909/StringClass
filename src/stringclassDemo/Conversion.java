package stringclassDemo;

public class Conversion {

	public static void main(String[] args) {
		
		
		int j1=30;
		String k=String.valueOf(j1);
		System.out.println(k);
		
		int i=20;
		String nm=Conversion.valueOf(i);
		System.out.println(nm);
		int j=Integer.parseInt(nm);
		System.out.println(j);
		
	}
	   
}