package stringclassDemo;
final class A{
	private int i;
	private String s;
	A(int i,String s)
	{
		this.i=i;
		this.s=s;
	}
	public A modify(int i,String s) {
		if(this.i==i && this.s.equals(s))
			return this;
		else
			return new A(i,s);
	}
}
public class OwnClass {
	public static void main(String[] args) {
		A a=new A(10,"Ram");
		A a1=a.modify(10,"Ram");
		A a2=a.modify(100,"Ram");
		A a3=a.modify(10,"Sham");
		
		System.out.println(a==a1);
		System.out.println(a==a2);
		System.out.println(a1==a2);
	}

}
