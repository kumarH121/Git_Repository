package TestPack1;

public class Questionanswers {
	
	int i = 10;
	
	
		    public static void main(String[] args) {
		        Scanner scn = new Scanner(System.in);
		        int n = scn.nextInt();
		        
		        if(n == 1) {
		            System.out.println("NO");
		            return;
		        }
		        
		        for(int i=2;i<n;i++) {
		            if(n % i == 0) {
		                System.out.println("NO");
		                return;
		            }
		        }
		        
		        System.out.println("YES");
		    }
		
	}
	
	


