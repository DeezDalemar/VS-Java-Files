public class testArray {
    public static void main(String[] args) {
        int[] b = { 75, 23, 78, 89 };
        
        int[] a = new int[5 /*the number of elements in an array */];

        System.out.println(b[0]);

        b[0] = 1;

        System.out.println(b[0]);

        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);

            b[0] += 1;

            System.out.println(b[0]);
        }
    }
}
