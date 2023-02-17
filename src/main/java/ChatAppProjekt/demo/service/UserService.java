package ChatAppProjekt.demo.service;

import ChatAppProjekt.demo.model.User;

import java.util.List;

public interface UserService {
    public User saveUser(User user);

    public List<User> getAllUsers();

    public User findUser(String username);

    public User findByPhoneNumber(String phoneNumber);
    public User registerUser(String username, String password, String phoneNumber);

    public List<User> findByGroup(String group);
}
