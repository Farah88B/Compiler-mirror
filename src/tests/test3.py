# ======================================
# Test File 2: Advanced Python Features
# ======================================

from flask import Flask, request

# 1. Class Definition
class Product:
    def __init__(self):
        self.name = "Unknown"
        self.price = 0

class User:
    def get_info(self):
        return "User Info"

# 2. Nested Function Calls
app = Flask(__name__)
result = str(int(float("123.45")))

# 3. Chained Attribute Access
form_data = request.form.get("username")
config_value = app.config.get("DEBUG")

# 4. Complex Indexing
matrix = [[1, 2], [3, 4]]
value = matrix[0][1]

# 5. Method Calls on Objects
items = [1, 2, 3]
items.append(4)
items.extend([5, 6])

text = "hello"
upper_text = text.upper()

# 6. Dictionary with Complex Values
config = {
    "host": "localhost",
    "port": 5000,
    "debug": True,
    "options": {
        "timeout": 30
    }
}

# 7. List with Complex Elements
users = [
    {"name": "Alice", "age": 25},
    {"name": "Bob", "age": 30},
    {"name": "Charlie", "age": 35}
]

# 8. Nested Control Flow
for user in users:
    if user["age"] > 30:
        status = "senior"
    else:
        for item in [1, 2, 3]:
            if item > 1:
                break

# 9. Complex Boolean Expressions
valid = x > 0 and y > 0 and z > 0
result = (a == b) or (c != d and e > f)
check = not (x > 10 or y < 5)

# 10. Multiple Function Parameters
def process(name, age, city, country):
    info = name + str(age)
    return info

def calculate(a, b, c, d, e):
    return a + b + c + d + e

# 11. Nested If-Elif-Else
if x > 100:
    if y > 200:
        result = "both high"
    else:
        result = "x high only"
elif x > 50:
    if y > 100:
        result = "both medium"
    elif y > 50:
        result = "x medium, y medium"
    else:
        result = "x medium, y low"
else:
    result = "x low"

# 12. While with Complex Condition
while counter < 100 and is_valid == True:
    counter += 1
    if counter > 50:
        is_valid = False

# 13. For with Multiple Operations
for i in range(10):
    result = i * 2
    if result > 10:
        result = result / 2
    else:
        result = result + 1

# 14. Expression as Statement
add(10, 20)
process("Alice", 25, "NYC", "USA")
items.append({"key": "value"})

# 15. Parenthesized Expressions
result = (a + b) * (c + d)
value = ((x * y) + (z * w)) / 2

# 16. Mixed Argument Types
app.route("/home", methods=["GET", "POST"])
dict_result = dict(name="Alice", age=25, city="NYC")

# 17. List with Expressions
calculated = [x + 1, y * 2, z - 3]
transformed = [item * 2 for item in numbers]  # Note: list comprehension might not be supported

# 18. Complex Assignment Right Side
total = sum([1, 2, 3, 4, 5])
user_data = request.form.get("user")

# 19. Global with Multiple Variables
def modify_globals():
    global x
    global y
    x = 100
    y = 200

# 20. Unary NOT on Complex Expressions
result = not (x > 10 and y < 20)
valid = not user.is_active()
