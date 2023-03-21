public class Main {
    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        Product product = new Product();
        manager.add(product);
        product.id = 46421;
        product.name = "";
        product.price = 2000;
        manager.add(product);

    }
}