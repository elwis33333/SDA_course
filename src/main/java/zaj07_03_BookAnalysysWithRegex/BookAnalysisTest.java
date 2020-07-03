package zaj07_03_BookAnalysysWithRegex;

import java.io.IOException;

public class BookAnalysisTest {
    public static void main(String[] args) {
        BookAnalysis bookAnalysis = new BookAnalysis();
        try{
            bookAnalysis.analysis();
        }
        catch (IOException e){

        }
    }
}
