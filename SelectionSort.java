public class SelectionSort {

    public static void main(String[] args) {
        int[] array = {4, 5,3 ,33, 2 ,544 ,53,1, 565,35464, 3523,32};

        System.out.println("Original array:");
        printArray(array);

        selectionSort(array);

        System.out.println("Sorted array");
        printArray(array);
    }

    private static void selectionSort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int indexOfSmallest = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[indexOfSmallest]) {
                    indexOfSmallest = j;
                }
            }

            if (i != indexOfSmallest) {
                int newSmallest = array[indexOfSmallest];
                array[indexOfSmallest] = array[i];
                array[i] = newSmallest;
            }
        }

    }

    private static void printArray(int[] array) {
        for (int number : array) {
            System.out.print(number + " ");
        }

        System.out.println();
    }


//    public static void main(String[] args) {
//        Integer[] unsortedArray = new Integer[10];
//
//        for (int i = 0; i < 10; i++) {
//            unsortedArray[i] = (int) (Math.random() * 100);
//        }
//
//        for (Integer number : unsortedArray) {
//            System.out.print(number + ",");
//        }
//
//        System.out.println();
//
//        Integer[] sortedArray = selectionSort(unsortedArray);
//
//
//        for (Integer number : sortedArray) {
//            System.out.print(number + ",");
//        }
//
//        System.out.println();
//    }

//    private static Integer[] selectionSort(Integer[] unsortedArray) {
//        Integer[] sortedArray = new Integer[unsortedArray.length];
//
//        for (int i = 0; i < unsortedArray.length; i++) {
//
//            int smallestIndex = findSmallestIndex(unsortedArray);
//            sortedArray[i] = unsortedArray[smallestIndex];
//            unsortedArray[smallestIndex] = null;
//        }
//
//        return sortedArray;
//    }
//
//    private static int findSmallestIndex(Integer[] unsortedArray) {
//        int smallestIndex = 0;
//
//        for(int i = 0; i < unsortedArray.length; i++) {
//            if (unsortedArray[smallestIndex] == null) {
//                smallestIndex++;
//            }
//
//            if (unsortedArray[i] != null  && unsortedArray[i] < unsortedArray[smallestIndex]) {
//                smallestIndex = i;
//            }
//        }
//
//        return smallestIndex;
//    }
}
