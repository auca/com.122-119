import java.awt.*;
import java.util.ArrayList;

public class Board {
    public static final int BOARD_SIZE = 4;
    public static final int MIN_NUMBER = 2;
    private final int[][] data;
    private int maximumNumber;

    Board() {
        data = new int[BOARD_SIZE][BOARD_SIZE];
        maximumNumber = 2;

        placeRandomNumbers(2);
    }

    int getWidth() {
        return data[0].length;
    }

    int getHeight() {
        return data.length;
    }

    int getNumber(int x, int y) {
        return data[y][x];
    }

    int getMaximumNumber() {
        return maximumNumber;
    }

    void shiftLeft() {
        for (int y = 0; y < getHeight(); ++y) {
            mergeRow(y, -1);
            shiftRow(y, -1);
        }

        placeRandomNumbers(1);
    }

    void shiftRight() {
        for (int y = 0; y < getHeight(); ++y) {
            mergeRow(y, 1);
            shiftRow(y, 1);
        }

        placeRandomNumbers(1);
    }

    void shiftUp() {
        for (int x = 0; x < getWidth(); ++x) {
            mergeColumn(x, -1);
            shiftColumn(x, -1);
        }

        placeRandomNumbers(1);
    }

    void shiftDown() {
        for (int x = 0; x < getWidth(); ++x) {
            mergeColumn(x, 1);
            shiftColumn(x, 1);
        }

        placeRandomNumbers(1);
    }

    private void placeRandomNumbers(int numbersToPlace) {
        ArrayList<Point> unoccupiedCoordinates = new ArrayList<>();
        for (int y = 0; y < getHeight(); ++y) {
            for (int x = 0; x < getWidth(); ++x) {
                if (data[y][x] == 0) {
                    unoccupiedCoordinates.add(new Point(x, y));
                }
            }
        }

        for (int i = 0; i < numbersToPlace && unoccupiedCoordinates.size() > 0; ++i) {
            int randomIndex = (int) (Math.random() * unoccupiedCoordinates.size());
            Point point = unoccupiedCoordinates.get(randomIndex);
            unoccupiedCoordinates.remove(randomIndex);
            data[point.y][point.x] = MIN_NUMBER;
        }
    }


    private void mergeRow(int y, int dx) {
        if (dx < 0) {
            int lastColumn = -1;
            for (int x = 0; x < getWidth(); ++x) {
                lastColumn = processColumn(lastColumn, x, y);
            }
        } else {
            int lastColumn = -1;
            for (int x = getWidth() - 1; x >= 0; --x) {
                lastColumn = processColumn(lastColumn, x, y);
            }
        }
    }

    private int processColumn(int lastColumn, int x, int y) {
        if (data[y][x] != 0) {
            if (lastColumn == -1 || data[y][lastColumn] != data[y][x]) {
                lastColumn = x;
            } else {
                data[y][lastColumn] += data[y][x];
                if (data[y][lastColumn] > maximumNumber) {
                    maximumNumber = data[y][lastColumn];
                }
                data[y][x] = 0;
                lastColumn = -1;
            }
        }

        return lastColumn;
    }

    private void mergeColumn(int x, int dy) {
        if (dy < 0) {
            int lastRow = -1;
            for (int y = 0; y < getHeight(); ++y) {
                lastRow = processRow(lastRow, x, y);
            }
        } else {
            int lastRow = -1;
            for (int y = getHeight() - 1; y >= 0; --y) {
                lastRow = processRow(lastRow, x, y);
            }
        }
    }

    private int processRow(int lastRow, int x, int y) {
        if (data[y][x] != 0) {
            if (lastRow == -1 || data[lastRow][x] != data[y][x]) {
                lastRow = y;
            } else {
                data[lastRow][x] += data[y][x];
                if (data[lastRow][x] > maximumNumber) {
                    maximumNumber = data[lastRow][x];
                }
                data[y][x] = 0;
                lastRow = -1;
            }
        }

        return lastRow;
    }

    private void shiftRow(int y, int dx) {
        if (dx < 0) {
            for (int x = 0; x < getWidth(); ++x) {
                shiftNumbers(x, y, -1, 0);
            }
        } else {
            for (int x = getWidth() - 1; x >= 0; --x) {
                shiftNumbers(x, y, 1, 0);
            }
        }
    }

    private void shiftColumn(int x, int dy) {
        if (dy < 0) {
            for (int y = 0; y < getHeight(); ++y) {
                shiftNumbers(x, y, 0, -1);
            }
        } else {
            for (int y = getHeight() - 1; y >= 0; --y) {
                shiftNumbers(x, y, 0, 1);
            }
        }
    }

    private boolean areCoordsInside(int x, int y) {
        return x >= 0 && x < getWidth() &&
               y >= 0 && y < getHeight();
    }

    private void shiftNumbers(int x, int y, int dx, int dy) {
        if (data[y][x] == 0) { return; }

        int nextX = x + dx;
        int nextY = y + dy;
        while (areCoordsInside(nextX, nextY) && data[nextY][nextX] == 0) {
            data[nextY][nextX] = data[y][x];
            data[y][x] = 0;
            x = nextX;
            y = nextY;
            nextX = x + dx;
            nextY = y + dy;
        }
    }
}
