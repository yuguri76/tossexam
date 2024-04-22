public class LargestPandigital {

    public static int findLargestPandigital(String s, int N) {
        int largestPandigital = -1;

        for (int i = 0; i <= s.length() - N; i++) {
            String sub = s.substring(i, i+ N);
            int num = Integer.parseInt(sub);

            if (isPandigital(num, N) && num > largestPandigital) {
                largestPandigital = num;
                }
            }
            return largestPandigital;
        }

    private static boolean isPandigital(int num, int N) {
        int[] digits = new int[N + 1];
        int temp = num;

        for (int i = 1; i <= N; i++) {
            int digit = temp % 10;
            if (digit == 0 || digit > N || digits[digit] != 0) {
                return false;
            }
            digits[digit] = 1;
            temp /= 10;
        }

        for (int i = 1; i <= N; i++) {
            if (digits[i] == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s1 = "1451232125";
        int N1 = 2;
        System.out.println(findLargestPandigital(s1, N1));

        String s2 = "3132531233";
        int N2 = 3;
        System.out.println(findLargestPandigital(s2, N2));

        String s3 = "12412415";
        int N3 = 4;
        System.out.println(findLargestPandigital(s3, N3));
    }
}