import java.util.Scanner;
public class Övning2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ange ditt belopp i SEK ");

        double sek = scanner.nextDouble();

        double euro = sek * 0.084;
        double usd = sek * 0.090;

        double convertedEuro = (double)Math.round(euro * 1000d) / 1000d;
        double convertedUsd = (double)Math.round(usd * 1000d) / 1000d;


        System.out.println(sek + "SEK motsvarar " + convertedEuro + " euro och " + convertedUsd + " amerikanska dollar");





    }
}
