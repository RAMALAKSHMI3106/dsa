import java.util.Scanner;

public class FloorCeilUnsortedArray {
    public static void main(String args[]) {
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

        getFloorCeil(arr, target);
        input.close();
    }

    private static void getFloorCeil(int arr[], int target) {
        int floor = Integer.MIN_VALUE;
        int ceil = Integer.MAX_VALUE;

        for (int i : arr) {
            if (i <= target && i > floor) {
                floor = i;
            }

            if (i >= target && i < ceil) {
                ceil = i;
            }
        }

        if (floor == Integer.MIN_VALUE) {
            System.out.println("Floor not found");
        } else {
            System.out.println("Floor = " + floor);
        }

        if (ceil == Integer.MAX_VALUE) {
            System.out.println("Ceil not found");
        } else {
            System.out.println("Ceil = " + ceil);
        }
    }
}
/* 
Time Complexity:
Time: O(n)
Space: O(1)

Output:
Enter the size of the array: 5
Enter the array elements:
1 2 3 8 10
Enter the target element: 9
Floor = 8
Ceil = 10
 */