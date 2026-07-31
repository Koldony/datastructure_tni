import java.util.Scanner;
import java.util.Stack;

public class LabStack02 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int[] cart = {1,2,3,4,5};

        for (int i = 0; i < cart.length; i++) {
            stack.push(cart[i]);
            System.out.println("Push in track : " + cart[i]);
        }
        System.out.println("Train car after into dead-end track : " + stack);

        while (!stack.isEmpty()) {
            int car = stack.pop();
            System.out.println("Pop from track: " + car);
        }
        System.out.println("Train car after out of dead-end track : " + stack);
    }

}
