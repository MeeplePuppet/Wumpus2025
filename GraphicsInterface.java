import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GraphicsInterface {
    private JFrame gameFrame;
    private JLabel turnLabel;
    private GameController gameController;

    public GraphicsInterface(GameController gameController) {
        this.gameController = gameController;

        // Creates a frame (Window) for the UX
        this.gameFrame = new JFrame("Wumpus");
        this.gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        
        // Creates a button and attaches a listener to it that calls the move method
        JButton moveButton = new JButton("Move");
        moveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                moveButtonClicked();
            }
        });

        // Creates a button and attaches a listener to it that calls the shoot method
        JButton shootButton = new JButton("Shoot");
        shootButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                shootButtonClicked();
            }
        });

        // Creates a label to display the current turn count
        turnLabel = new JLabel();

        // Adds the buttons and labels to the UX
        panel.add(moveButton);
        panel.add(shootButton);
        panel.add(turnLabel);
        this.gameFrame.getContentPane().add(panel);

        // Shows the UX
        this.gameFrame.pack();
        this.gameFrame.setSize(500,600);
        this.gameFrame.setVisible(true);
    }

    // Updates the room UX with the exits for the current room
    public void enterRoom(boolean[] exits) {

    }

    // Tells the game controller that the player moved
    public void moveButtonClicked() {
        gameController.move(Cave.Direction.North);
    }
    
    // Tells the GameController than the player shot an arrow
    public void shootButtonClicked() {
        gameController.shoot(Cave.Direction.North);
    }

    // Updates the UX based on last action
    public void updateUX() {
        turnLabel.setText("Turn: " + gameController.player.getTurns());
    }
}