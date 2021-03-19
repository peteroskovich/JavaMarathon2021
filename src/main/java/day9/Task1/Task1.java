package day9.Task1;

public class Task1 {
    public static void main(String[] args) {

        Student s = new Student("Вася", "Школьники");
        Teacher t = new Teacher("Мария", "Алгебра");
        System.out.println(s.getGroupName());
        System.out.println(t.getSubjectName());
        s.printInfo();
        t.printInfo();
    }
}
