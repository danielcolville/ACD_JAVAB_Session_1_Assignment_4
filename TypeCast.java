package typeCast;

import java.util.Scanner;
public class TypeCast {
	public static void main(String[] args) {
		byte bt;
		short st;
		int nt;
		long lg;
		float ft;
		double dbl;
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter a byte number:");
		bt=scan.nextByte();
		System.out.print("Enter a short number:");
		st=scan.nextShort();
		nt=(int)(bt+st);
		System.out.println("The integer sum is:"+ nt);
		lg=(long)(st+nt);
		System.out.println("The long integer sum is:"+ lg);
		ft=(float)(nt+lg);
		System.out.println("The float sum is:"+ ft);
		dbl=(double)(lg+ft);
		System.out.println("The double sum sum is:"+ dbl);
	}
}
