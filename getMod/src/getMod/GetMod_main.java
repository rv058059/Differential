package getMod;

import java.util.Scanner;

public class GetMod_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		 System.out.print("input Number m > ");
		 int m = Integer.parseInt(scan.next());
		 
		 System.out.print("Input Number n > ");
		 int n = Integer.parseInt(scan.next());

		 GetMod_lib clib = new GetMod_lib(m,n);
		 System.out.println("m % n ="+clib.getMod());
	}

}
