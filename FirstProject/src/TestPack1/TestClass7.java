package TestPack1;

public class TestClass7 {
	
//	public static void main(String[] args) {
		
	//	for(int i = 1; i <=5; ++i; j = 0) 
		{
	//		for (int j = 1; j<=5 - i; ++i)
			{
				System.out.print(" ");
			}
	//		while (j!= 2 * i -1)
			{
				System.out.print("* ");
	//			++j;
			}
			
			System.out.println();
		}
				
//	}
//}
public static void main(String[] args) {
   int rows = 5, k = 0;

    for (int i = 1; i <= rows; ++i, k = 0) {
      for (int space = 1; space <= rows - i; ++space) {
        System.out.print("  ");
      }

      while (k != 2 * i - 1) {
        System.out.print("* ");
        ++k;
      }

      System.out.println();
    }
  }
}

