package Java_classesAndObject;
/*
Product Details
A departmental store displays all its products along with its price for the convenience of its customers. 
In the inventory of the departmental store, all the products with its price and the quantity is maintained. 
The store manager can look at the inventory and find out which of the products are selling fast so that 
he can re-order to maintain the stock. The stock should be maintained at 10 per product.

Consider the below class:
In the Shop class include the given attributes , methods and constructor with the access specifiers as specified in the class

[Note: The productName array will hold the name of the product, 
the productQuantity array will hold the quantity of each product and 
the productPrice array will hold the price of each product. The size of all the 3 arrays should be same.]

Example: if productName[0]=”laptop” then its quantity will be stored in productQuantity[0] 
and price will be stored in productPrice[0].
The constructor is used to initialize the product name, product quantity and product price.
 1.The search method is overloaded method. The search method which takes int as argument is used to search 
   the product based on the quantity. This method should return the product details of the given quantity. 
   The return message should be in the given format:
 
 Productname:price of the product
For example if the input is 30, consider that three products have the quantity as 30, 
so this method return the string array as:

Product1name:price in the arraylocation “0”
Product2name:price in the arraylocation “1”
Product3name:price in the arraylocation “2”

 2.The search method which takes float as argument is used to search the product based on the price. 
   This method should return the product details of the given price. The return message should be in the format given below:

 Productname:quantity of the product
For example if the input is 3200.58, consider that three products have the price as 3200.58, 
so this method return the string array as:

 Product1name:quantity in the arraylocation “0”
 Product2name:quantity in the arraylocation “1”
 Product3name:quantity in the arraylocation “2”

 3.The search method which does not take any argument is used to search the products that has reached the re-order level. 
 The product with the quantity 10 and less than 10 have reached the re-order level. 
 This method should return the product names which is less than 10 that is below the re-order level. 
 
  Input 1
    Enter the number of products:
    4
    Enter product names:
    laptop
    mobile
    pendrive
    monitor
    Enter the price of each product:
    45000.63
    10000.63
    399.45
    399.45
    Enter the quantity of each product:
    30
    2
    30
    9
    Enter the product price to be searched:
    399.45
    Enter the product quantity to be searched:
    30

  Ouput1
    Search based on price
    pendrive:30
    monitor:9
    Search based on quantity
    laptop:45000.63
    pendrive:399.45
    Products below re-ordered level
    mobile
    monitor
*/
import java.util.Scanner;
public class ProductDetails {
    public static void main(String[] args){
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter the number of products:");
        int _number = SC.nextInt();
        SC.nextLine();

        // Array Creation
        String[] _productName = new String[_number];
        int[] _productQuantity = new int[_number];
        float[] _productPrice = new float[_number];

        // Taking inputs From user
        System.out.println("Enter product names:");
        for(int i=0;i<_productName.length;i++)
            _productName[i]=SC.nextLine();
        
        System.out.println("Enter the price of each product:");
        for(int i=0;i<_productPrice.length;i++)
            _productPrice[i]=SC.nextFloat();

        System.out.println("Enter the quantity of each product:");
        for(int i=0;i<_productQuantity.length;i++)
            _productQuantity[i]=SC.nextInt();

        // Invoking class with parameter
        Shop _shop = new Shop(_productName,_productQuantity,_productPrice);

        // Take input from user
        System.out.println("Enter the product price to be searched:");
        float _itemPrice = SC.nextFloat();
        System.out.println("Enter the product quantity to be searched:");
        int _itemQuanitity = SC.nextInt();

        // Printing Output
        System.out.println("Search based on price");
        String[] _price = _shop.search(_itemPrice);
        for(int i=0;i<_price.length;i++)
            System.out.println(_price[i]);

        System.out.println("Search based on quantity");
        String[] _quantity = _shop.search(_itemQuanitity);
        for(int i=0;i<_quantity.length;i++)
            System.out.println(_quantity[i]);

        System.out.println("Products below re-ordered level");
        String[] _reorder = _shop.search();
        for(int i=0;i<_reorder.length;i++)
            System.out.println(_reorder[i]);

    }
}
