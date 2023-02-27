package Device;

import Products.Product;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.List;


public class VendingMachine {
    protected List<Product> localList = new ArrayList<>();
    private int cash;


    @Override
    public String toString() {
        StringBuilder localString = new StringBuilder();
        for (Product product : localList) {
            localString.append(product.toString());
            localString.append("\n");
        }
        localString.append("В автомате имеется ").append(cash).append("р. \n");
        return localString.toString();
    }

    public void addProduct(Product inputProduct) {
        localList.add(inputProduct);

    }

    public List<Product> findProduct(String name) {
        List<Product> foundProduct = new ArrayList<>();
        for (Product product : localList) {
            if (product.getName().contains(name)) {
                foundProduct.add(product);
            }
        }
        return foundProduct;
    }

    public Product sellProduct(Product sallingProduct) {
        Product sellProduct = new Product();
        if (localList.contains(sallingProduct)) {
            for (int i = 0; i < localList.size(); i++) {
                if (localList.get(i) == sallingProduct) {
                    sellProduct = localList.get(i);
                    localList.remove(i);
                    cash += sellProduct.getCost();
                    return sellProduct;
                }
            }
        }

        return sellProduct;
    }
}
