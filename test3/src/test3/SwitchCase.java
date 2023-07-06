package test3;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("sayı giriniz");
	int sayi=input.nextInt();
	switch(sayi) {
	case 1:
		System.out.println("sayı 1 e eşittir");
		break;
	case 2:
		System.out.println("sayı 2 ye eşittir");
		break;
	case 3:
		System.out.println("sayı 3 e eşittir");
		break;
	default:	
		System.out.println("geçersiz bir sayı girdiniz");
	}

	}

}
