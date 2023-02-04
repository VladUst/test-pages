package ru.vladustest.service;

public class ChangesReporter {
    private ChangesInspector inspector;

    public ChangesReporter(ChangesInspector inspector) {
        this.inspector = inspector;
    }

    public void printFullReport(String employeeName) {
        System.out.println("Здравствуйте, дорогая " + employeeName);
        System.out.println("\nЗа последние сутки во вверенных Вам сайтах произошли следующие изменения:\n");
        System.out.println("Исчезли следующие страницы: " + inspector.getDeleted());
        System.out.println("Появились следующие новые страницы: " + inspector.getCreated());
        System.out.println("Изменились следующие страницы: " + inspector.getUpdated());
    }
}
