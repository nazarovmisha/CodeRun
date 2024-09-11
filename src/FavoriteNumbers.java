//https://coderun.yandex.ru/problem/random-swaps?currentPage=1&groups=backend&pageSize=20&search=

import java.io.*;


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
        //   System.out.println(originalNumber);
        double favorite = 0;
        double un = 0;

        double count = Double.parseDouble(number);
        int a;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                a = Integer.parseInt(arr[j]);
                arr[j] = arr[i];
                arr[i] = String.valueOf(a);
                StringBuilder str = new StringBuilder();
                for (String s : arr) {
                    str.append(s);
                }
                //    System.out.println(str);
                int result = Integer.parseInt(str.toString());
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
            //   System.out.println("i = " + i);
            res += favorite / un;
            //    System.out.println(res);
            if (originalNumber % 5 == 0 || originalNumber % 6 == 0 || originalNumber % 10 == 0) {
                if (i > 0) {
                    if (i % 2 != 0) {
                        favorite++;
                    } else {
                        favorite--;
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




