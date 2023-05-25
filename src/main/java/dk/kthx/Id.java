package dk.kthx;

public class Id<Self> {
    private long value;

    private Id(long value) {
        this.value = value;
    }

    static public <Self> Id<Self> wrap(long identifier) {
        return new Id<>(identifier);
    }

    public long value() {
        return value;
    }
}
