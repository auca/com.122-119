public class Field {
    // Field's Data and State

    private static final int FIELD_WIDTH  = 12;
    private static final int FIELD_HEIGHT = 12;

    private static final char EMPTY_CELL  = '.';
    private static final char MARKED_CELL = '*';
    private static final char TURTLE_CELL = 'T';

    private char[][] field;

    // Field's Behavior

    Field() {
        field = new char[FIELD_HEIGHT][FIELD_WIDTH];
        for (int y = 0; y < FIELD_HEIGHT; y++) {
            for (int x = 0; x < FIELD_WIDTH; x++) {
                field[y][x] = EMPTY_CELL;
            }
        }
    }

    boolean areCoordinatesInside(int x, int y) {
        return x >= 0 && x < FIELD_WIDTH && y >= 0 && y < FIELD_HEIGHT;
    }

    void markCell(int x, int y) {
        field[y][x] = MARKED_CELL;
    }

    void display(Turtle turtle) {
        for (int y = 0; y < FIELD_HEIGHT; y++) {
            for (int x = 0; x < FIELD_WIDTH; x++) {
                System.out.print(x == turtle.getX() && y == turtle.getY() ? TURTLE_CELL : field[y][x]);
            }
            System.out.println();
        }
        System.out.println();
    }
}

