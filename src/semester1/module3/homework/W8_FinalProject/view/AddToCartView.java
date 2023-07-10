package semester1.module3.homework.W8_FinalProject.view;

import semester1.module3.homework.W8_FinalProject.data.services.ShopService;

import java.util.ArrayList;
import java.util.Scanner;

public class AddToCartView extends AppView {
    final ShopService shopService;

    public AddToCartView(ShopService shopService) {
        super("Add to cart", new ArrayList<>());
        this.shopService = shopService;
    }

    @Override
    public void action() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter product id: ");
        String productId = scanner.nextLine();
        System.out.println();

        System.out.print("Enter product count: ");
        int count = scanner.nextInt();

        System.out.println();

        boolean result = shopService.addToCart(productId, count);
        if (result) {
            System.out.println("Success");

        } else {
            System.out.println("Failure");
        }
        System.out.println();

    }
}
