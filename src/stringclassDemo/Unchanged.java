package stringclassDemo;

final class Shree{
	
	private int i;
	private String s;
	
	Shree(int i,String s){
		this.i=i;
		this.s=s;	
	}
	
	public Shree get() {
		if(this.i==i)
			return this;
		else
			return new Shree(i,s);
	}
public boolean equals(Object o) {
	if(o == this)
	return true;
	if(o instanceof Shree) {
		Shree s1=(Shree)o;{
		if(i==s1.i && s.equals(s1.s))
			return true;
		}
	}
		return false;

}

}

public class Unchanged {

	public static void main(String[] args) {

		Shree s=new Shree(10,"Shri");
		Shree s1=new Shree(10,"Shri");0
		Shree s2=new Shree(100,"Shriprasad");
		
		System.out.println(s.equals(s1));
		System.out.println(s1.equals(s));
		System.out.println(s2.equals(s));
	}

}