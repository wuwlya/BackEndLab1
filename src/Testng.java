public class Testng {
    public static void main(String[] args) {
        Cat kisa = new Cat("Нала", 3, "Платон");
        System.out.println(kisa.getName());
        System.out.println(kisa.getAge());
        System.out.println(kisa.getOwnerName());
        kisa.meow();
        kisa.drinkMilk();
        kisa.jump();
    }
}
