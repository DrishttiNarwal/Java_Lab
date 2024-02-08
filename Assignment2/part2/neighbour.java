package assignment2_part2;

public class shortest_neighbor_distance {
    public static int findneighbors(int[] array) {
        if (array.length < 2) {
            return -1;
        }

        int minDistance = Integer.MAX_VALUE;
        int minIndex = 0;

        for (int i = 0; i < array.length - 1; i++) {
            int distance = Math.abs(array[i] - array[i + 1]);

            if (distance < minDistance) {
                minDistance = distance;
                minIndex = i;
            }
        }

        return minIndex;
    }
}
