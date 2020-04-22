import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Board board = new Board();
        BoardView boardView = new BoardConsoleView(board);

        while (scanner.hasNextLine()) {
            String command = scanner.nextLine().toLowerCase();
            switch (command) {
                case "up": board.shiftUp(); break;
                case "down": board.shiftDown(); break;
                case "left": board.shiftLeft(); break;
                case "right": board.shiftRight(); break;
                case "present": break;
                default: continue;
            }
            boardView.present();
        }
    }
}
