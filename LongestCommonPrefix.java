import java.util.HashMap;

//Given a string s, return true if the s can be palindrome after deleting at most one character from it.
public class LongestCommonPrefix {
    public static void main(String args[]) {
        String[] strs = {"flow", "flower","flight"};
        System.out.println("Longest common prefix=  "+ getLongestCommonPrefix(strs));
    }

    public static String getLongestCommonPrefix(String[] strs) {
        if(strs.length == 0) {
            return "";
        }
        String longestPrefix =strs[0];
        for(int i=1; i<strs.length; i++){
            while(strs[i].indexOf(longestPrefix)!= 0){
                System.out.println("before " + longestPrefix);
                longestPrefix = longestPrefix.substring(0, longestPrefix.length()-1);
                System.out.println("after " + longestPrefix);
        }
    }
        return longestPrefix;
    }
}