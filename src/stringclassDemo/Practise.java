package stringclassDemo;

public class Practise {
  //Finding the Duplicate letters in given string by #THE VAIBHAV GURAV
	public static void main(String[] args) {
		int count=0;
		String s1 = "SHREE PATIL";
        
		char []c=s1.toCharArray();
		for(int i=0;i<c.length;i++) {
			if(count!=0)
				break;
			for(int j=i+1;j<c.length;j++) {
				if(c[i]==c[j]) {
					
					System.out.println("1st Duplicate letter "+c[j]);
					count++;
					break;
				}
			}
		}
	}

}


