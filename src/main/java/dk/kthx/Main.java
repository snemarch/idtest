package dk.kthx;

public class Main {
    private static Repository repository = new Repository();

    public static void main(String[] args) {
        Id<User> userId = Id.wrap(2L);
        Id<Drug> drugId = Id.wrap(5L);

//        var user = repository.getUser(1L); // compile error
        var user1 = repository.getUser(Id.wrap( 1L));
        var user2 = repository.getUser(userId).orElseThrow();
//        repository.getUser(drugId); // compile error

        var oneDrug = repository.getDrug(drugId).orElseThrow();

//        repository.getDrugsForUser(drugId); // compile error
//        repository.getDrugsForUser(oneDrug.getIdentifier()); // compile error
        var drugs = repository.getDrugsForUser(user2.getIdentifier());

    }
}
