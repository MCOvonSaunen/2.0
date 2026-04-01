public class Steckbrief {
    public static void main(String[] args) {
        int alter = 19;
        int geburtsjahr = 2006;
        int gehalt = 2200;
        String handynummer = "0660 3216850";
        float körpergröße = 1.84F;
        float gewicht = 95;
        boolean führerschein = true;
        char note = 'A';

        System.out.println("=== Mein Steckbrief ===");
        System.out.println("Alter: " + alter + " Jahre");
        System.out.println("Geburtsjahr: " + geburtsjahr);
        System.out.println("Gehalt: " + gehalt + " Euro");
        System.out.println("Handynummer: " + handynummer);
        System.out.println("Körpergröße: " + körpergröße + " m");
        System.out.println("Gewicht: " + gewicht + " kg");
        System.out.println("Führerschein: " + führerschein);
        System.out.println("Lieblingsnote: " + note);
    }
}