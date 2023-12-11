class Solution {
    public String largestOddNumber(String num) {
        int len = num.length();

        for (int i = len - 1; i >= 0; i--) {
            int digit = Character.getNumericValue(num.charAt(i));
            if (isOdd(digit)) {
                return num.substring(0, i + 1);
            }
        }

        return ""; // No odd digits found
    }

    private boolean isOdd(int num) {
        return num % 2 != 0;
    }
}
