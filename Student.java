public class Student extends Person {
    private String course;
    private int marks;

    public Student(String name, int age, String course, int marks) {
        super(name, age); // Calls the Person constructor.
        setCourse(course);
        setMarks(marks);
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        if (course == null || course.trim().isEmpty()) {
            throw new IllegalArgumentException("Course cannot be empty.");
        }
        this.course = course;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        if (marks < 0 || marks > 100) {
            throw new IllegalArgumentException("Marks must be between 0 and 100.");
        }
        this.marks = marks;
    }

    @Override
    public void introduce() {
        System.out.println("I am " + getName() + ", studying " + course
                + ". My marks are " + marks + "/100.");
    }
}
