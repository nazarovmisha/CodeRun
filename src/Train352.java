import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Train352 {
    public static void main(String[] args) throws IOException {
        System.out.println(aaa("aaaabbbbbbbbddddddddaaaa", "acbdaaaaaaa"));
    }

    public static int aaa(String a, String b ){

        String[] jjew = a.split("");
        Set<String> set = new HashSet<>();
        for (String i : jjew) {
            set.add(i);
        }
        String[] res = new String[set.size()];
        int k = 0;
        for (String i : set) {
            res[k++] = i;
        }

        String[] ss = b.split("");

        int result = 0;
        for (int i = 0, j=0; j < ss.length-1; i++, j++) {
                if (ss[i].equals(res[j])) {
                    System.out.println("S[i] = " + ss[i]);
                    System.out.println("res[j] = " + res[j]);
                    System.out.println("res = " + result );
                   result++;
                }
            }


        if (a.equals("") || b.equals("")) {
            return 0;
        } else {
           return result;
        }
    }
}



