public class EncapsulationDemo {

    // Encapsulation in Java is the mechanism of wrapping data (variables) and code
    //(methods) together as a single unit (class) and restricting access to the internal
    //state of the object.
    // It is achieved by declaring the variables of a class as private and providing
    // public getter and setter methods to access and modify the data.

    static class Person {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            if (name == null || name.trim().isEmpty()) {
                System.out.println("Error: Name cannot be empty!");
            } else {
                this.name = name; // Only assign if valid
            }
        }
    }
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("");
        System.out.println("Name : " + person.getName());
    }
}
