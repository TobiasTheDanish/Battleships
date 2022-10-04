import processing.core.PApplet;

public class Displayer
{
    PApplet sketch;
    public Displayer(PApplet sketch)
    {
        this.sketch = sketch;
    }

    public void startFrame()
    {
        sketch.background(255);
    }

    public void drawMap(Coordinate startPos, int tileSize, String[][] map)
    {
        for (int x = 0; x < map[0].length; x++)
        {
            for (int y = 0; y < map[1].length; y++)
            {

                if (x == 0 && y == 0)
                {
                    sketch.fill(0);
                }
                else
                {
                    sketch.fill(255);
                }
                sketch.stroke(0);
                sketch.rect(startPos.x + x * tileSize, startPos.y + y * tileSize, tileSize, tileSize);
            }
        }
    }

}
