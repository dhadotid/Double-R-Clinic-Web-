<%-- 
    Document   : index
    Created on : Apr 9, 2018, 11:48:30 AM
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

</head>
    <body>
        <header>
            <input type="checkbox" id="tag-menu"/>
            <label class="menu-bar" for="tag-menu" data-toggle="tooltip" data-placement="bottom" title="Menu">R2 Clinic</label>
            <div class="jw-drawer">
                <nav>
                    <ul>
                        <li><a href="Dashboard.aspx">Dashboard</a></li>
                        <li><a href="Specialist.aspx">Specialist</a></li>
                        <li><a href="Doctor.jsp">Doctor</a></li>
                        <li><a href="Patient.aspx">Patient</a></li>
                        <li><a href="Treatment.aspx">Treatment</a></li>
                        <li><a href="Recipe.aspx">Recipe</a></li>
                        <!--
                        <li class="dropdown">
                            <a href="#" type="button" class="dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Recipe<span class="caret"></span></a>
                            <ul class="dropdown-menu dropdown-color">
                                <li><a href="#">Recipe Detail</a></li>
                            </ul>
                        </li>
                        !-->
                        <li><a href="Drug.aspx">Drug</a></li>
                        <li><a href="Payment.aspx">Payment</a></li>
                    </ul>
                </nav>
            </div>
            <ul class="white-color" style="float: right;" data-toggle="tooltip" data-placement="left" title="Account Setting">
                <li class="dropdown no-bullets" style="margin-right: 40px;">
                    <label class="menu-bar dropdown-toggle" for="tag-menu" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" id="tvNama2">Hi, Account<span class="caret"></span></label>
                    
                    <ul class="dropdown-menu dropdown-color">
                        <li><a href="#">Change Password</a></li>
                        <li>
                            <input type="" Text="Logout" ID="btnLogout" OnClick="btnLogout_Click">
                        </li>
                    </ul>
                </li>
            </ul>
        </header>

        
        <div class="content">
            <div class="four-grids" style="margin:0px;margin-right: 15px;margin-top: 15px;">
		<div class="col-md-3 four-grid">
			<div class="four-agileits">
				<div class="icon">
					<i class="glyphicon glyphicon-user" aria-hidden="true"></i>
				</div>
                                <div class="four-text">
                                    <h3>Registered Patient</h3>
                                    <h4 id="registeredPatient" runat="server">24</h4>					
                                </div>				
			</div>
		</div>
		<div class="col-md-3 four-grid">
			<div class="four-agileinfo">
				<div class="icon">
					<i class="fa fa-user-md" style="font-size:37px;color:white" aria-hidden="true"></i>
				</div>
				<div class="four-text">
					<h3>The Doctor</h3>
					<h4 id="theDoctor" runat="server">15</h4>
				</div>			
			</div>
		</div>
		<div class="col-md-3 four-grid">
			<div class="four-w3ls">
				<div class="icon">
					<i class="glyphicon glyphicon-plus" aria-hidden="true"></i>
				</div>
				<div class="four-text">
					<h3>Drug Avaible</h3>
					<h4 id="drugAvaible" runat="server">12</h4>			
				</div>		
			</div>
		</div>
		<div class="col-md-3 four-grid">
			<div class="four-wthree">
				<div class="icon">
					<i class="glyphicon glyphicon-credit-card" aria-hidden="true"></i>
				</div>
				<div class="four-text">
					<h3>Payment Success</h3>
					<h4 id="patientAlreadyPayment" runat="server">14</h4>				
				</div>		
			</div>
		</div>
		<div class="clearfix"></div>
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
