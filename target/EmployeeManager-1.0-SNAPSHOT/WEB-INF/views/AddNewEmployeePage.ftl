<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Add new employee</title>
    <link rel="stylesheet" href="https://res.cloudinary.com/dhs04wkdd/raw/upload/v1576917066/datepicker.min_iujm5q.css">
    <link rel="stylesheet" href="css/style.css">
</head>

<body>
<section class="card-create">
    <div class="container">
        <div class="card">
            <div class="card-text-logo">
                <p>Add new employee</p>
            </div>
            <div class="card-inner">
                <form name="Employee" action="/EmployeeManager_war/addEmployee" method="post" onsubmit="return onValidate()">
                    <input placeholder="First name" id="first_name" type="text" name="first_name" required>
                    <input placeholder="Last name" id="last_name" type="text" name="last_name" required>
                    <input placeholder="Date of birthday" type="text" class="datepicker-here"
                           data-position="right top" id="date_of_bitrh" name="date_of_bitrh" required/>
                    <input placeholder="Job title" name="job_title" id="job_title" type="text" required>
                    <p id="depLog">Department:</p>
                    <select aria-placeholder="Department" name="department_id" id="department_id" required>
                        <option value="1">1</option>
                        <option value="2">2</option>
                        <option value="3">3</option>
                    </select>
                    <p id="genLog">Gender:</p><select name="gender" id="gender" required>
                        <option value="MAN">MAN</option>
                        <option value="WOMAN">WOMAN</option>
                    </select>
                    <div class="card-button">
                        <a class="default_btn" href="/EmployeeManager_war/">Back</a>
                        <button type="submit" class="default_btn">Save</button>
                     </div>
                </form>
            </div>
        </div>
    </div>
</section>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.0/jquery.min.js"></script>
<script src="https://res.cloudinary.com/dhs04wkdd/raw/upload/v1576917147/datepicker.min_laq25i.js"></script>
<script src="../js/main.js"></script>
</body>

</html>