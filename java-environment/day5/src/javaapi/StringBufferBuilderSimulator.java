package javaapi;

public class StringBufferBuilderSimulator {
	
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("Hello World");
//		StringBuilder literal = "Hello World"; does not work
		System.out.println(sb);
		sb.append(". This was added");
		System.out.println(sb);
		sb.insert(5, "--INSERTED--");
		System.out.println(sb);
		
	}

}
