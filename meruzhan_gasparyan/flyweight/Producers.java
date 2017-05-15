package meruzhan.gasparyan.flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by meruzhan.gasparyan on 28-Apr-17.
 */

public class Producers {
    private static List<Product> goods = new ArrayList<>();
    private static Producers instance = new Producers();


    private Producers(){
        if(instance != null) {
            throw new RuntimeException();
        }
    }

    public Product order(String productName) {
        for (Product product: goods) {
            if(product.getName().equals(productName)){
                return product;
            }
        }
        Product product = new Product(productName);
        goods.add(product);
        return product;
    }

    public static Producers getInstance(){
        return instance;
    }
}
