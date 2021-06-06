package Java_classesAndObject;

public class Person {
    private String name;
    private char gender;
    private int age;

    //getter
    public String getName(){
        return name;
    }
    public char getGender(){
        return gender;
    }
    public int getAge(){
        return age;
    }
    // setter
    public void setName(String _name){
        this.name = _name;
    }
    public void setGender(char _gender){
        this.gender = _gender;
    }
    public void setAge(int _age){
        this.age = _age;
    }
}
