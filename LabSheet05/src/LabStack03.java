import java.util.Scanner;
import java.util.Stack;
public class LabStack03 {
    public static Stack<String> history = new Stack<String>();
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Press 1: Visit a new website");
        System.out.println("Press 2: See the previous website");
        System.out.println("Press 3: Visit the previous website");
        System.out.println("Press 4: Clear History");
        while (true) {
            System.out.print("\nEnter an option: ");
            int option = input.nextInt();
            if (option == 1) visitNewWeb();
            else if (option == 2) seePreviousWeb();
            else if (option == 3) visitPreviousWeb();
            else if (option == 4) clearHistory();
            else {
                System.out.println("Exit");
                break;
            }
        }
    }
    public static void visitNewWeb() {
        while (true) {
            System.out.print("Enter a website name: ");
            String name = input.next();
            history.push(name);
            System.out.print("Current history => " + history);
            break;
        }
    }
    public static void seePreviousWeb() {
        while (true) {
            System.out.println("Previous website: " + history.peek());
            System.out.print("Current history => " + history);
            break;
        }
    }
    public static void visitPreviousWeb() {
        while (true) {
            System.out.println("Visit: " + history.peek());
            System.out.print("Current history => " + history);
            break;
        }
    }
    public static void clearHistory() {
        history.clear();
        System.out.print("Current history => " + history);
    }
}
