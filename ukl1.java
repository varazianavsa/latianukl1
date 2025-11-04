import java.util.Scanner;

public class pakettest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("jarak tempuh");
        int jaraktempuh = in.nextInt();
        System.out.println("panjang");
        int panjang = in.nextInt();
        System.out.println("lebar");
        int lebar = in.nextInt();
        System.out.println("tinggi");
        int tinggi = in.nextInt();
        int volume = panjang * lebar * tinggi;

        System.out.println("volume benda" + volume);

        System.out.println("jarak tempuh" + jaraktempuh);
        if (jaraktempuh <= 10 && jaraktempuh >= 10) {
            System.out.println(" RP 4250 PER KG ");
        } else {
            System.out.println("RP 600 PER KG");
        }

        System.out.println(" volumebenda" + volume);
        if (volume <= 100 && volume >= 100) {
            System.out.println(" o ");
        } else {
            System.out.println(" 50.00080");

        }

    }

}
