package totalFile.repository;


import org.springframework.stereotype.Repository;
import totalFile.model.Product;

import java.util.ArrayList;
import java.util.List;


@Repository
public class ProductRepository implements IProductRepository {
    static List<Product> productList = new ArrayList<>();

    static {
        productList.add(new Product(1, "Iphone 11", 1000, "apple", "new 100%"));
        productList.add(new Product(2, "Iphone 12", 1200, "apple", "new 98%"));
        productList.add(new Product(3, "Iphone 13", 1500, "apple", "new 99%"));
        productList.add(new Product(4, "samsung note 20", 1500, "samsung", "new 95%"));
        productList.add(new Product(5, "samsung note 10", 1200, "samsung", "new 100%"));
    }

    @Override
    public List<Product> findAll() {
        return productList;
    }


    @Override
    public Product findById(int id) {
        Product product = null;
        for (Product item : productList) {
            if (item.getId() == id) {
                product = new Product(item.getId(), item.getName(), item.getPrice(), item.getProducer(), item.getDescription());
            }
        }
        return product;
    }

    @Override
    public void update(int id, Product product) {
        for (Product value : productList) {
            if (id == value.getId()) {
                value.setName(product.getName());
                value.setPrice(product.getPrice());
                value.setProducer(product.getProducer());
                value.setDescription(product.getDescription());
            }
        }
    }

    @Override
    public void remove(int id) {
        int index = 0;
        for (int i = 0; i < productList.size(); i++) {
            if (id == productList.get(i).getId()) {
                index = i;
            }
        }
        productList.remove(index);
    }

    @Override
    public List<Product> searchByName(String name) {
        return null;
    }
}
