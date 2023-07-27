// Given a string, return true if it ends in "ly".

// endsLy("oddly") → true
// endsLy("y") → false
// endsLy("oddy") → false

public boolean endsLy(String str) {
  boolean result = false;
  if (str.length() <= 1) { return result; }
  String ly = "ly";
  if (str.substring(str.length()-2, str.length()).equals(ly)) { result = true; }
  return result;
}
