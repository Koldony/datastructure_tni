import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class LabQueue01 {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<Integer>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i<5; i++) {
            System.out.print("Enqueue: ");
            int number = sc.nextInt();
            q.add(number);
        }

        System.out.println("Queue => " + q);
        System.out.println();

        while (!q.isEmpty()) {
            int number = q.peek();
            System.out.println("Calling number: " + number);
            int seNumber = q.poll();
            System.out.println("Providing service number: " + seNumber);
            System.out.println();
        }
        System.out.println("Queue => " + q);
    }
}
