package CSCProj;

import java.io.*;
//Manager class that uses a Linked List to store products and handles File I/O operations.
public class ShoppingCart implements Serializable{
	
	private Node head; // Head of the Linked List (Replacing the Array from Phase 1)

    public ShoppingCart() {
        this.head = null;
    }
    
    // Method to save the data to a Binary/Object File
    public void saveToFile(String fileName) {
        try {
            FileOutputStream fileOut = new FileOutputStream(fileName);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(this.head);
            out.close();
            fileOut.close();
        } catch (IOException i) {
            System.out.println("Error: " + i.getMessage());
        }
    }

    public void loadFromFile(String fileName) {
        try {
            FileInputStream fileIn = new FileInputStream(fileName);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            this.head = (Node) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public void addProduct(Product p) {
        Node newNode = new Node(p);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(newNode);
        }
        System.out.println("Added: " + p.getName());
    }

    // Method to search for a product.
    // Demonstrates Exception Propagation by throwing ProductNotFoundException.
    public void searchProduct(int searchId) throws ProductNotFoundException {
        Node temp = head;
        while (temp != null) {
            if (temp.getData().getId() == searchId) {
                temp.getData().displayInfo();
                return;
            }
            temp = temp.getNext();
        }
        throw new ProductNotFoundException("Product with ID " + searchId + " not found!");
    }

    public void removeProduct(int removeId) {
        if (head == null) return;
        if (head.getData().getId() == removeId) {
            head = head.getNext();
            return;
        }
        Node temp = head;
        while (temp.getNext() != null) {
            if (temp.getNext().getData().getId() == removeId) {
                temp.setNext(temp.getNext().getNext());
                return;
            }
            temp = temp.getNext();
        }
    }

    public double calculateTotal() {
        return calculateTotalRecursive(head);
    }

 // Demonstrates Recursion to calculate the total price of all items in the list.
    private double calculateTotalRecursive(Node current) {
        if (current == null) return 0;
        return current.getData().getPrice() + calculateTotalRecursive(current.getNext());
    }

    public void showCart() {
        Node temp = head;
        while (temp != null) {
            temp.getData().displayInfo();
            temp = temp.getNext();
        }
        System.out.println("Total Amount: " + calculateTotal() + " SAR");
    }
}