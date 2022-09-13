package stringclassDemo;

final class Rushi1111{

	private final int salary;
	private final String nm;
	Rushi1111(int salary,String nm){
		
		this.salary=salary;
		this.nm=nm;
	}	
	public Rushi1111 modify(int salary,String nm) {
		
		if(this.salary==salary && this.nm.equals(nm))
			return this;
		else
			return new Rushi1111(salary,nm);
	}
}
public class PrimiImm {

	public static void main(String[] args) {
		Rushi1111 r=new Rushi1111(10,"Ram");	
		Rushi1111 r1=r.modify(10,"Ram");
		Rushi1111 r2=new Rushi1111(10,"Ram");
		System.out.println(r==r2);
		System.out.println(r1==r2);
		System.out.println(r1==r);
		
		
		
	}

}
