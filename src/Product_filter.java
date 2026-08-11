class Product{
    String name;
    String category;
    int price;
    String brand;
    public Product(String name,String category,int price,String brand)
    {
        this.name=name;
        this.category=category;
        this.price=price;
        this.brand=brand;
    }
    public void display()
    {
        System.out.println("->" +name+ "("+category+ ", "+price+ "$, "+brand+")");
    }
}
class ProductCatalog{
    Product[] products;

    public ProductCatalog(Product[] products)
    {
        this.products = products;
    }

    public void filterProducts(String category)
    {
        System.out.println("search for category ->"+category);
        for(Product p:products)
        {
            if(p.category.equalsIgnoreCase(category))
            {
                p.display();
            }
        }
    }
    public void filterProducts(int minPrice, int mxPrice)
    {
        System.out.println("search for price range ->"+minPrice+"-"+mxPrice);
        for(Product p:products)
        {
            if(p.price<=mxPrice && p.price>=minPrice)
            {
                p.display();
            }
        }
    }
    public void filterProducts(String brand, boolean isbrand)
    {
        System.out.println("search for brand ->" +brand);
        for(Product p:products)
        {
            if(p.brand.equalsIgnoreCase(brand))
            {
                p.display();
            }
        }
    }
    public void filterProducts(String category,int minPrice,int mxPrice)
    {
        System.out.println("search for category->"+category+" price range->"+minPrice+"-"+mxPrice);
        for(Product p:products)
        {
            if(p.category.equalsIgnoreCase(category) && p.price>=minPrice && p.price<=mxPrice)
            {
                p.display();
            }
        }
    }
    public void filterProducts(String category,int minPrice,int mxPrice,String brand)
    {
        System.out.println("search for category ->"+category+" price range->"+minPrice+"-"+mxPrice+" ,brand"+brand);
        for(Product p:products)
        {
            if(p.category.equalsIgnoreCase(category)&& p.price>=minPrice && p.price<=mxPrice && p.brand.equalsIgnoreCase(brand))
            {
                p.display();
            }
        }
    }

}
public class Product_filter{
    public static void main(String[] args)
    {
        Product[] items={
                new Product("iPhone 15", "Electronics", 999, "Apple"),
                new Product("MacBook", "Electronics", 1199, "Apple"),
                new Product("AirPods", "Electronics", 199, "Apple"),
                new Product("Tshirt", "Fashion", 110, "Nike"),
                new Product("Running Shorts", "Fashion", 45, "Nike")
        };
        ProductCatalog filter= new ProductCatalog(items);
        filter.filterProducts("electronics");
        filter.filterProducts(100,500);
        filter.filterProducts("nike",true);
        filter.filterProducts("electronics",100,500,"Apple");
    }
}
