package day9.Task1;

public class Student extends Human {
    private String groupName;
    private String n;

    public String getGroupName() {
        return groupName;
    }

    public Student(String name, String groupName) {
        super(name);
        this.groupName = groupName;
    }

    public void printInfo() {
        System.out.println("Этот человек с именем " + name);
        System.out.println("Этот студент с именем "+ super.name);
    }
}
