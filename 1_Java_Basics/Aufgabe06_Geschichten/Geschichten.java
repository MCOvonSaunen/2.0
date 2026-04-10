import java.util.Scanner;

public class Geschichten {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ich werde Dier eine Geschichte erzählen, aber ich brauche zuerst ein paar Informationen.");
        System.out.println("Wie heißt der Hauptcharakter?");
        String name = scanner.nextLine();
        System.out.println("Was ist sein / ihr Job?");
        String job = scanner.nextLine();
        System.out.println("Hier ist die Geschichte: "+"\n"+"Es war einmal "+ name +", ein " + job +"."+"\n"+"Auf dem Weg zum Arbeit dachte "+ name + ", über das Leben nach."+"\n"+"Vielleicht wird "+ name + " nicht für immer ein " + job + " sein.");
    }
}   