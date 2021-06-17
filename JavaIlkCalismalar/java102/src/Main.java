import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		//Önce deðiþkenimi tanýmlýyorum.
		
		double ortalama;
		
		//Scanner Sýnýfýmý Tanýmlýyorum.
		
		System.out.println("Not Ortalamanýzý Giriniz:");
		Scanner inp =new Scanner(System.in);

		// Kullanýcýdan Not Girmesini istiyorum.
		
		ortalama= inp.nextDouble();
		
		System.out.println(ortalama);
		
		// Koþul Ýfadelerini Yazýyorum.
		boolean kosul1= ortalama>=60.0;
		boolean kosul2= ortalama==60.0;
		boolean sonuc= kosul1 || kosul2;
		
		// Koþula Göre Çýkacak Sonuç:
		String x = sonuc ? "Tebrikler, Sýnýfý Geçtiniz!" : "Sýnýfta Kaldýnýz";
		System.out.println(x);
}
}
