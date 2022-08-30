import java.io.*;
import java.security.PublicKey;
import java.util.*;
import java.util.List;
import java.util.concurrent.RecursiveTask;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class IntersectionOfTwoArrays {
    public static void main(String args[]) {
        int[] a = {1,2,2,1,3};
        int[] b = {2,2,3};
       int[] result = getIntersectionOfTwoArrays(a,b);
        System.out.println("Result = "+ Arrays.toString(result));
    }
    public static int[] getIntersectionOfTwoArrays(int[] a, int[]b){
        Map<Integer, Integer> nums = new HashMap<>();
        for(int i=0; i<a.length; i++){
            if(!nums.containsKey(a[i])) {
                nums.put(a[i],1);
            }
        }
        for(int j=0; j< b.length; j++){
            if(nums.containsKey(b[j])){
                nums.put(b[j], nums.get(b[j]) + 1);
            }
        }
        int[] result = nums.keySet().stream().filter(n-> nums.get(n) > 1).mapToInt(Integer::intValue).toArray();
        return result;
    }
}