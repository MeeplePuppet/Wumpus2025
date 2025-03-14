public class HighScore {
    public HighScore() {

    }

    // Loads the high score file
    public void load(String file) {
        System.out.println("HighScore.load()");
    }

    // Returns the count of high scores
    public int count() {
        System.out.println("HighScore.count()");
        return -1;
    }

    // Returns a specific high score from the list
    public int get(int i) {
        System.out.println("HighScore.get()");
        return -1;
    }

    // Writes a high score for the provided player
    public void write(Player player) {
        System.out.println("HighScore.write()");
    }
}