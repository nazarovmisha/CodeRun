import java.io.*;
import java.util.Arrays;

public class Dividers435 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        reader.close();
        if (number > 33000) {
            int[] arr = new int[number+1];
            for (int i = 0; i < number+1; i++) {
                if (i % 2 == 0)
                    if (i % 3 == 0)
                        if (i % 5 == 0)
                            if (i % 7 == 0)
                                    if (i % 13 == 0) {
                                        arr[i] = i;
                                    }
            }
            Arrays.sort(arr);
            int[] max = {0, 0};
            int res = 0;
            for (int k = 0; k <arr.length; k++) {
                for (int j = 1; j <= arr[k]; j++) {
                    if (arr[k] > 0) {
                        if (arr[k] % j == 0) {
                            res++;
                            if (res >= max[1]) {
                                max[1] = res;
                                max[0] = arr[k];
                            }
                        }
                    }
                }
                res = 0;

            }
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
            writer.write(String.valueOf(max[0]));
            writer.newLine();
            writer.write(String.valueOf(max[1]));
            writer.close();
        } else {
            int res = 0;
            int[] max = {0, 0};

            for (int i = number; i > 0; i--) {
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0) {
                        res++;
                        if (res > max[1]) {
                            max[1] = res;
                            max[0] = i;
                        }
                    }
                }
                res = 0;
            }
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
            writer.write(String.valueOf(max[0]));
            writer.newLine();
            writer.write(String.valueOf(max[1]));
            writer.close();
        }
    }
}