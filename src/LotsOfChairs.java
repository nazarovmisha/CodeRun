import java.io.*;
import java.math.BigInteger;
import java.util.Arrays;

//https://coderun.yandex.ru/problem/trading-ya-intern/solutions/10010066-f431-0fbd-b073-8f82d8a4ca99?currentPage=2&groups=backend&pageSize=20&search=

public class LotsOfChairs {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String byers = reader.readLine();
        String salePriceString = reader.readLine();
        String purchasePriceString = reader.readLine();
        reader.close();
        int[] sellersAndByers = Arrays.stream(byers.split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] salePrice = Arrays.stream(salePriceString.split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] purchasePrice = Arrays.stream(purchasePriceString.split(" ")).mapToInt(Integer::parseInt).toArray();
        int sales=Math.min(sellersAndByers[0],sellersAndByers[1]);
        Arrays.sort(salePrice);
        Arrays.sort(purchasePrice);
        BigInteger result=new BigInteger("0");
        for (int i = 0, j = sales-1; i < sales; i++, j--) {
         if ((purchasePrice[j]-salePrice[i])>0){
             result=result.add(BigInteger.valueOf(purchasePrice[j] - salePrice[i]));
         }
            }
        String answer = String.valueOf(result);
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        writer.write(answer);
        writer.close();
    }
}

