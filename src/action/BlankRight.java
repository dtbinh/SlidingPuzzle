package action;

import model.Plain;
import model.State;

public class BlankRight implements Action {
    @Override
    public State act(State cur) {
        Plain next = new Plain((Plain) cur);
        next.BlankRight();

        return next;
    }
}
