import org.jetbrains.annotations.NotNull;

import static java.lang.System.exit;

public class Task3 {
    public static void main(String[] args) {
        int[] res = new int[10];
        int[] mas1 = {1,2,3,4,5,6,7,8,9,0};
        int[] mas2 = {0,9,8,7,6,5,4,3,2};
        for (int i:getdifference(mas1, mas2)) {
            System.out.print(i + " ");
        }

    }
    static int[] getdifference(int @NotNull [] a, int[] b){
        int[] result = new int[a.length];
        try {
            for (int i = 0; i < a.length; i++) {
                result[i] = a[i] /  b[i];
            }
        } catch (RuntimeException e){
            System.out.println("Lengths of array is not equal!");
            exit(0);
        }
        return result;
    }

}
