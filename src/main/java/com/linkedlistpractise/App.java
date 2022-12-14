package com.linkedlistpractise;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {
    private static final Logger logger = LogManager.getLogger(App.class);

    public static void main(String[] args) {
        logger.info("Hello to Linked List Practise Problem!");
        Linkedlist list = new Linkedlist();
        // list.insertNode(56);
        // list.insertNode(30);
        // list.insertNode(70);
        list.insertAtStart(70);
        // list.insertNode(30);
        list.insertAtStart(56);
        list.insertAtIndex(1, 30);
        list.insertAtIndex(2, 40);
        // list.deleteNode(0);
        // list.deleteNode(2);
        list.showLinkedList();
        list.searchNodeWithKey(30);
        list.sizeOfLinkedList();
        list.orderedLinkedList();
        list.showLinkedList();

    }
}
