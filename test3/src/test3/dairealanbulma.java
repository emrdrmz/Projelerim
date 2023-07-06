package test3;

import java.util.Scanner;

public class dairealanbulma {

	public static void main(String[] args) {
		double yarıçap,pisayısı=3.14;
		double dairealan,daireçevre;
		Scanner input=new Scanner(System.in);
		System.out.println("yarıçapı giriniz");
		yarıçap=input.nextDouble();
		
		dairealan=(yarıçap*yarıçap)*(pisayısı);
		System.out.println("dairenin alanı:" +dairealan);
		daireçevre=(yarıçap*pisayısı)*2;
		System.out.println("dairenin çevresi:" +daireçevre);
		
		
		
		
		

	}

}
