package semester1.module3.classwork.W1_generics;

public class T2_twoElements {
    public static void main(String[] args) {
        TwoCellsBox<Paper, Plastic> paperPlasticBox = new TwoCellsBox<>();
    }
}

class TwoCellsBox<T, S> {

    private T firstCellItem;
    private S secondCellItem;

    public void setFirstCellItem(T firstCellItem) {
        this.firstCellItem = firstCellItem;
    }

    public void setSecondCellItem(S secondCellItem) {
        this.secondCellItem = secondCellItem;
    }

    public T getFirstCellItem() {
        return firstCellItem;
    }

    public S getSecondCellItem() {
        return secondCellItem;
    }


}