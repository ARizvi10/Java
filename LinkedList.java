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

    public void deleteAt(int index){
        Node n = head;
        Node temp = null;
        if (index == 0){
            head = head.next;
        }
        else{
            //moving the code here fixes the issue, why? is it because of the method on n, assigning head to it? ohhh its because it doesnt just copy it
            //it assigns the address to it, let me try this. yep, that fixed it i moved Node n = head; and Node temp = null; back up, and changed head = head.next 
            //to n = n.next, this is because of how objects copy in java
            for (int i = 0; i < index - 1; i++){
                n = n.next; //traverse the list until n is the node before index we want to delete, n.next being the index we want to delete
            }
            temp = n.next; //assigns pointer to the data at n.next
            n.next = temp.next; //assigns the node we want to delete at temp.next, the spot afterwards; n.next.next
            temp = null; //garbage collection gets rid of the mem taken
        }
    }
    public void delete(int data){
        if (head.data == data){
            head = head.next;
            return;
        }
        Node n = head; //temp node
        Node prev = head;
        while (n.next != null){
           // System.out.println(n.data); commit
            if (n.data == data){
               // System.out.println("prev data: " + prev.data);
                //System.out.println("n data: " + n.data);
                prev.next = n.next;
                return;
            }
            else{
                prev = n;
                n = n.next;
            }
        }
        if (n.data == data){
            prev.next = null;
        }
    }
}
