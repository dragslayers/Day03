public class MergeTwoSortedLists {

    public static void main(String[] args) {

        int t1[] = { 1, 2, 3 };
        int t2[] = { 1, 3, 4 };
        int x = 0, z = 0;
        int t3[] = new int[6];
        int i = 0;

        while (i < t3.length) {

            if (t2[z] <= t1[x] || z == 3) {
                t3[i] = t2[z];
                System.out.println("z : " + z);
                z++;
                i++;
            }
            if (z == 3) {
                z = 2;
            }
            if (t1[x] <= t2[z] || x == 3) {
                t3[i] = t1[x];
                System.out.println("x : " + x);
                x++;
                i++;
            }
            if (x == 3) {
                x = 2;
            }

        }

        for (int j = 0; j < t3.length; j++) {
            System.out.println(t3[j]);
        }
    }
}
