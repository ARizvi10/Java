import java.util.HashMap;
public class LinkedList {
    Node head;

    public void insert (int data) {
        Node node = new Node();
        node.data = data;


        if (head == null) {
            head = node;
        }
        else{
            Node curr = head;
            while (curr.next != null){
                curr = curr.next;
            }
            curr.next = node;

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

    public void replaceNodeAtIndex(int index, int data) {
        Node node = new Node(); //creates new node to insert
        node.data = data; //assigns data of new node to desired data

        if (index == 0) {
            node.next = head.next; //assigns pointer to the node at head.next, manipulate data at head.next
            head = node;
            //if replacing first node, replace head without losing rest of list
        } else {
            Node n = head; //temp node
            for (int i = 0; i < index - 1; i++) {
                n = n.next; //traverse to node before the node at index
            }
            node.next = n.next.next; //points node to the node at index+1, where inserted node should point
            n.next = node; //inserts node at index, points prev node to it

            //ok so the node is inserting,but the rest of the list is lost.
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
            //to n = n.next, this is because of how objects copy in java.
            for (int i = 0; i < index - 1; i++){
                n = n.next; //traverse the list until n, the node before index we want to delete, n.next being the index we want to delete
            }
            temp = n.next; //assigns pointer to the node at n.next
            n.next = temp.next; //assigns the node we want to delete at temp.next, the spot afterwards; n.next.next
            temp = null; //garbage collection gets rid of the mem taken

            //.next method is just a way to peek at the nodes, dont do any operation or traversal, thats what the equal sign does.
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
