import java.util.Scanner;

public class whileRepo {
public static void main(String[] args) {
	int i=0;
	while(i<10) {
		System.out.println("hello abdulvahap");
		i++;
	}
	whileRepo whileRepo=new whileRepo();
	whileRepo.sayiTahminEtme();
}
public void toplama() {
	int toplam=0;
	int i=0;
	while(i<20) {
		toplam=toplam+i;
				i++;
	}
	System.out.println("Toplam:"+toplam);
}
public void sayiTahminEtme() {
	 int sayi = (int)(Math.random() * 101); //0 ile 100 aras�nda bir say� �retir 100'de olabilir
	 
     Scanner input = new Scanner(System.in); //Kullan�c�dan say� alabilmek i�in Scanner s�n�f�n� kulland�k

     int tahmin = -1; //0 ile 100 aras�nda olmamas� i�in -1 verdik

     while(sayi != tahmin){ // say� tahmine e�it olmad��� s�rece true d�necek ve bu i�lem tekrarlanacak . Say� i�leme e�it oldu�unda false d�necek ve d�ng�ye girmiyecek
         
         System.out.print("Tahmin etti�iniz say�y� giriniz: ");

         tahmin = input.nextInt(); // Say� kullan�c�dan al�n�r

         if(tahmin == sayi){
             System.out.println("Do�ru Tahmin");

         }else if(tahmin > sayi){
             System.out.println("Tahmininizi Azalt�n");

         }else{
             System.out.println("Tahmininizi Artt�r�n");

         }
     }
}
}
