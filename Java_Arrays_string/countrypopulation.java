/**
Country wise population

Display the population of each country from the least to the highest.
[Input Format: First input refers to the no of countries, 
second one is an array to get the country names and 
the third one is an array to get the population of each country (the population is given in crores)]
[Assumption: no two countries will have same population]

  Input1:
    5
    india
    china
    japan
    australia
    america
    135
    133
    12
    2
    32

  Output1:
    australia
    japan
    america
    china
    india
    2
    12
    32
    133
    135
 */
import java.util.*;
public class countrypopulation {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        int len = SC.nextInt();
        SC.nextLine();

        String aStr[] = new String[len];
        for(int i=0;i<aStr.length;i++)
            aStr[i] = SC.nextLine();
            
        int aInt[] = new int[len];
        for(int i=0;i<aInt.length;i++)
            aInt[i] = SC.nextInt();

        int _aInt[] = Arrays.copyOf(aInt,len);
        Arrays.sort(_aInt);
        String _aStr[] = new String[len];

        for(int i=0,x=0;i<_aInt.length;i++){
            for(int j=0;j<aStr.length;j++){
                if(_aInt[i] == aInt[j])
                    _aStr[x++] = aStr[j];
            }
        }

        for(int i=0;i<_aStr.length;i++)
            System.out.println(_aStr[i]);
        for(int i=0;i<_aInt.length;i++)
            System.out.println(_aInt[i]);

    }
}
