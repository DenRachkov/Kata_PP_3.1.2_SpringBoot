package web.Kata_PP_31.__SpringBoot.dao;



import web.Kata_PP_31.__SpringBoot.model.User;


import java.util.List;

public interface UserDao {
    void addUser(User user);

    List<User> getAllUsers();

    User getUser(long id);

    void updateUser(User user);

    void deleteUser(long id);
}
