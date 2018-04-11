<%-- 
    Document   : AddDoctor
    Created on : Apr 10, 2018, 11:52:36 PM
    Author     : GR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Double R Clinic</title>

        <link href="assets/dashboard/css/style.css" rel="stylesheet" />
        <link href="assets/css/bootstrap.min.css" rel="stylesheet"/>
        <link href="assets/css/Style.css" rel="stylesheet" />
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.2.1.min.js"></script>
        <script type="text/javascript" src="https://code.jquery.com/ui/1.12.1/jquery-ui.min.js"></script>

        <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/v/dt/dt-1.10.13/datatables.min.css"/>
        <script type="text/javascript" src="https://cdn.datatables.net/v/dt/dt-1.10.13/datatables.min.js"></script>
    <center>
    <h2>Add / Update Doctor</h2>
    </center>
    <br>
    </head>
    <body>
    <form name="ADform" method="post" action="cAdmin">
        <div class="container form-horizontal">
            <div class="row">
                <div class="col-md-7 col-md-offset-3">
                <div class="custom">
                    <fieldset disabled>
                        <div class="form-group">
                          <label class="col-md-3 control-label" for="txtIdDoctor">ID Doctor</label>
                          <div class="col-md-9">
                              <input type="text" id="txtID" name="txtID" required="required" class="form-control col-md-7 col-xs-12">
                          </div>
                        </div>
                    </fieldset>
                
                <div class="form-group">
                  <label class="col-md-3 control-label" for="DDIdSpecialist">ID Specialist</label>
                  <div class="col-md-9">
                     <select name="specialist">
                        <option value="General">General</option>
                        <option value="Hati">Hati</option>
                      </select> 
                  </div>
                </div>
                
                <div class="form-group">
                  <label class="col-md-3 control-label" for="txtDoctorname">Doctor Name</label>
                  <div class="col-md-9">
                    <input type="text" id="txtName" name="txtName" required="required" class="form-control col-md-7 col-xs-12" value="">
                  </div>
                </div>

                <div class="form-group">
                  <label class="col-md-3 control-label" for="gender">Gender</label>
                  <div class="col-md-9">
                    <input type="radio" name="gender" value="male"> Male
                    <input type="radio" name="gender" value="female"> Female
                  </div>
                </div>
                
                <div class="form-group">
                  <label class="col-md-3 control-label" for="txtDateofbirth">Date of Birth</label>
                  <div class="col-md-9">
                      <input type="date" name="dob">
                  </div>
                </div>

                <div class="form-group">
                  <label class="col-md-3 control-label" for="txtPhonenumber">Phone Number</label>
                  <div class="col-md-9">
                    <input type="text" id="txtPhone" name="txtPhone" required="required" class="form-control col-md-7 col-xs-12" value="">
                  </div>
                </div>

                <div class="form-group">
                  <div class="col-md-12 text-right">
                      <input type="submit" value="Save">
                  </div>
                </div>
                </div>
                </div>
            </div>
        </div>
    </form>
    <script src="assets/js/jquery-3.1.1.min.js"></script>
    <script src="assets/js/bootstrap.min.js"></script>
    <script type="text/javascript">
      $(document).ready(function(){
        $('.table').DataTable();
      });
    </script>
    <script type="text/javascript">
        $(function () {
            $('[data-toggle="tooltip"]').tooltip()
        })
    </script>
                    
    </body>
</html>
