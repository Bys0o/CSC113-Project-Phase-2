package CSCProj;
//Custom User-defined Exception class to handle cases where a product is missing.
public class ProductNotFoundException extends Exception {
	public ProductNotFoundException(String message) {
        super(message);
    }
}