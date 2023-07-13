// Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".

// doubleX("axxbb") → true
// doubleX("axaxax") → false
// doubleX("xxxxx") → true

boolean doubleX(String str) {
  boolean result = false;
  if (str.length() < 1) result = false;
  for (int i = 0; i < str.length() - 1; i++) {
  // extra conditional for first instance of x check
    if (str.charAt(i) == 'x' && str.charAt(i + 1) != 'x') {
        break;
      } else if (str.charAt(i) == 'x' && str.charAt(i + 1) == 'x') {
        result = true;
      }
  }
  
  return result;
}
