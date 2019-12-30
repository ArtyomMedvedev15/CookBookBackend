<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="../../css/style.css"/>
</head>
<body class="adminPage">
<section class="card-create">
    <div class="container">
        <div class="card">
            <div class="card-text-logo">
                <p>Add new recipe</p>
            </div>
            <div class="card-inner">
                <form name="Recipe" action="/CookBook_war/admin//Edit/${edtRecp.id}" method="post">
                    <input placeholder="Name recipe" id="first_name" value="${edtRecp.nameRecipe}" type="text" name="nameRecipe" required>
                    <input placeholder="Describe" id="last_name" value="${edtRecp.describe}" type="text" name="describe" required>
                    <input placeholder="Rating" id="last_name"value="${edtRecp.rating}" type="number" name="rating" required>
                    <input placeholder="imgPath" id="last_name" value="${edtRecp.imgPath}" type="text" name="imgPath" required>

                    <p id="depLog">Type Food: ${tpF}</p>
                    <select name="TypeFood" id="department_id" required>
                        <#list typefood as tf>
                            <option type="number" value="${tf.ordinal()}">${tf}</option>
                        </#list>
                    </select>

                    <p id="depLog">Type recipe: ${tpR}</p>
                    <select name="TypeRecipe" id="department_id" required>
                        <#list typerecipe as tr>
                            <option value="${tr.ordinal()}">${tr}</option>
                        </#list>
                    </select>

                    <p id="depLog">Type view: ${tpG}</p>
                    <select name="TypeGoal" id="department_id" required>
                        <#list typegoal as tg>
                            <option value="${tg.ordinal()}">${tg}</option>
                        </#list>
                    </select>
                    <div class="card-button">
                        <a class="default_btn" href="/CookBook_war/admin/listRecipes">Back</a>
                        <button type="submit" class="default-btn">Add</button>
                    </div>
                </form>
            </div>

        </div>
    </div>
</section>

</body>
</html>