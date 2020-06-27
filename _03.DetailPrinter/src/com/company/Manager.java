package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Manager extends Employee {
    List<String> documents;

    public Manager(String name, Collection<String> documents) {
        super(name);
        this.documents = new ArrayList<String>(documents);
    }

    public Manager(String name) {
        super(name);
    }

    public List<String> getDocuments() {
        List<String> returnDocs = Collections.unmodifiableList(documents);
        return returnDocs;
    }

    public void setDocuments(List<String> documents) {
        this.documents = documents;
    }

    @Override
    public String toString() {
        if (this.documents != null){
            return super.toString() + System.lineSeparator() + String.join(System.lineSeparator(), this.documents);
        } else {
            return super.toString();
        }
    }
}
