package Intermediate.challenges.challenge06;

public class LinkedListNinja {
    private NodeNinja head;
    private NodeNinja tail;
    private int length;

    class NodeNinja {
        String name;
        int age;
        String village;
        NodeNinja next;

        public NodeNinja(String name, int age, String village) {
            this.name = name;
            this.age = age;
            this.village = village;
        }

        /*@Override
        public String toString() {
            return "Ninjas:" + '\'' +
                    "Name: " + name + '\'' +
                    "Age: " + age +
                    "Village: " + village + '\'';
        }*/
    }

    public LinkedListNinja() {
    }

    public LinkedListNinja(String name, int age, String village) {
        NodeNinja newNode = new NodeNinja(name, age, village);
        this.head = newNode;
        this.tail = newNode;
        this.length = 1;
    }

    public void prependNinja(String name, int age, String village) {
        NodeNinja newNinja = new NodeNinja(name, age, village);

        if (head == null) {
            head = newNinja;
            tail = newNinja;
        } else {
            newNinja.next = head;
            head = newNinja;
        }
        length++;
    }

    public NodeNinja removeFirstNinja() {
        if (head == null) return null;

        NodeNinja removedNinja = head;

        if (head.next == null) {
            head = null;
            tail = null;
        } else {
            head = head.next;
        }
        removedNinja.next = null;
        length--;
        return removedNinja;
    }

    public NodeNinja getIndex(int index) {
        if (index < 0 || index >= length) {
            return null;
        }

        NodeNinja temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;

    }

    public void displayNinjas() {
        if (length == 0) {
            System.out.println("Nothing to display, the list is empty");
            return;
        }

        NodeNinja current = head;
        System.out.println("________________________");
        while (current != null) {
            System.out.println("Name: " + current.name + "\n" +
                    "Age: " + current.age + "\n" +
                    "Village: " + current.village);
            if (current.next != null) {
                System.out.println("________________________");
            }
            current = current.next;
        }
    }

    public NodeNinja getHead() {
        return head;
    }

    public NodeNinja getTail() {
        return tail;
    }

    public void getLength() {
        System.out.println("The amout of ninjas is: " + length);
    }
}


