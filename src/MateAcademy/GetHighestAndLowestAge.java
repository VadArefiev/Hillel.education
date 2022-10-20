package MateAcademy;

import java.util.Arrays;

public class GetHighestAndLowestAge {
    public static void main(String[] args) {
        int[]getHighestAndLowestAges = {26, 26, 34, 67, 67, 54, 68};
        System.out.println(Arrays.toString(getHighestAndLowestAge(getHighestAndLowestAges)));
    }
         public static int[] getHighestAndLowestAge(int[] ages) {
                int min;
                int max;
                if (ages.length == 0) {
                    min = 0;
                    max = 0;
                    return new int[]{min, max};
                } else {
                    min = ages[0];
                    max = ages[0];
                    for (int age : ages) {
                        if (age > max) {
                            max = age;
                        }
                        if (age < min) {
                            min = age;
                        }
                    }
                }
                return new int[]{max, min};

            }
        }


