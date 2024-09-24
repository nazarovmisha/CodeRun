import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class TraneClosedKey {
    public static void main(String[] args) {
        System.out.println(key("5 10"));
    }

    public static int key(String str) {
        String[] strArr = new String[]{Arrays.toString(str.split(" "))};
        System.out.println(Arrays.toString(strArr));
        return 1;
    }
}


