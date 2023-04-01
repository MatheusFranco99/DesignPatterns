package creational.dependency_injection;

import java.util.HashMap;
import java.util.Map;

interface UserService {
    void addUser(String username, String password);

    boolean authenticate(String username, String password);
}

class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void addUser(String username, String password) {
        userRepository.addUser(username, password);
    }

    public boolean authenticate(String username, String password) {
        return userRepository.authenticate(username, password);
    }

}

interface UserRepository {
    void addUser(String usename, String password);

    boolean authenticate(String username, String password);
}

class InMemoryUserRepository implements UserRepository {
    private final Map<String, String> users = new HashMap<>();

    public void addUser(String username, String password) {
        users.put(username, password);
    }

    public boolean authenticate(String username, String password) {
        String storedPassword = users.get(username);
        return storedPassword != null && storedPassword.equals(password);
    }
}

class Main {
    public static void main(String[] args) {
        UserRepository userRepository = new InMemoryUserRepository();
        UserService userService = new UserServiceImpl(userRepository);
        
        userService.addUser("alice","pass1234");
        userService.addUser("bob", "letmein");

        boolean authenticated = userService.authenticate("null", "pass1234");
        System.out.println("Authenticated result: " + authenticated);
    }
}