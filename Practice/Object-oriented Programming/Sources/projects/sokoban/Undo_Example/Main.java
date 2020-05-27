import java.awt.*;
import java.util.Stack;

class Player {
    private int x, y;
    private final Stack<Point> moveHistory;

    public Player(int x, int y) {
        this.x = x;
        this.y = y;

        moveHistory = new Stack<>();
    }

    public void move(int dx, int dy) {
        moveHistory.push(new Point(this.x, this.y));
        if (moveHistory.size() > 3) {
            moveHistory.remove(0);
        }

        this.x += dx;
        this.y += dy;
    }

    public boolean canUndoMove() {
        return !moveHistory.empty();
    }

    public void undoMove() {
        if (!moveHistory.empty()) {
            Point point = moveHistory.pop();

            this.x = point.x;
            this.y = point.y;
        }
    }

    @Override
    public String toString() {
        return "Player{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        Player player = new Player(0, 0);

        System.out.println("Moving:");

        System.out.println(player);
        player.move(0, 1);
        System.out.println(player);
        player.move(0, 1);
        System.out.println(player);
        player.move(1, 0);
        System.out.println(player);
        player.move(1, 0);
        System.out.println(player);
        player.move(0, 1);
        System.out.println(player);

        System.out.println("Undoing moves:");

        while (player.canUndoMove()) {
            player.undoMove();
            System.out.println(player);
        }
    }
}
