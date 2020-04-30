public class PrintArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        double[] b = {1.1, 2.2, 3.3};
        char[] c = {'a', 'b', 'c'};
        toPrint(a);
        toPrint(b);
        toPrint(c);
    }

    public static void toPrint(int[] a) {
        for(int myArray:a)
        System.out.println(myArray);
    }

    public static void toPrint(double[] b) {
        for (double myArray:b)
        System.out.println(myArray);
    }

    public static void toPrint(char[] c) {
        for (char myArray:c)
            System.out.println(myArray);
    }
}
