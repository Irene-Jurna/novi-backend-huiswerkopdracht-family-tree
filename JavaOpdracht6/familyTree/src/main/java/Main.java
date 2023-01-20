// Vraag: had ik mijn opdracht FamilyTree met hoofdletter moeten noemen, in plaats van familyTree?
// Ik mis de org.example map, is dat een probleem?

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

        irene.addParents(hanneke, martin);
        System.out.println(irene.getMother().getName());

        // Hier komt een handler uit (Person@372f7a8d). Hoe kan ik ervoor zorgen dat de namen van de kinderen uitgeprint worden?
        joris.addChild(joris, moos);
        System.out.println(joris.getChildren());

        // Deze methode werkt niet (komt null uit). Hoe kan ik dit werkend krijgen?
        irene.addSibling(irene, moos);
        System.out.println(irene.getSiblings());

        // Methode getGrandChildren snap ik niet
//        martin.getGrandChildren();

        // Deze methode werkt ook niet (komt null uit).
        irene.addPet(irene, stoffer);
        irene.addPet(irene, kela);
        irene.addPet(irene, punk);
        irene.getPets();
    }
}
