package player;

public class SpaceCraft {

    private String playerName;
    private AttackMode attackMode;

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public SpaceCraft(String playerName) {
        this.playerName = playerName;
    }

    public void setAttackMode(AttackMode attackMode) {
        this.attackMode = attackMode;
    }

    public void mode() {
        attackMode.mode();
    }
}
