package stringclassDemo;

public class Stringrev2 {
	public static void main(String[] args) {
        int j=0;
		String s = new String("Jyoti Vahini");
		System.out.println(s);

		String s1=s.substring(6);
		String s3=s.substring(0, 6);
		System.out.println(s1);
		
		char c[]=s1.toCharArray();
		char c1[]=new char[6];
		for(int i=c.length-1;i>=0;i--) {
			c1[j]=c[i];
			j++;
		}
//		String s2=new String(c1);
		System.out.println(c1);
//		System.out.println(s3.concat(s2));
	}
}