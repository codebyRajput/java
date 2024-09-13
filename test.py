def replace_zero_with_five(n):
    result = 0
    multiplier = 1

    while n > 0:
        digit = n % 10
        if digit == 0:
            result += 5 * multiplier
        else:
            result += digit * multiplier
        multiplier *= 10
        n //= 10

    return result

n = int(input("Enter an integer n: "))
result = replace_zero_with_five(n)
print("All zeroes are replaced with 5:", result)
