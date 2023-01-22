import java.util.ArrayList;
import java.util.List;

public class Person {

    // Attributes
    private String name;
    private String middleName;
    private String lastName;
    private String sex;
    private int age;
    private Person mother;
    private Person father;
    private List<Person> children;
    private List<Person> siblings;
    private List<Pet> pets;

    // Constructor 1
    public Person(String firstName, String lastName, int age, String sex) {
        this.name = firstName;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
    }

    // Constructor 2
    public Person(String firstName, String middleName, String lastName, int age, String sex) {
        this.name = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public Person getMother() {
        return mother;
    }

    public Person getFather() {
        return father;
    }

    public List<Person> getSiblings() {
        return siblings;
    }

    public List<Person> getChildren() {
        return children;
    }

    public List<Pet> getPets() {
        return pets;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public void setSiblings(List<Person> siblings) {
        this.siblings = siblings;
    }

    public void setChildren(List<Person> children) {
        this.children = children;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }

    // Methods
    public void addParents(Person mother, Person father, Person child) {
        child.setMother(mother);
        child.setFather(father);

        addChild(mother, child);
        addChild(father, child);
    }

    public void addChild(Person parent, Person child) {
        List<Person> kids = new ArrayList<>();
        if (parent.getChildren() != null) {
            // For-loop zonder index. 'c' is de naam van de variabele binnen de for-lus
            for (Person c : parent.getChildren()) {
                kids.add(c);
            }
        } else {
            kids.add(child);
        }
        parent.setChildren(kids);
    }

    public void addSibling(Person person, Person sibling) {
        List<Person> siblingsList = new ArrayList<>();
        if (person.getSiblings() != null) {
            siblingsList.addAll(getSiblings());
        }
        siblingsList.add(sibling);
        person.setSiblings(siblingsList);
    }

    // Uit de huiswerkles, maar ik begrijp deze methode niet
    public List<Person> getGrandChildren(Person person) {
        // Vraag: wat is het verschil in het gebruik van ArrayList<> en List<> op de volgende regel?
        List<Person> grandchildren = new ArrayList<>();
        for (Person child : children) {
            for (Person grandChild : child.getChildren()) {
                grandchildren.addAll(grandChild.getChildren());
            }
        }
        return grandchildren;
    }

    public void addPet(Person owner, Pet pet) {
        List<Pet> petsList = new ArrayList<>();
        if (owner.getPets() != null) {
            petsList.addAll(owner.getPets());
        }
        petsList.add(pet);
        owner.setPets(petsList);
    }
}