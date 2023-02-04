package ru.vladustest;

import org.junit.jupiter.api.Test;
import ru.vladustest.service.ChangesInspector;
import ru.vladustest.service.CodeChangesInspector;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CodeChangesInspectorTest {
    HTMLTestDataGenerator dataGenerator = new HTMLTestDataGenerator();
    ChangesInspector inspector = new CodeChangesInspector(dataGenerator.generatePreviousState(), dataGenerator.generateCurrentState());
    Set<String> expected = new HashSet<>();

    @Test
    public void testUpdatedHTML(){
        expected.add("https://softaria.ru/development/");
        Set<String> actual = inspector.getUpdated();
        assertEquals(expected, actual);
    }

    @Test
    public void testDeletedHTML(){
        expected.add("https://softaria.ru/portfolio");
        Set<String> actual = inspector.getDeleted();
        assertEquals(expected, actual);
    }

    @Test
    public void testCreatedHTML(){
        expected.add("https://softaria.ru/junior-fullstack/");
        Set<String> actual = inspector.getCreated();
        assertEquals(expected, actual);
    }

    @Test
    public void testAllChanges(){
        Set<String> deletedExpected = new HashSet<>();
        Set<String> createdExpected = new HashSet<>();
        Set<String> updatedExpected = new HashSet<>();
        deletedExpected.add("https://softaria.ru/portfolio");
        updatedExpected.add("https://softaria.ru/development/");
        createdExpected.add("https://softaria.ru/junior-fullstack/");
        Set<String> deletedActual = inspector.getDeleted();
        Set<String> createdActual = inspector.getCreated();
        Set<String> updatedActual = inspector.getUpdated();
        assertAll(()-> assertEquals(deletedExpected, deletedActual),
                ()-> assertEquals(createdExpected, createdActual),
                ()-> assertEquals(updatedExpected, updatedActual));
    }

    @Test
    public void testEmptyPreviousState(){
        ChangesInspector inspector = new CodeChangesInspector(new HashMap<>(), dataGenerator.generateCurrentState());
        Set<String> deletedExpected = new HashSet<>();
        Set<String> createdExpected = new HashSet<>();
        Set<String> updatedExpected = new HashSet<>();
        createdExpected.add("https://softaria.ru/development/");
        createdExpected.add("https://softaria.ru/about/");
        createdExpected.add("https://softaria.ru/junior-fullstack/");
        Set<String> deletedActual = inspector.getDeleted();
        Set<String> createdActual = inspector.getCreated();
        Set<String> updatedActual = inspector.getUpdated();
        assertAll(()-> assertEquals(deletedExpected, deletedActual),
                  ()-> assertEquals(createdExpected, createdActual),
                  ()-> assertEquals(updatedExpected, updatedActual));
    }

    @Test
    public void testEmptyCurrentState(){
        ChangesInspector inspector = new CodeChangesInspector(dataGenerator.generatePreviousState(), new HashMap<>());
        Set<String> deletedExpected = new HashSet<>();
        Set<String> createdExpected = new HashSet<>();
        Set<String> updatedExpected = new HashSet<>();
        deletedExpected.add("https://softaria.ru/development/");
        deletedExpected.add("https://softaria.ru/portfolio");
        deletedExpected.add("https://softaria.ru/about/");
        Set<String> deletedActual = inspector.getDeleted();
        Set<String> createdActual = inspector.getCreated();
        Set<String> updatedActual = inspector.getUpdated();
        assertAll(()-> assertEquals(deletedExpected, deletedActual),
                ()-> assertEquals(createdExpected, createdActual),
                ()-> assertEquals(updatedExpected, updatedActual));
    }
}
