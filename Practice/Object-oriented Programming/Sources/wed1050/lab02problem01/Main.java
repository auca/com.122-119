import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Field field = new Field();
        Turtle turtle = new Turtle(field);

        Scanner scanner = new Scanner(System.in);
        String input;
        while (!(input = scanner.nextLine().toLowerCase().trim()).equals("exit")) {
            try {
                String[] parts = input.split(" ");
                if (parts.length == 1 && parts[0].trim().equals("")) {
                    throw new Exception("Please, provide the command.");
                }
                if (!parts[0].equals("move") && parts.length != 1) {
                    throw new Exception("Invalid number of arguments. Try again");
                }

                switch (parts[0]) {
                    case "penup":
                        turtle.putPenUp();
                        break;
                    case "pendown":
                        turtle.putPenDown();
                        break;
                    case "turnright":
                        turtle.turnRight();
                        break;
                    case "turnleft":
                        turtle.turnLeft();
                        break;
                    case "move":
                        if (parts.length != 2) {
                            throw new Exception("Invalid number of arguments. Try again");
                        }

                        int steps;
                        try {
                            steps = Integer.parseInt(parts[1]);
                        } catch (NumberFormatException e) {
                            throw new Exception("The number of steps is not a valid number.");
                        }
                        if (steps <= 0) {
                            throw new Exception("The number of steps must be a positive number.");
                        }
                        turtle.move(steps);
                        break;
                    case "display":
                        field.display(turtle);
                        break;
                    default:
                        throw new Exception("Invalid command. Try again.");
                }
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
    }
}

