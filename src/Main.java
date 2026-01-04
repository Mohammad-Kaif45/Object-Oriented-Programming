public class Main {

    // Super class
    static class Animal {

        void sound(){
            System.out.println("Animal makes a sound....");
        }
        void eat(){
            System.out.println("Animal is eating");
        }

    }

    // Child class or a Sub class
    static class Dog extends Animal{
        void sound(){
            System.out.println("Dog barks...");
        }
        void bark(){
            System.out.println("Dog is barking....");
        }
    }
    public static void main(String[] args) {
        Animal obj1 = new Animal();
//        obj1.eat();
        obj1.sound();
        Dog obj2 = new Dog();
//        obj2.bark();
//        obj2.eat();
        obj2.sound();
    }
}