public class LinkedList {
    private Node head;

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getHead() {
        return this.head;
    }

    public void insert(int data) {
        Node node = new Node();
        node.setData(data);

        if (this.head == null) {
            this.head = node;
        }
    }
}
