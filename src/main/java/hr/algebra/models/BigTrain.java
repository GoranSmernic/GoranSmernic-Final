package hr.algebra.models;

public class BigTrain extends Train {
    public BigTrain() {
        super(Size.BIG, 6);

    }

    @Override
    public String toString() {
        return "BigTrain - " + getString();
    }
}
