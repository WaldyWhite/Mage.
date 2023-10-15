public class Main {
    public static void main(String[] args) {
        Mage mage1 = new Mage("Waldy", 2,8, "earth");
        Mage mage2 = new Mage("Ydlaw", 2,9, "earth");
        System.out.println(mage2.fight(mage1));
        System.out.println(mage2.getInfo());
    }
}