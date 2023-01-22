// Vraag: had ik mijn opdracht FamilyTree met hoofdletter moeten noemen, in plaats van familyTree?
// Ik mis de org.example map, is dat een probleem?

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Person irene = new Person("Irene", "Judith", "Jurna", 32, "female");

        Person hanneke = new Person("Hanneke", "Johanna", "Abbring", 60, "female");

        Person martin = new Person("Martin", "Gerardus", "Jurna", 60, "male");

        Person joris = new Person("Joris", "Maarten", "Jurna", 30, "male");
        Person moos = new Person("Moos", "Joas", "Jurna", 0, "male");

        Pet stoffer = new Pet("Stoffer", 18, "Boerderijkat");
        Pet punk = new Pet("Punk", 10, "Maine Coon");
        Pet kela = new Pet("Kela", 12, "Asielkat");

        System.out.println(martin.getMiddleName());

        irene.addParents(hanneke, martin, irene);
        System.out.println(irene.getMother().getName());

        // Hier komt een handler uit (Person@372f7a8d). Hoe kan ik ervoor zorgen dat de namen van de kinderen uitgeprint worden? (dezelfde vraag bij de methode addPet onderaan in Main)
        joris.addChild(joris, moos);
        System.out.println(joris.getChildren());

        ArrayList<Person> siblingList = new ArrayList<>();
        irene.addSibling(irene, moos);
        siblingList.add(moos);
        System.out.println(siblingList.get(0).getName());

        // Methode getGrandChildren snap ik niet
//        martin.getGrandChildren();

        irene.addPet(irene, stoffer);
        irene.addPet(irene, kela);
        irene.addPet(irene, punk);
        irene.getPets();
        System.out.println(irene.getPets());
    }
}