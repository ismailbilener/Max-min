import java.util.Scanner;

public class Maxmin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sayi, adet,min,max;
        min=1; max=1;

        System.out.print("Kaç tane sayı gireceksiniz? : ");
        adet = input.nextInt();

        for (int i=1; i<=adet; i++){
            System.out.println(i+ ". sayiyi giriniz: ");
            sayi=input.nextInt();

            if (i==1){
                min=sayi;
                max=sayi;
            }
            if (sayi>max){
                max=sayi;
            }
            if (sayi<min){
                min=sayi;
            }
        }
        System.out.println("min: "+min);
        System.out.println("max: "+max);
    }
}
