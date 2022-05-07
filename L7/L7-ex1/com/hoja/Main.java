package com.hoja;

import com.hoja.model.NetEnt;
import com.hoja.model.NetRepo;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        NetEnt ent = new NetEnt();
        NetRepo repo = new NetRepo();
        Scanner scanner = new Scanner(System.in);
        String inputUsername ,inputPass ;
        inputUsername = scanner.nextLine();
        inputPass = scanner.nextLine();
        ent.setUsername(inputUsername);
        ent.setPass(inputPass);

            if (repo.select(ent).isEmpty()){
                System.out.println("Error");
            }else if (inputUsername.equals(repo.select(ent).get(0))){
                if (inputPass.equals(repo.select(ent).get(1))){
                    int currentNet = Integer.parseInt(repo.select(ent).get(2));
                    long currentMoney = Long.parseLong(repo.select(ent).get(3));
                    int c=0;
                    c = scanner.nextInt();
                    switch (c){
                        case 1 :
                            ent.setNet(currentNet+2);
                            ent.setMoney(currentMoney-1000);
                            repo.update(ent);
                            break;
                        case 2 :
                            ent.setNet(currentNet+4);
                            ent.setMoney(currentMoney-2000);
                            repo.update(ent);
                            break;
                        case 3 :
                            ent.setNet(currentNet+10);
                            ent.setMoney(currentMoney-5000);
                            repo.update(ent);
                            break;
                        case 4 :
                            ent.setNet(currentNet+25);
                            ent.setMoney(currentMoney-10000);
                            repo.update(ent);
                            break;
                    }
                }else{
                    System.out.println("wrong password");
                }

            }
        }
    }

