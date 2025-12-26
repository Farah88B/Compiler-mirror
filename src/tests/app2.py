from flask import Flask, render_template, request

app = Flask(__name__)

products = []

@app.route("/")
def index():
    return render_template("index.html", products=products)

@app.route("/add", methods=["GET", "POST"])
def add():
    if request.method == "POST":
        products.append({
            "name": request.form["name"],
            "price": request.form["price"]
        })
    return render_template("add_product.html")

@app.route("/details/<int:i>")
def details(i):
    return render_template("product_details.html", product=products[i])

app.run(debug=True)
