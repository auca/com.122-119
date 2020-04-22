public class BoardConsoleView extends BoardView {

    public static final String EMPTY_CELL = "-";

    BoardConsoleView(Board board) {
        super(board);
    }

    void present() {
        int columnSize = String.valueOf(board.getMaximumNumber()).length() + 1;
        String format = "%" + columnSize + "s";

        for (int y = 0; y < board.getHeight(); ++y) {
            for (int x = 0; x < board.getWidth(); ++x) {
                int number = board.getNumber(x, y);
                System.out.printf(format, number == 0 ? EMPTY_CELL : String.valueOf(number));
            }
            System.out.println();
        }
    }

}
