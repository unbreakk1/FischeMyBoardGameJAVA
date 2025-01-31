package BoardGame;

public class Map {
    private final char[][] maze =
    {
            {'S', '.', '.', '#', '.'},
            {'#', '#', '.', '#', '#'},
            {'.', '.', '.', '.', '.'},
            {'.', '#', '#', '#', '.'},
            {'.', '.', 'G', '#', '#'}
    };

    public void printMap(Player player)
    {
        for (int i = 0; i < maze.length; i++)
        {
            for (int j = 0; j < maze[i].length; j++)
            {
                if (i == player.getX() && j == player.getY())
                {
                    System.out.print("P ");
                } else
                {
                    System.out.print(maze[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public boolean isMoveValid(int x, int y)
    {

        if (x < 0 || y < 0 || x >= maze.length || y >= maze[0].length)
        {
            return false;
        }

        return maze[x][y] != '#';
    }

    public boolean reachedGoal(int x, int y)
    {
        return maze[x][y] == 'G';
    }
}