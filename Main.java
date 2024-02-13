import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int sum = 0;
        double avg1, avg2;

        Scanner input = new Scanner(System.in);

        // declare an array of integers called nums of size 100
        int[] nums = new int[100];

        // create a for loop that populates array nums and calculates avg1
        for (int i = 0; i < nums.length; i++) {
            nums[i] = 100 + i;
            sum += nums[i];
        }
        avg1 = (double) sum / nums.length;

        // add 5 to every element in array nums
        for (int i = 0; i < nums.length; i++) {
            nums[i] += 5;
        }

        // reset sum for calculating avg2
        sum = 0;

        // use a for-each loop to calculate the sum for avg2
        for (int num : nums) {
            sum += num;
        }
        avg2 = (double) sum / nums.length;

        // display results
        System.out.println("avg1 = " + avg1);
        System.out.println("avg2 = " + avg2);
    }
}
