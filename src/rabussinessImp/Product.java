package rabussinessImp;

import rabussiness.IProduct;

import java.util.Scanner;

public class Product implements IProduct {
    private int productid;
   private String productName,title,descriptions;
   private float importPrice,exportPrice,interest;
   private boolean productStatus;

    @Override
    public void inputData() {
        Scanner input =new Scanner(System.in);
        System.out.print("Nhập mã sản phẩm : ");
        this.setProductid(input.nextInt());
        System.out.print("Nhập tên sản phẩm : ");
        this.setProductName(input.nextLine());
        System.out.print("Nhập tiêu đề sản phảm: ");
        this.setTitle(input.nextLine());
        this.setDescriptions(input.nextLine());
        System.out.print("Nhập mô tả sản phẩm : ");
        this.setImportPrice(input.nextFloat());
        System.out.print("Nhập giá nhập của sản phẩm : ");
        this.setExportPrice(input.nextFloat());
        System.out.print("Nhập giá xuất của sản phẩm : ");
        this.setProductStatus(input.nextBoolean());
        System.out.print("Nhập trạng thái của sản phẩm : ");


    }
    public Product(){}
    public void CalInterest(){
        float interest=(this.exportPrice-this.importPrice);

    }

    @Override
    public void displayData() {
        CalInterest();
        System.out.printf("%-20s%-20s%-20s%-20s\n" +
                        "%-20s%-20d%-20s%-20s%-20s%-20s\n" +
                        "%-20s%-60s%-20s%-20.2f\n",
                "Mã sản phẩm : ", getProductid(), "Tên sản phẩm : ", getProductName(),
                "tiêu đê : ", getTitle(), "Mô tả : ", getDescriptions(), "giá nhập : ", getImportPrice(),
                "giá xuất : ", getExportPrice(), "Hoa Hồng : ");
    }
    public Product(int productid, String productName, String title, String descriptions, float importPrice, float exportPrice, float interest, boolean productStatus) {
        this.productid = productid;
        this.productName = productName;
        this.title = title;
        this.descriptions = descriptions;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.interest = interest;
        this.productStatus = productStatus;
    }





    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public float getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(float importPrice) {
        this.importPrice = importPrice;
    }

    public float getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(float exportPrice) {
        this.exportPrice = exportPrice;
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }

    public boolean isProductStatus() {
        return productStatus;
    }

    public void setProductStatus(boolean productStatus) {
        this.productStatus = productStatus;
    }

}
