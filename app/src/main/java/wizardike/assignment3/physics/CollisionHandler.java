package wizardike.assignment3.physics;

import java.io.DataOutputStream;
import java.io.IOException;

import wizardike.assignment3.levels.Level;

public interface CollisionHandler {
    void run(Level level, int thisEntity, Collidable other, int otherEntity);

    void save(DataOutputStream save) throws IOException;
    int getId();
}
