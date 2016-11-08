package GetMinus;

import java.util.Scanner;

public class GetMinus_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		 System.out.print("input Number m > ");
		 int m = Integer.parseInt(scan.next());
		 
		 System.out.print("Input Number n > ");
		 int n = Integer.parseInt(scan.next());

		 GetMinus_lib clib = new GetMinus_lib(m,n);
		 System.out.println("m - n ="+clib.getMinus());		
	}

}
