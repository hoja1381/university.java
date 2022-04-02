package com.hoja;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map map = new HashMap();
        map.put("name",scanner.nextLine());
        map.put("StudentNumber",scanner.nextLine());
        map.put("gradeAverage",scanner.nextDouble());

        System.out.println(map.get("name"));
        System.out.println(map.get("StudentNumber"));
        System.out.println(map.get("gradeAverage"));
    }
}
