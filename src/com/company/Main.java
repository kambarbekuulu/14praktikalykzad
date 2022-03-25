package com.company;

public class Main {

    public static void main(String[] args) {
        UserDoo userDoo= new UserDoo();
        UserService userService= new UserService();
        User user1 = new User(1,"Aza","male",13);
        User user2 = new User(2,"Azat","male",10);
        User user3 = new User(3,"Azamat","male",20);
    userService.addUser(user1);
    userService.addUser(user2);
    userService.addUser(user3);
    userService.idmnTabu(2);
    userService.idmnOchuru(1);
    userService.idmnTabu(1);

    userService.getUsers();

    }
}
