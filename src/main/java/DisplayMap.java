public class DisplayMap extends BattleMap<String>
{
    public DisplayMap(int boardSize)
    {
        super(boardSize);
    }

    /*
    public void display()
    {
        for (int x = 0; x < map[1].length; x++)
        {
            for (int y = 0; y < map[0].length; y++)
            {
                switch (map[x][y])
                {
                    case "w":
                        break;

                    case "h":
                        break;

                    case "*":
                        break;

                    default:
                        break;
                }
            }
        }
    }
    */

    @Override
    public void updateMap(Coordinate coordinate, BattleMap bMap)
    {
        int target = (int)bMap.getValueByCoordinate(coordinate);

        switch (target)
        {
            case 0:
                this.map[coordinate.x+1][coordinate.y+1] = "w";
                break;

            case 1:
                this.map[coordinate.x+1][coordinate.y+1] = "h";
                break;

            default:
                System.out.println("Not a valid coordinate!");
                break;
        }
    }

    @Override
    protected String[][] initMap(int boardSize)
    {
        String[][] map = new String[boardSize+1][boardSize+1];

        for (int y = 0; y < map[1].length; y++)
        {
            for (int x = 0; x < map[0].length; x++)
            {
                if (x == 0 && y == 0)
                {
                    map[x][y] = "*|";
                }
                else if(x == 0)
                {
                    map[x][y] = String.format("%d", y);
                }
                else if (y == 0)
                {
                    map[x][y] = String.format("%d|", x);
                }
                else
                {
                    map[x][y] = "*";
                }
            }
        }

        return map;
    }
}
