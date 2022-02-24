package TypeCasting;

public class TYPECASTING {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     int x=3;
	   //Automatically convert integer to long so it is implicit 
	     long y=x;
	   //Automatically convert long to float so it is implicit 
	      float z=y;
	           System.out.println("Before covertion, int value is :"+x);
	           System.out.println("After covertion, long value is :"+y);
	           System.out.println("After covertion,float value is :"+z);
	           System.out.println("Implict Type casting");
	           System.out.println("====================================");

	       double d = 166.6;
	   // converting double data type into long data type
	       long l = (long)d;
	   // converting long  data type into int data type
	        int i = (int)l;
	           System.out.println("Before covertion, double is :"+d);
	   // It is not automatically converted so it is explicit type casting
	   // fraction part lost
	           System.out.println("After covertion, double into long:"+d);
	           System.out.println("After covertion,  long   into int:"+d);
	           System.out.println("Explict Type casting");


}

}
