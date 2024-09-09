//https://coderun.yandex.ru/problem/random-swaps?currentPage=1&groups=backend&pageSize=20&search=

import java.io.*;
import java.util.Arrays;

public class FavoriteNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String number = bufferedReader.readLine();
        String[] arr = number.split("");
        StringBuilder originalNumberString = new StringBuilder();
        for (String s : arr) {
            originalNumberString.append(s);
        }
        int originalNumber = Integer.parseInt(originalNumberString.toString());
        System.out.println(originalNumber);
        double count = Double.parseDouble(bufferedReader.readLine());
        bufferedReader.close();
        double favorite = 0;
        double un = 0;
        String result1 = Arrays.toString(arr);
        System.out.println(result1);

        //  if(result1 % 5 == 0 || result1 % 6 == 0 || result1 % 10 == 0){
        //     favorite=1;
        //  }

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
        if (un == 0) {
            un = 1;
        }
        double res = 0;
        for (int i = 0; i < count; i++) {
                res += favorite / un;
            if (originalNumber % 5 == 0 || originalNumber % 6 == 0 || originalNumber % 10 == 0) {
                if (i > 0) {
                    if (i % 2 == 0) {
                        favorite--;
                    } else {
                        favorite++;
                    }
                }
            }
        }
        double result = res / count;
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.close();
    }
}




