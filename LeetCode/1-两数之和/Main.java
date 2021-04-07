public class Main {

    public static void main(String[] args) {
        int[] nums = {3, 3};
        int target = 6;

        System.out.println(printResult(towSum(nums, target)));
    }

    private static int[] towSum(int[] nums, int target) {
        if (nums == null || nums.length < 2)
            throw new IllegalArgumentException();

        int[] result = {0, 0};

        for (int i = 0; i < nums.length - 1; i++) {
            int j = i + 1;
            for (; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;

                    return result;
                }
            }
        }

        return result;

    }

    private static String printResult(int[] nums) {
        if (nums == null) {
            return "[]";
        }

        StringBuilder builder = new StringBuilder(nums.length * 2);
        builder.append('[');

        for (int i = 0; i < nums.length - 1; i++) {
            builder.append(nums[i]).append(',');
        }

        builder.append(nums[nums.length - 1]).append(']');


        return builder.toString();

    }
}
