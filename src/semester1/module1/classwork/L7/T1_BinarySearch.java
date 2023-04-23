package semester1.module1.classwork.L7;

public class T1_BinarySearch {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        int result = 0;
        int search = 7;

        int firstIndex = 0;
        int lastIndex = array.length;

        while (firstIndex <= lastIndex) {

            int middleIndex = (firstIndex + lastIndex) / 2;

            if (search < array[middleIndex]) {
                lastIndex = middleIndex - 1;

            } else if (search > array[middleIndex]) {
                firstIndex = middleIndex + 1;

            } else {
                result = middleIndex;
                break;
            }
        }

        System.out.println(result);
    }
}
