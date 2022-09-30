package com.linkedlistpractise;

public class Linkedlist {
    Node head;

    void insertNode(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    void insertAtStart(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        if (head == null) {
            head = node;
        } else {
            Node temp;
            temp = head;
            head = node;
            head.next = temp;
        }
    }

    void insertAtIndex(int index, int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        if (head == null) {
            insertAtStart(data);
        } else {
            Node temp;
            temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            node.next = temp.next;
            temp.next = node;
        }
    }

    void show() {
        Node temp = head;
        while (temp.next != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println(temp.data);

    }

    void deleteNode(int index) {
        Node node;
        Node temp;
        temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        node = temp.next;
        temp.next = node.next;
        node = null;

    }

    void searchValue(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        if (head == null) {
            System.out.println("Linked list empty!!");
        } else {
            Node temp;
            temp = head;
            while (temp != null) {
                if (temp.data == node.data) {
                    System.out.println("Node Found " + node.data);
                    break;
                } else {
                    temp = temp.next;
                }
            }

        }
    }

}
