public class CatRunner {
    public static void main(String[] args) {
    Cat cat1 = new Cat ("fat", 5,10,"mouse toy");
    cat1.introduce();
    Cat cat2 = new Cat ("5",5, 10,"nothing");
    cat2.introduce();
    cat2.printCatInfo();
    Cat cat3 = new Cat ("BARRY", 4,15, "a yarn ball");
    cat3.introduce();
    cat3.printCatInfo();
    cat3.printCatToy();
    }
}
