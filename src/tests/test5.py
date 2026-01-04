# ======================================
# Test File 5: Edge Cases & Stress Tests
# ======================================

# 1. Empty Structures
empty_list = []
empty_dict = {}
empty_string = ""

# 2. Single Element
single_list = [1]
single_dict = {"key": "value"}

# 3. Very Long Expressions
long_expr = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10
long_mult = 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2

# 4. Many Parameters
def many_params(a, b, c, d, e, f, g, h, i, j):
    return a + b + c + d + e + f + g + h + i + j

# 5. Many Arguments
result = many_params(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

# 6. Deep Nesting (10 levels)
if True:
    if True:
        if True:
            if True:
                if True:
                    if True:
                        if True:
                            if True:
                                if True:
                                    if True:
                                        result = "deep"

# 7. Empty Function Bodies
def empty1():
    pass

def empty2():
    pass

# 8. Function Returning Function Call
def chain1():
    return chain2()

def chain2():
    return chain3()

def chain3():
    return "end"

# 9. Multiple Elif
if x == 1:
    result = "one"
elif x == 2:
    result = "two"
elif x == 3:
    result = "three"
elif x == 4:
    result = "four"
elif x == 5:
    result = "five"
elif x == 6:
    result = "six"
else:
    result = "other"

# 10. Many Global Declarations
def use_many_globals():
    global a
    global b
    global c
    global d
    global e
    a = 1
    b = 2
    c = 3

# 11. Complex Attribute Chains
value = obj.attr1.attr2.attr3.attr4.attr5

# 12. Complex Index Chains
value = list1[0][1][2][3]

# 13. Mixed Chains
value = obj.attr[0].method()[1].field

# 14. All Boolean Operators
complex = (a and b) or (c and d) or (e and f)
complex2 = not (a or b) and not (c or d)

# 15. Expression with All Operators
result = ((a + b - c) * d / e) % f

# 16. Comparison Chains
check = a < b < c < d
check2 = x == y == z

# 17. Augmented Assignment on Complex
obj.attr[0] += 5
dict_item["key"] += 10

# 18. Call with No Arguments
result1 = func()
result2 = method()

# 19. Call with Only Named Arguments
result = func(a=1, b=2, c=3, d=4)

# 20. Mixed Everything
def stress_test():
    global x, y, z

    a = [1, 2, 3]
    b = {"key": "value"}

    for i in a:
        if i > 1:
            while i < 10:
                i += 1
                if i == 5:
                    break
        else:
            pass

    c = (1 + 2) * (3 - 4) / (5 % 2)

    return a, b, c
