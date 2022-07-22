package player;

public class AtomicBomb implements AttackMode{
    @Override
    public void mode() {
        System.out.println("Attacks furiously like a crazy stupid terrorist with an Atomic Bomb\n" +
                "Booooooooooooom!!!!\n\n" +
                "Game Over\n" +
                "There was no time do escape the bomb blast and you died together!!!");
    }
}
