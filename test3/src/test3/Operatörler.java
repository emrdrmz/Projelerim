package test3;

public class Operatörler {

	public static void main(String[] args) {
		int a=20;
		int b=15;
		int toplam=a + b;
		int cikarma=a - b;		
		int carpma=a * b; 
		int bolme=a / b;
		int mod=a % b;
System.out.println("a:" +a);		
System.out.println("b" +b);
		 
System.out.println("toplam:" +toplam );		
System.out.println("çıkarma:" +cikarma);
System.out.println("carpma:" +carpma);
System.out.println("bölme:" +bolme);
System.out.println("mod:" +mod);
toplam++;
System.out.println(toplam);
cikarma--;
System.out.println(cikarma);

int y=++a + b;
System.out.println(y);


int x=30;
int z=30;
boolean kosul=(x>=z);
System.out.println(kosul);				

boolean kosul1=x==z;
boolean kosul2=x>z;

boolean sonuc1=kosul1 && kosul2;
System.out.println(sonuc1);

boolean sonuc2=kosul1 || kosul2;
System.out.println(sonuc2);

String sonuc3=kosul2 ? "Doğru" : "Yanlış";
System.out.println(sonuc3);			
		

	}

}
