import java.util.*;

public class UniqueNumberOfOccurrences {
    public static void main(String args[]) {
        int[] numbers = new int[]{1, 2, 2, 3, 3, 3, 4};
        System.out.println("UniqueNumberOfOccurances = " + getUniqueNumberOfOccurrences(numbers));
    }
    public static boolean getUniqueNumberOfOccurrences(int[] numbers){
       Map<Integer, Integer> nums = new HashMap<>();
       for(int i=0; i<numbers.length; i++){
           if(nums.containsKey(numbers[i])){
               nums.put(numbers[i], nums.get(numbers[i])+1);
           } else {
               nums.put(numbers[i], 1);
           }
       }
        System.out.println(nums);
       System.out.println(nums.values().stream().distinct().count());
       if(nums.values().stream().distinct().count() == nums.size()) {
           return true;
       }
       return false;
    }
}