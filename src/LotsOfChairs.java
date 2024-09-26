import java.io.*;
import java.util.Arrays;

//https://coderun.yandex.ru/problem/trading-ya-intern/solutions/10010066-f431-0fbd-b073-8f82d8a4ca99?currentPage=2&groups=backend&pageSize=20&search=

public class LotsOfChairs {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String byers = reader.readLine();
        String salePriceString = reader.readLine();
        String purchasePriceString = reader.readLine();
        reader.close();
        long[] sellersAndByers = Arrays.stream(byers.split(" ")).mapToLong(Integer::parseInt).toArray();
        long[] salePrice = Arrays.stream(salePriceString.split(" ")).mapToLong(Integer::parseInt).toArray();
        long[] purchasePrice = Arrays.stream(purchasePriceString.split(" ")).mapToLong(Integer::parseInt).toArray();
        long sales;
        if (sellersAndByers[0] < sellersAndByers[1]) {
            sales = sellersAndByers[0];
        } else {
            sales = sellersAndByers[1];
        }
        Arrays.sort(salePrice);
        Arrays.sort(purchasePrice);
        long result = 0l;
        long a =0l;
        long b =0l;
        for (long i = 0l, j = sales-1l; i < sales; i++, j--) {
           a+=salePrice[(int) i];
           b+=purchasePrice[(int) j];
           result=Math.max(result,(b-a));
            }

        String answer = String.valueOf(result);
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        writer.write(answer);
        writer.close();
    }
}

