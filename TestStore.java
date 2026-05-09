package CSCProj;

import javax.swing.SwingUtilities;

public class TestStore {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ShoppingCart cart = new ShoppingCart();
            AddProductFrame firstFrame = new AddProductFrame(cart);
            firstFrame.setVisible(true);
        });
    }
}