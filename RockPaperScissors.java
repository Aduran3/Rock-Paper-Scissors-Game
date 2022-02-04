// Rock paper scissors game

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static int getRandom(int uMove, int cMove) {
        if (uMove == cMove)
            return 2;
        else if (uMove == 1)
        {
            if (cMove == 3)
                return 1;
            else if (cMove == 2)
                return 0;
        }
        else if (uMove == 2)
        {
            if (cMove==1)
                return 1;
            else if (cMove == 3)
                return 0;
        }
        else if (uMove == 3)
        {
            if (cMove == 2)
                return 1;
            else if (cMove == 1)
                return 0;
        }
        return 5;
    }
    public static int getCompMove(){
        int compNum;
        Random random = new Random();
        compNum = random.nextInt(3)+1;
        return compNum;
    }
    public static int getUserMove(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 for rock, 2 for paper ,3 for scissors.");
        int i = scanner.nextInt();
        return i;
    }

    public static void main(String[] args) {
        System.out.println("Enter 1 for Computer vs Computer or enter 2 for User vs Computer.");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        int count = 0, usersWin=0, compWin=0;
        if(choice == 1){
            while(count < 5) {
                count++;
                System.out.println("Round number " +count);
                int computersFirst = getCompMove();
                int compMove = getCompMove();
                if(computersFirst == 1)
                    System.out.print("Computer 1: Rock " );
                else if(computersFirst == 2)
                    System.out.print("Computer 1: Paper " );
                else
                    System.out.print("Computer 1: Scissors ");
                if(compMove == 1)
                    System.out.print("Computer 2: Rock" );
                else if(compMove == 2)
                    System.out.print("Computer 2: Paper" );
                else
                    System.out.print("Computer 2: Scissors");
                System.out.println();
                int win = getRandom(computersFirst, compMove);
                if(win == 1){
                    System.out.println("Computer 1 wins this round");
                    usersWin++;
                }
                else if (win == 0){
                    System.out.println("Computer 2 wins this round");
                    compWin++;
                }
                else if(win == 2){
                    System.out.println("It is a draw");
                }
                System.out.println("Total Score: Computer 1 won "+usersWin+" rounds while Computer 2 won "+compWin+" rounds");
                System.out.println();
            }
        }

        if(choice == 2) {
            while(count<5) {
                count++;
                System.out.println("Round number "+count);
                int uInput = getUserMove();
                int compMove = getCompMove();
                if(uInput == 1)
                    System.out.print("User: Rock " );
                else if(uInput == 2)
                    System.out.print("User: Paper " );
                else
                    System.out.print("User: Scissors ");
                if(compMove == 1)
                    System.out.print("User: Rock" );
                else if(compMove == 2)
                    System.out.print("User: Paper" );
                else
                    System.out.print("User: Scissors");
                System.out.println();
                int win = getRandom(uInput, compMove);
                if(win == 1){
                    System.out.println("The user won this round");
                    usersWin++;
                }
                else if (win == 0){
                    System.out.println("The computer won this round");
                    compWin++;
                }
                else if(win == 2){
                    System.out.println("It is a draw");
                }
                System.out.println("Total Score: User "+usersWin+" Computer win "+compWin);
                System.out.println();
            }
        }
    }
}