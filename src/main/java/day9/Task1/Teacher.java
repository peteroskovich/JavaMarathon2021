package day9.Task1;

public class Teacher extends Human {
    private String subjectName;

    public String getSubjectName() {
        return subjectName;
    }

    public Teacher(String name, String subjectName) {
        super(name);
        this.subjectName = subjectName;

    }

    @Override
    public void printInfo() {
        System.out.println("Этот человек с именем " + name);
            System.out.println("Этот преподаватель с именем "+ super.name);
    }
}
