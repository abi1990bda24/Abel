public class LinkedList {
    public  Node start;
    public  Node end;
    public int size;
 
    public LinkedList() {
        start = null;
        end = null;
        size = 0;
    }
 
    public boolean isEmpty() {
        return start == null;
    }
 
    public int getSize() {
        return size;
    }
 
    public void insertAtStart(int val) {
        Node go = new Node(val, null, null);
        if (start == null) {
            start = go;
            end = start;
        } else {
            start.setLinkPrev(go);
            go.setLinkNext(start);
            start = go;
        }
        size++;
    }
 
    public void insertAtEnd(int val) {
        Node go = new Node(val, null, null);
        if (start == null) {
            start = go;
            end = start;
        } else {
            go.setLinkPrev(end);
            end.setLinkNext(go);
            end = go;
        }
        size++;
    }
 
    public void insertAtPos(int val,int pos) {
        Node go= new Node(val, null, null);
        if (pos == 0) {
            insertAtStart(val);
            return;
        }
        Node x = start;
        for (int i = 2; i <= size; i++) {
            if (i == pos) {
                Node tmp = x.getLinkNext();
                x.setLinkNext(go);
                go.setLinkPrev(x);
                go.setLinkNext(tmp);
                tmp.setLinkPrev(go);
            }
            x = x.getLinkNext();
        }
        size++;
    }
 
    public void deleteAtPos(int pos) {
        if (pos == 1) {
            if (size == 1) {
                start = null;
                end = null;
                size = 0;
                return;
            }
            start = start.getLinkNext();
            start.setLinkPrev(null);
            size--;
            return;
        }
        if (pos == size) {
            end = end.getLinkPrev();
            end.setLinkNext(null);
            size--;
        }
        Node x = start.getLinkNext();
        for (int i = 2; i <= size; i++) {
            if (i == pos) {
                Node p = x.getLinkPrev();
                Node n = x.getLinkNext();
 
                p.setLinkNext(n);
                n.setLinkPrev(p);
                size--;
                return;
            }
            x = x.getLinkNext();
        }
    }
 
    public void show() {
    	System.out.print("THE DLL is = ");
        if (size == 0) {
            System.out.print("empty\n");
            return;
        }
        if (start.getLinkNext() == null) {
            System.out.println(start.getData());
            return;
        }
        Node x = start;
        System.out.print(start.getData() + " ");
        x = start.getLinkNext();
        while (x.getLinkNext() != null) {
            System.out.print(x.getData() + " ");
           x = x.getLinkNext();
        }
        System.out.print(x.getData() + "\n");
    }
}

