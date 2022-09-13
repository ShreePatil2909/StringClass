package stringclassDemo;
final class S{
	private final int i;
	private final String s;
	S(int i,String s){
		this.i=i;
		this.s=s;
	}	
	public S Shree(int i,String s) {
		if(this.i==i && this.s.equals(s))
			return this;
		else
		return new S(i,s);
	}
}
class ImmutablClas {
	public static void main(String[] args) {
	
		S s=new S(10,"Shree");
		S s3=new S(10,"Shree");
		S s1=s.Shree(10,"Shree");
		S s2=s.Shree(100,"Krishna");
		 
		System.out.println(s==s3);
		System.out.println(s==s1);
		System.out.println(s==s2);
		System.out.println(s1==s2);
	}
}
