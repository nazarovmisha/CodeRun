
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
        String[] array = (reader.readLine().split(" "));
        reader.close();
        int[] intArray = new int[index];
        for (int i = 0; i < index - 1; i++) {
            intArray[i] = Integer.parseInt(array[i]);
        }

        int result = index;
        for (int i = 0; i < index - 1; i++) {
            Arrays.sort(intArray);
            if (intArray[i] == intArray[i + 1]) {
                result-=2;}

            String stringResult = Integer.toString(result);
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
            writer.write(stringResult);
            reader.close();
            writer.close();
        }
    }
}