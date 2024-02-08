package assignment2_part1;

public class EvenOddPartitioner {

    public void partition(int[] data) {
        int[] evenArray = new int[data.length];
        int[] oddArray = new int[data.length];
        int evenCnt = 0, oddCnt = 0;

        for (int i = 0; i < data.length; i++) {
            if (data[i] % 2 == 0) {
                evenArray[evenCnt++] = data[i];
            } else {
                oddArray[oddCnt++] = data[i];
            }
        }

        System.out.println("Original Array:");
        printArray(data);
        System.out.println("Even Array:");
        printArray(evenArray, evenCnt);
        System.out.println("Odd Array:");
        printArray(oddArray, oddCnt);
    }

    private void printArray(int[] array, int length) {
        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
    }

    private void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + "\t");
        }
        System.out.println();
    }
}
