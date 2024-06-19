package at.elina.test.games.firstgame;

import org.newdawn.slick.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ObjectsGame extends BasicGame {
    private List<Actor> actors;
    private Rocket rocket;

    public ObjectsGame(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.actors = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            Rectangle rectangle = new Rectangle(random.nextInt(600), random.nextInt(600), random.nextInt(50));
            this.actors.add(rectangle);
        }

        for (int i = 0; i < 10; i++) {
            Circle circle = new Circle();
            this.actors.add(circle);
        }

        for (int i = 0; i < 10; i++) {
            Ellipse ellipse = new Ellipse(random.nextInt(800), random.nextInt(600));
            this.actors.add(ellipse);
        }

        Rocket rocket = new Rocket();
        this.rocket = rocket;
        this.actors.add(rocket);

    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        for (Actor actor:this.actors) {
            actor.update(gameContainer, delta);
        }

}


    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        for (Actor actor:this.actors) {
            actor.render(graphics);
        }
        graphics.setBackground(Color.gray);

    }

    @Override
    public void keyPressed(int key, char c) {
        if (key == Input.KEY_SPACE){
            System.out.println("shoot");
            Cannonball cb = new Cannonball(this.rocket.getX(), this.rocket.getY());
            this.actors.add(cb);
        }

    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new ObjectsGame("Rectangles"));
            container.setDisplayMode(800,600,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
