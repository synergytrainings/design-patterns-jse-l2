package meruzhan.gasparyan.flyweight;

import main.Extend;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by meruzhan.gasparyan on 28-Apr-17.
 */
public class Shop {

    private String address;
    private String name;
    private List<Product> goods;
    private Producers producers;


    public Shop(String address, String name, List<Product> goods) {
        this.address = address;
        this.name = name;
        this.goods = goods;
        this.producers = Producers.getInstance();
    }

    public Shop(String address,String name){
        this.address = address;
        this.name = name;
        this.goods = new ArrayList<>();
        this.producers = Producers.getInstance();
    }


    public Product getProduct(String productName){
        for (Product product: goods) {
            if(product.getName().equals(productName)){
                return product;
            }
        }

        Product product = producers.order(productName);
        goods.add(product);
        return product;
    }

}
