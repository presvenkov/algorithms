public class BinarySearch {

    public static void main(String[] args) {

        int[] intArray = {1, 3, 4, 5, 7, 88, 99};

        int valueSearching = 1;

        System.out.println("LinSearch:" + linearSearch(intArray, valueSearching));
        System.out.println("BinSearch:" + binarySearch(intArray, valueSearching));

    }

    private static int linearSearch(int[] array, int valueSearching) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valueSearching) {
                return i;
            }
        }

        return -1;
    }

    private static int binarySearch(int[] array, int valueSearching) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;
            //beware the binary search bug (right+left) / 2 that might overflow
            //You have left < right by definition.
            //As a consequence, right - left > 0, and furthermore left + (right - left) = right (follows from basic algebra).
            //And consequently left + (right - left) / 2 <= right. So no overflow can happen since every step of the operation is bounded by the value of right.
            //It's never going to overflow over the length of a 32 bit integer

            if (array[mid] == valueSearching) {
                return mid;
            }
            else if (array[mid] > valueSearching) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;
    }
}
