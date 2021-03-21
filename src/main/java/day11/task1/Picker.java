package day11.task1;

public class Picker implements Worker {
    private int salary;
    private boolean isPayed;
    private Warehouse w;



    public int getSalary() {
        return salary;
    }

    public boolean getIsPayed() {
        return isPayed;
    }

    @Override
    public String toString() {
        return "salary='" + salary + '\'' +
                ", isPlayed=" + isPayed;
    }

    public Picker(int salary, Warehouse w) {

        this.salary = salary;
        this.w = w;

    }

    public void doWork() {
        salary += 80;
        w.increaseCountPickOrders();
    }

    public void bonus() {
        if (w.getCountPickOrders() == 10000) {
            salary += 70000;
            isPayed = true;
            return;
        }  if (isPayed == true) {
            System.out.println("Бонус уже был выплачен");
            return;
        } else
            System.out.println("Бонус пока не доступен");
        return;
    }
}