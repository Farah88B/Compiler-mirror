from flask import Flask, render_template, request, redirect, url_for

app = Flask(__name__)

users = []
posts = []

# 1. Simple Route
@app.route("/")
def home():
    return "Welcome"

# 2. Route with Single Method
@app.route("/about", methods=["GET"])
def about():
    return render_template("about.html")

# 3. Route with Multiple Methods
@app.route("/contact", methods=["GET", "POST"])
def contact():
    if request.method == "POST":
        name = request.form["name"]
        email = request.form["email"]
        return "Success"
    return render_template("contact.html")

# 4. Route with URL Parameters
@app.route("/user/<int:id>")
def user_profile(id):
    return render_template("profile.html", user_id=id)

@app.route("/post/<string:slug>")
def post_detail(slug):
    return render_template("post.html", slug=slug)

# 5. Route with Multiple Parameters
@app.route("/category/<string:cat>/item/<int:item_id>")
def item_detail(cat, item_id):
    return render_template("item.html", category=cat, id=item_id)

# 6. Nested If in Route
@app.route("/admin", methods=["GET", "POST"])
def admin():
    if request.method == "POST":
        if request.form["action"] == "delete":
            users.append({"deleted": True})
        elif request.form["action"] == "edit":
            users.append({"edited": True})
        else:
            pass
    return render_template("admin.html")

# 7. Complex Data Processing
@app.route("/register", methods=["POST"])
def register():
    username = request.form["username"]
    password = request.form["password"]
    email = request.form.get("email")

    user = {
        "username": username,
        "password": password,
        "email": email,
        "active": True
    }

    users.append(user)
    return redirect(url_for("home"))

# 8. Loop in Route Function
@app.route("/users")
def list_users():
    result = []
    for user in users:
        if user["active"] == True:
            result.append(user)
    return render_template("users.html", users=result)

# 9. While in Route Function
@app.route("/process")
def process_data():
    counter = 0
    results = []
    while counter < len(users):
        results.append(users[counter])
        counter += 1
    return render_template("process.html", data=results)

# 10. Multiple Operations in Route
@app.route("/create", methods=["GET", "POST"])
def create_post():
    if request.method == "POST":
        title = request.form["title"]
        content = request.form["content"]
        tags = request.form.get("tags")

        post = {
            "title": title,
            "content": content,
            "tags": tags.split(",") if tags else []
        }

        posts.append(post)

        for tag in post["tags"]:
            print(tag)

        return redirect(url_for("list_posts"))

    return render_template("create.html")

# 11. Nested Routes (Multiple Decorators)
@app.route("/api/v1/data")
def api_data_v1():
    return {"version": 1, "data": users}

@app.route("/api/v2/data")
def api_data_v2():
    return {"version": 2, "data": users}

# 12. Route with Complex Logic
@app.route("/search", methods=["GET", "POST"])
def search():
    if request.method == "POST":
        query = request.form["query"]
        category = request.form.get("category")

        results = []

        for post in posts:
            if query in post["title"]:
                if category == None or post["category"] == category:
                    results.append(post)

        if len(results) > 0:
            return render_template("results.html", results=results)
        else:
            return render_template("no_results.html")

    return render_template("search.html")

# 13. App Configuration
app.config["DEBUG"] = True
app.config["SECRET_KEY"] = "my-secret"

# 14. App Run
if __name__ == "__main__":
    app.run(debug=True, host="0.0.0.0", port=5000)
