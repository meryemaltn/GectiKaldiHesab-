import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		//�nce de�i�kenimi tan�ml�yorum.
		
		double ortalama;
		
		//Scanner S�n�f�m� Tan�ml�yorum.
		
		System.out.println("Not Ortalaman�z� Giriniz:");
		Scanner inp =new Scanner(System.in);

		// Kullan�c�dan Not Girmesini istiyorum.
		
		ortalama= inp.nextDouble();
		
		System.out.println(ortalama);
		
		// Ko�ul �fadelerini Yaz�yorum.
		boolean kosul1= ortalama>=60.0;
		boolean kosul2= ortalama==60.0;
		boolean sonuc= kosul1 || kosul2;
		
		// Ko�ula G�re ��kacak Sonu�:
		String x = sonuc ? "Tebrikler, S�n�f� Ge�tiniz!" : "S�n�fta Kald�n�z";
		System.out.println(x);
}
}
