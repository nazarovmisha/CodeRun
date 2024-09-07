
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

//https://coderun.yandex.ru/problem/exactly-one-occur?currentPage=1&groups=%D0%91%D0%B5%D0%BA%D0%B5%D0%BD%D0%B4&pageSize=10&rowNumber=2

public class UniqueElement {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int index = Integer.parseInt(reader.readLine());
        String[] nums = reader.readLine().split(" ");
        reader.close();
        Arrays.sort(nums);
        Set<String> list=new HashSet<>(List.of(nums));
        for (int i = 0; i < index-1; i++) {
            if (nums[i].equals(nums[i+1])){
                list.remove(nums[i]);
            }
        }
        int result=list.size();
        String stringResult = Integer.toString(result);
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        writer.write(stringResult);
        writer.close();
    }
}

