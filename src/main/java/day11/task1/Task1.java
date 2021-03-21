package day11.task1;

public class Task1 {
    static void businessProcess(Worker worker) {
        for (int i = 0; i < 5000; i++) {
            worker.doWork();
        }
    }

    public static void main(String[] args) {
        Warehouse W = new Warehouse();
        Courier w1 = new Courier(0,  W);
        Picker w2 = new Picker(0, W);
        Courier w3=new Courier(0,W);
        Picker w4= new Picker(0,W);
        businessProcess(w2);
        businessProcess(w1);
        businessProcess(w3);
        businessProcess(w4);

        System.out.println("Количество собранных заказов " + W.getCountPickOrders());
        System.out.println("Количество доставленных заказов " + W.getCountDeliveredOrders());
        w2.bonus();
        w1.bonus();
        w3.bonus();
        w4.bonus();
        System.out.println("Зарплата курьера " + w1.getSalary());
        System.out.println("Зарплата сборщика  " + w2.getSalary());
        w3.toString();
        w4.toString();
        Warehouse W1 = new Warehouse();
        System.out.println( W1.getCountPickOrders() + "\n" + W1.getCountPickOrders() );

    }
}

