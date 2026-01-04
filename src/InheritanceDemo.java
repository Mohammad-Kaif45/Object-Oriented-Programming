public class InheritanceDemo {
    // Super class
    static class Animal { 
        void eat(){
            System.out.println("Animal is eating");
        }
    }

    // Child class or a Sub class
    static class Dog extends Main.Animal {
        void bark(){
            System.out.println("Dog is barking....");
        }
    }

    public static void main(String[] args) {
        Main.Animal obj1 = new Main.Animal();
        obj1.eat();
        Main.Dog obj2 = new Main.Dog();
        obj2.bark();
        obj2.eat();
    }
}
