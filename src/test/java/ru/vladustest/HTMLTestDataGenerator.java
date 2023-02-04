package ru.vladustest;

import java.util.HashMap;

public class HTMLTestDataGenerator {
    public HashMap<String, String> generatePreviousState(){
        HashMap<String, String> previousState = new HashMap<>();
        previousState.put("https://softaria.ru/development/", "<!DOCTYPE html>\n" +
                "<html>\n" +
                "  <head>\n" +
                "    <meta charset=\"utf-8\">\n" +
                "    <title>My test page</title>\n" +
                "  </head>\n" +
                "  <body>\n" +
                "  </body>\n" +
                "</html>");
        previousState.put("https://softaria.ru/portfolio", "<!DOCTYPE html>\n" +
                "<html>\n" +
                "  <head>\n" +
                "    <meta charset=\"utf-8\">\n" +
                "    <title>My deleted page</title>\n" +
                "  </head>\n" +
                "  <body>\n" +
                "  </body>\n" +
                "</html>");
        previousState.put("https://softaria.ru/about/", "<!DOCTYPE html>\n" +
                "<html>\n" +
                "  <head>\n" +
                "    <meta charset=\"utf-8\">\n" +
                "    <title>My test page</title>\n" +
                "  </head>\n" +
                "  <body>\n" +
                "  </body>\n" +
                "</html>");
        return previousState;
    }

    public HashMap<String, String> generateCurrentState(){
        HashMap<String, String> currentState = new HashMap<>();
        currentState.put("https://softaria.ru/development/", "<!DOCTYPE html>\n" +
                "<html>\n" +
                "  <head>\n" +
                "    <meta charset=\"utf-8\">\n" +
                "    <title>My updated page</title>\n" +
                "  </head>\n" +
                "  <body>\n" +
                "  </body>\n" +
                "</html>");
        currentState.put("https://softaria.ru/about/", "<!DOCTYPE html>\n" +
                "<html>\n" +
                "  <head>\n" +
                "    <meta charset=\"utf-8\">\n" +
                "    <title>My test page</title>\n" +
                "  </head>\n" +
                "  <body>\n" +
                "  </body>\n" +
                "</html>");
        currentState.put("https://softaria.ru/junior-fullstack/", "<!DOCTYPE html>\n" +
                "<html>\n" +
                "  <head>\n" +
                "    <meta charset=\"utf-8\">\n" +
                "    <title>My new page</title>\n" +
                "  </head>\n" +
                "  <body>\n" +
                "  </body>\n" +
                "</html>");
        return currentState;
    }
}
