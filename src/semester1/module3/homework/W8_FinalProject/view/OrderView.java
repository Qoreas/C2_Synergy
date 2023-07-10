package semester1.module3.homework.W8_FinalProject.view;

import semester1.module3.homework.W8_FinalProject.data.services.ShopService;

import java.util.ArrayList;
import java.util.Scanner;

public class OrderView extends AppView{
    final ShopService shopService;

    public OrderView(ShopService shopService) {
        super("Order", new ArrayList<>());
        this.shopService = shopService;
    }

    @Override
    public void action() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println();

        System.out.print("Enter your phone: ");
        String phone = scanner.nextLine();

        shopService.createOrder(name, phone, "address", "type", "20:00");
        System.out.println();
    }
}
