package at.elina.test.games.firstgame;

import org.newdawn.slick.*;

public class Rectangles extends BasicGame {

    public enum DIRECTION {RIGHT, DOWN, LEFT, UP}

    private float xRect;
    private float yRect;
    private DIRECTION rectDirection = DIRECTION.RIGHT;
    private float speedRect;
    private float xOval;
    private float yOval;
    private DIRECTION ovalDirection = DIRECTION.RIGHT;

    private float speedOval;


    public Rectangles(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.xRect = 150;
        this.yRect = 150;
        this.speedRect = 5.0f;

        this.xOval = 100;
        this.yOval = 100;
        this.speedOval = 5.0f;
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        //this.xRect += (float) delta/ speedRect;


        if (rectDirection == DIRECTION.RIGHT) {
            this.xRect += (float) delta/speedRect;
            if (this.xRect > 600) {
                this.rectDirection = DIRECTION.DOWN;
            }

        }

        if (rectDirection == DIRECTION.DOWN) {
            this.yRect += (float) delta/speedRect;
            if (this.yRect > 400) {
                this.rectDirection = DIRECTION.LEFT;
            }

        }

        if (rectDirection == DIRECTION.LEFT) {
            this.xRect -= (float) delta/speedRect;
            if (this.xRect<150) {
                this.rectDirection = DIRECTION.UP;
            }
        }

        if (rectDirection == DIRECTION.UP) {
            this.yRect -= (float) delta/speedRect;
            if (this.yRect<150) {
                this.rectDirection = DIRECTION.RIGHT;
            }
        }

        if (ovalDirection == DIRECTION.RIGHT) {
            this.xOval += (float) delta/speedOval;
            if (this.xOval>700) {
                this.ovalDirection = DIRECTION.LEFT;
            }
        }

        if (ovalDirection == DIRECTION.LEFT) {
            this.xOval -= (float) delta/speedOval;
            if (this.xOval<50) {
                this.ovalDirection = DIRECTION.RIGHT;
            }
        }

}



    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        graphics.drawRect(this.xRect, this.yRect, 100,100);
        graphics.drawString("Elina´s Rectangle!", 50, 50);
        graphics.drawOval(this.xOval, this.yOval, 50, 25);
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new Rectangles("Rectangles"));
            container.setDisplayMode(800,600,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
