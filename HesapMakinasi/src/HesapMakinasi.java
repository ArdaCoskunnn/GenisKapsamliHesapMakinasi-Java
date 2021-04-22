import java.util.Scanner;

public class HesapMakinasi {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int islem_numarasi,  tekrarsayisi = 1, kackeretekrar = 0;
		double sayi = 0, sonuc = 0,ilksayi, tampi = 3.14159265358979323846264338327950288419716939937510, pi= 3.14, cevre= 0, alan= 1;
		
		System.out.println("                    4 Islem                   ");
		System.out.println("----------------------------------------------");
		System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");
		System.out.println("----------------------------------------------");
		System.out.println("             Cevre - Alan hesaplama           ");
		System.out.println("----------------------------------------------");
		System.out.println("5-Daire cevre - alan hesaplaplama\n6-Ucgen cevre - alan\n7-Kare cevre - alan hesaplama");
		System.out.println("----------------------------------------------");
		System.out.println("8-Faktöriyel");
		System.out.println("----------------------------------------------");
		System.out.print("Yapmak istediginiz islemin numarasini giriniz ==>");
		islem_numarasi = input.nextInt();
		System.out.println("----------------------------------------------");
		
		switch(islem_numarasi) {
/*----------------------------------------------------------------------------------*/
		case 1:		
			System.out.print("Kac sayi toplanacak ==>");
			kackeretekrar = input.nextInt() + 1;
	
			while(!(tekrarsayisi == kackeretekrar)) {
				System.out.print(tekrarsayisi + "." + " sayiyi giriniz ==>");
				sayi = input.nextDouble();
				
				sonuc += sayi;
				tekrarsayisi++;
			}
			System.out.print("Sonuc ==> " + sonuc);
			break;
/*----------------------------------------------------------------------------------*/
		case 2:
	
			System.out.println("Hangi sayidan cikarilacak ==>");
			ilksayi = input.nextDouble();
			
			sonuc += ilksayi;
			
			System.out.print("Kac sayi cikarilacak ==>");
			kackeretekrar = input.nextInt() + 1;
	
			while(!(tekrarsayisi == kackeretekrar)) {
				System.out.print(tekrarsayisi + "." + " sayiyi giriniz ==>");
				sayi = input.nextDouble();
				
				sonuc -= sayi;
				tekrarsayisi++;
			}
			System.out.print("Sonuc ==> " + sonuc);
			break;
/*----------------------------------------------------------------------------------*/
		case 3:
			double sonuc_c = 1;
			System.out.print("Kac sayi carpilacak ==>");
			kackeretekrar = input.nextInt() + 1;
	
			while(!(tekrarsayisi == kackeretekrar)) {
				System.out.print(tekrarsayisi + "." + " sayiyi giriniz ==>");
				sayi = input.nextDouble();
				
				sonuc_c *= sayi;
				tekrarsayisi++;			
			}
			System.out.print("Sonuc = " + sonuc_c);
			break;
/*----------------------------------------------------------------------------------*/
		case 4:
			System.out.println("Hangi sayi bolunecek ==>");
			ilksayi = input.nextDouble();
			
			sonuc += ilksayi;
			
			System.out.print("Kac sayi bolecek ==>");
			kackeretekrar = input.nextInt() + 1;
	
			while(!(tekrarsayisi == kackeretekrar)) {
				System.out.print(tekrarsayisi + "." + " sayiyi giriniz ==>");
				sayi = input.nextDouble();
				
				sonuc /= sayi;
				tekrarsayisi++;
			}
			System.out.print("Sonuc ==> " + sonuc);
			break;
/*----------------------------------------------------------------------------------*/
		case 5:
			double yaricap = 0, yaklasik_alan, yaklasik_cevre;
			
			System.out.println("Yaricap giriniz ==>");
			yaricap = input.nextDouble();
			
			yaklasik_alan = yaricap * yaricap * pi;
			
			alan = yaricap * yaricap * tampi;
			
			cevre = yaricap * tampi * 2;
			
			yaklasik_cevre = yaricap * pi * 2;
			
			System.out.println("Yaklasik cevre ==> " + yaklasik_cevre);
			System.out.println("Cevre ==> "+ cevre);
			System.out.println("Yaklasik alan ==> " + yaklasik_alan);
			System.out.println("Alan ==> " + alan);	
			break;
/*----------------------------------------------------------------------------------*/
		case 6:
			double d_uzunluk, y_uzunluk;
			
			while(!(tekrarsayisi == 4)) {
				System.out.print(tekrarsayisi + "." + " kenari giriniz ==>");
				sayi = input.nextDouble();
				
				cevre += sayi;
				
				tekrarsayisi++;
			}		
			
			System.out.print("\nDikey uzunluk giriniz ==> ");
			d_uzunluk = input.nextDouble();
			
			System.out.print("Yatay uzunluk giriniz ==> ");
			y_uzunluk = input.nextDouble();
			
			alan = d_uzunluk * y_uzunluk / 2;
			
			System.out.println("\nCevre ==> " + cevre);
			System.out.println("Alan ==>" + alan);
			break;
/*----------------------------------------------------------------------------------*/	
		case 7:
			
			System.out.print("Kenar uzunlugu giriniz ==> ");
			sayi = input.nextDouble();
			
			cevre = sayi * 4;
			alan = sayi * sayi;
			
			System.out.println("\nCevre ==> " + cevre);
			System.out.println("Alan ==>" + alan);
			
			break;
/*----------------------------------------------------------------------------------*/
		case 8:
			int sayiFaktoriyel = 0, sonucFaktoriyel = 1, i = 1;
			System.out.print("Faktoriyelini hesaplamak istediginiz sayiyi giriniz ==> ");
			sayiFaktoriyel = input.nextInt();
			
			while(!(i == sayiFaktoriyel + 1)) {
				
				sonucFaktoriyel *= i;
				i++;	
			}
			
			System.out.print(sayiFaktoriyel + "! ==> " + sonucFaktoriyel);
			
			break;
		}
		input.close();
	}
}
