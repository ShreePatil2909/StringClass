package stringclassDemo;
class Bar{
	Bar(){
		m1();
	}
	void m1() {
		System.out.println("1st");
	}
}
public class Foo extends Bar {
	int x=5;
	void m1() {
		System.out.println("2nd-->"+x);
	}
	public static void main(String[] args) {
		System.out.println("main");
		Bar b=new Foo();
		b.m1();
		
	}

}
