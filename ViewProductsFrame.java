package CSCProj;

import javax.swing.*;
import java.awt.*;

public class ViewProductsFrame extends JFrame {
	
    private JTextArea textArea;
    private JTextField txtSearchId;
    private JButton btnSearch, btnShowAll, btnSave, btnLoad, btnBack;
    private ShoppingCart cart;

    public ViewProductsFrame(ShoppingCart cart) {
        this.cart = cart;
        setTitle("Store Results & Search");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));

        textArea = new JTextArea();
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane, BorderLayout.CENTER);

        JPanel topPanel = new JPanel(new FlowLayout());
        topPanel.add(new JLabel("Product ID:"));
        txtSearchId = new JTextField(10);
        topPanel.add(txtSearchId);
        btnSearch = new JButton("Search");
        topPanel.add(btnSearch);
        add(topPanel, BorderLayout.NORTH);

        JPanel bottomPanel = new JPanel(new GridLayout(2, 2, 5, 5));
        btnShowAll = new JButton("Show All Products");
        btnSave = new JButton("Save to File");
        btnLoad = new JButton("Load from File");
        btnBack = new JButton("<< Back to Add");

        bottomPanel.add(btnShowAll);
        bottomPanel.add(btnSave);
        bottomPanel.add(btnLoad);
        bottomPanel.add(btnBack);
        add(bottomPanel, BorderLayout.SOUTH);

        btnShowAll.addActionListener(e -> {
            textArea.setText(""); 
            cart.showCart(); 
            textArea.setText("Check Console for details or wait for GUI update.");
        });

     // ActionListener for the search button
        btnSearch.addActionListener(e -> {
            try {
                int id = Integer.parseInt(txtSearchId.getText());
                cart.searchProduct(id);
                JOptionPane.showMessageDialog(this, "Search completed! Check console.");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Invalid ID");
            }
        });

        btnSave.addActionListener(e -> {
            cart.saveToFile("cart_data.ser");
            JOptionPane.showMessageDialog(this, "Saved to cart_data.ser");
        });

        btnLoad.addActionListener(e -> {
            cart.loadFromFile("cart_data.ser");
            JOptionPane.showMessageDialog(this, "Loaded from file!");
        });

        btnBack.addActionListener(e -> {
            this.setVisible(false);
            new AddProductFrame(cart).setVisible(true);
        });
    }
}