# ======================================
# Test File 1: Basic Python Constructs
# ======================================

# 1. Import Statements
from flask import Flask
from math import sqrt, pow

# 2. Simple Assignments
x = 10
y = 20
name = "Alice"
is_valid = True
nothing = None

# 3. List Literals
numbers = [1, 2, 3, 4, 5]
empty_list = []
mixed = [1, "hello", True]

# 4. Dictionary Literals
person = {"name": "Bob", "age": 30}
empty_dict = {}

# 5. Arithmetic Operations
result = x + y
difference = x - y
product = x * y
division = x / y
modulo = x % y

# 6. Comparison Operations
is_equal = x == y
not_equal = x != y
greater = x > y
less = x < y
greater_equal = x >= y
less_equal = x <= y

# 7. Logical Operations
condition1 = x > 5 and y < 30
condition2 = x > 100 or y < 100
negation = not is_valid

# 8. Function Definition (Simple)
def greet():
    return "Hello"

def add(a, b):
    return a + b

def multiply(x, y, z):
    result = x * y * z
    return result

# 9. If Statement
if x > 5:
    result = "big"

# 10. If-Else Statement
if y < 10:
    status = "small"
else:
    status = "large"

# 11. If-Elif-Else Statement
if x < 0:
    sign = "negative"
elif x == 0:
    sign = "zero"
else:
    sign = "positive"

# 12. While Loop
counter = 0
while counter < 5:
    counter = counter + 1

# 13. For Loop
for i in numbers:
    print(i)

for item in [1, 2, 3]:
    result = item * 2

# 14. Control Statements
for i in [1, 2, 3, 4, 5]:
    if i == 3:
        continue
    if i == 5:
        break
    pass

# 15. Function Call
result = add(10, 20)
greeting = greet()

# 16. Augmented Assignment
x += 5
y -= 3
x *= 2
y /= 4

# 17. Global Statement
global_var = 100

def use_global():
    global global_var
    global_var = 200

# 18. Attribute Access
app = Flask(__name__)
method = app.run

# 19. Index Access
first = numbers[0]
last = numbers[4]

# 20. Nested Expressions
complex_expr = (x + y) * (x - y)
nested_call = add(add(1, 2), add(3, 4))