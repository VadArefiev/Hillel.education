package MateAcademy;

public class SumAfterNumber {
    public static void main(String[] args) {
    int[] values2 = {24,46,57,48,46,82};
    System.out.println( getSum(values2, 57));
    }
            public static int getSum(int[] values, int startValue) {
            boolean startValueFound = false;
            int sum = 0;
            for (int element : values) {
                if (startValueFound) {
                    sum += element;
                }
                if (element == startValue) {
                    startValueFound = true;
                }
            }
            return sum;
        }
    }


