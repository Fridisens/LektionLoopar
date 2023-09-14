import java.util.Scanner;

public class Övning3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Vilket år vill du kontrollera? ");
            int leapyear = sc.nextInt();
            sc.nextLine();

            if ((leapyear % 4 == 0) || (leapyear % 100 == 0) || (leapyear % 400 == 0)) {
                System.out.println("År " + leapyear + " är ett skottår!");

            } else {
                System.out.println("År " + leapyear + " är INTE ett skottår");
            }

            System.out.println("Exit? (y/n)");
            String input = sc.nextLine();

            if (input.equals("y")) {
                break;
            }

        }

    }

}






