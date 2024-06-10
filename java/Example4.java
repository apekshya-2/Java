public class Example4 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int sum = 0;
        int x;
        for (x = 0; x < 10; x = x + 1)
            sum += nums[x];
        System.out.println("Sum of nums:" + sum);
    }

}
