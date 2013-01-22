package project1;

//import java.awt.Event;
import java.util.Scanner;

class CLI {

    private Scanner scanner;
    private State state;

    public CLI() {
        scanner = new Scanner(System.in);
        state = new State();
    }

    public void start() {
        System.out.println("Type and enter \"n\" for a new game, \"l\" to load a game or \"q\" to quit.");
        // Event.KEY_PRESS
        boolean game = false;
        while (!game) {
            System.out.print("> ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("l")) {
                state.gameContinue();
                game = true;
            } else if (input.equalsIgnoreCase("n")) {
                state.gameStart();
                game = true;
            } else {
                System.out.println("Invalid command.");
            }
        }
        while (game) {
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("Type w, a, s or d and press enter to move");
            state.update();
            System.out.println("");
            System.out.print("> ");
            String command = scanner.nextLine();
            state.playerMove(command);
        }
    }
}
