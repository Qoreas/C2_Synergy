package semester1.module3.homework.W8_FinalProject.data.sourse.order;

import semester1.module3.homework.W8_FinalProject.data.models.Order;

public class MockOrderDataSourceImpl extends OrderDataSource {
    private Order order;

    @Override
    public void createOrder(Order order) {
        this.order = order;
    }

    @Override
    public Order getOrder() {
        return order;
    }
}
