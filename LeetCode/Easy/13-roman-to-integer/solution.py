class Solution(object):
    def romanToInt(self, s):
       roman_to_int={
        'I':1 ,'V':5,'X':10,'L':50,'M':1000,'D':500,'C':100
       } 
       t_v=0
       p_v=0
       for char in reversed(s):
        c_v=roman_to_int[char]
        if c_v<p_v:
            t_v-=c_v
        else:
                t_v+=c_v
                p_v=c_v
       return t_v

