public class varargs {

    static int sum(int... arr) {
        int result = 0;
        for (int i : arr) {
            result = result + i;
        }

        return result;
    }

    public static void main(String[] Args) {
        System.out.println(sum(0, 1));
        System.out.println(sum(1, 99));
        System.out.println(sum(1, 2, 5, 6));
        System.out.println(sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

    }
}
