package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String subject;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
Random random = new Random();

    public String getSubject() {
        return subject;
    }
void evaluate(Student s){
        int i = random.nextInt(5-2)+2;
System.out.println("Преподаватель "+ name + " оценил студента с именем "+ s.getName() +" по предмету " + subject +
        " на оценку " + i );
}

}
