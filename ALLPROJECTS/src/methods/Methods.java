package methods;
class B {
	int i=1;
}

// Java , copy by value
class A {
	void test(B b) {
		b.i++;
	}
}

public class Methods {

	public static void main(String[] args) {
		A a = new A();
		B b = new B(); 
		
		a.test(b);
		
		System.out.println(b.i);
	}

}