package at.elina.test.games.firstgame;

import org.newdawn.slick.Graphics;

public class Rectangle implements Actor{
    private float x;
    private float y;
    private float speed;
    public enum DIRECTION {RIGHT, LEFT}
    private DIRECTION rectDirection = DIRECTION.RIGHT;

    public Rectangle(int x, int y, float speed) {
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.rectDirection = DIRECTION.LEFT;
    }


    public void render(Graphics graphics){
        graphics.drawRect(this.x, this.y, 10, 10);
    }

    public void update(int delta){
        if (this.rectDirection == DIRECTION.RIGHT){
            this.x += (float)delta/speed;
            if (this.x > 800){
                this.x = 0;
            }
        }

        if (this.rectDirection == DIRECTION.LEFT) {
            this.x -= (float) delta/speed;
            if (this.x < 0) {
                this.x = 800;
            }

        }
    }
}

/*
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

        if (circleDirection == DIRECTION.DOWN) {
        this.yCircle += (float) delta/speedCircle;
        if (this.yCircle>500) {
        this.circleDirection = DIRECTION.UP;
        }
        }

        if (circleDirection == DIRECTION.UP) {
        this.yCircle -= (float) delta/speedCircle;
        if (this.yCircle<100) {
        this.circleDirection = DIRECTION.DOWN;
        }
        }
*/