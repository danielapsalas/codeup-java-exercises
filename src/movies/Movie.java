package movies;

public class Movie {
    //    Create a class named Movie. It should have private fields for name and category, and a
//    constructor that sets both of these. Create methods to access these properties and change
//    them (getters and setters).

    private String name;
    private String category;

    public Movie(String MovieName, String MovieCategory){
        this.name = MovieName;
        this.category = MovieCategory;
    }

    public String getName(){
        return this.name;
    }

    public String getCategory(){
        return this.category;
    }

    public void setName(String MovieName){
        this.name = MovieName;
    }

    public void setCategory(String MovieCategory){
        this.category = MovieCategory;
    }
}
