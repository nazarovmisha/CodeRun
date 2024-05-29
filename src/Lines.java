import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Lines {
    public static void main(String[] args) throws IOException {
        Map<Integer, Integer> map = new HashMap<>();
        int answer = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < num; i++) {
            result.append(reader.readLine() + " ");
        }
        int[] start = new int[num];
        int[] finish = new int[num];
        String sss = result.toString();
        sss.trim();
        String[] strings = sss.split(" ");
        for (int i = 0; i < num * 2; i++) {
            if (i % 2 == 0) {
                start[i] = Integer.parseInt(strings[i]);
            } else {
                finish[i] = Integer.parseInt(strings[i]);
            }
            for (int j = 0; j < num; j++) {
                for (int k = 0; k < num; k++) {
                    if ((start[i] >= start[j] && finish[i] >= finish[j]) || (start[i] <= start[j] && finish[i] <= finish[j])) {
                        map.put(start[i], start[j]);
                        map.put(finish[i], finish[j]);
                    }
                }
            }
        }
        answer = num - map.size();
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        writer.write(String.valueOf(result));
    }
}

