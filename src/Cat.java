public class Cat {
    private String name;
    private int age;
    private String ownerName;

    public Cat(String name, int age, String ownerName) {
        this.name = name;
        this.age = age;
        this.ownerName = ownerName;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void meow() {
        System.out.println("Мяу!");
    }

    public void drinkMilk() {
        System.out.println(name + " лакает молоко.");
    }

    public void jump() {
        System.out.println(name + " скачет.");
    }
}
