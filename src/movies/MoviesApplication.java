package movies;

import util.Input;

import static movies.MoviesArray.findAll;

public class MoviesApplication {
    static Movie[] movies = findAll();

    public static void main(String[] args) {
        Input input = new Input();

        System.out.println(
                "What would you like to do?\n" +
                "\n" +
                "0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category");

        switch(input.getInt(0, 5)) {
            case 0:
                System.exit(0);
                break;
            case 1:
               System.out.println("view all movies");
               for (Movie movie : movies){
                   System.out.println(movie.getName() + " " + movie.getCategory());
               }
               break;
            case 2:
                movieCategory("animated");

                break;
            case 3:
                movieCategory("drama");
                break;
            case 4:
                movieCategory("horror");
                break;
            case 5:
                movieCategory("scifi");
                break;
        }

    }

    public static void movieCategory(String category){
        System.out.println("movies in " + category + " category!");
        for (Movie movie : movies){
            if(movie.getCategory().equalsIgnoreCase(category)){
                System.out.println(movie.getName() + " " + movie.getCategory());
            }
        }
    }

}
