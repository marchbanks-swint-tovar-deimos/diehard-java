package laurenWeek1;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static final String rock = "rock";
    public static final String paper = "paper";
    public static final String scissors = "scissors";

    //get user's move
    public static String getUsersMove(){
        Scanner scanner = new Scanner(System.in);
        String userInput =  scanner.nextLine();
        return userInput;
    }

    //get computers move
    public static String getComputersMove (){
        int computerNum;
        String computerMove = " ";
        Random random = new Random();
        computerNum = random.nextInt(3)+1;

        if(computerNum == 1){
            computerMove = rock;
        }
        else if (computerNum == 2){
            computerMove = paper;
        }
        else if(computerNum == 3){
            computerMove = scissors;
        }
        return computerMove;
    }

    //get the results
    public static void getResults(String usersMove, String computersMove){
        System.out.println("The computer played " + computersMove + "\n");

        if(usersMove.equalsIgnoreCase(computersMove)){

            System.out.println("----------------Results--------------");
            System.out.println("It's a tie!");
        }
              //===check if the user inputs rock====//
        else if(usersMove.equalsIgnoreCase("rock")){
            if (computersMove.equalsIgnoreCase("paper")){

                System.out.println("----------------Results--------------");
                System.out.println("You lose! Sorry, paper covers rock!");
            }
            else if (computersMove.equalsIgnoreCase("scissors")){

                System.out.println("----------------Results--------------");
                System.out.println("Yay you win! Rock crushes scissors!");
            }
        }
                //===check if user inputs paper===//
        else if (usersMove.equalsIgnoreCase("paper")){
            if (computersMove.equalsIgnoreCase("scissors")){

                System.out.println("----------------Results--------------");
                System.out.println("You lose! Sorry, scissors cuts paper!");
            }
            else if (computersMove.equalsIgnoreCase("rock")){
                System.out.println("Yay you win! Paper covers rock!");
            }
        }
                //===check if user inputs scissors===//
        else if (usersMove.equalsIgnoreCase("scissors")){
            if(computersMove.equalsIgnoreCase("rock")){

                System.out.println("----------------Results--------------");
                System.out.println("You lose! Sorry, rock crushes scissors!");
            }
            else if (computersMove.equalsIgnoreCase("paper")){

                System.out.println("----------------Results--------------");
                System.out.println("Yay you win! Scissors cuts paper!");
            }
        }
        else {
            System.out.println("Invalid user input...Try again...");
        }
    }
    public static void main(String[] args) {
        System.out.println("Please enter your choice (Rock, Paper, Scissors):");


        String userInput = getUsersMove();

        if(userInput.equalsIgnoreCase(rock) || userInput.equalsIgnoreCase(paper)|| userInput.equalsIgnoreCase(scissors)){
            getResults(userInput, getComputersMove());
        }
        else {
            System.out.println("Invalid input... You put in " + userInput);
        }
    }
}
