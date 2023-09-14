import java.util.Scanner;
public class Övning1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int centimeter;


        System.out.println("Hur lång är du? (Svara i centimeter)");
        centimeter = sc.nextInt();

        double cmInFathom = centimeter * 0.0054681;
        double cmInAln = centimeter * 0.0168413174;
        double cmInInch =  centimeter * 0.3937;
        double cmInFeet = centimeter * 0.032808;

        System.out.println("Du är " + cmInFathom +" famn lång");
        System.out.println("Du är " + cmInAln +" aln lång");
        System.out.println("Du är " + cmInInch +" tum lång");
        System.out.println("du är " + cmInFeet +" fot lång");
    }

}
