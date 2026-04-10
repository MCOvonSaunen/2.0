import java.util.Scanner;

public class User_Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vorname eingeben: ");
        String vorname = scanner.nextLine();
        System.out.println("Nachname eingeben: ");
        String nachname = scanner.nextLine();
        System.out.println("Guten Tag, " + vorname + " " + nachname);
    }
}
