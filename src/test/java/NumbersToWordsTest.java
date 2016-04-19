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
    String expected = "Two Hundred Twelve";
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
    String expected = "Four Thousand Eight Hundred Fifteen";
    assertEquals(expected, testNumbersToWords.runNumbersToWords(4815));
  }

  @Test
  public void convertNumber_returnWord_FiveThousandThreeHundredAndFiftyOne() {
    NumbersToWords testNumbersToWords = new NumbersToWords();
    String expected = "Five Thousand Three Hundred Fifty-One";
    assertEquals(expected, testNumbersToWords.runNumbersToWords(5351));
  }


  @Test
  public void convertNumber_returnWord_TwoMillionThreeHundredFortyFiveThousandSixHundredAndSeventyEight() {
    NumbersToWords testNumbersToWords = new NumbersToWords();
    String expected = "Two Million Three Hundred Forty-Five Thousand Six Hundred Seventy-Eight";
    assertEquals(expected, testNumbersToWords.runNumbersToWords(2345678));
  }

  // @Test
  // public void convertNumber_returnWord_TwoMillionThreeHundredFortyFiveThousandSixHundredAndSeventyEight() {
  //   NumbersToWords testNumbersToWords = new NumbersToWords();
  //   String expected = "Two Million Three Hundred Forty-Five Thousand Six Hundred Seventy-Eight";
  //   assertEquals(expected, testNumbersToWords.runNumbersToWords(2345678));
  // }

  @Test
  public void convertNumber_returnWord_FourBillionTwoMillionThreeHundredFortyFiveThousandSixHundredAndSeventyEight() {
    NumbersToWords testNumbersToWords = new NumbersToWords();
    String expected = "Four Billion Two Million Three Hundred Forty-Five Thousand Six Hundred Seventy-Eight";
    assertEquals(expected, testNumbersToWords.runNumbersToWords(4002345678L));
  }

  @Test
  public void convertNumber_returnWord_ThreeTrillionFourBillionTwoMillionThreeHundredFortyFiveThousandSixHundredAndSeventyEight() {
    NumbersToWords testNumbersToWords = new NumbersToWords();
    String expected = "Three Trillion Four Billion Two Million Three Hundred Forty-Five Thousand Six Hundred Seventy-Eight";
    assertEquals(expected, testNumbersToWords.runNumbersToWords(3004002345678L));
  }
}
