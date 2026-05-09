package CSCProj;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AddProductFrame extends JFrame {
    private JTextField txtName, txtPrice, txtId, txtExtra;
    private JButton btnAddLaptop, btnAddPhone, btnNextFrame;
    private ShoppingCart cart;

    public AddProductFrame(ShoppingCart cart) {
        this.cart = cart;
        setTitle("Store Management - Add Products");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(6, 2, 10, 10));

        add(new JLabel("   Product Name:")); 
        txtName = new JTextField(); 
        add(txtName);

        add(new JLabel("   Price:")); 
        txtPrice = new JTextField(); 
        add(txtPrice);

        add(new JLabel("   ID:")); 
        txtId = new JTextField(); 
        add(txtId);

        add(new JLabel("   Spec:")); 
        txtExtra = new JTextField(); 
        add(txtExtra);

        btnAddLaptop = new JButton("Add Laptop");
        btnAddPhone = new JButton("Add Smartphone");
        btnNextFrame = new JButton("Go to Results >>");

        add(btnAddLaptop); 
        add(btnAddPhone);
        add(new JLabel("   Navigate:")); 
        add(btnNextFrame);

        btnAddLaptop.addActionListener(e -> {
            try {
                int id = Integer.parseInt(txtId.getText());
                double price = Double.parseDouble(txtPrice.getText());
                Laptop L = new Laptop(id, txtName.getText(), price, "Acer", 12, 16, txtExtra.getText());
                cart.addProduct(L);
                JOptionPane.showMessageDialog(this, "Laptop Added!");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Input Error!");
            }
        });

        btnAddPhone.addActionListener(e -> {
            try {
                int id = Integer.parseInt(txtId.getText());
                double price = Double.parseDouble(txtPrice.getText());
                Smartphone S = new Smartphone(id, txtName.getText(), price, "Apple", 24, 5000, txtExtra.getText());
                cart.addProduct(S);
                JOptionPane.showMessageDialog(this, "Smartphone Added!");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Input Error!");
            }
        });

        btnNextFrame.addActionListener(e -> {
            this.setVisible(false);
            new ViewProductsFrame(cart).setVisible(true);
        });
    }
}