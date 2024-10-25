public class CalculateSum {
    public static int uniqueSum(int num1, int num2, int num3) {
        if (num1 != num2 && num1 != num3 && num2 != num3) {
            return num1 + num2 + num3;
        }
        if (num1 == num2 && num1 == num3) {
            return 0;
        }
        if (num1 == num2) {
            return num3;
        }
        if (num1 == num3) {
            return num2;
        }
        if (num2 == num3) {
            return num1;
        }
        return 0;
    }
}
