<!DOCTYPE html>
<html lang="en" xmlns="http://www.w3.org/1999/html">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>List of employee</title>
    <link rel="stylesheet" href="css/style.css"/>
</head>
<body>
<section class="listSection">
    <div class="container">
        <div class="text-section">
            <p>List of employees</p>
        </div>
        <div class="add_btn">
            <a id="add-btn" href="/EmployeeManager_war/addEmployee" class="default_btn">Add</a>
        </div>
        <div class="table_of_employee">
            <table>
                <tr>
                    <th>Id</th>
                    <th>Firstname</th>
                    <th>Lastname</th>
                    <th>Department id</th>
                    <th>Job title</th>
                    <th>Gender</th>
                    <th>Date of birth</th>
                    <th>Edit</th>
                    <th>Delete</th>
                </tr>

                    <#list Employeers as empl>
                        <tr>
                    <td><a href="/EmployeeManager_war/employee/${empl.id}">${empl.id}</a></td>
                    <td>${empl.first_name}</td>
                    <td>${empl.last_name}</td>
                    <td>${empl.department_id}</td>
                    <td>${empl.job_title}</td>
                    <td>${empl.gender}</td>
                    <td>${empl.date_of_bitrh}</td>
                    <td><a class="default_btn" href="/EmployeeManager_war/edit/${empl.id}">Edit</a></td>
                    <td><a class="default_btn" href="/EmployeeManager_war/delete/${empl.id}">Delete</a></td>
                        </tr>
                    </#list>

            </table>
        </div>
    </div>
</section>
</body>
</html>