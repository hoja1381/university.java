package com.hoja.model;

import java.util.List;

public class UserServ {
    private UserServ() {
    }

    private static UserServ userServ = new UserServ();

    public static UserServ getInstance() {
        return userServ;
    }

    public void write(UserEnti userEnti) throws Exception {
        try (UserRepo userRepo = new UserRepo()) {
            userEnti.setUserName(userEnti.getUserName());
            userEnti.setPass(userEnti.getPass());
            userEnti.setName(userEnti.getName());
            userEnti.setEmail(userEnti.getEmail());
            userRepo.Insert (userEnti);
            userRepo.commit ();
        }
    }

    public List<UserEnti> report() throws Exception {
        List<UserEnti> userEntis;
        try (UserRepo userRepo = new UserRepo()) {
            userEntis = userRepo.select();
        }
        return userEntis;
    }
}
