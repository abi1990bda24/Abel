public class DLL {
    public static void main(String[] args) {
       LinkedList  list = new LinkedList();
        System.out.println("Doubly Linked List Implementatipon");
        System.out.println("Insert at Start of DLL");
        list.insertAtStart(0);
        list.show();
        System.out.println("Insert at End of DLL");
        list.insertAtEnd(5);
        list.show();
        System.out.println("Insert at some Position of DLL");
        list.insertAtPos(7, 2);
        list.insertAtPos(9, 3);
        
        list.insertAtStart(4);
        list.insertAtPos(6, 1);
        list.show();
        System.out.println("Deleting at Position 1 or the first element");
        list.deleteAtPos(1);
        list.show();
        System.out.println("Deleting at position 3 or the third element");
        list.deleteAtPos(3);
        list.show();
}
}