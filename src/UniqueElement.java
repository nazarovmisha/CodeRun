
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

//https://coderun.yandex.ru/problem/exactly-one-occur?currentPage=1&groups=%D0%91%D0%B5%D0%BA%D0%B5%D0%BD%D0%B4&pageSize=10&rowNumber=2

public class UniqueElement {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int index = Integer.parseInt(reader.readLine());
        String[] nums = reader.readLine().split(" ");
        reader.close();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < index; i++) {
            set.add(Integer.parseInt(nums[i]));
        }
        int result=0;
        int count=index-set.size();
        result=index-count;

        String stringResult = Integer.toString(result);
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        writer.write(stringResult);
        writer.close();
    }
}

