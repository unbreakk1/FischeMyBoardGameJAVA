
package BoardGame;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Map map = new Map();
        Player player = new Player(0, 0); // Starting position at (0, 0)

        Scanner scanner = new Scanner(System.in);

        boolean running = true;

        System.out.println("Welcome to the Maze Runner!");
        map.printMap(player);

        while (running)
        {
            System.out.println("Enter a move (W/A/S/D): ");
            String move = scanner.nextLine().toUpperCase();

            switch (move)
            {
                case "W" -> player.moveUp(map);
                case "A" -> player.moveLeft(map);
                case "S" -> player.moveDown(map);
                case "D" -> player.moveRight(map);
                default -> System.out.println("Invalid move! Use W/A/S/D.");
            }

            map.printMap(player);

            if (map.reachedGoal(player.getX(), player.getY()))
            {
                System.out.println("Congratulations! You've reached the goal!");
                running = false;
            }
        }

        System.out.println("Game Over. Thanks for playing!");
        scanner.close();
    }
}