package Flowcontrol;
import java.util.*;
public class Ass1 {
	public static void main(String []args) {
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the integer:");
		num=sc.nextInt();
		if(num>0)
		System.out.println(num+" the postive number:");
		else if(num<0)
			System.out.println(num+"is negative number:");
		else
		System.out.println("is number is zero");
	}
	

}
