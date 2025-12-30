# ======================================
# Test File 4: Complex Nested Structures
# ======================================

from flask import Flask

# 1. Deep Nesting - Control Flow
def complex_logic(x, y, z):
    if x > 0:
        if y > 0:
            if z > 0:
                result = "all positive"
            else:
                result = "z negative"
        else:
            if z > 0:
                result = "y negative"
            else:
                result = "y and z negative"
    else:
        if y > 0:
            if z > 0:
                result = "x negative"
            else:
                result = "x and z negative"
        elif y == 0:
            result = "x negative, y zero"
        else:
            result = "x and y negative"
    return result

# 2. Complex Data Structure
database = {
    "users": [
        {
            "id": 1,
            "name": "Alice",
            "posts": [
                {"id": 1, "title": "First Post"},
                {"id": 2, "title": "Second Post"}
            ]
        },
        {
            "id": 2,
            "name": "Bob",
            "posts": []
        }
    ],
    "settings": {
        "theme": "dark",
        "language": "en"
    }
}

# 3. Multiple Nested Loops
def process_matrix():
    matrix = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
    result = []

    for row in matrix:
        for item in row:
            if item > 5:
                result.append(item * 2)
            else:
                result.append(item)

    return result

# 4. Nested While Loops
def nested_while():
    i = 0
    result = []

    while i < 3:
        j = 0
        while j < 3:
            result.append(i * 3 + j)
            j += 1
        i += 1

    return result

# 5. Mixed Loops
def mixed_loops():
    outer = [1, 2, 3]
    inner = [4, 5, 6]
    result = []

    for i in outer:
        counter = 0
        while counter < len(inner):
            result.append(i + inner[counter])
            counter += 1

    return result

# 6. Complex Method Chaining
text = "hello world"
result = text.upper().replace("WORLD", "PYTHON").split(" ")

# 7. Nested Indexing
data = {
    "users": {
        "1": {
            "posts": [
                {"title": "Post 1"},
                {"title": "Post 2"}
            ]
        }
    }
}

title = data["users"]["1"]["posts"][0]["title"]

# 8. Complex Function with Everything
def mega_function(a, b, c, d):
    global global_var

    result = []
    temp = a + b

    if temp > 10:
        for i in [1, 2, 3]:
            if i > 1:
                temp = temp * i
            else:
                temp = temp + i
    else:
        while temp < 20:
            temp += c
            if temp == 15:
                break

    for item in [d, d * 2, d * 3]:
        if item > 5:
            result.append(item)
        elif item == 5:
            continue
        else:
            pass

    return result

# 9. Nested Function Definitions
def outer_function():
    x = 10

    def inner_function():
        return x + 5

    return inner_function()

# 10. Complex Boolean Expressions
def check_conditions(a, b, c, d, e):
    condition1 = (a > 5 and b < 10) or (c == 0)
    condition2 = not (d > 0 or e < 0)
    condition3 = ((a + b) > 10) and ((c - d) < 5)

    if condition1 and condition2:
        result = "both true"
    elif condition1 or condition3:
        result = "at least one true"
    else:
        result = "all false"

    return result

# 11. Complex List Operations
numbers = [1, 2, 3, 4, 5]
numbers.append(6)
numbers.extend([7, 8, 9])
first = numbers[0]
last = numbers[8]
subset = numbers[2]

# 12. Complex Dictionary Operations
person = {
    "name": "Alice",
    "details": {
        "age": 30,
        "address": {
            "city": "NYC",
            "zip": "10001"
        }
    }
}

city = person["details"]["address"]["city"]

# 13. Deeply Nested Flask Route
app = Flask(__name__)

@app.route("/complex/<int:id>", methods=["GET", "POST"])
def complex_route(id):
    if id > 0:
        if id < 100:
            for i in [1, 2, 3]:
                if i == id:
                    result = "found"
                    break
            else:
                result = "not found"
        else:
            result = "too large"
    else:
        result = "invalid"

    return result

# 14. All Operations Combined
def ultimate_test(x, y, z):
    global counter

    result = {
        "sum": x + y + z,
        "product": x * y * z,
        "checks": []
    }

    for i in [x, y, z]:
        if i > 0:
            result["checks"].append(True)
        else:
            result["checks"].append(False)

    counter = 0
    while counter < 10:
        if counter == 5:
            break
        counter += 1

    return result
