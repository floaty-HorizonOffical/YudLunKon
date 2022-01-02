package engine.floatyHorizonProduction.yudlunkon;

// DO NOT DELETE THESE LIBRARIES! IT WILL BREAK THE ENGINE MAIN MENU!
import java.util.Scanner;
import YudLunKon.official.util.Print;
import engine.floatyHorizonProduction.yudlunkon.funFacts;

public class Main {
    public static void main(String[] args) throws Exception {
        boolean autoStart = false;
        boolean menuInUse = true;

        Scanner action = new Scanner(System.in);
        Print.printNewLn("Hello and welcome to YudLunKon! by floaty Horizon");
        // Uncomment if you made a modification
        //print.printNewLn("\tMod by: GITHUB-USERNAME/YOUTUBE-USERNAME\n\t\tMOD-KIND: MOD-NAME"); // Replace MOD-KIND with ex. Library, Addition, Custom Bug Fix or just Custom-build
        if (!autoStart) {
            while (menuInUse) {
                Print.printNewLn("What would you want to do?\n\t[1] Run\n\t[2] Help(W.I.P)\n\t[3] Cheat Sheet(W.I.P)\n\t[4] Fun Facts(W.I.P)\n\t[5] Exit");
                Print.printLn("Do Action> ");
                byte doAction = action.nextByte();
                if (doAction > 0 && doAction <= 5) {
                    switch (doAction) {
                        case 1 -> {
                            Print.printNewLn("Starting game..");
                            menuInUse = false;
                            MainGame.main();
                        }
                        case 2 -> Print.printNewLn("Whoops! This isn't finished yet! No help for you!");
                        case 3 -> Print.printNewLn("This isn't finished yet! No cheating for now ;)");
                        case 4 -> funFacts.fact();
                        case 5 -> {
                            Print.printNewLn("Exiting engine...");
                            menuInUse = false;
                        }
                    }
                } else
                    Print.printNewLn("That's not an option!");
            }
        } else MainGame.main();
    }
}

class MainGame {
    static void main() throws Exception{
        // Put your game code here!
    }
}


