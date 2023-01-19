import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Maak een Integer en String Array
        Integer[] numeric = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String[] alphabetic = {"een", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "nul"};

        // Maak een boolean variabele, String variabele en een nieuw Scanner object
        boolean play = true;
        String ongeldig = "ongeldige invoer";
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        // Constructor uit de klasse Translator aanroepen via nieuw object type Translator
        Translator translate= new Translator(alphabetic, numeric);

        // While-loop
        while (play) {
            System.out.println("Type 'x' om te stoppen \nType 'v' om te vertalen");

            if (input.equals("x")) {
                play = false;
            } else if (input.equals("v")) {
                System.out.println("Type een cijfer in van 0 t/m 9");
                int number = scanner.nextInt();
                scanner.nextLine();
                if (number < 10 ) {
                    System.out.println("Hier moet ik nog iets doen");
                } else {
                    System.out.println(ongeldig);
                }
            } else {
                System.out.println(ongeldig);
            }
        }

    }
}
