import processing.core.PApplet;
import processing.core.PGraphics;

public class Main extends PApplet
{
    private Game game;

    public static void main(String[] args)
    {
        String[] processingArgs = {"Main"};
        Main mySketch = new Main();
        PApplet.runSketch(processingArgs, mySketch);
    }

    public void settings()
    {
        fullScreen();
        this.g = new PGraphics();

        game = new Game(this,8);
        game.start();
    }

    public void draw()
    {
        game.run();
    }
}
