package Java_classesAndObject;

public class Movie {
    private String movieName;
    private String movieCategory;
    private int ticketCost;

    // getter
    public String getMovieName(){
        return movieName;
    }
    public String getMovieCategory(){
        return movieCategory;
    }
    public int getTicketCost(){
        return ticketCost;
    }

    // setter
    public void setMovieName(String _movieName){
        this.movieName = _movieName;
    }
    public void setMovieCategory(String _movieCategory){
        this.movieCategory = _movieCategory;
    }
    public void setTicketCost(int _ticketCost){
        this.ticketCost = _ticketCost;
    }

    // functionality method
    public int calculateTicketCost(String circle){
        if(circle.equalsIgnoreCase("gold")){
            if(movieCategory.equalsIgnoreCase("2D")){
                ticketCost = 300;
                return 0;
            }
            if(movieCategory.equalsIgnoreCase("3D")){
                ticketCost = 500;
                return 0;
            }
            return -1;
        }
        if(circle.equalsIgnoreCase("silver")){
            if(movieCategory.equalsIgnoreCase("2D")){
                ticketCost = 250;
                return 0;
            }
            if(movieCategory.equalsIgnoreCase("3D")){
                ticketCost = 450;
                return 0;
            }
            return -1;
        }
        if(movieCategory.equalsIgnoreCase("2D") || movieCategory.equalsIgnoreCase("3D"))
            return -2;
        
        // default return
        return -3;
    }
}
