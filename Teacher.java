public class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        setSubject(subject);
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        if (subject == null || subject.trim().isEmpty()) {
            throw new IllegalArgumentException("Subject cannot be empty.");
        }
        this.subject = subject;
    }

    @Override
    public void introduce() {
        System.out.println("I am " + getName() + ", and I teach " + subject + ".");
    }
}
