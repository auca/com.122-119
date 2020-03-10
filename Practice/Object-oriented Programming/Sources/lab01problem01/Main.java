import java.util.Scanner;

public class Main {
    /*
     * Field
     */

    // Field's Data

    static final int FIELD_WIDTH  = 12;
    static final int FIELD_HEIGHT = 12;

    static final char EMPTY_CELL  = '.';
    static final char MARKED_CELL = '*';
    static final char TURTLE_CELL = 'T';

    static char[][] field;

    // Field's Services

    static void fieldConstruct() {
        field = new char[FIELD_HEIGHT][FIELD_WIDTH];
        for (int y = 0; y < FIELD_HEIGHT; y++) {
            for (int x = 0; x < FIELD_WIDTH; x++) {
                field[y][x] = EMPTY_CELL;
            }
        }
    }

    static boolean areCoordinatesInsideField(int x, int y) {
        return x >= 0 && x < FIELD_WIDTH &&
               y >= 0 && y < FIELD_HEIGHT;
    }

    static void fieldDisplay() {
        for (int y = 0; y < FIELD_HEIGHT; y++) {
            for (int x = 0; x < FIELD_WIDTH; x++) {
                System.out.print(x == turtleX && y == turtleY ? TURTLE_CELL : field[y][x]);
            }
            System.out.println();
        }
        System.out.println();
    }

    /*
     * Turtle
     */

    // Turtle's Data

    static int turtleX = 0;
    static int turtleY = 0;
    static int turtleDX = 1;
    static int turtleDY = 0;
    static boolean isTurtlePenDown = false;

    // Turtle's Services

    static void turtlePutPenUp() {
        isTurtlePenDown = false;
    }

    static void turtlePutPenDown() {
        isTurtlePenDown = true;
    }

    static void turtleTurnRight() {
        int temp = turtleDX;
        turtleDX = -turtleDY;
        turtleDY = temp;
    }

    static void turtleTurnLeft() {
        int temp = turtleDX;
        turtleDX = turtleDY;
        turtleDY = -temp;
    }

    static void turtleMove(int steps) {
        for (int i = 0; i < steps; i++) {
            int nextX = turtleX + turtleDX;
            int nextY = turtleY + turtleDY;

            if (!areCoordinatesInsideField(nextX, nextY)) {
                break;
            }

            if (isTurtlePenDown) {
                field[turtleY][turtleX] = MARKED_CELL;
            }

            turtleX = nextX;
            turtleY = nextY;
        }
    }

    /*
     * Entry Point
     */
    public static void main(String[] args) {
        fieldConstruct();

        Scanner scanner = new Scanner(System.in);
        String input;
        while (!(input = scanner.nextLine().toLowerCase().trim()).equals("exit")) {
            String[] parts = input.split(" ");
            // TODO: check for input errors
            switch (parts[0]) {
                case "penup":
                    turtlePutPenUp();
                    break;
                case "pendown":
                    turtlePutPenDown();
                    break;
                case "turnright":
                    turtleTurnRight();
                    break;
                case "turnleft":
                    turtleTurnLeft();
                    break;
                case "move":
                    // TODO: check that we have enough parts
                    int steps = Integer.parseInt(parts[1]);
                    turtleMove(steps);
                    break;
                case "display":
                    fieldDisplay();
                    break;
                default:
                    System.err.println("Invalid command. Try again.");
                    break;
            }
        }
    }
}

