package constructor;
class A {
	int i;
	int j;
	
	
	/*A() {
		i=4;
		j=6;
	}*/
	
	A(int i, int j) {
		this.i = i;
		this.j = j;
	}
}



class B {
	int i;
	String s ;
	
	/*public B() {
		System.out.println("B constructor is called");
	}*/
	
	
	public B(int i) {
		
	}
	
	public B() {
		
	}
}


class C extends B {
	public C() {
		System.out.println("C constructor is called");
	}
}


public class Constructor {

	
	public static void main(String[] args) {
	
		/*A a = new A(1,2);
		System.out.println(a.i);*/
		
		C c = new C();
	}
}