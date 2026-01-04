# ==========================================
# Test File: The Ultimate Python Compilation Test
# ==========================================
# الغرض: اختبار جميع ميزات المشروع (OOP, Decorators, Complex Attributes)
# ==========================================

from flask import Flask, request

# ==========================================
# 1. OOP: Classes and Methods
# ==========================================
class DataProcessor:


    def __init__(self):
        self.processed = 0

    def add(self, x, y):
        return x + y

# ==========================================
# 2. Decorators: Flask Routes
# ==========================================

# Route بسيط
@app.route("/")
def home():
    return "Home Page"

# Route مع وسائط (NamedArg)
@app.route("/calculate", methods=["POST"])
def calculate_page():
    return "Calculation Page"

# Route مع باراميترات في المسار (مثل id في Flask)
@app.route("/user/<int:id>")
def get_user(id):
    return f"User {id}"

# ==========================================
# 3. Chained Attribute Access (Critical Test)
# ==========================================
# اختبار خاص: تأكد أن AST قادر على تفسير:
# app -> config -> get() -> ("debug")
# المسار في AST: AttributeNode -> AttributeNode -> CallExpr
config_value = app.config.get("debug_mode")

# ==========================================
# 4. Nested Function Calls
# ==========================================
# اختبار خاص: تأكد أن AST يبني:
# Call(str) -> Call(int) -> Literal("123")
result = str(int("12345"))

# ==========================================
# 5. Classes with Decorators (Complex Scenario)
# ==========================================
processor = DataProcessor()

@app.route("/process")
def process_data():
    # استخدام الكائن المُنشأ
    total = processor.add(10, 20)
    return total

# ==========================================
# 6. Nested Control Flow in Methods
# ==========================================
class ComplexLogic:
    def evaluate(self, score):
        if score > 50:
            return "Pass"
        elif score > 30:
            return "Average"
        else:
            return "Fail"

logic = ComplexLogic()

@app.route("/eval")
def evaluation_route():
    user_score = 45
    result = logic.evaluate(user_score)
    return result

# ==========================================
# 7. Complex Dictionary and Indexing
# ==========================================
@app.route("/details")
def details():
    data = {
        "user": "Alice",
        "meta": {
            "active": True
        }
    }
    # الوصول المزدوج للقواميس والفهارس
    # data -> ["meta"] -> ["active"]
    is_active = data["meta"]["active"]
    return is_active

# ==========================================
# 8. Nested Expressions (Parenthesis)
# ==========================================
# يجب أن تُحفظ الأولوية: القسمة قبل الجمع
# Tree: BinaryOp(*, left=BinaryOp(+, ...), right=...)
complex_val = (10 + 20) * (5 + 5)

@app.route("/math")
def math_route():
    return complex_val

# ==========================================
# 9. Final Run (Expression Statement)
# ==========================================
# اختبار تعبير كامل كجملة
if __name__ == "__main__":
    app.run(debug=True)