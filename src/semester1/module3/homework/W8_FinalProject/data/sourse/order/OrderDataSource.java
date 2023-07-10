package semester1.module3.homework.W8_FinalProject.data.sourse.order;

import semester1.module3.homework.W8_FinalProject.data.models.Order;

public abstract class OrderDataSource {
    public abstract void createOrder(Order order);
    public abstract Order getOrder();
}
