/**
Highest Mark in Each Semester
Ram wants to know the maximum marks scored by him in each semester. The mark should be between 0 to 100 ,
if goes beyond the range display "You have entered invalid mark."

  Input 1:
    Enter no of semester:
    3
    Enter no of subjects in 1 semester:
    3
    Enter no of subjects in 2 semester:
    4
    Enter no of subjects in 3 semester:
    2
    Marks obtained in semester 1:
    50
    60
    70
    Marks obtained in semester 2:
    90
    98
    76
    67
    Marks obtained in semester 3:
    89
    76

  Output 1:
    Maximum mark in 1 semester:70
    Maximum mark in 2 semester:98
    Maximum mark in 3 semester:89


  Input 2:
    Enter no of semester:
    3
    Enter no of subjects in 1 semester:
    3
    Enter no of subjects in 2 semester:
    4
    Enter no of subjects in 3 semester:
    2
    Marks obtained in semester 1:
    55
    67
    98
    Marks obtained in semester 2:
    67
    -98

  Output 2:
    You have entered invalid mark.
 */
import java.util.*;
public class highestSemMarks {
    public static void main(String[] args){
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter no of semester:");
        int len = SC.nextInt();
        int [] sem = new int[len];
        int [] max = new int[len];

        for(int i=0;i<sem.length;i++){
            System.out.println("Enter the no of subject in "+(i+1)+" semester:");
            sem[i] = SC.nextInt();
        }

        boolean flag = true;
        for(int i=0;i<sem.length;i++){
            System.out.println("Marks obtained in semester "+(i+1)+":");
            max[i] = maxSemMaxrks(sem[i]);
            if(max[i]==-1){
                System.out.println("You have enteered invalid mark.");
                flag = false;
                break;
            }
            if(!flag)
                break;
        }

        if(flag){
            for(int i=0;i<max.length;i++)
                System.out.println("Maximum mark in "+(i+1)+" semester:"+max[i]);
        }
    }

    public static int maxSemMaxrks(int length){
        boolean flag = true;
        Scanner SC = new Scanner(System.in);
        int[] marks =  new int[length];

        for(int i=0;i<marks.length;i++){
            marks[i] = SC.nextInt();
            if(marks[i]>100 || marks[i]<0){
                flag = false;
                return -1;
            }
        }

        if(flag)
            Arrays.sort(marks);
        return marks[(marks.length)-1];
    }
}
