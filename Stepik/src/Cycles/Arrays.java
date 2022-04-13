package Cycles;

public class Arrays {
    /**
     * Merges two given sorted arrays into one
     *
     * @param a1 first sorted array
     * @param a2 second sorted array
     * @return new array containing all elements from a1 and a2, sorted
     */
    public static int[] mergeArrays(int[] a1, int[] a2) {
        int index_a1 = 0, index_a2 = 0, res = 0;
        int[] result = new int[a1.length + a2.length];
        while (index_a1 < a1.length && index_a2 < a2.length) {
            if (a1[index_a1] < a2[index_a2]) {
                result[res++] = a1[index_a1++];
            } else {
                result[res++] = a2[index_a2++];
            }
        }
        if (index_a2==a2.length) {
            while (index_a1 < a1.length) {
                result[res++] = a1[index_a1++];
            }
        }
        if (index_a1==a1.length) {
            while (index_a2 < a2.length) {
                result[res++] = a2[index_a2++];
            }
        }
           return result;




    }
}
