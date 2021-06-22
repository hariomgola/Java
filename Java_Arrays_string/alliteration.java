/**
Alliteration

Tina and Louis played a game where one has to tell a letter and the other has to form a sentence with all the words 
starting with the same letter irrespective of cases. The sentence should contain minimum 3 words and maximum any 
number of words. For a minimum of three words a score of 2 is given. Each additional word gets a score of 2 .
Write a program to check the rules of the game and print the score as given in the sample input, output.

  Input 1:
    Enter the letter 
    S
    She sells seashells
  Output 1:
    Good,You get a score of 2


  Input 2:
    Enter the letter
    F
    Friendly fire fighting frogs fence for fabulous French food.
  Output 2:
    Good,You get a score of 14


  Input 3:
    Enter the letter
    H
    Hannah's home has heater
  Output 3:
    Good,You get a score of 4


  Input 4:
    Enter the letter
    j
    Jack and Jill
  Output 4:
    No score
 */
import java.util.*;
public class alliteration {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter the letter");
        char ch = SC.nextLine().charAt(0);
        String str = SC.nextLine();

        int result = checkScore(str.toLowerCase(),Character.toLowerCase(ch));
        if(result>1)
            System.out.println("Good,You get a score of "+result);
        else
            System.out.println("No score");
    }

    public static int checkScore(String str,char ch){
        String sArr[] = str.split(" ");
        int counter = -1;
        for(int i=0;i<sArr.length;i++){
            if(sArr[i].charAt(0) != (ch))
                return 0;
            if(counter < 2)
                counter++;
            else
                counter += 2;
        }

        return counter;
    }
}
