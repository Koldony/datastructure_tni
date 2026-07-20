public class TrainLinkedList {

    static void main() {

        LinkedList greeline = new LinkedList();

        System.out.println();
        System.out.println();

        greeline.insert("Mo-chit");
        greeline.insert("Ari");
        greeline.insert("Sanam-Pao");
        System.out.println("All Station   : " + greeline.traversal());
        greeline.insert(2,"Rachakru");
        System.out.println("All Station   : " + greeline.traversal());
        System.out.println("Total Station : " + greeline.length());
        System.out.println("First Station : " + greeline.get(0));
        greeline.set(0,"Mo-chit (Central Ladprao)");
        System.out.println("All Station   : " + greeline.traversal());
        greeline.remove(2);
        System.out.println("All Station   : " + greeline.traversal());
        greeline.removeLastElement();
        System.out.println("All Station   : " + greeline.traversal());
        greeline.clear();
        System.out.println("Total Station : " + greeline.length());
        System.out.println("All Station   : " + greeline.traversal());

    }

}