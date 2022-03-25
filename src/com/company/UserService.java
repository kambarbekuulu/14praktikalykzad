package com.company;

public class UserService {
    private UserDoo userDoo = new UserDoo();

    int index = 0;

    public void addUser(User user) {
        if (index != userDoo.getUsers().length) {
            userDoo.getUsers()[index] = user;
            index++;
        } else {

            System.out.println("mesta net");
        }

    }

    public void idmnTabu(int id) {
        for (int i = 0; i < userDoo.getUsers().length; i++) {
            if (userDoo.getUsers()[i] != null) {

                if (userDoo.getUsers()[i].getId() == id) {
                    System.out.println(userDoo.getUsers()[i]);
                }

                }
            }
        }
        public void idmnOchuru(int id) {
        for (int i = 0; i < userDoo.getUsers().length; i++) {
            if (userDoo.getUsers()[i] != null) {
                if (userDoo.getUsers()[i].getId() == id) {
                    userDoo.getUsers()[i]=null;
                    System.out.println("User with id:"+id+" was deleted");

                }
            }
        }
    }

  public void getUsers(){
      for (int i = 0; i < userDoo.getUsers().length; i++) {
          if (userDoo.getUsers()[i]!=null){
              System.out.println(userDoo.getUsers()[i]);
          }

      }
}



}






