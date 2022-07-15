package totalFile.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import totalFile.model.Product;
import totalFile.repository.IProductRepository;

import java.util.List;

@Service
public class ProductService implements IProductService{

    @Autowired
    private IProductRepository iProductRepository;

    @Override
    public List<Product> findAll() {
        return iProductRepository.findAll();
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
