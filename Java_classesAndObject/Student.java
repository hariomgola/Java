package Java_classesAndObject;

public class Student {
    private int id;
    private String name;
    private int[] marks;
    private float average;
    private char grade;

    // Constructor
    public Student(int _id,String _name,int[] _marks){
        this.id=_id;
        this.name = _name;
        this.marks = _marks;
    }

    // getter
    public int getId(){
        return id;
    } 
    public String getName(){
        return name;
    }
    public int[] getMarks(){
        return marks;
    }
    public float getAverage(){
        return average;
    }
    public char getGrade(){
        return grade;
    }
    // setter
    public void setId(int _id){
        this.id = _id;
    }
    public void setName(String _name){
        this.name = _name;
    }
    public void setMarks(int[] _marks){
        this.marks = _marks;
    }
    public void setAverage(float _average){
        this.average = _average;
    }
    public void setGrade(char _grade){
        this.grade = _grade;
    }

    // functionality method
    public void findGrade(){
        int [] _marks = getMarks();
        for(int i=0;i<_marks.length;i++){
            if(marks[i]<50){
                this.grade='F';
                return;
            }
        }
        float _average = getAverage();
        if(_average>=50 && _average<=79)
            setGrade('A');
        if(_average>79)
            setGrade('O');
    }
    public void calculateAvg(){
        float sum=0;
        for(int i=0;i<marks.length;i++){
            sum += marks[i];
        }
        setAverage(sum/(marks.length));
    }

}
