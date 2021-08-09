class Solution {
    public String addStrings(String num1, String num2) {

        int i = num1.length() - 1;
        int j = num2.length() - 1;

        StringBuilder sb = new StringBuilder();

        int carry = 0;

        while (i >= 0 || j >= 0) {

            int s1 = 0, s2 = 0;
            if (i >= 0)
                s1 = num1.charAt(i--) - '0';

            if (j >= 0)
                s2 = num2.charAt(j--) - '0';

            int val = s1 + s2 + carry;
            int sum = val % 10;
            sb.append(sum);

            carry = val / 10;

        }

        if (carry == 1)
            sb.append(carry);

        return sb.reverse().toString();
    }
}