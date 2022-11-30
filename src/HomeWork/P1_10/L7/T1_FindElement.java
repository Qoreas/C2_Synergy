package HomeWork.P1_10.L7;

public class T1_FindElement {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        int result = 0;
        int search = 10;
        int firstIndex = 0;
        int lastIndex = array.length;
        boolean done = false;

        while (firstIndex <= lastIndex) {
            int middle = (firstIndex + lastIndex) / 2;

            if (search < array[middle]) {
                lastIndex = middle - 1;

            } else if (search > array[middle]) {
                firstIndex = middle + 1;

            } else {
                done = true;
                result = search;
                System.out.println("index: " + middle);
                break;
            }
        }

        if (done) {
            System.out.println("Number found: " + result);
        } else {
            System.out.println("Number not found");
        }
    }
}
