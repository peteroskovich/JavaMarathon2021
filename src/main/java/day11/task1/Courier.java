package day11.task1;

public class Courier implements Worker {
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
        return "salary=" + salary +
                ", isPayed=" + isPayed;
    }

    public Courier(int salary, Warehouse w) {

        this.salary = salary;
        this.w = w;
    }

    public void doWork() {
        salary += 100;
        w.increaseDeliveredOrders();
    }

    ;

    public void bonus() {
        if (w.getCountDeliveredOrders() == 10000) {
            salary += 50000;
            isPayed = true;
            return;
        } if (isPayed == true) {
            System.out.println("Бонус уже был выплачен");
            return;
        } else
            System.out.println("Бонус пока не доступен");
        return;
    }

    ;
}
