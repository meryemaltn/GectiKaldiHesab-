import java.util.Scanner;
public class Main {
		public static void main(String[] args) {
		double tutar,kdvOran, kdvTutar, kdvliTutar;
		Scanner input =new Scanner(System.in);
		System.out.print("�cret tutar�n� giriniz: ");
		tutar = input.nextDouble();

		kdvOran = tutar<1000 && tutar>0 ? 0.18 : 0.8 ;
		
		kdvTutar = tutar * kdvOran;
		kdvliTutar = tutar + kdvTutar;
		
		System.out.println("KDV'siz Tutar: "+ tutar);
		System.out.println("KDV Oran�: "+kdvOran);
		System.out.println("KDV Tutar�: "+kdvTutar);
		System.out.println("KDV'li Tutar: "+kdvliTutar);
		
		}
		}