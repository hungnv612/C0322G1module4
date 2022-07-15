package totalFile.repository;

import org.springframework.stereotype.Repository;
import totalFile.model.Product;

import java.util.ArrayList;
import java.util.List;


@Repository
public class ProductRepository implements IProductRepository{
    static List<Product> productList = new ArrayList<>();

    static {
        productList.add(new Product("1", "Iphone 11", 1000, "apple", "new 100%"));
        productList.add(new Product("2", "Iphone 12", 1200, "apple", "new 98%"));
        productList.add(new Product("3", "Iphone 13", 1500, "apple", "new 99%"));
        productList.add(new Product("4", "samsung note 20", 1500, "samsung", "new 95%"));
        productList.add(new Product("5", "samsung note 10", 1200, "samsung", "new 100%"));
    }
    @Override
    public List<Product> findAll() {
        return productList;
    }

    @Override
    public void save(Product product) {

    }

    @Override
    public Product findById(String id) {
        return null;
    }

    @Override
    public void update(String id, Product product) {

    }

    @Override
    public void remove(String id) {

    }

    @Override
    public List<Product> searchByName(String name) {
        return null;
    }
}
