package dk.kthx;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class Repository {
    Optional<User> getUser(Id<User> id) {
        return Optional.empty();
//        return Collections.emptyList();
    }

    Optional<Drug> getDrug(Id<Drug> id) {
        return Optional.empty();
//        return Collections.emptyList();
    }

    List<Drug> getDrugsForUser(Id<User> id) {
        return Collections.emptyList();
    }
}
