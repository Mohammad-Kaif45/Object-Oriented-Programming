public class PolymorphismDemo {

    //This happens between a Parent and Child class. The method name and parameters are exactly the same, but the Child provides its own specific implementation.
    // Method overriding -> Run Time Polymorphism
    static class Car {
        void color(){
            System.out.println("Car is white");
        }

    }

    static class BMW{
        void color(){
            System.out.println("BMW is Black");
        }
    }

    // Method Overloading -> Compile time polymorphism
    // This happens within the same class. You use the same method name, but with different parameters (inputs). The compiler decides which one to run based on what data you pass it.
    static class Calc {
        void add(int a,int b){
            System.out.println(a+b);
        }

        void add(float a, float b){
            System.out.println(a + b);
        }

        void add(double a, double b){
            System.out.println(a + b);
        }

    }
    public static void main(String[] args) {
        Car obj1 = new Car();
        BMW obj2 = new BMW();
        obj1.color();
        obj2.color();
        Calc obj3 = new Calc();
        obj3.add(2,3);
        obj3.add(2.0,4.0);
        obj3.add(4,8);
    }
}
