import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTest {

    @Test
    void should_Return_Parents() {
        // Arrange
        Person irene = new Person("Irene", "Judith", "Jurna", 32, "female");

        Person hanneke = new Person("Hanneke", "Johanna", "Abbring", 60, "female");

        Person martin = new Person("Martin", "Gerardus", "Jurna", 60, "male");

        // Act
        irene.addParents(hanneke, martin, irene);

        // Assert
        assertEquals("Hanneke", irene.getMother().getName());
        assertEquals("Martin", irene.getFather().getName());
    }

    @Test
    void should_Return_Children() {
        // Arrange
        Person joris = new Person("Joris", "Maarten", "Jurna", 30, "male");
        Person moos = new Person("Moos", "Joas", "Jurna", 0, "male");

        // Act
        joris.addChild(joris, moos);

        List<Person> kids = new ArrayList<>();
        kids.add(moos);

        // Assert
        assertEquals(kids, joris.getChildren());
    }

    @Test
    void should_Return_Siblings() {
        // Arrange
        Person irene = new Person("Irene", "Judith", "Jurna", 32, "female");
        Person moos = new Person("Moos", "Joas", "Jurna", 0, "male");

        // Act
        irene.addSibling(irene, moos);

        List<Person> siblingList = new ArrayList<>();
        siblingList.add(moos);
        irene.setSiblings(siblingList);

        // Assert
        assertEquals(siblingList, irene.getSiblings());

        /*
        Of (uit huiswerkklas Johan):
        assertEquals("Moos", irene.getSiblings().get(0).getName());
         */
    }

    @Test
    void shoud_Return_GrandChildren() {
        // Arrange
        Person martin = new Person("Martin", "Gerardus", "Jurna", 60, "male");
        Person moos = new Person("Moos", "Joas", "Jurna", 0, "male");

        // Act
        // Vergelijking
        ArrayList<Person> grandchildren = new ArrayList<>();
        grandchildren.add(moos);

        // En dan hier de methode toevoegen, maar die begreep ik niet (zie Person.java)

        // Assert
        // ???
    }

    @Test
    void should_Return_Pet() {
        // Arrange
        Person irene = new Person("Irene", "Judith", "Jurna", 32, "female");
        Pet stoffer = new Pet("Stoffer", 18, "Boerderijkat");
        Pet punk = new Pet("Punk", 10, "Maine Coon");
        Pet kela = new Pet("Kela", 12, "Asielkat");

        // Act
        irene.addPet(irene, stoffer);
        irene.addPet(irene, punk);
        irene.addPet(irene, kela);

        List<Pet> pets = new ArrayList<>();
        pets.add(stoffer);
        pets.add(punk);
        pets.add(kela);

        // Arrange
        assertEquals(pets, irene.getPets());
    }

}