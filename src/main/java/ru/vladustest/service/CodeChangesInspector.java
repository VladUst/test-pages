package ru.vladustest.service;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class CodeChangesInspector implements ChangesInspector {
    private HashMap<String, String> previousState;
    private HashMap<String, String> currentState;
    Set<String> previousStateKeys;
    Set<String> currentStateKeys;

    public CodeChangesInspector(HashMap<String, String> previousState, HashMap<String, String> currentState) {
        this.previousState = previousState;
        this.currentState = currentState;
        previousStateKeys = previousState.keySet();
        currentStateKeys = currentState.keySet();
    }

    @Override
    public Set<String> getCreated() {
        Set<String> created = new HashSet<String>(currentStateKeys);
        created.removeAll(previousStateKeys);
        return created;
    }

    @Override
    public Set<String> getUpdated() {
        Set<String> updated = new HashSet<>();
        for (String previousStateKey : previousState.keySet()) {
            String previousStateCode = previousState.get(previousStateKey);
            String currentStateCode = currentState.get(previousStateKey);
            if (currentStateCode != null){
                if(!previousStateCode.equals(currentStateCode)){
                    updated.add(previousStateKey);
                }
            }
        }
        return updated;
    }

    @Override
    public Set<String> getDeleted() {
        Set<String> deleted = new HashSet<String>(previousStateKeys);
        deleted.removeAll(currentStateKeys);
        return deleted;
    }
}
