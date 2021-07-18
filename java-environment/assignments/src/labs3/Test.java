package labs3;

public class Test {

	public static void main(String[] args) {

		A.staticCount = 2494;
		System.out.println("class A static count: " + A.staticCount);
		A a = new A();

		System.out.println(a.instanceCount);
		System.out.println(a.staticCount);
		System.out.println(A.staticCount);


		System.out.println(":::NEW LINE:::");
		A a2 = new A();

		System.out.println(a2.instanceCount);
		System.out.println(A.staticCount);

		System.out.println(":::NEW LINE:::");
		a.instanceCount = 15;

		System.out.println("object a instanceCount: " + a.instanceCount);
		System.out.println("object a2 instanceCount: " + a2.instanceCount);
		
		System.out.println("class A static count: " + A.staticCount);

	}

}
