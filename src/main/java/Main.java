import processing.core.PApplet;

public class Main extends PApplet
{
    public static void main(String[] args)
    {
        PApplet.main(Main.class.getCanonicalName());
    }

    public void settings()
    {
        fullScreen();
    }

    public void draw()
    {
        background(255);
        fill(0);
        rectMode(CENTER);
        rect(width/2, height/2, width/2, height/2);
    }
}
