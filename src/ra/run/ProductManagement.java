package ra.run;

import rabussinessImp.Product;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Collection;

public class ProductManagement {
    static ArrayList<Product> listProduct=new ArrayList<>();
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int choice;
        boolean productStatus=false;
        do {
            System.out.print("\n****************HACKATHON-JAVA-ADVANCE-05-BASIC-MENU***************\n" +
                    "1. Nhập số sản phẩm và nhập thông tin sản phẩm\n" +
                    "2. Hiển thị thông tin các sản phẩm \n" +
                    "3. Sắp xếp sản phẩm theo lợi nhuận tăng dần\n" +
                    "4. Xóa sản phẩm theo mã sản phẩm\n" +
                    "5. Tìm kiếm sản phẩm theo tên sản phẩm\n" +
                    "6. Thay đổi trạng thái của sản phẩm theo mã sản phẩm\n" +
                    "7. Thoát\n");
            System.out.print("\nVui lòng chọn một mục thực thi: ");
            choice = input.nextInt();
            if (!productStatus && choice != 1) {
                System.out.println("Hiện sản phẩm đã hết, vui lòng chọn 1!!!");
            } else {
                if (choice != 7) {
                    switch (choice) {
                        case 1:
                            System.out.println("Nhập số lượng sản phẩm");
                            int n=input.nextInt();
                            for (int i = 0; i < n; i++) {
                                Product sp=new Product();
                                sp.inputData();
                                listProduct.add(sp);
                            }
                            break;
                        case 2://THông tin san phẩm
                            for (int i = 0; i <listProduct.size() ; i++) {
                                Product sp = listProduct.get(i);
                                sp.displayData();
                                System.out.println("\n");
                            }
                            break;
                        case 3:
                            Collections.sort(listProduct);
                            System.out.println("mảng là");

                            break;
                        case 4:
                            System.out.println("Nhập sản phẩm cần xóa");
                            int deleteProduct = input.nextInt();
                            for (int i = 0; i <listProduct.size() ; i++) {
                                if(listProduct.get(i).getProductid()==deleteProduct){
                                    listProduct.remove(i);
                                }
                                
                            }

                            break;
                        case 5:
                            input.nextLine();
                            System.out.println("Nhập sản phẩm muốn tìm");
                            String maSp= input.nextLine();


                            break;
                        case 6:
                            System.out.println("Nhập vào sản phẩm cần thay đổi");
                            int change= input.nextInt();
                            for (int i = 0; i <listProduct.size() ; i++) {
                                if (listProduct.get(i).getProductid()==change){
                                    listProduct.get(i).setProductStatus();
                                }
                            }

                            break;
                        default:
                            System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại!!!");
                            break;
                    }
                } else {
                    System.out.println("Chuương trình sẽ kết thúc ngay sau đây!!!");
                }
            }
        } while (choice != 7);
    }

}

