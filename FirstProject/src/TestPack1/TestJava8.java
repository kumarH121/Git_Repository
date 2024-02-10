package TestPack1;

public class TestJava8 {
	
	int num2 = 20; // NON-STATIC variable
	static int num3 = 90;
	
	public static void main(String[] args) {
		
		TestJava8 t1 = new TestJava8();
		System.out.println(t1.num2);
		
		TestJava8 t2 = new TestJava8();
		System.out.println(t2.num2);
		
		TestJava8 t3 = new TestJava8();
		System.out.println(t3.num2);
		
		System.out.println("***************");
		
		t2.num2 = 50;
		
		System.out.println(t1.num2);
		System.out.println(t2.num2);
		System.out.println(t3.num2);
		
		System.out.println("calling static variable ****** ");
		
		t2.num3 = 80;
		
		System.out.println(t1.num3);
		System.out.println(t2.num3);
		System.out.println(t3.num3);
			
		
	}

}

