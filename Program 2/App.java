public class App {
    public static void main(String[] args) {
        
        // define constants
        String favoriteSoda = "Dr. Dolittle";
        char bestRating = 'A';

       // define variables

       String favoriteSnack;
       char rating;
       int numberOfPeople;
       int topChoiceTotal;

       // Assign the value of "crackers" to favoriteSnack
       favoriteSnack = "crackers";

       // Assign a grade of 'B' to rating
       rating = 'B';

       // Assign the number 250 to the numberOfPeople
       numberOfPeople = 250;

       // Assign the number 148 to the topChoiceTotal
       topChoiceTotal = 148;

       // display results
       System.out.println("The preferred soda is " + favoriteSoda);
       System.out.println("The preferred snack is " + favoriteSnack);
       System.out.println("Out of " + numberOfPeople + " people " + topChoiceTotal + " chose these items!");
       System.out.println("Each of these products were given a rating of " + bestRating + " from our expert tasters");
       System.out.println("The other products were rated not higher than a " + rating);

    }
}
