package Device;

import Products.Product;

import java.text.DateFormat;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;


public class VendingMachine {
    protected List<Product> localList = new ArrayList<>();
    private double cash;
    private final Locale locale = new Locale("ru","RU");
    private final DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.LONG, locale);

    @Override
    public String toString() {
        StringBuilder localString = new StringBuilder();
        for (Product product : localList) {
            localString.append(product.toString());
            localString.append("\n");
        }
        localString.append("В автомате -> ").append(cash).append("р. \n");
        return localString.toString();
    }

    public void addProduct(Product inputProduct) {
        localList.add(inputProduct);
        inputProduct.setLoadDate(dateFormat.format(new Date()));
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
    public DateFormat getDateFormat(){
        return dateFormat;
    }
}
