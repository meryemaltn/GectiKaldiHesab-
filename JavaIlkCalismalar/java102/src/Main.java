import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int a;
		Scanner input=new Scanner(System.in);
		a=input.nextInt();
		System.out.println(a);*/
		
		
		// Önce Deðiþkenleri Oluþturalým
		/*int mat, fizik, kimya, turkce, tarih, muzik;
		
		//Scanner Sýnýfýmýzý Tanýmlayalým
		
		Scanner inp= new Scanner(System.in);
		
		// Kullanýcýdan notlarý iste
		
		System.out.println("Matematik Notunu Giriniz:");
		mat=inp.nextInt();
		
		System.out.println("Fizik Notunu Giriniz:");
		fizik =inp.nextInt();
		
		System.out.println("Kimya Notunu Giriniz:");
		kimya =inp.nextInt();
		
		System.out.println("Türkçe Notunu Giriniz:");
		turkce =inp.nextInt();
		
		System.out.println("Tarih Notunu Giriniz:");
		tarih =inp.nextInt();
		
		System.out.println("Müzik Notunu Giriniz:");
		muzik =inp.nextInt();
		
		int toplam=(mat + fizik + kimya + turkce + tarih + muzik);
		double sonuc= toplam/6.0;
		System.out.println("Not Ortalamasý:"+sonuc);
		*/
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
