package semester1.module3.homework.W8_FinalProject.view;

import java.util.ArrayList;

public abstract class AppView {
    public final String title;
    public final ArrayList<AppView> children;

    public AppView(String title, ArrayList<AppView> children) {
        this.title = title;
        this.children = children;
    }

    public void action() {};

    public void displayChildren() {
        System.out.println(title);
        System.out.println("Choose from 1 to " + (children.size() + 1) + ": ");
        for (int i = 0; i < children.size(); i++) {
            AppView _view = children.get(i);
            System.out.println(i + 1 + " - " + _view.title);
        }
        System.out.println(children.size() + 1 + " - Back");
    }
}
