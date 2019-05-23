package backend.Commands;

import backend.Storage.Storage;
import backend.Turtle;

import java.util.List;

public class Stamp extends RootNode {
    public Stamp(Storage storage, Turtle turtle, List<Node> children) {
        super(storage, turtle, children);
    }

    @Override
    public Object run() {
        myTurtle.Changed();
        myTurtle.stamp();
        myTurtle.clear();
        return 1;
    }
}
