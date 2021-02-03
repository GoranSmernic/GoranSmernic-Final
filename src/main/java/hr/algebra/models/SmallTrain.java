package hr.algebra.models;

public class SmallTrain extends Train {
    public SmallTrain() {
        super(Size.SMALL, 8);

    }

    @Override
    public String toString() {
        return "BigTrain - " + getString();
    }
}
