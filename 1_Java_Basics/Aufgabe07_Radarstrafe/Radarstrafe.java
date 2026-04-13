import java.util.Scanner;

public class Radarstrafe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wie schnell fährst du (in km/h)?");
        String eingabe = scanner.nextLine();
        float kmh = Float.parseFloat(eingabe);
        if (kmh < 70) {
            System.out.println("Schönen Tag noch fahren sie weiter..."); 
        }
        if (kmh >= 71) {
            System.out.println("RADARSTRAFE!");
        }
    }
}