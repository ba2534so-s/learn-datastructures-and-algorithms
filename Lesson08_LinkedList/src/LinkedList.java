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
        node.setNext(null);

        if (head == null) {
            this.setHead(node);
        } else {
            Node n = this.getHead();
            while (n.getNext() != null) {

            }

        }
    }
}
