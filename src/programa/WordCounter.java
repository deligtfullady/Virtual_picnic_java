package programa;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCounter {
    private File file;

    public WordCounter(File file) {
        this.file = file;
    }

    public int countWords() {
        int wordCount = 0;
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                scanner.next();
                wordCount++;
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        return wordCount;
    }
}