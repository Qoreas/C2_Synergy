package semester1.module3.homework.W8_FinalProject.data.sourse.catalog;

import semester1.module3.homework.W8_FinalProject.data.models.Product;

import java.util.ArrayList;

public class MockCatalogDataSourceImpl extends CatalogDataSource {

    @Override
    public ArrayList<Product> getCatalog() {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("1", "SmartPhone", "AppleMaxPro12", 100_000, true));
        products.add(new Product("2", "LapTop", "MacNTosh", 10_000, false));
        products.add(new Product("3", "SmartWatch", "MiBand U-FS", 40_000, false));
        products.add(new Product("4", "Monitor", "MPSI-NND", 4_000, true));
        return products;
    }
}
