package TestPack1;

public class VariableTest3 {
	
	int a = 80;  //non static 
	static int b = 90; //static variable
	
	
	public void method1() {
		
  		int num = 10;//local variable becuse its inside the curly braces of the method
		
		System.out.println(num);
		
		int a = 100;
		System.out.println(a);
		
		System.out.println(this.a);
		
		//this keyword its used when we have to differentiate into local and global variable when both the variable has a same name.
		
	}


    public static void main(String[] args) {
	
    	VariableTest3 vv = new VariableTest3();
    	
    	vv.method1();
    	
    	System.out.println();
	
}


}