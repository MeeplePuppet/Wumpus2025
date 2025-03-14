public class Player {
    public Player() {

    }

    // Returns player position
    public int[] getPosition() {
        System.out.println("Player.getPosition");
        return null;
    }

    // Sets player position
    public void setPosition(int x, int y) {
        System.out.println("Player.setPosition()");
    }

    // Returns player arrow count
    public int getArrows() {
        System.out.println("Player.getArrows()");
        return -1;
    }

    // Sets player arrow count, used for buying/shooting arrows
    public void setArrows(int arrows) {
        System.out.println("Player.setArrows()");
    }

    // Returns player gold
    public int getGold() {
        System.out.println("Player.getGold()");
        return -1;
    }

    // Sets player gold, used for picking up/spending gold
    public void setGold(int Gold) {
        System.out.println("Player.setGold()");
    }

    // Returns player turns
    public int getTurns() {
        System.out.println("Player.getTurns()");
        return -1;
    }

    // Updates the player's turns
    public void nextTurn() {
        System.out.println("Player.nextTurn()");

    }

    // Computes the player's total score
    public int computeScore() {
        System.out.println("Player.computeScore()");
        return -1;
    }
}