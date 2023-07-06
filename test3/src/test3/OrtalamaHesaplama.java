package test3;

import java.util.Scanner;

public class OrtalamaHesaplama {

	public static void main(String[] args) {
		int matematik, turkce, ingilizce,sosyal;
		double ortalama;
		int toplam;
		double ortalama2;
		
		Scanner input=new Scanner(System.in);
		System.out.println("matematik notunuzu giriniz:");
		matematik=input.nextInt();
		System.out.println("türkçe notunuzu giriniz");
		turkce=input.nextInt();
		System.out.println("ingilizce notunuzu giriniz");
		ingilizce=input.nextInt();
		System.out.println("sosyal notunuzu giriniz:");
		sosyal=input.nextInt();
	    ortalama=(matematik*0.4) + (turkce*0.4) + (ingilizce*0.1) + (sosyal*0.1);
	    System.out.println("ortalama"+ortalama);
	    ortalama2=ortalama;
String sonuc=(ortalama>=50)?	"geçtiniz" : "kaldınız";    	
System.out.println(sonuc);
String sonuc2=(ortalama2>=85)? "Takdir belgesi aldınız" : "Takdir belgesi alamadınız";
System.out.println(sonuc2);
String sonuc3=(ortalama2>=75)? "Teşekkür belgesi aldınız" :"Teşekkür belgesi alamadınız";
System.out.println(sonuc3);


		
		
	}

}
