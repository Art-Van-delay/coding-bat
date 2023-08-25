# Given a string, return a new string where the first and last chars have been exchanged.

# front_back('code') → 'eodc'
# front_back('a') → 'a'
# front_back('ab') → 'ba'

def front_back(str):
    front = str[0:1]
    back = str[len(str)-1:len(str)]
    middle = str[1:len(str)-1]
    if (len(str) < 2):
        return str
    return back + middle + front
