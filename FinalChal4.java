package com.mycompany.finalchal4;

public class FinalChal4 {

    // Node class representing a single page in the browsing history
    static class Node {
        String url;
        Node prev;
        Node next;

        Node(String url) {
            this.url = url;
        }
    }

    // BrowserHistory class implementing the functionality
    static class BrowserHistory {
        private Node current;

        // Visit a new page
        public void visit(String url) {
            Node newNode = new Node(url);
            if (current != null) {
                current.next = null; // Clear forward history
                newNode.prev = current;
            }
            current = newNode;
            System.out.println("Visited: " + url);
        }

        // Go back to the previous page
        public void goBack() {
            if (current != null && current.prev != null) {
                current = current.prev;
                System.out.println("Back to: " + current.url);
            } else {
                System.out.println("No previous page.");
            }
        }

        // Go forward to the next page
        public void goForward() {
            if (current != null && current.next != null) {
                current = current.next;
                System.out.println("Forward to: " + current.url);
            } else {
                System.out.println("No next page.");
            }
        }

        // Print the current page
        public void printCurrentPage() {
            if (current != null) {
                System.out.println("Current page: " + current.url);
            } else {
                System.out.println("No pages visited.");
            }
        }
    }

    public static void main(String[] args) {
        BrowserHistory browserHistory = new BrowserHistory();

        browserHistory.visit("www.google.com");
        browserHistory.visit("www.youtube.com");
        browserHistory.visit("www.github.com");

        browserHistory.goBack(); // Goes to www.youtube.com
        browserHistory.goBack(); // Goes to www.google.com
        browserHistory.goForward(); // Goes to www.youtube.com
        browserHistory.visit("www.stackoverflow.com"); // Clears forward history

        browserHistory.goBack(); // Goes to www.youtube.com
        browserHistory.printCurrentPage(); // Prints www.youtube.com
        browserHistory.goForward(); // Goes to www.stackoverflow.com
        browserHistory.goForward(); // No next page
    }
}

