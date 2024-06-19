package at.elina.test.games.firstgame;

import org.newdawn.slick.*;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;

import java.awt.*;

public class Rocket implements Actor{

    private Image rocketImage;
    private float x,y;

    public Rocket() throws SlickException {
        Image tmp = new Image("testdata/rocket_elina.png");
        this.rocketImage = tmp.getScaledCopy(200, 200);
        this.x = 100;
        this.y = 100;
    }

    @Override
    public void render(Graphics graphics) {
        rocketImage.draw(this.x, this.y);
    }

    @Override
    public void update(GameContainer gameContainer, int delta) {
        if (gameContainer.getInput().isKeyDown(Input.KEY_RIGHT)){
            this.x++;
        }

        if (gameContainer.getInput().isKeyDown(Input.KEY_LEFT)){
            this.x--;
        }

        if (gameContainer.getInput().isKeyDown(Input.KEY_UP)){
            this.y--;
        }

        if (gameContainer.getInput().isKeyDown(Input.KEY_DOWN)){
            this.y++;
        }

    }

    public float getX() {
        return x + 100;
    }

    public float getY() {
        return y;
    }

}
