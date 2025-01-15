import java.util.HashMap;
public class LinkedList {
    Node head;

    public void insert (int data) {
        Node node = new Node();
        node.data = data;

        if (head == null){
            head = node;
        }
        else {
            Node n = head; //temp node
            while (n.next != null){
                n = n.next;
            }
            n.next = node; //assigns ins. node at end with prev node pointing to it
        }
        
    }

    public void show() {
        Node node = head;

        while(node.next != null){

            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }

    public void duplicateChecker(LinkedList list) {
        HashMap<Integer,Integer> dupes = new HashMap<>();
        Node node = head;

        while(node.next != null){

            if (dupes.containsKey(node.data) == true){
                
            }
        }
    }
}
