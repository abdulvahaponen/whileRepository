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
	 int sayi = (int)(Math.random() * 101); //0 ile 100 arasýnda bir sayý üretir 100'de olabilir
	 
     Scanner input = new Scanner(System.in); //Kullanýcýdan sayý alabilmek için Scanner sýnýfýný kullandýk

     int tahmin = -1; //0 ile 100 arasýnda olmamasý için -1 verdik

     while(sayi != tahmin){ // sayý tahmine eþit olmadýðý sürece true dönecek ve bu iþlem tekrarlanacak . Sayý iþleme eþit olduðunda false dönecek ve döngüye girmiyecek
         
         System.out.print("Tahmin ettiðiniz sayýyý giriniz: ");

         tahmin = input.nextInt(); // Sayý kullanýcýdan alýnýr

         if(tahmin == sayi){
             System.out.println("Doðru Tahmin");

         }else if(tahmin > sayi){
             System.out.println("Tahmininizi Azaltýn");

         }else{
             System.out.println("Tahmininizi Arttýrýn");

         }
     }
}
}
