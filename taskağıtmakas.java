import java.util.Random;
import java.util.Scanner;
public class taskağıtmakas {

    public static void main(String[] args) {
        Scanner sec = new Scanner(System.in);
        Random sayi = new Random();
        System.out.println("Bir sayı seçiniz.\n 1=taş,2=kağıt,3=makas.");
        int k_secim=sec.nextInt();
        int b_secim=sayi.nextInt(3)+1;
        int k_skor=0, b_skor=0;


        System.out.println("Kullanıcı seçim:" +k_secim);
        System.out.println("Bilgisayar seçim:"+b_secim);

    switch (k_secim){
        case 1:{
            System.out.println("Kullanıcının seçtiği sayı taş.");
            if (b_secim==1){
                System.out.println("Bilgisayarın seçimi taş.");
                System.out.println("Berabere kalındı.");
                System.out.println("Kullanıcı skor:"+ k_skor +"Bilgisayar skor:"+ b_skor);



        }
        else if(b_secim==2){
            System.out.println("Bilgisayarın seçimi kağıt.");
            System.out.println("Bilgisayar kazandı.");
            b_skor=b_skor+1;
            System.out.println("Kullanıcı skor:"+ k_skor +"Bilgisayar skor:"+ b_skor);
        }
        else if(b_secim==3){
            System.out.println("Bilgisayarın seçimi makas.");
            System.out.println("Kullanıcı kazandı.");
            k_skor=k_skor+1;
            System.out.println("Kullanıcı skor:"+ k_skor +"Bilgisayar skor:"+ b_skor);

        }
        break;

    }
    case 2:{
            System.out.println("Kullanıcının seçtiği sayı kağıt.");
            if (b_secim==1){
                System.out.println("Bilgisayarın seçimi taş.");
                System.out.println("Kullanıcı kazandı.");
                 b_skor=b_skor+1;
                System.out.println("Kullanıcı skor:"+ k_skor +"Bilgisayar skor:"+ b_skor);



        }
        else if(b_secim==2){
            System.out.println("Bilgisayarın seçimi kağıt.");
            System.out.println("Berabere kalındı.");
           
            System.out.println("Kullanıcı skor:"+ k_skor +"Bilgisayar skor:"+ b_skor);
        }
        else if(b_secim==3){
            System.out.println("Bilgisayarın seçimi makas.");
            System.out.println("Bilgisayar kazandı.");
            k_skor=k_skor+1;
            System.out.println("Kullanıcı skor:"+ k_skor +"Bilgisayar skor:"+ b_skor);

        }
        break;

    }
    case 3:{
            System.out.println("Kullanıcının seçtiği sayı makas.");
            if (b_secim==1){
                System.out.println("Bilgisayarın seçimi taş.");
                System.out.println("Bilgisayar kazandı.");
                 b_skor=b_skor+1;
                System.out.println("Kullanıcı skor:"+ k_skor +"Bilgisayar skor:"+ b_skor);



        }
        else if(b_secim==2){
            System.out.println("Bilgisayarın seçimi kağıt.");
            System.out.println("Kullanıcı kazandı.");
            b_skor=b_skor+1;
            System.out.println("Kullanıcı skor:"+ k_skor +"Bilgisayar skor:"+ b_skor);
        }
        else if(b_secim==3){
            System.out.println("Bilgisayarın seçimi makas.");
            System.out.println("Berabere kalındı.");
            
            System.out.println("Kullanıcı skor:"+ k_skor +"Bilgisayar skor:"+ b_skor);

        }
        break;

    }
    default:


    }

    }
   
}