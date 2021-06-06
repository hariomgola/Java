package Java_classesAndObject;
/*
Discount Coupon
Online Strore provides a discount coupon to their customer. The customer can use this coupon to buy the products, 
so that they can avail a discount for the product they bought. 
The coupon provided by the mall is not applicable for all the products. 
The customer can use the coupon to avail discount for a certain category of products. 
The table given below list outs the category and its percentage of discount of several category of products.

    Category            Discount percentage

     - Electronic       - 10%
     - Furniture        - 5%
     - Cosmetics        - 2%

The discount is applicable only for the above categories.

Create a Category class which has below property.
int categoryId;
String categoryName;

Create an another Product class which has below property.
int productId;
String productName;
double price;
Category categoryObj;


 Input:
    Enter the product id:
    1
    Enter the product name:
    Laptop
    Enter the price:
    50000
    Enter the category id:
    002
    Enter the category name:
    Electronic

 Output:
    You need to pay 45000.00/- for the Electronic - Laptop
 
 Input:
    Enter the product id:
    2
    Enter the product name:
    jeans
    Enter the price:
    5000
    Enter the category id:
    003
    Enter the category name:
    Apparels

  Output:
    You need to pay 5000.00/- for the Apparels - jeans
*/
import java.util.Scanner;
public class Discount {
    public static void main(String[] args){
        Scanner SC = new Scanner(System.in);
        Product _p = new Product();
        Category _c = new Category();

        System.out.println("Enter the product id:");
        _p.setProductId(SC.nextInt());
        SC.nextLine();
        System.out.println("Enter the product name:");
        _p.setProductName(SC.nextLine());
        System.out.println("Enter the price:");
        _p.setPrice(SC.nextDouble());
        System.out.println("Enter tha category id:");
        _c.setCategoryId(SC.nextInt());
        SC.nextLine();
        System.out.println("Enter the category name:");
        _c.setCategoryName(SC.nextLine());

        _p.setCategoryObj(_c);
        _p.appluCoupon();

        System.out.println("You need to pay " +String.format("%.2f",_p.getPrice())+ "/- for the " + _c.getCategoryName() +" - " + _p.getProductName() );
    }
}
