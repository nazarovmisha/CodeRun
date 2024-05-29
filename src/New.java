import java.util.HashSet;
import java.util.Set;

public class New {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 3, 4, 4, 5, 5, 6, 6, 6, 7, 7, 7, 7};
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        int result;
        int count;
        System.out.println("nums.lenght " + nums.length);
        System.out.println("set.size " + set.size());
        count = nums.length - set.size();
        System.out.println("count " + count);
        //  if (count != 0 && count % 2 == 0) {
        //    result = nums.length - count - count + 1;
        if (count != 0) {
            result = nums.length - count - (count / 2) - 2;
        } else {
            result = nums.length - count;
        }
        System.out.println("result " + result);

    }
}
