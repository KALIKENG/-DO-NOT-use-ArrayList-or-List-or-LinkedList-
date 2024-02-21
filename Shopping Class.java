public class Sale {
    private String type;
    private double price;
    private Customer customer;

    public Sale(String type, double price, Customer customer) {
        this.type = type;
        this.price = price;
        this.customer = customer;
    }

    public double calculateTotal() {
        double discount = customer.getDiscountRate() * price;
        return price - discount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}