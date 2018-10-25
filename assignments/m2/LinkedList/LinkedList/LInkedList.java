 class LinkedList {
    private int size;
    private Node start;
    LinkedList() {
        this.size = 0;
        this.start = null;
    }
    public int size() {
        return size;
    }
    public void pushRight(int data) {
        if (start == null) {
            Node newNode = new Node(data);
            start = newNode;
        }
        else {
            Node temp = start;
            Node newNode = new Node(data);
            while (temp.getNextNode() != null) {
                temp = temp.getNextNode();
            }
            temp.setNextNode(newNode);
        }
        size++;
    }
    public void pushLeft(int data) {
        Node newnode = new Node(data);
        newnode.setNextNode(start);
        start = newnode;
        size++;
    }
    public void removeLeft() {
        if (start != null) {
            start = start.getNextNode();
            size--;
        } else {
            System.out.println("No nodes to remove");
        }
    }
    public void remove(int data) {
        Node temp1 = start;
        if(temp1.getData() == data) {
            temp1 = temp1.getNextNode();
            start = temp1;
        } else {
            while(temp1.getNextNode().getNextNode()!= null) {
                if(temp1.getNextNode().getData() == data) {
                    break;
                }
                temp1 = temp1.getNextNode();
            }
            if(temp1.getNextNode().getData() == data) {
                temp1.setNextNode(temp1.getNextNode().getNextNode());
            }
        }
        size--;
    }
    public void popLeft() {
        if (start != null) {
            start = start.getNextNode();
            size--;
        } else {
            System.out.println("No nodes to remove");
        }
    }
    public void removeRight() {
        if (start == null) {
            System.out.println("No nodes to remove");
        } else if (size < 2) {
            start = null;
            size--;
        } else {
            Node temp = start;
            while (temp.getNextNode().getNextNode() !=null) {
                temp = temp.getNextNode();
            }
            temp.setNextNode(null);
            size--;
        }
    }
    public String toString() {
        String s = "";
        Node temp = start;
        if (temp == null) {
            return "Empty linked list";
        }
        while (temp.getNextNode() != null) {
            s += temp.getData() + ", ";
            temp = temp.getNextNode();
        }
        s += temp.getData();
        return s;
    }
}
