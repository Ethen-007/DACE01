def next_greater_number(n):
    digits = list(str(n))
    length = len(digits)

    i = length - 2
    while i>=0 and digits[i] >=digits[i+1]:
        i-=1
    if i == -1:
        return -1

    j = length - 1
    while j>=0 and digits[j]<=digits[i]:
        j-=1
    
    digits[i], digits[j] = digits[j], digits[i]

    left, right = i+1, length-1
    while left < right:
        digits[left], digits[right] = digits[right], digits[left]
        left+=1
        right-=1

    return int("".join(digits))
