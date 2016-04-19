import java.util.ArrayList;
import org.junit.*;
import static org.junit.Assert.*;

public class NumbersToWordsTest {

  @Test
  public void convertNumber_returnWord_Zero() {
    NumbersToWords testNumbersToWords = new NumbersToWords();
    String expected = "Zero";
    assertEquals(expected, testNumbersToWords.runNumbersToWords(0));
  }

  @Test
  public void convertNumber_returnWord_fifteen() {
    NumbersToWords testNumbersToWords = new NumbersToWords();
    String expected = "Fifteen";
    assertEquals(expected, testNumbersToWords.runNumbersToWords(15));
  }

  @Test
  public void convertNumber_returnWord_TwoHundredAndTwelve() {
    NumbersToWords testNumbersToWords = new NumbersToWords();
    String expected = "Two Hundred and Twelve";
    assertEquals(expected, testNumbersToWords.runNumbersToWords(212));
  }

  @Test
  public void convertNumber_returnWord_FiftyOne() {
    NumbersToWords testNumbersToWords = new NumbersToWords();
    String expected = "Fifty-One";
    assertEquals(expected, testNumbersToWords.runNumbersToWords(51));
  }

  @Test
  public void convertNumber_returnWord_FourThousandEightHundredAndFifteen() {
    NumbersToWords testNumbersToWords = new NumbersToWords();
    String expected = "Four Thousand Eight Hundred and Fifteen";
    assertEquals(expected, testNumbersToWords.runNumbersToWords(4815));
  }

  @Test
  public void convertNumber_returnWord_FiveThousandThreeHundredAndFiftyOne() {
    NumbersToWords testNumbersToWords = new NumbersToWords();
    String expected = "Five Thousand Three Hundred and Fifty-One";
    assertEquals(expected, testNumbersToWords.runNumbersToWords(5351));
  }

}
