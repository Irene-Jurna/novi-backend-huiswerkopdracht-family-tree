public class Main {
    public static void main(String[] args) {

        // Variabelen (zet je boven de methode waarin je ze gebruikt)
        int number = 6;
        int input1 = 4;
        int input2 = 20;
        String name = "Henk";

        // Methodes
        hello();
        positiveOrNegative(number);
        positiveOrZeroOrNegative(number);
        bartender(name);
        sum(input1, input2);
    }

    // Gedrag methoden

    public static void sum(int input1, int input2) {
        int outcome = input1 + input2;
        System.out.println(outcome);
        System.out.println("Het kan ook met concatenatie: de som van deze getallen is " + (input1 + input2));
    }

    public static void bartender(String name) {
        int drinkChoice = 1;
        String drink;
        switch (drinkChoice) {
            case 0:
                drink = "chocolademelk";
                break;
            case 1:
                drink = "mango lassi";
                break;
            case 2:
                drink = "jasmin tea";
                break;
            case 3:
                drink = "ginger beer";
                break;
            default:
                drink = "water";
                break;
        }
        System.out.println(name + " bestelt " + drink);
    }

    public static void positiveOrZeroOrNegative(int number) {
        if (number > 0) {
            System.out.println("This number is positive!");
        } else if (number < 0) {
            System.out.println("This number is negative");
        } else {
            System.out.println("This number is zero");
        }
    }

    public static void positiveOrNegative(int number) {
        if (number > 0) {
            System.out.println("This number is positive!");
        } else {
            System.out.println("This number is negative");
        }
    }

    public static void hello() {
        System.out.println("Hello, world!");
    }
}
