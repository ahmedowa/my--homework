
class Animals {
    String name;
    int runlimit;
    int swimlimit;
    static int animalCount = 0;
    static int catCount = 0;
    static int dogCount = 0;

    public Animals(String name) {
        this.name = name;
        animalCount++;
    }
    public void run(int a) {
        if (a <= runlimit) {
            System.out.println(name + " пробежал " + a + " м.");
        } else { System.out.println(name + " не смог пробежать.");
        }
    }
    public void swim(int b) {
        if (swimlimit == 0) {
            System.out.println(name + " не умеет плавать.");
        } else if (b <= swimlimit) {
            System.out.println(name + " проплыл " + b + " м.");
        } else { System.out.println(name + " не смог проплыть.");
        }
    }
}
class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public boolean decreaseFood(int amount) {
        if (food >= amount) {
            food -= amount;
            return true;
        } return false;
    }
    public void addFood(int amount) {
        if (amount > 0) {
            food += amount;
        }
    }
    public void info() {
        System.out.println("В миске осталось еды: " + food);
    }
}
class Cat extends Animals {
    public boolean isHungry;
    public int appetite;
    public Cat(String name, int appetite) {
        super(name);
        this.runlimit = 200;
        this.swimlimit = 0;
        this.isHungry = false;
        this.appetite = appetite;
        catCount++;
    }
    public void eat(Plate plate) {
        if (plate.decreaseFood(appetite)) {
            isHungry = true;
            System.out.println(name + " покушал и сыт.");
        } else { System.out.println(name + " не стал есть, мало еды.");
        }
    }
}
class Dog extends Animals {
    public Dog(String name) {
        super(name);
        this.runlimit = 500;
        this.swimlimit = 10;
        dogCount++;
    }
}
public class Main {
    public static void main(String[] args) {
        Dog dogBobik = new Dog("Бобик");
        dogBobik.run(150);
        Cat catSonya = new Cat ("Соня" , 15);
        catSonya.swim(5);
        Plate plate = new Plate(30);
        plate.info();

        Cat[] cats= {
              
                new Cat("Барсик", 20),
                new Cat("Мурзик", 10)};
        for (Cat cat : cats) {
            cat.eat(plate);
        }
        for (Cat cat : cats) {
            System.out.println("Кот " + cat.name + " сыт? " + (cat.isHungry ? "Да" : "Нет"));
        }
        plate.info();
        System.out.println("Всего создано животных: " + Animals.animalCount);
        System.out.println("Из них котов: " + Animals.catCount);
        System.out.println("Из них собак: " + Animals.dogCount);
    }
