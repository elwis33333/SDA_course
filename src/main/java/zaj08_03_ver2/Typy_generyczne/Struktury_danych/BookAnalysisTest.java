package zaj08_03_ver2.Typy_generyczne.Struktury_danych;

import java.io.IOException;

public class BookAnalysisTest {
    public static void main(String[] args) {
        BookAnalysis bookAnalysis = new BookAnalysis();

        try{
            bookAnalysis.analysis();
        }
        catch(IOException e){

        }
    }
}
