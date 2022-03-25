package com.company;

import java.util.Arrays;

public class UserDoo {
    private  User[] users = new User[10];

    public User[] getUsers() {
        return users;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "UserDoo{" +
                "users=" + Arrays.toString(users) +
                '}';
    }
}
