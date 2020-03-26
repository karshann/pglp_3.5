package org.example;

import java.time.LocalDateTime;

public class Log implements Message {

    public void affichermessage(String S) {
        System.out.println(LocalDateTime.now() + S);
    }

}
