import java.util.ArrayList;
import java.util.Comparator;

public class Pawn extends ConcretePiece {
    private static final String PLAYER_ONE_TYPE = "♙";
    private static final String PLAYER_TWO_TYPE = "♟";
    //Data
    String type;
    int kills;

    //constructor
    public Pawn(Player owner, String id, Position xy) {
        super(owner, id, xy);

        if (owner.isPlayerOne())
            type = PLAYER_ONE_TYPE;
        else
            type = PLAYER_TWO_TYPE;
    }


    @Override
    public String getType() {
        return type;
    }

    @Override
    public int getKills() {
        return this.kills;
    }

    public static Comparator<Pawn> killsCompare = Comparator.comparingInt(Pawn::getKills);

    public void addKill() {
        this.kills += 1;
    }
}