package ru.vladustest;

import ru.vladustest.repository.HTMLCodeRepository;
import ru.vladustest.service.ChangesInspector;
import ru.vladustest.service.ChangesReporter;
import ru.vladustest.service.CodeChangesInspector;

public class Main {
    public static void main(String[] args) {
        // В реальности коды и ссылки на страницы, скорее всего, будут приходить извне (в виде JSON или файлов)
        // предполагаю, что данные как-то обработаны в контроллере и уже хранятся где-то в виде таблиц<строка, строка>
        HTMLCodeRepository HTMLRepo = new HTMLCodeRepository();
        ChangesInspector inspector = new CodeChangesInspector(HTMLRepo.getPreviousState(), HTMLRepo.getCurrentState());
        ChangesReporter reporter = new ChangesReporter(inspector);
        reporter.printFullReport("Мария Ивановна");
    }
}
