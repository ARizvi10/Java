class Main {
    public static void main(String [] args) {
        System.out.println("Hello, World.");
        LinkedList list = new LinkedList();
        list.insert(18);
        list.insert(45);
        list.insert(12);
        //list.show();
        //list.deleteAt(1);
        list.delete(45);
        list.show();

        //list.deleteAt(1);
        //commit
        //list.show();

    }
}