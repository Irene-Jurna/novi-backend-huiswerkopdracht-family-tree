import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PetTest {
    @Test
    void test_getName() {
        // Arrange
        Pet punk = new Pet("Punk", 10, "Maine Coon");

        // Act
        String name = punk.getName();

        // Assert
        assertEquals("Punk", name);
    }

    @Test
    void test_getAge() {
        // Arrange
        Pet punk = new Pet("Punk", 10, "Maine Coon");

        // Act
        int age = punk.getAge();

        // Assert
        assertEquals(10, age);
    }

    @Test
    void test_getSpecies() {
        Pet punk = new Pet("Punk", 10, "Maine Coon");

        // Act
        String species = punk.getSpecies();

        // Assert
        assertEquals("Maine Coon", species);
    }

    @Test
    void test_setOwner() {
        Pet punk = new Pet("Punk", 10, "Maine Coon");
        Person irene = new Person("Irene", "Judith", "Jurna", 32, "female");

        // Act
        punk.setOwner(irene);
        String owner = punk.getOwner().getName();

        // Assert
        assertEquals("Irene", owner);
    }

}
