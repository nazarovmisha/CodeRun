import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Train352 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String jew = reader.readLine().trim();
        String s = reader.readLine().trim();
        String[] jjew = jew.split("");

        Set<String> set = new HashSet<>();
        for (String i : jjew) {
            set.add(i);
        }
        String[] res = new String[set.size()];
        int k = 0;
        for (String i : set) {
            res[k++] = i;
        }

        String[] ss = s.split("");
        reader.close();
        int result = 0;
        for (int i = 0; i < res.length; i++) {
            if (s.contains(res[i])) {
                result++;
            }
        }

        String answer = String.valueOf(result);
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        if (jew.equals("") || s.equals("")) {
            writer.write("0");
        } else {
            writer.write(answer);
            writer.close();
        }
    }
}


