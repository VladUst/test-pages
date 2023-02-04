package ru.vladustest.repository;

import java.util.HashMap;


public class HTMLCodeRepository {
    private HashMap<String, String> previousState;
    private HashMap<String, String> currentState;

    public HTMLCodeRepository() {
        this.previousState = new HashMap<>();
        this.currentState = new HashMap<>();
        // Такой функции, естественно, не будет в реальном коде. Оставляю лишь для демонстрации работы
        generateDummyData();
    }

    public HashMap<String, String> getPreviousState() {
        return previousState;
    }

    public HashMap<String, String> getCurrentState() {
        return currentState;
    }

    private void generateDummyData() {
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
    }

}
