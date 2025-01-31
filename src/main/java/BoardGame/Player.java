package BoardGame;

public class Player
{
    private int x;
    private int y;

    public Player(int startX, int startY)
    {
        this.x = startX;
        this.y = startY;
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    public void moveUp(Map map)
    {
        if (map.isMoveValid(x - 1, y))
        {
            x -= 1;
        } else {
            System.out.println("Move blocked by a wall.");
        }
    }

    public void moveDown(Map map)
    {
        if (map.isMoveValid(x + 1, y))
        {
            x += 1;
        } else {
            System.out.println("Move blocked by a wall.");
        }
    }

    public void moveLeft(Map map)
    {
        if (map.isMoveValid(x, y - 1))
        {
            y -= 1;
        } else {
            System.out.println("Move blocked by a wall.");
        }
    }

    public void moveRight(Map map)
    {
        if (map.isMoveValid(x, y + 1))
        {
            y += 1;
        } else {
            System.out.println("Move blocked by a wall.");
        }
    }
}