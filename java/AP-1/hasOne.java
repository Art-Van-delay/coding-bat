// Given a positive int n, return true if it contains a 1 digit. Note: use % to get the rightmost digit, and / to discard the rightmost digit.

// hasOne(10) → true
// hasOne(22) → false
// hasOne(220) → false

public boolean hasOne(int n) {
  boolean result = false;
  int length  = (int)(Math.log10(n)+1);
  
  for (int i = 0; i < length; i++) {
    if (n % 10 == 1) {
      result = true;
    }
    n /= 10;
  }
  
  return result;
}
