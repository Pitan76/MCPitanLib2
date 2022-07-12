package ml.pkom.mcpitanlib2.api.math;

import net.minecraft.util.math.Position;

public class Pos {
    private Position position;

    public Pos(Position position) {
        setPosition(position);
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }
}
