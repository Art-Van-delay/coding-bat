# def make_out_word(out, word):
#   return out[0:2] + word + out[len(out)-2:len(out)]

def extra_end(str):
    end = str[len(str) - 2:len(str)]

    return end * 3
