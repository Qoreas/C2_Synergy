package semester1.module3.homework.W8_FinalProject.controller;

import semester1.module3.homework.W8_FinalProject.view.AppView;

import java.util.Scanner;

public class ShopController {
    final AppView view;

    public ShopController(AppView view) {
        this.view = view;
    }

    public void run() {
        while (true) {
            view.action();
            view.displayChildren();

            Scanner scanner = new Scanner(System.in);
            int value = scanner.nextInt();

            if (checkValue(value)) {
                System.out.println("Wrong value.");
            } else if (value == view.children.size() + 1) {
                break;
            } else {
                AppView selectedView = view.children.get(value - 1);
                new ShopController(selectedView).run();
            }
        }
    }

    private boolean checkValue(int value) {
        return value < 0 || value > view.children.size() + 1;
    }

    public static void addToCartController() {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter product id: ");
//        String productId = scanner.nextLine();
//        System.out.println();
//
//        System.out.print("Enter product count: ");
//        int count = scanner.nextInt();
//
//        System.out.println();
//
//        boolean result = shopService.addToCart(productId, count);
//        if (result) {
//            System.out.println("Success");
//
//        } else {
//            System.out.println("Failure");
//        }
//        System.out.println();

    }
}
