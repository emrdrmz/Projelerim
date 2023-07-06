package test3;

import java.util.Scanner;

public class NotOrtalamasiHesaplama {

	public static void main(String[] args) {
		int quiz,vize,ffinal;
		int toplam;
		double ortalama;
		Scanner input= new Scanner  (System.in);
		System.out.println("quiz notunu giriniz");
		quiz=input.nextInt();
		System.out.println("vize notunuzu giriniz");
		vize=input.nextInt();
		System.out.println("final notunuzu giriniz");
		ffinal=input.nextInt();
		
		ortalama=(quiz*0.2) + (vize*0.35) + (ffinal*0.45);
		System.out.println("not ortalamanız" +ortalama);
		String sonuc = (ortalama>=50)? "geçtiniz" : "kaldınız";
		System.out.println(sonuc);
		

	}

}
