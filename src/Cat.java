// Cat class definition
public class Cat {

    // instance variables
    private String name;
    private int age;
    private double weight;
    private String toy;

    // constructor
    public Cat(String catName, int catAge, double catWeight, String favToy) {
        name = catName;
        age = catAge;
        weight = catWeight;
        toy = favToy;
    }

    // method that introduces the Cat
    public void introduce() {
//        System.out.println("Hello my name is " + name);
        if (age>6) {
            System.out.println("Hello my name is " + name + " and I am an older cat");
        }else{
            System.out.println("Hello my name is " + name + " and I am a younger cat");
        }
    }

    // method that prints Cat info
    public void printCatInfo() {

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
    }
    public void printCatToy() {
        System.out.println("My favorite toy is" + toy);

    }
}
