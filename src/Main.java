import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // Ödev: Hesap makinesini switch-case kullanarak yapınız.

        int number1, number2, secim;
        Scanner input = new Scanner(System.in);
        System.out.print(" Lütfen ilk sayıyı giriniz: ");
        number1 = input.nextInt();
        System.out.print(" Lütfen ikinci sayıyı giriniz: ");
        number2 = input.nextInt();

        System.out.println(" 1-Toplama\n 2-Çıkarma\n 3-Çarpma \n 4-Bölme");
        System.out.print(" Seçiminiz: ");
        secim = input.nextInt();

        switch (secim) {
            case 1:
                System.out.println(" Toplama: " + (number1 + number2));
                break;
            case 2:
                System.out.println(" Çıkarma: " + (number1 - number2));
                break;
            case 3:
                System.out.println(" Çarpma: " + (number1 * number2));
            case 4:
                if (number2 != 0) {
                    System.out.println(" Bölme: " + (number1 / number2));
                } else {
                    System.out.println(" Bir sayı 0'a bölünemez !");
                }
                break;
            default:
                System.out.println(" Yanlış Seçim Yaptınız!");
        }

        System.out.println(" Program Sona Erdi!");
    }
}