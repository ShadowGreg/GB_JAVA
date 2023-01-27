import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution temp = new Solution();
        System.out.println(temp.isSubsequence("axc", "ahbgdc"));
    }
}

class Solution {
    public boolean isSubsequence(String s, String t) {
        for (char c : s.toCharArray()){
            int index = t.indexOf(c);
            if (index == -1) return false;
            t = t.substring(index+1);
        }
        return true;
    }
}