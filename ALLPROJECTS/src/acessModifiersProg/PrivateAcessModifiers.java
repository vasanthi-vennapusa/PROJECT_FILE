package acessModifiersProg;

class A {
	private int data = 03;
	void test() {
		System.out.println(data);
	}
  }
     public class PrivateAcessModifiers 
  {
	 public static void main(String[]args) {
		A a=new A();
		a.test();
	}

}
