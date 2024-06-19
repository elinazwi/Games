package at.elina.test.games.firstgame;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

import java.awt.*;
import java.util.Random;

public class Circle implements Actor{

    private float x;
    private float y;
    private float speed;
    private float diameter;

    public Circle() {
        Random random = new Random();
        this.x = random.nextInt(800);
        this.y = random.nextInt(600);
        this.speed = random.nextInt(40) + 10;
        this.diameter = random.nextInt(10) + 10;
    }

    public void render(Graphics graphics){
        graphics.drawOval(this.x, this.y, this.diameter, this.diameter);
    }



    public void update(GameContainer gameContainer, int delta){
        Random random = new Random();

        this.y += (float)delta/speed;
        this.diameter += (float)delta/speed;
        if (this.y > 600){
            this.y = 0;
            this.diameter = random.nextInt(10) +10;
        }
    }
}
