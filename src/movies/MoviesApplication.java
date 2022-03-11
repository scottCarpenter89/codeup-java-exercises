package movies;


import util.Input;

public class MoviesApplication {
    private static final Input userInput = new Input();
    private static Movie[] movies = MoviesArray.findAll();
    private static boolean userContinues = true;

    private static int movieMenu() {
        System.out.println("What would you like to do?\n" +
                "\n" +
                "0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category\n" +
                "6 - add a new movie\n");
        return userInput.getInt(0, 6, "How would you like to proceed?");
    }

    private static void printMovies(int userSelection) {
        for(Movie movie: movies) {
            if (movie.getCategories().equals(userSelection)) {
                System.out.printf("%s -- %s", movie.getName(), movie.getCategories());
            }
        }
    }

    private static void getMovieList(int userSelection) {

        switch (userSelection) {
            case 1:
               userSelection = 1;
               printMovies(userSelection);
               break;
            case 2:
                userSelection = 2;
                printMovies(userSelection);
                break;
            case 3:
                userSelection = 3;
                printMovies(userSelection);
                break;
            case 4:
                userSelection = 4;
                printMovies(userSelection);
                break;
            case 5:
                userSelection = 5;
                printMovies(userSelection);
                break;
//            case 6:
//                userSelection = 6;
////                addMovie(userSelection);
//                break;
            default:
                printMovies(userSelection);
                break;
        }
    }

    public static void main(String[] args) {
       int userChoice =  movieMenu();
       getMovieList(userChoice);

    }
}
