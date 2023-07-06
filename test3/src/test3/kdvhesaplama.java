package test3;

import java.util.Scanner;

public class kdvhesaplama {

	public static void main(String[] args) {
		double tutar,kdvlifiyat ,kdv=0.18;
		Scanner input=new Scanner(System.in);
		System.out.println("ürünün tutarını giriniz");
		tutar=input.nextDouble();
		kdvlifiyat=(tutar + tutar*kdv);
		System.out.println("kdvlifiyat:" +kdvlifiyat);
				
		
		
		
		
		

	}

}
