import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        if (n < 2) {
            System.out.println(n);
            scanner.close();
            return;
        }

        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        Arrays.sort(nums);

        int ans = 0;
        if (nums[0] != nums[1]) ans++;
        for (int i = 1; i < n-1; i++) {
            if (nums[i-1] != nums[i] && nums[i+1] != nums[i]) {
                ans++;
            }
        }
        if (nums[n-1] != nums[n-2]) ans++;

        System.out.println(ans);
        scanner.close();
    }
}