package variables;

public class PassByValueAndReference {
	
	public static void main(String[] args) {
		int x = 10;
		modify(x); //pass by value
		System.out.println(x); // 10
		
		Data d = new Data(10);
		System.out.println(d.id);
		
		modifyData(d);
		System.out.println(d.id);
		
	}
	
	public static int modify(int a) {
		a = 5;
		return a;
	}
	
	public static void modifyData(Data data) {
		data.id = 5;
	}

}
