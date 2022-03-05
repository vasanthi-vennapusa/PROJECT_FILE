package acessModifiers1;
import acessModifiers.C;
public class DefaultModifier {
	public static void main(String[] args) {
        C c = new C();
        // Can not access default modifier property from another package
        //System.out.println(c.dat);
	}

}
