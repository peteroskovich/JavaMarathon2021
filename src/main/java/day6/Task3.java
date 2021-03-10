package day6;

public class Task3 {
    public static void main(String[] args) {
Teacher t = new Teacher();
t.setName("Людмила");
t.setSubject("Математика");
Student s= new Student();
s.setName("Павел");
t.evaluate(s);
    }
}
