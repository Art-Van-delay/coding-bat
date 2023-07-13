// Given a non-empty string like "Code" return a string like "CCoCodCode".

// stringSplosion("Code") → "CCoCodCode"
// stringSplosion("abc") → "aababc"
// stringSplosion("ab") → "aab"

public String stringSplosion(String str) {
  String splode = "";
  String result = "";
  for (int i = 0; i < str.length() + 1; i++) {
    splode = str.substring(0, i);
    result += splode;
  }
  return result;
}
