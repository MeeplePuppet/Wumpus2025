

public class GameController {
    public static void main(String... args)
    {
        var gc = new GameController();
    }

    public Cave cave;
    public GameLocations gameLocations;
    public GraphicsInterface graphicsInterface;
    public HighScore highScore;
    public Player player;
    public Trivia trivia;

    public GameController()
    {
        // Creates all of the objects needed for the game
        cave = new Cave();
        gameLocations = new GameLocations();
        graphicsInterface = new GraphicsInterface(this);
        highScore = new HighScore();
        player = new Player();
        trivia = new Trivia();
    }

    public void move(Cave.Direction dir) {
        System.out.println("GameController.move()");
        cave.canMove(0,0,dir);
        gameLocations.isWumpus(0,0);
        gameLocations.isBats(0,0);
        gameLocations.isChasm(0,0);
        player.setPosition(0,0);
        graphicsInterface.updateUX();
    }

    public void shoot(Cave.Direction dir) {
        System.out.println("GameController.shoot()");
        graphicsInterface.updateUX();
    }
}