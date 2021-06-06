package Java_classesAndObject;
public class Category {
    // property
    private int categoryId;
    private String categoryName;

    //get Method
    public int getCategoryId(){
        return categoryId;
    }
    public String getCategoryName(){
        return categoryName;
    }

    // set Method
    public void setCategoryId(int _categoryId){
        this.categoryId = _categoryId;
    }
    public void setCategoryName(String _categoryName){
        this.categoryName = _categoryName;
    }
}
