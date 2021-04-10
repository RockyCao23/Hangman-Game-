import java.util.*;

public class HangmanGame {
        public static void main (String[] args) {
            Scanner scanner = new Scanner(System.in);
            HangingMan hangingMan = new HangingMan();
            Puzzle puzzle = new Puzzle();

            while (puzzle.isUnsolved() && hangingMan.isntDead()) { //isUnsolved? isntDead??
                hangingMan.show();                      //show the hanging man
                puzzle.show();                          //show the word?
                System.out.print("\nMake a guess: ");
                String guess = scanner.nextLine();
                if (!puzzle.makeGuess(guess)) {         //makeGuess - takes in guess (scan)?
                    hangingMan.dieSomeMore();
                }
                clearScreen();
            }

            if (hangingMan.isntDead()) {                            //isnt dead?
                System.out.println("You win! The word was " + puzzle.getWord());
            } else {
                System.out.println("You lose! The word was " + puzzle.getWord()); //getWord shoes word
            }
        }

        public static void clearScreen() {
            System.out.println("\f");
        }
}
