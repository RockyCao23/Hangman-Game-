public class HangingMan {

    private int numWrongGuesses;
    private String hangMan;
    String[] HangmanImage = {
            "+----+\n"+
            "|\n"+
            "|\n"+
            "|\n"+
            "/\\\n",

            "+----+\n"+
                    "|    O\n"+
                    "|\n"+
                    "|\n"+
                    "/\\\n",

            "+----+\n"+
                    "|    O\n"+
                    "|    +\n"+
                    "|\n"+
                    "/\\\n",

            "+----+\n"+
                    "|    O\n"+
                    "|    +-\n"+
                    "|\n"+
                    "/\\\n",


            "+----+\n"+
                    "|    O\n"+
                    "|   -+-\n"+
                    "|\n"+
                    "/\\\n",


            "+----+\n"+
                    "|    O\n"+
                    "|   -+-\n"+
                    "|   / \n"+
                    "/\\\n",


            "+----+\n"+
                    "|    O\n"+
                    "|   -+-\n"+
                    "|   / \\\n"+
                    "/\\\n",
    };



    //constructor

    public HangingMan(){

        numWrongGuesses = 0;

    }

    public void show(){

        this.hangMan = HangmanImage[numWrongGuesses];
        System.out.println(this.hangMan);

    }

    public void dieSomeMore(){
        numWrongGuesses ++;
    }


    public boolean isntDead(){
        if (numWrongGuesses != 6){
            return true;
        }else return false;
    }

}
