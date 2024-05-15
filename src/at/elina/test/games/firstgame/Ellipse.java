package at.elina.test.games.firstgame;

import org.newdawn.slick.Graphics;

public class Ellipse implements Actor{

    private float x;
    private float y;
    private int speed;

    public Ellipse(int x, int y) {
        this.x = x;
        this.y = y;
        this.speed = 5;

    }

    @Override
    public void render(Graphics graphics) {
        graphics.drawOval(this.x, this.y, 50, 10);
    }

    @Override
    public void update(int delta) {
        this.y += (float)delta/speed;
        this.x += (float)delta/speed;
        if ((this.y > 600) && (this.x >800)) {
            this.y = 0;
            this.x = 0;
        }
    }
}
