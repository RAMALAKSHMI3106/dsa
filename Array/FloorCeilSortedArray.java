import java.util.Scanner;

public class FloorCeilSortedArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = input.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        System.out.print("Enter the target element: ");
        int target = input.nextInt();

        int floor = floor(arr, target);
        int ceil = ceil(arr, target);
        
        System.out.println("Floor = " + floor);
        System.out.println("Ceil = " + ceil);
        input.close();
    }

    static int floor(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target)
                return arr[mid];

            if (arr[mid] < target) {
                ans = arr[mid];
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }

    static int ceil(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target)
                return arr[mid];

            if (arr[mid] > target) {
                ans = arr[mid];
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }
}
/*
Time Complexity:
Time: O(log n)
Space: O(1)

Output:
Enter the size of the array: 3
Enter the array elements:
12 14 43
Enter the target element: 13
Floor = 12
Ceil = 14
*/