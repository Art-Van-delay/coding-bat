// Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".

// altPairs("kitten") → "kien"
// altPairs("Chocolate") → "Chole"
// altPairs("CodingHorror") → "Congrr"

public String altPairs(String str) {
  String result = "";
  String sub = "";

  // increment by 4 to hit the correct index
  for (int i = 0; i < str.length(); i += 4) {
    // initial starting index is 0 which will be added to substring
    // variable used for storing index position in .substring() 
    int end = i + 2;
    // string length conditional catch
    if (end > str.length()) {
      end = str.length();
    }
    // result += substring of i to i + 2 to encompass the string indexes
    result += str.substring(i, end);
  }
  return result;
}
// This one was tough !
