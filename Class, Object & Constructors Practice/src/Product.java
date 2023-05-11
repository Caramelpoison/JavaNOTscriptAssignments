public class Product {

    public double cost;
    public int quantity;
    public String name;

    public Product(String name, double cost, int quantity){
        this.cost       =       cost;
        this.quantity   =       quantity;
        this.name       =       name;
    }
    public double totalCost(Product product, int quantity){
        double total       =       product.cost        *       quantity;
        System.out.println(product.name + " cost $" + product.cost + " and " + quantity + " units were purchased");
        System.out.println("");
        System.out.println("The Total Cost is $" + total);
        System.out.println("");
        return total;
    }

    public void printProduct(Product product){
        System.out.println("One " + product.name + " cost $" + product.cost);
        System.out.println("");
    }

}
