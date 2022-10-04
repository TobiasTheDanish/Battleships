public abstract class BattleMap <T>
{
    protected T[][] map;
    public BattleMap(int boardSize)
    {
        this.map = initMap(boardSize);
    }
    protected T getValueByCoordinate(Coordinate coordinate)
    {
        return map[coordinate.x][coordinate.y];
    }
    public T[][] getMap()
    {
        return map;
    }
    public abstract void updateMap(Coordinate coordinate, BattleMap bMap);
    protected abstract T[][] initMap(int boardSize);
}
