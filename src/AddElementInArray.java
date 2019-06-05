import java.util.Scanner;

public class AddElementInArray {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,8,9,0,0,0};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number input:");
        int x = scanner.nextInt();
        System.out.println("Enter index:");
        int index = scanner.nextInt();

        if (index <= 1 || index >= arr.length -1) {
            System.out.println("Cant add element value to array!");
        } else {
            for (int i = arr.length-1; i < 0; i--) {
                arr[i] = arr[i-1];
            }
            arr[index] = x;

            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + "\t");
            }
        }
    }
}
