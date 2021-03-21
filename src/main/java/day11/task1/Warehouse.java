package day11.task1;

public class Warehouse {
    private int countPickOrders;
    private int countDeliveredOrders;

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    public int getCountPickOrders() {
        return countPickOrders;
    }


    public void increaseCountPickOrders() {
        countPickOrders++;
    }

    public void increaseDeliveredOrders() {
        countDeliveredOrders++;
    }

    @Override
    public String toString() {
        return "Количество собранных заказов " + countPickOrders + '\'' +
                "Количество доставленных заказов " + countDeliveredOrders;
    }
}
