import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

//.isUnsolved - helper (boolean)
//.show - accessor
//.makeGuess -
//.getWord
public class Puzzle {

    //fields
    private ArrayList<String> words ;
    //private ArrayList<String> guess = new ArrayList<String>();
    private ArrayList<String> guess = new ArrayList<String>();
    private String theWord;
    private ArrayList<String> space = new ArrayList<String>();
    private String z = "";



    public Puzzle() {
        words = new ArrayList<String>();

        try {
            File file = new File("words.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()) {
                String tempWord = scanner.next().toUpperCase();
                words.add(tempWord);
            }
            scanner.close();

            //ONCE THIS LINE OF CODE IS REACHED, YOUR words ArrayList
            //CONTAINS ALL THE WORDS IN words.txt
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        int x = (int)(words.size() * Math.random()) + 1;
        this.theWord = words.get(x);
        for (int i = 0; i < theWord.length(); i++){
            space.add("_");
        }

    }

    public boolean isUnsolved(){
        if (space.toString().replace("[","").replace("]","").replace(",","").replace(" ","").equals(theWord)){
            return false;
        }else return true;
    }

    public void show(){
        //this.z = space.toString().replace("[","").replace("]","").replace(",","");
        System.out.println("Puzzle: " + space.toString().replace("[","").replace("]","").replace(",",""));
        System.out.print("\nGuesses: ");
            System.out.print(guess.toString().replace("[","").replace("]",""));
        }


    public boolean makeGuess(String guess){
        guess = guess.toUpperCase();

        this.guess.add(guess.toUpperCase());

        for (int i = 0; i < theWord.length(); i ++){
            if (guess.equals(theWord.substring(i,i+1))){
                space.set(i,guess);

            }
        }

        if (theWord.contains(guess)){
            return true;
        }else return false;
    }
    public String getWord(){
        return this.theWord;
    }



}

