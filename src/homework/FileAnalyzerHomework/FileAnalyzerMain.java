package homework.FileAnalyzerHomework;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class FileAnalyzerMain {
    public static void main(String[] args) {
        FileAnalyzer analyzer = new FileAnalyzer();
        File file = new File("C:\\Users\\MaGa Mobile\\IdeaProjects\\NewProject\\src\\homework\\example.txt");

        try {
            int totalWords = analyzer.totalWordCount(String.valueOf(file));
            System.out.println("Total word count: " + totalWords);

            int uniqueWords = analyzer.uniqueWordCount(String.valueOf(file));
            System.out.println("Unique word count: " + uniqueWords);

            Map<String, Integer> wordMap = analyzer.wordMap(file.getPath());
            System.out.println("Word occurrences: " + wordMap);

            Map<String, Integer> topWords = analyzer.topFrequentWords(String.valueOf(file), 5);
            System.out.println("Top 5 frequent words: " + topWords);

            String specificWord = "example";
            int occurrences = analyzer.countWordOccurrences(String.valueOf(file), specificWord);
            System.out.println("Occurrences of '" + specificWord + "': " + occurrences);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
