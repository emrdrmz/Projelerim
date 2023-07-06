package test3;

import java.util.Scanner;

public class kullanicigiris {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String k_adi,parola;
		System.out.println("kullanıcı adınızı giriniz");
		k_adi=input.nextLine();
		System.out.println("parolanızı giriniz");
		parola=input.nextLine();
		if(k_adi.equals("java") && (parola.equals("123"))) {
			System.out.println("Başarıyla giriş yaptınız");
		}else {
			System.out.println("kullanıcı adı veya şifreyi hatalı girdiniz");
		}

	}

}
