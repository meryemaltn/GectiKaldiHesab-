import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int a;
		Scanner input=new Scanner(System.in);
		a=input.nextInt();
		System.out.println(a);*/
		
		
		// �nce De�i�kenleri Olu�tural�m
		/*int mat, fizik, kimya, turkce, tarih, muzik;
		
		//Scanner S�n�f�m�z� Tan�mlayal�m
		
		Scanner inp= new Scanner(System.in);
		
		// Kullan�c�dan notlar� iste
		
		System.out.println("Matematik Notunu Giriniz:");
		mat=inp.nextInt();
		
		System.out.println("Fizik Notunu Giriniz:");
		fizik =inp.nextInt();
		
		System.out.println("Kimya Notunu Giriniz:");
		kimya =inp.nextInt();
		
		System.out.println("T�rk�e Notunu Giriniz:");
		turkce =inp.nextInt();
		
		System.out.println("Tarih Notunu Giriniz:");
		tarih =inp.nextInt();
		
		System.out.println("M�zik Notunu Giriniz:");
		muzik =inp.nextInt();
		
		int toplam=(mat + fizik + kimya + turkce + tarih + muzik);
		double sonuc= toplam/6.0;
		System.out.println("Not Ortalamas�:"+sonuc);
		*/
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
