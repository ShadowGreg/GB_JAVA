import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int answer = sol.romanToInt("IV");
        System.out.println(answer);

    }
}

class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> ramanToInt = new HashMap<>();
        ramanToInt.put('I', 1);
        ramanToInt.put('V', 5);
        ramanToInt.put('X', 10);
        ramanToInt.put('L', 50);
        ramanToInt.put('C', 100);
        ramanToInt.put('D', 500);
        ramanToInt.put('M', 1000);


        Integer outAnswer = 0;

        if(s.length()>1){
            for (int i = s.length() - 1; i > 0; i--) {
                char temp = s.charAt(i);
                int tempInt = ramanToInt.get(s.charAt(i));
                if (ramanToInt.containsKey(s.charAt(i))) {
                    if (ramanToInt.get(s.charAt(i - 1)) >= ramanToInt.get(s.charAt(i))) {
                        outAnswer = outAnswer + ramanToInt.get(s.charAt(i));
                    }
                    if (ramanToInt.get(s.charAt(i - 1)) < ramanToInt.get(s.charAt(i))) {
                        outAnswer = outAnswer - ramanToInt.get(s.charAt(i - 1)) + ramanToInt.get(s.charAt(i));
                        i--;
                    }
                }
            }
            if (ramanToInt.get(s.charAt(0)) >= ramanToInt.get(s.charAt(1)))
                outAnswer = outAnswer + ramanToInt.get(s.charAt(0));
        }else {
            outAnswer = ramanToInt.get(s.charAt(0));
        }


            return outAnswer;
    }

}
