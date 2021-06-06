package Java_classesAndObject;
/*
Movie Ticket Calculation

Create a class Movie with the following private member variables.
String movieName
String movieCategory
int ticketCost
Include appropriate getters and setters method in Movie class.
Write the following method in the Movie class:
public int calculateTicketCost(String circle)--This method should take circle as argument. 
Return 0 when any one of the following condition met :

If circle is gold and movie category is 2D set ticket cost Rs.300
If circle is gold and movie category is 3D set ticket cost Rs.500
If circle is silver and movie category is 2D set ticket cost Rs.250
If circle is silver and movie category is 3D set ticket cost Rs.450
Return -1 if category is invalid.  Return -2 if circle is invalid and -3 if both are invalid.

Create a Main class to get the input and to display the output
Get the input for Movie using the method - public static Movie getMovieDetails(). 
Invoke this method from the main method and store the Movie object.

Get the input for circle using the method - public static String getCircle().  
Invoke this method from the main method and store the circle value.

Next, invoke the calculateTicketCost method in Movie by passing this circle and calculate the ticket cost and 
set to the ticketCost attribute and print the output.

If the return from calculateTicketCost is zero, the output should be be  "The ticket cost is=<ticket cost>".
If it returns -1, the output should be "Sorry there is no <category> type of category in theater."
If the return is -2, the output should be "Sorry!!! Circle is Invalid."
If the return is -3, the output should be "Sorry!!! Both circle and category are Invalid."

  Input 1:
    Enter the movie name:
    VIP
    Enter the movie category:
    2D
    Enter the circle:
    gold

  Output 1:
    Movie name = VIP
    Movie category = 2D
    The ticket cost is = 300

  Input 2:
    Enter the movie name:
    Titanic
    Enter the movie category:
    5D
    Enter the circle:
    GOLD

  Output 2:
    Movie name = Titanic
    Movie category = 5D
    Sorry there is no 5D type of category in theater.

  Input 3:
    Enter the movie name:
    Black Panther
    Enter the movie category:
    2d
    Enter the circle:
    SILVER

  Output 3:
    Movie name = Black Panther
    Movie category = 2d
    The ticket cost is = 250 

  Input 4:
    Enter the movie name:
    Black Panther
    Enter the movie category:
    2d
    Enter the circle:
    good

  Output 4:
    Movie name = Black Panther
    Movie category = 2d
    Sorry!!! Circle is Invalid.

  Input 5:
    Enter the movie name:
    Black Panther
    Enter the movie category:
    7V
    Enter the circle:
    good

  Output 5:
    Movie name = Black Panther
    Movie category = 7V
    Sorry!!! Both circle and category are Invalid.
*/
import java.util.Scanner;
public class Movieticket {
    public static void main(String[] args) {
        Movie _movie = getMovieDetails();
        String circle = getCircle();
        int result = _movie.calculateTicketCost(circle);

        System.out.println("Movie name = "+ _movie.getMovieName());
        System.out.println("Movie category = "+ _movie.getMovieCategory());
        if(result == 0)
            System.out.println("The ticket cost is = "+ _movie.getTicketCost());
        if(result == -1)
            System.out.println("Sorry there is no "+ _movie.getMovieCategory() +" type of category in theater.");
        if(result == -2)
            System.out.println("Sorry!!! Circle is Invalid.");
        if(result == -3)
            System.out.println("Sorry!!! Both circle and category are Invalid.");
    }
    public static Movie getMovieDetails(){
        Scanner SC = new Scanner(System.in);
        Movie _movie = new Movie();
        System.out.println("Enter the movie name:");
        _movie.setMovieName(SC.nextLine());
        System.out.println("Enter the movie category:");
        _movie.setMovieCategory(SC.nextLine());
        return _movie;
    }
    public static String getCircle(){
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter the circle:");
        return SC.nextLine();
    }
}
