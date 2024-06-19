package at.elina.test.games.firstgame;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class Cannonball implements Actor{
    private float x,y;

    public Cannonball(float x, float y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void render(Graphics graphics) {
        graphics.setColor(Color.cyan);
        graphics.fillOval(this.x, this.y, 10, 10);
        Utility.resetColor(graphics);
    }

    @Override
    public void update(GameContainer gameContainer, int delta) {
        this.y--;
    }
}
