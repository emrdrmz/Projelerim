package test3;

import java.util.Scanner;

public class BiletFiyati {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	int km,yas,tip;
	System.out.println("Mesafeyi giriniz:");
	km=input.nextInt();
	System.out.println("Yaşı giriniz");
	yas=input.nextInt();
	System.out.println("yolculuk tipini seçiniz 1-Tek gidiş		2-Gidiş Dönüş");
	tip=input.nextInt();
	double normalfiyat,yasindirim,tipindirim;
	
	
	
	
	if(km >= 0 && yas>=0&& (tip==1) || (tip==2)) {
normalfiyat=km*0.10;
if(yas<12) {
	yasindirim=normalfiyat*0.5;		
}else if (yas>=12 && yas<=24){
	yasindirim=normalfiyat*0.10;
}else if(yas>=65) {
	yasindirim=normalfiyat*0.30;		
}else {
	yasindirim=0;
}
normalfiyat-=yasindirim;
if(tip ==2) {
	tipindirim=normalfiyat*0.20;
	normalfiyat=(normalfiyat-tipindirim)*2;
}else {
	tipindirim=0;
}
System.out.println("Bilet tutarınız:" +normalfiyat +"$");
	}else {
		System.out.println("Girdiler Yanlış");
	}
	

	}

}
