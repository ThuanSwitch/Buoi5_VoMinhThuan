package vominhthuan.spring.sevice;

import vominhthuan.spring.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> ListProduct=new ArrayList<>();

    public ProductService(){
        this.ListProduct.add(new Product(1,"san pham 1","1.jmg",947));
        this.ListProduct.add(new Product(2,"san pham 2","2.jmg",948));
    }
    public void add(Product newProduct){
        ListProduct.add(newProduct);
    }
    public  List<Product> GetAll(){
        return ListProduct;
    }
    public Product get(int id){
        return ListProduct.stream().filter(p->p.getId()==id).findFirst().orElse(null);
    }
    public  void edit(Product editProduct){}

}
