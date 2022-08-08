import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.println("nhap vao so thap phan: ");
        int number = scanner.nextInt();
        while (number!=0){
            int d = number%2;
            stack.push(d);
            number/=2;
        }
        System.out.println(stack);
        int[] a = new int[stack.size()];
        for (int i = 0; i < a.length; i++) {
            a[i]= stack.pop();
        }
        System.out.println(Arrays.toString(a));

    }
}