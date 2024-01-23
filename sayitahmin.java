 import java.util.Random;
import java.util.Scanner;
 
public class sayitahmin
{
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Random rastgele = new Random();
        int rastgele_sayi = 1 + rastgele.nextInt(49);
        
        System.out.println("Seçilen sayi 1 ile 50 arasındadır.");
        int sayi,sayac = 0;
        
        do {
            System.out.print("Bir sayi giriniz: ");
            sayi = scan.nextInt();
            if(sayi > rastgele_sayi) {
                System.out.println("Sayiyi küçültün.");
            }
            else if(sayi < rastgele_sayi) {
                System.out.println("Sayiyi büyütün.");
            }
            sayac++;
        }
        while(sayi != rastgele_sayi);
        
        System.out.println("Tebrikler!! " + sayac + ". denemede sayıyı buldunuz.");
    }
}