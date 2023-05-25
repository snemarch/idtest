package dk.kthx;

public class User implements Identifiable<User> {
    private Id<User> id;

    @Override
    public Id<User> getIdentifier() {
        return id;
    }
}
