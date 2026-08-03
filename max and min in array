import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        // Input array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Assume first element is both maximum and minimum
        int max = arr[0];
        int min = arr[0];

        // Find maximum and minimum
        for (int i = 1; i < n; i++) {
            if (arr[i] > max)
                max = arr[i];

            if (arr[i] < min)
                min = arr[i];
        }

        // Display results
        System.out.println("Maximum Value: " + max);
        System.out.println("Minimum Value: " + min);

        sc.close();
    }
}
