import java.util.HashMap;
import java.io.Console;

public class NumbersToWords {



 public String runNumbersToWords(long number) {
  Long tempCounter;
  String finalWord = "";

  HashMap<Long, String> ones = new HashMap();
  String[] onesArray = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
  for (long i = 0 ; i <= 19; i++) {
    ones.put(i, onesArray[(int)i]);
  }


  HashMap<Long, String> tens = new HashMap();
  String[] tensArray = {"Zero", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
  for (long i = 0 ; i <= 9; i++) {
    tempCounter = 10 * (i);
    tens.put(tempCounter, tensArray[(int)i]);
  }

  if (number == 0) {
    return "Zero";
  }

  // while (number > 0) {
    if (number / 1000000000000L > 0) {
      finalWord = finalWord + runNumbersToWords(number / 1000000000000L) + " Trillion ";
      number %= 1000000000000L;
    }

    if (number / 1000000000 > 0) {
      finalWord += runNumbersToWords(number / 1000000000) + " Billion ";
      number %= 1000000000;
    }

    if (number / 1000000 > 0) {
      finalWord += runNumbersToWords(number / 1000000) + " Million ";
      number %= 1000000;
    }

    if (number / 1000 > 0) {
      finalWord += runNumbersToWords(number / 1000) + " Thousand ";
      number %= 1000;
    }

    if (number / 100 > 0) {
      finalWord += runNumbersToWords(number / 100) + " Hundred ";
      number %= 100;
    }

    if (number > 0) {
      // if (!finalWord.isEmpty()) {
      //   finalWord += " and ";
      // }

      if (number < 20) {
        finalWord += ones.get(number);
      } else {
        finalWord += tens.get(number - (number % 10));
        if ((number % 10) > 0){
          finalWord += "-" + runNumbersToWords(number % 10);
        }
      }
    }
  // }
  return finalWord;

 }


}
//
//
// for (int index = 0 ; index < numberString.length ; index++) {
//   counter = counter * 10;
//
//   Integer moddedNumber = tempNumber % counter;
//
//
//   if (tempNumber % 100 > 10 && tempNumber % 100 < 20) {
//
//     Integer teensModdedNumber = number % 100;
//     finalWord = teens.get(teensModdedNumber) + " " + finalWord;
//     counter = counter * 10;
//   } else {
//     finalWord = numberWords.get(moddedNumber) + " " + finalWord;
//   }
//
//   Integer tempNumber -= moddedNumber;
//
//
// }
//
//   return finalWord;
