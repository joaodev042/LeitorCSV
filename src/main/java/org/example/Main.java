package org.example;

import com.google.gson.Gson;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)  {
        double soma = 0;
        try {
            List<User> users = Files.lines(Paths.get("src/static/nubank-2024-04.csv"))
                    .skip(1)
                    .map(line -> line.split(","))
                    .map(cols -> new User(cols[0], cols[1], cols[2], Double.parseDouble(cols[3])))
                    .filter(usr -> usr.getCategory().equals("transporte") )
                    .collect(Collectors.toList());

            for(User user : users){
                System.out.println(user);
            }

            for (int i = 0; users.size() > i; i++){
                Double num = users.get(i).getAmount();
                soma += num.doubleValue();

            }
            System.out.println(soma);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}




