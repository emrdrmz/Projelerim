package test3;

import java.util.Scanner;

public class SinifAtlama {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	int mat,fen,sosyal,turkce,bedenegitimi;
	double ortalama;
	System.out.print("Matematik notunuzu giriniz:");
	mat=input.nextInt();	
	System.out.print("\nFen notunuzu giriniz:");
	fen=input.nextInt();
	System.out.print("\nsosyal notunuzu giriniz:");
	sosyal=input.nextInt();
	System.out.print("\ntürkçe notunuzu giriniz:");
	turkce=input.nextInt();
	System.out.print("\nbeden notunuzu giriniz:");
	bedenegitimi=input.nextInt();
	ortalama=(mat+fen+sosyal+turkce+bedenegitimi)/5;
	System.out.println("ortalama:" +ortalama);
	if(ortalama>85) {
		System.out.println("takdir belgesi aldınız");
	}else if(ortalama>70) {
		System.out.println("teşekkür belgesi aldınız");
	}else if(ortalama>50) {
		System.out.println("düz geçtiniz");
	}else {
		System.out.println("kaldınız");
	}

	}

}
