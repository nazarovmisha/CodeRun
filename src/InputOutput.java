import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

//https://coderun.yandex.ru/problem/median-out-of-three/solutions/10010066-4dcc-36c0-73e3-97d3c775dd59?currentPage=1&pageSize=10&rowNumber=1

public class InputOutput {

    /*
	Для чтения входных данных необходимо получить их
	из стандартного потока ввода (System.in).
	Данные во входном потоке соответствуют описанному
	в условии формату. Обычно входные данные состоят
	из нескольких строк. Можно использовать более производительные
	и удобные классы BufferedReader, BufferedWriter, Scanner, PrintWriter.

	С помощью BufferedReader можно прочитать из стандартного потока:
	* строку -- reader.readLine()
	* число -- int n = Integer.parseInt(reader.readLine());
	* массив чисел известной длины (во входном потоке каждое число на новой строке) --
	int[] nums = new int[len];
    for (int i = 0; i < len; i++) {
        nums[i] = Integer.parseInt(reader.readLine());
    }
	* последовательность слов в строке --
	String[] parts = reader.readLine().split(" ");

	Чтобы вывести результат в стандартный поток вывода (System.out),
	Через BufferedWriter можно использовать методы
	writer.write("Строка"), writer.write('A') и writer.newLine().

	Возможное решение задачи "Вычислите сумму чисел в строке":
	int sum = 0;
    String[] parts = reader.readLine().split(" ");
    for (int i = 0; i < parts.length; i++) {
        int num = Integer.parseInt(parts[i]);
        sum += num;
    }
    writer.write(String.valueOf(sum));
	*/
    public static void main(String[] args) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int index = Integer.parseInt(reader.readLine());
            String[] nums = reader.readLine().split(" ");
            reader.close();
            Set<Integer> set = new HashSet<>();
            for (int i = 0; i < index; i++) {
                set.add(Integer.parseInt(nums[i]));
            }
            int result;
            int count;
            count = nums.length - set.size();
            if (count != 0 && count % 2 == 0) {
                result = nums.length - count - count + 1;
            } else if (count != 0 && count % 2 != 0) {
                result = nums.length - count - count;
            } else {
                result = nums.length - count;
            }
            String stringResult = Integer.toString(result);
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
            writer.write(stringResult);
            writer.close();
        }
    }



