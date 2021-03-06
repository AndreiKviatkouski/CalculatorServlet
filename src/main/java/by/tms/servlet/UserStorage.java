package by.tms.servlet;

import entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserStorage {
    public static List<User> userList = new ArrayList<User>();

    public void add(User user) {
        userList.add(user);
    }

    public User getUserByLogin(String login) {
        for (User user : userList) {
            if (user.getLogin().equals(login)) {
                return user;
            }
        }
        return null;
    }
}
