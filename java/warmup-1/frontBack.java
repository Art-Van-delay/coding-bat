// Given a string, return a new string where the first and last chars have been exchanged.

// frontBack("code") → "eodc"
// frontBack("a") → "a"
// frontBack("ab") → "ba"

public String frontBack(String str) {
  String[] newStr = str.split("");
  String first = newStr[0];
  String last = newStr[newStr.length - 1];
  newStr[0] = last;
  newStr[newStr.length - 1] = first;

  return String.join("", newStr);
}
