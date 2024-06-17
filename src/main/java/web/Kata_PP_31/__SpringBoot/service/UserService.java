package web.Kata_PP_31.__SpringBoot.service;




import web.Kata_PP_31.__SpringBoot.model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);

    List<User> getAllUsers();

    User getUser(long id);

    void updateUser(User user);

    void deleteUser(long id);
}
