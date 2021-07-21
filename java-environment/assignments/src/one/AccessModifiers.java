package one;

import two.ProtectedSubClass;

public class AccessModifiers {

	public static void main(String[] args) {

		Person2 adam = new Person2();
		adam.age = 15;

		System.out.println(adam.age);
		
		ProtectedSubClass psc = new ProtectedSubClass();
        psc.printID();
	}

}
