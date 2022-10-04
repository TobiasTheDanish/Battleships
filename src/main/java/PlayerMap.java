import processing.core.PApplet;

public class PlayerMap extends BattleMap<Integer>
{
    public PlayerMap(int boardSize)
    {
        super(boardSize);
    }

    @Override
    public void updateMap(Coordinate coordinate, BattleMap bMap)
    {
        String target = (String) bMap.getValueByCoordinate(new Coordinate(coordinate.x+1, coordinate.y+1));

        if(target.equalsIgnoreCase("h"))
        {
            this.map[coordinate.x][coordinate.y] = 0;
        }
    }

    @Override
    protected Integer[][] initMap(int boardSize)
    {
        Integer[][] map = new Integer[boardSize][boardSize];

        for (int y = 0; y < map[1].length; y++)
        {
            for (int x = 0; x < map[0].length; x++)
            {
                map[x][y] = 0;
            }
        }
        return map;
    }
}
