import java.util.Scanner;
public class Main {
		public static void main(String[] args) {
		double tutar,kdvOran, kdvTutar, kdvliTutar;
		Scanner input =new Scanner(System.in);
		System.out.print("Ücret tutarýný giriniz: ");
		tutar = input.nextDouble();

		kdvOran = tutar<1000 && tutar>0 ? 0.18 : 0.8 ;
		
		kdvTutar = tutar * kdvOran;
		kdvliTutar = tutar + kdvTutar;
		
		System.out.println("KDV'siz Tutar: "+ tutar);
		System.out.println("KDV Oraný: "+kdvOran);
		System.out.println("KDV Tutarý: "+kdvTutar);
		System.out.println("KDV'li Tutar: "+kdvliTutar);
		
		}
		}