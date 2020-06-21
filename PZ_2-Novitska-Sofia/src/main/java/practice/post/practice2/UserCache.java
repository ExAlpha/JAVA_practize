package practice.post.practice2;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;

public class UserCache {

    private static final UserCache INSTANCE = new UserCache();
    private final ConcurrentHashMap<Integer, User> users = new ConcurrentHashMap<Integer, User>();

    private UserCache() {
    }

    public static UserCache getInstance() {
        return INSTANCE;
    }

    public Collection<User> values(){
        return this.users.values();
    }

    public void add(final User user){
        this.users.put(user.getId(), user);
    }
}
