package programa;

import java.io.File;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        File inputFile = new File("input.txt");

        WordCounter wordCounter = new WordCounter(inputFile);
        int wordCount = wordCounter.countWords();
        System.out.println("Количество слов в файле: " + wordCount);

        LongestWord longestWordFinder = new LongestWord(inputFile);
        String longestWord = longestWordFinder.findLongestWord();
        System.out.println("Самое длинное слово в файле: " + longestWord);

        WordFrequency wordFrequencyCalculator = new WordFrequency(inputFile);
        Map<String, Integer> wordFrequency = wordFrequencyCalculator.calculateWordFrequency();
        System.out.println("Слова, встречающиеся чаще всего в файле: " + wordFrequency);
    }
}