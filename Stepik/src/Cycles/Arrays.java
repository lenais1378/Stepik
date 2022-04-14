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
        int[] a3 = new int[a1.length + a2.length];
        int index_a1 = 0, index_a2 = 0;
       for (int i = 0; i < a3.length; i++) {
           if (index_a1 > a1.length-1) {


                if (a1[i] < a2[i]) {
                    a3[i] = a1[i];
                }
                else {
                    a3[i] = a2[i];
                }

            }
        }



    }
}
