package differential;

import java.util.Scanner;
public class Differential_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
		 System.out.print("input value of a > ");
		 double a = Double.parseDouble(scan.next());
		 
		 System.out.print("Input value of h > ");
		 double h = Double.parseDouble(scan.next());

		 Differential_lib elib = new Differential_lib(a,h);
		 System.out.println("f(x)=x^2��x="+a+"�ɂ���������W����"+elib.getRx());
		 System.out.println("f(x)=x^2��x="+a+"�ɂ����鐔�l������"+elib.getDx());
		 System.out.println("f(x)=x^2��x="+a+"�ɂ����鑊�Ό덷��"+Math.abs(elib.getRx()-elib.getDx())/elib.getRx()/elib.getRx());
				
	}
	

}
