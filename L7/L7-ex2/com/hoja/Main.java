package com.hoja;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        CarsEnt carsEnt = new CarsEnt();
        CarUserEnt carUserEnt = new CarUserEnt();
        CarsRepo carsRepo = new CarsRepo();
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String pass = scanner.nextLine();
        carUserEnt.setUsername(username).setPass(pass);

        try {
            if(carsRepo.selectCARUSERS(carUserEnt,carsEnt).isEmpty()){
                System.out.println("error");
            }else if (username.equals(carsRepo.selectCARUSERS(carUserEnt,carsEnt).get(1))){
                if (pass.equals(carsRepo.selectCARUSERS(carUserEnt,carsEnt).get(2))){
                    System.out.println("which car ? 1)saina 2)tiba 3)pride 4)quiqe");
                    int c =scanner.nextInt();
                    carsEnt.setId(c);
                for (String a:carsRepo.selectCAR(carUserEnt,carsEnt)){
                        System.out.println(a);
                    }
                    System.out.println("buying ... ");
                    long price = Long.parseLong(carsRepo.selectCAR(carUserEnt,carsEnt).get(3));
                    long currentMoney = Long.parseLong(carsRepo.selectCARUSERS(carUserEnt,carsEnt).get(3));
                    carUserEnt.setMoney(currentMoney-price);
                    carsRepo.update(carUserEnt,carsEnt);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
