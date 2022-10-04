import processing.core.PApplet;
import processing.core.PGraphics;

public class Game
{
    PApplet sketch;
    private DisplayMap battleMap;
    private PlayerMap playerMap;
    private PlayerMap npcMap;
    private Displayer displayer;

    public Game(PApplet sketch, int boardSize)
    {
        this.sketch = sketch;
        battleMap = new DisplayMap(boardSize);
        playerMap = new PlayerMap(boardSize);
        npcMap = new PlayerMap(boardSize);
        displayer = new Displayer(sketch);
    }

    public void start()
    {
        displayer.startFrame();
    }

    public void run()
    {
        displayer.startFrame();
        displayer.drawMap(new Coordinate(400, 400), 40, battleMap.getMap());
    }
}
