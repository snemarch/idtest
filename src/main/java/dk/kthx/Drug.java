package dk.kthx;

public class Drug implements Identifiable<Drug> {
    private Id<Drug> id;

    @Override
    public Id<Drug> getIdentifier() {
        return id;
    }
}
