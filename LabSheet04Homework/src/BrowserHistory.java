import java.util.LinkedList;

public class BrowserHistory {
    public static void main(String[] args) {
        LinkedList<String> browse = new LinkedList<String>();

        browse.add("google.com");
        browse.add("youtube.com");
        browse.add("github.com");
        System.out.println(browse);

        browse.removeLast();
        System.out.println(browse);

        browse.add("shopee.com");
        browse.add("wikipedia.org");
        browse.add("claude.ai");
        System.out.println(browse);

        browse.remove("youtube.com");
        System.out.println(browse);

        System.out.println("current page = " + browse.getLast());

        boolean visited = browse.contains("youtube.com");
        System.out.println("Visited youtube.com = " + visited);

        browse.removeLast();
        System.out.println("Go back to previous page = " + browse.getLast());

        browse.removeLast();
        System.out.println("Go back to previous page again = " + browse.getLast());

        browse.clear();
        System.out.println(browse);
    }
}
