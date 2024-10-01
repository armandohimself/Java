package CodingExercises.Keywords.This;

class ProductBuilder {
    private String productType;
    private double price;

    public ProductBuilder setProductType(String productType) {
        this.productType = productType;
        return this;
    }

    public ProductBuilder setPrice(double price) {
        this.price = price;
        return this;
    }

    public Product build() {
        return new Product(this.productType, this.price);
    }

    public static void main(String[] args) {
        Product product = new ProductBuilder().setProductType("Book").setPrice(19.99).build();
        System.out.println("Product Type: " + product.getProductType() + ", Price: " + product.getPrice());
    }
}

class Product {
    private String productType;
    private double price;

    public Product(String productType, double price) {
        this.productType = productType;
        this.price = price;
    }

    public String getProductType() {
        return productType;
    }

    public double getPrice() {
        return price;
    }
}
