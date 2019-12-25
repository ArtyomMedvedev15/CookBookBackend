$( function() {
    $( "#datepicker" ).datepicker();
  } 

  );
  function onValidate(){
    var first_name = document.getElementById("first_name")
    var last_name = document.getElementById("last_name");
    var department_id = document.getElementById("department_id");
    var job_title = document.getElementById("job_title");
    var gender = document.getElementById("gender");
    var dates = document.getElementById("date_of_bitrh");

    if(first_name.value.trim()==""||last_name.value.trim()==""
    ||department_id.value.trim()==""||job_title.value.trim()==""
    ||gender.value.trim()==""||dates.value.trim()==""){
        alert("Something went wrong check the data is correct");
        return false;
    }else{
        return true;
    }
}
 