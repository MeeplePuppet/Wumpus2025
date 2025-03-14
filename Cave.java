public class Cave {
    public static enum Direction {
        North,
        East,
        South,
        West
    }

    public Cave() {

    }

    // Loads the cave from a file
    public void load(String file) {
        System.out.println("Cave.load()");
    }

    // Can the player move from x,y in the dir direction?
    public boolean canMove(int x, int y, Direction dir) {
        System.out.println("Cave.canMove()");
        return true;
    }

    public boolean[] giveExits(int x, int y) {
        System.out.println("Cave.giveExits()");
        return null;
    }
}