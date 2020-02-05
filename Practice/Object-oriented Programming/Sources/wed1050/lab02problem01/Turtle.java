public class Turtle {
    // Turtle's State

    private int x = 0;
    private int y = 0;
    private int dx = 1;
    private int dy = 0;
    private boolean isPenDown = false;
    private Field field;

    // Turtle's Behavior

    Turtle(Field field) {
        this.field = field;
    }

    int getX() {
        return x;
    }

    int getY() {
        return y;
    }

    void putPenUp() {
        isPenDown = false;
    }

    void putPenDown() {
        isPenDown = true;
    }

    void turnRight() {
        int temp = dx;
        dx = -dy;
        dy = temp;
    }

    void turnLeft() {
        int temp = dx;
        dx = dy;
        dy = -temp;
    }

    void move(int steps) {
        for (int i = 0; i < steps; i++) {
            int nextX = x + dx;
            int nextY = y + dy;

            if (!field.areCoordinatesInside(nextX, nextY)) {
                break;
            }

            if (isPenDown) {
                field.markCell(x, y);
            }

            x = nextX;
            y = nextY;
        }
    }
}

