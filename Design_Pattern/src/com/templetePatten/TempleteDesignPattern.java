// Abstract class representing the template
package com.templetePatten;

abstract class DataProcessor {
    // Template method
    public final void process() {
        readData();
        processData();
        saveData();
    }

    // Steps to be implemented by subclasses
    abstract void readData();
    abstract void processData();

    // Concrete method
    void saveData() {
        System.out.println("Saving processed data to the database.");
    }
}

// Concrete class implementing the abstract methods
class ExcelDataProcessor extends DataProcessor {
    @Override
    void readData() {
        System.out.println("Reading data from an Excel file.");
    }

    @Override
    void processData() {
        System.out.println("Processing Excel data.");
    }
}

// Another concrete class implementing the abstract methods
class TextDataProcessor extends DataProcessor {
    @Override
    void readData() {
        System.out.println("Reading data from a text file.");
    }

    @Override
    void processData() {
        System.out.println("Processing text data.");
    }
}

// Client code
public class TempleteDesignPattern {
    public static void main(String[] args) {
        DataProcessor excelProcessor = new ExcelDataProcessor();
        excelProcessor.process();

        DataProcessor textProcessor = new TextDataProcessor();
        textProcessor.process();
    }
}
