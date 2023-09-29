package ra.bt3;

import java.util.Scanner;

public class Product {
    private String productId;
    private String productName;
    private int catalogId;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(int catalogId) {
        this.catalogId = catalogId;
    }

    public void inputData(Scanner scanner, Product[] arrProduct, int currentProduct, Categories[] arrCategories, int currentCategories){
        System.out.println("Nhập mã sản phẩm");
        System.out.println("Nhập tên sản phẩm");
        System.out.println("Chọn danh mục của sản phẩm:");
        //Hiển thị ra các danh mục
        for (int i = 0; i < currentCategories; i++) {
            System.out.printf("%d.%s\n",(i+1),arrCategories[i].getCatalogName());
        }
        System.out.print("Lựa chọn của bạn:");
        int choice = Integer.parseInt(scanner.nextLine());//choice = chỉ số phẩn tử catalog được chọn - 1
        this.catalogId = arrCategories[choice-1].getCatalogId();

    }
}
