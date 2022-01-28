package LeetCode;

public class DesignHashSet {

    static class Node{
        int data;
        Node next;
        public Node(int d){
            data = d;
            next = null;
        }
    }

    static Node head;

    static void print(Node node){
        if (node == null){
            System.out.println("List is empty");
        }
        else {
            while (node != null){
                System.out.print(node.data + " ");
                node = node.next;
            }
        }
    }

    public DesignHashSet() {

    }

    public void add(int key) {
        if (head == null){
            head = new DesignHashSet.Node(key);
        }
        else {
            Node previous = head;
            Node traverse = head;
            while (traverse != null){
                if (traverse.data == key){
                    return ;
                }
                previous = traverse;
                traverse = traverse.next;
            }
            previous.next = new DesignHashSet.Node(key);
        }
    }

    public void remove(int key) {
        Node current = head;
        Node previous = current;
        while (current != null){
            if (current.data == key){
                previous.next = current.next;
                return;
            }
            else {
                previous = current;
                current = current.next;
            }
        }
    }

    public boolean contains(int key) {
        Node traverse = head;
        while (traverse != null){
            if (traverse.data == key){
                return true;
            }
            traverse = traverse.next;
        }
        return false;
    }

    public static void main(String[] args){
        DesignHashSet designHashSet = new DesignHashSet();
        designHashSet.add(1);
        designHashSet.add(1);
        designHashSet.add(2);
        designHashSet.add(3);
        designHashSet.add(4);
        designHashSet.add(5);
        print(head);
        System.out.println();
        System.out.println(designHashSet.contains(4));
        designHashSet.remove(4);
        System.out.println(designHashSet.contains(1));
        System.out.println(designHashSet.contains(2));
        System.out.println(designHashSet.contains(3));
        System.out.println(designHashSet.contains(4));
        System.out.println(designHashSet.contains(6));
        print(head);
    }
}
