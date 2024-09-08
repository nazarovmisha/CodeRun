//https://coderun.yandex.ru/problem/random-swaps?currentPage=1&groups=backend&pageSize=20&search=

import java.io.*;
import java.util.Arrays;

public class FavoriteNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String number = bufferedReader.readLine();
        String[] arr = number.split("");
        double count = Double.valueOf(bufferedReader.readLine());
        bufferedReader.close();
        double favorite = 0;
        double un = 0;
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                a = Integer.parseInt(arr[j]);
                arr[j] = arr[i];
                arr[i] = String.valueOf(a);
                String str = "";
                for (String s : arr) {
                    str += s;
                }
                System.out.println(str);
                int result = Integer.parseInt(str);
                if (result % 5 == 0 || result % 6 == 0 || result % 10 == 0) {
                    if (i != j) {
                        favorite++;
                    }
                } else {
                    if (i != j) {
                        un++;
                    }
                }
            }
        }
        if (un==0){
            un=1;
        }
        double res = favorite/un;
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        String result = String.format("%.10f",res);
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.close();
    }



}




