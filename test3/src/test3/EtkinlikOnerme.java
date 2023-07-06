package test3;

import java.util.Scanner;

public class EtkinlikOnerme {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	int derece;
	System.out.println("Dereceyi Giriniz");
	derece=input.nextInt();
	if(derece>30) {
		System.out.println("Yüzme etkinliği yapabilirsiniz");
	}else if(derece>5 && derece<30) {
		System.out.println("Sinemaya gidebilirsin");
	}else if(derece<4) {
		System.out.println("Kayak etkinliğini yapabilirsin");
	}
	

	}

}
