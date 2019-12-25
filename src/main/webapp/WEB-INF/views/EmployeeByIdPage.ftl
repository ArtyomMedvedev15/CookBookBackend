<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Special employee by id ${Empl.id}</title>
    <link rel="stylesheet" href="../css/style.css"/>
</head>

<body>
<section class="card-create">
    <div class="container">
        <div class="card">
            <div class="card-text-logo">
                <p>Special employee by id ${Empl.id}</p>
            </div>
            <div class="card-inner">
                <input placeholder="First name" value="${Empl.first_name}" type="text" readonly>
                <input placeholder="Last name" type="text" value="${Empl.last_name}" readonly>
                <input placeholder="Date of birthday" type='text' value="${Empl.date_of_bitrh}" readonly />
                <input placeholder="Job title" type="text" value="${Empl.job_title}" readonly>
                <input placeholder="Department" type="text" value="${Empl.department_id}" readonly>
                <input placeholder="Gender" type="text" value="${Empl.gender}" readonly>
                <div class="card-button">
                    <a class="default_btn" href="/EmployeeManager_war/">Back</a>
                </div>
            </div>

        </div>
    </div>
</section>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.0/jquery.min.js"></script>
 </body>

</html>