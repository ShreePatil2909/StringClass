package stringclassDemo;

public class StringMethod {

	public static void main(String[] args)
	{
		int j=0;
		String s=new String("Komal");
		
		char c[]=s.toCharArray();
		char a1[]=new char[5];
		
		for(int i=c.length-1;i>=0;i--) {
			
			a1[j]=c[i];
			j++;
		}
		for(char n:a1) {
			System.out.println(n);
		}
  	}
}