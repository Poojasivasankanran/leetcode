public class StrobogrammaticCheck {
    public static boolean isStrobogrammatic(String num) {
        Map<Character, Character> map = new HashMap<>();
        map.put('0', '0');
        map.put('1', '1');
        map.put('6', '9');
        map.put('8', '8');
        map.put('9', '6');

        int left = 0, right = num.length() - 1;
        while (left <= right) {
            char l = num.charAt(left);
            char r = num.charAt(right);

            if (!map.containsKey(l) || map.get(l) != r) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String number = "619";
        System.out.println(isStrobogrammatic(number)); // Output: true
    }
}
