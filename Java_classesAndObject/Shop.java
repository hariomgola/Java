package Java_classesAndObject;

public class Shop {
    private String[] productName;
    private int[] productQuality;
    private float[] productPrice;

    // constructor
    public Shop(String[] _productName,int[] _productQuality,float[] _productPrice){
        this.productName = _productName;
        this.productQuality = _productQuality;
        this.productPrice = _productPrice;
    }

    // Functionality method Using Concept of method Overloading
    public String[] search(int _quantity){
        int counter=0;
        for(int i=0;i<productQuality.length;i++){
            if(productQuality[i] == _quantity)
                counter++;
        }

        String[] result = new String[counter];
        for(int i=0,j=0;i<productQuality.length;i++){
            if(productQuality[i] == _quantity)
                result[j++] = productName[i]+":"+productPrice[i];
        }

        return result;
    }

    public String[] search(float _price){
        int counter = 0;
        for(int i=0;i<productPrice.length;i++){
            if(productPrice[i]==_price)
                counter++;
        }

        String[] result = new String[counter];
        for(int i=0,j=0;i<productPrice.length;i++){
            if(productPrice[i]==_price)
                result[j++] = productName[i]+":"+productQuality[i];
        }

        return result;
    }

    public String[] search(){
        int counter =0;
        for(int i=0;i<productQuality.length;i++){
            if(productQuality[i]<10)
                counter++;
        }

        String[] result = new String[counter];
        for(int i=0,j=0;i<productQuality.length;i++){
            if(productQuality[i]<10)
                result[j++]=productName[i];
        }

        return result;
    }
}
