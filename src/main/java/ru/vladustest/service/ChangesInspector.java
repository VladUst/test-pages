package ru.vladustest.service;

import java.util.Set;

public interface ChangesInspector {
    Set<String> getCreated();
    Set<String> getUpdated();
    Set<String> getDeleted();
}
