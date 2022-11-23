import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int basamakDegeri ;
        int basamakSayisi=0;
         int toplam=0;
        Scanner inp=new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int x=inp.nextInt();

        int temp=x;


        while (temp!=0){
            temp=temp/10;
            basamakSayisi++;
        }

        temp=x;

        while (temp!=0) {

            basamakDegeri = temp % 10;
            toplam+=basamakDegeri;
            temp /= 10;
        }
        System.out.println("cevap: "+toplam);

    }
}
