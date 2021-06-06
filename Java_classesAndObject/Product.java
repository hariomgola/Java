package Java_classesAndObject;
public class Product {
    // Property
    private int  productId;
    private String productName;
    private double price;
    private Category categoryObj;

    // get Method;
    public int getProductId(){
        return productId;
    }
    public String getProductName(){
        return productName;
    }
    public double getPrice(){
        return price;
    }
    public Category getCategoryObj(){
        return categoryObj;
    }

    // set Method
    public void setProductId(int _productId){
        this.productId = _productId;
    }
    public void setProductName(String _productName){
        this.productName = _productName;
    }
    public void setPrice(double _price){
        this.price = _price;
    }
    public void setCategoryObj(Category _categoryObj){
        this.categoryObj = _categoryObj;
    }

    // Functionality method
    public void appluCoupon(){
        String _categoryname = categoryObj.getCategoryName();
        double _discount = 0;
        if(_categoryname.equals("Electronic"))
            _discount = price*0.10;
        if(_categoryname.equals("Furniture"))
            _discount = price*0.05;
        if(_categoryname.equals("Cosmetics"))
            _discount = price*0.02;
        this.price = price - _discount;
    }
}
