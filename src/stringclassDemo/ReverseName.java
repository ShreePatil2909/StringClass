package stringclassDemo;

public class ReverseName {

	public static void main(String[] args) {
		
		 String s=new String("Shree Patil");
		 String s1=s.substring(0,6);  // shree 
		 String s2=s.substring(6);		// Patil
		 int j=0;
		 char c[]=s2.toCharArray();
		 char c1[]=new char[5];
		 
		 for(int i=c1.length-1;i>=0;i--) {
			 
			 c1[j]=c[i];
			 j++;
		 }
		 s2=new String(c1);
		 System.out.println(s1.concat(s2));
	}
}