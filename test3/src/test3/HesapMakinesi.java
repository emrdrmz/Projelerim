package test3;

import java.util.Scanner;

public class HesapMakinesi {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int sayi1,sayi2,secim;
		System.out.println("ilk sayıyı giriniz");
		sayi1=input.nextInt();
		System.out.println("ikinci sayıyı giriniz");
		sayi2=input.nextInt();
		System.out.println("Yapmak isteğiniz işlemi seçiniz");
		System.out.println("1-toplama\n2-çıkarma \n3-çarpma\n4-bölme \n5-karekök alma");
		secim=input.nextInt();
		if(secim==1) {
			System.out.println("toplama sonucu:" +(sayi1+sayi2));
		}else if(secim==2) {
			System.out.println("çıkarma sonucu" +(sayi1-sayi2));
		}else if(secim==3) {
			System.out.println("çarpma sonucu:" +(sayi1*sayi2));
		}else if(secim==4) {
			if(sayi2==0) {
				System.out.println("sayı2 0 a eşittir sonuç belirsi<dir");
			}else {
				System.out.println("Bölme sonucu" +(sayi1/sayi2));	
			}
		}else if(secim==5) {
			System.out.println("Sayi1 karekökü:" +(sayi1*sayi1) +"\nsayı2 karekökü" +(sayi2*sayi2));
			}
			
		}

	}


