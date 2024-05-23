
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

//https://coderun.yandex.ru/problem/exactly-one-occur?currentPage=1&groups=%D0%91%D0%B5%D0%BA%D0%B5%D0%BD%D0%B4&pageSize=10&rowNumber=2

public class UniqueElement {

    public static void main(String[] args) throws IOException {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       int index = Integer.parseInt(reader.readLine());
       String [] strings = reader.readLine().split(" ");
       int [] nums = new int[index];
        for (int i = 0; i < strings.length; i++) {
            nums[i] = Integer.parseInt(strings[i]);
        }
        int count=0;
        int result = strings.length;
        for (int i = 0; i < strings.length-1; i++) {
            if (nums[i]==nums[i+1]){
                result-=2;
                count++;
            }
        }
        if (count>1){
            result+=1;
        }
        String stringResult = Integer.toString(result);
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        writer.write(stringResult);
        writer.close();
    }
}

