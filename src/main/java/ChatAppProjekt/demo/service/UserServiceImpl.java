package ChatAppProjekt.demo.service;

import ChatAppProjekt.demo.model.User;
import ChatAppProjekt.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;


    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public User registerUser (String username, String password, String phoneNumber) {
        User userFound = findUser(username);
        User userFoundByPhone = findByPhoneNumber(phoneNumber);
        if (userFound == null && userFoundByPhone == null) {
            User newUser = new User();
            newUser.setUsername(username);
            newUser.setPassword(password);
            newUser.setPhoneNumber(phoneNumber);
            return userRepository.save(newUser);
        } else {
            return null;
        }
    }

    @Override
    public List<User> findByGroup(String group) {
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User findUser(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public User findByPhoneNumber(String phoneNumber) {
        return userRepository.findByPhoneNumber(phoneNumber);
    }
}
