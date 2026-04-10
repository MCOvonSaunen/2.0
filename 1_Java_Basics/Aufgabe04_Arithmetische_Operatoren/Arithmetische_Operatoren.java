public class Arithmetische_Operatoren {
    public static void main(String[] args) {
        int y = 13;
        int x = 14;

        System.out.println(x + y); //24
        System.out.println(x - y); //1
        System.out.println(x * y); //182
        System.out.println((float)x / y); //1.0769
        System.out.println((float)x % (float)y); //1.0769

        int z = 25;

        System.out.println(++z); //26
        System.out.println(--z); //24
    }
}
