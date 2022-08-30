//Given a string s, return true if the s can be palindrome after deleting at most one character from it.
public class VallidPallindrom2 {
    public static void main(String args[]) {
        String s = "abca";
        System.out.println("Is valid palindrom= "+ validPallindrom(s));
    }
    public static boolean validPallindrom(String s){
        int i =0, j =s.length()-1;
        while(i<j) {
            if(s.charAt(i) != s.charAt(j)) {
                return (checkPallindrom(s, i, j-1) || checkPallindrom(s, i+1, j));
            }
            i++;
            j--;

        }
        return true;
    } public static boolean checkPallindrom(String s, int i, int j){
        if(s.charAt(i) != s.charAt(j)) {
            return false;
        }
        else {
            i++;
            j--;
        }
        return true;
    }
}