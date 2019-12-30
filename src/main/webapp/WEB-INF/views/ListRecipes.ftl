<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>List of recipes</title>
    <link rel="stylesheet" href="../css/style.css"/>
</head>
<body class="adminPage">
    <section class="listSection">

        <a id="buttonAdminAdd" class="default-btn" href="/CookBook_war/admin/addNewRecipe">Add</a>
        <a id="buttonAdminBack" class="default-btn" href="/CookBook_war/">Back to site</a>

        <div class="container">
            <div class="text-section">
                <p>List of recipes</p>
            </div>
            <div class="table_of_employee">
                <table>
                    <tr>
                        <th>Id</th>
                        <th>Name Recipe</th>
                        <th>Describe</th>
                        <th>img path</th>
                        <th>Date add</th>
                        <th>Rating</th>
                        <th>TypeFoodId</th>
                        <th>TypeRecipeId</th>
                        <th>TypeViewId</th>
                        <th>Edit</th>
                        <th>Delete</th>
                    </tr>
                    <#list Recipes as res>
                        <tr>
                            <td><a href="#">${res.id}</a></td>
                            <td>${res.nameRecipe}</td>
                            <td>${res.describe}</td>
                            <td>${res.imgPath}</td>
                            <#if res.getDateCreate()??>
                            <td>${res.getDateCreate()}</td>
                            <#else>
                             Emplty
                            </#if>
                            <td>${res.rating}</td>
                            <td>${res.getTypeFood()}</td>
                            <td>${res.getTypeRecipe()}</td>
                            <td>${res.getTypeGoal()}</td>
                            <td><a class="default-btn" href="/CookBook_war/admin/Edit/${res.id}">Edit</a></td>
                            <td><a class="default-btn" href="/CookBook_war/admin/delete/${res.id}">Delete</a></td>
                        </tr>
                    </#list>
                </table>
            </div>
        </div>
    </section>
</body>
</html>