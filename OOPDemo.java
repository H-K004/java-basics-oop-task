public class OOPDemo {
    public static void main(String[] args) {
        // Objects created from classes.
        Person person = new Person("Aarav", 21);
        Student student = new Student("Meera", 20, "BTech CSE", 89);
        Teacher teacher = new Teacher("Rohan", 35, "Java");

        // Getters and setters provide controlled access to private fields.
        person.setAge(22);
        System.out.println("Updated age: " + person.getAge());

        // Polymorphism: a Person reference can point to different subclasses.
        Person[] people = {person, student, teacher};
        for (Person item : people) {
            item.introduce(); // Runtime chooses the overridden method.
        }

        // Demonstrate a setter validating its input.
        student.setMarks(94);
        System.out.println(student.getName() + "'s updated marks: " + student.getMarks());
    }
}
