import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an array index: ");
        int index = sc.nextInt();
        try {
            System.out.println("Element at index " + index + " is: " + arr[index]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid index! Please enter a value between 0 and " + (arr.length - 1));
        }
        finally {
            System.out.println("Array access operation has concluded.");
        }
        sc.close();
    }
}