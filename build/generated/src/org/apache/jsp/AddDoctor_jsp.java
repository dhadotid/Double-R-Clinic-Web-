package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import model.MDoctor;

public final class AddDoctor_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("        <title>Double R Clinic</title>\r\n");
      out.write("\r\n");
      out.write("        <link href=\"assets/dashboard/css/style.css\" rel=\"stylesheet\" />\r\n");
      out.write("        <link href=\"assets/css/bootstrap.min.css\" rel=\"stylesheet\"/>\r\n");
      out.write("        <link href=\"assets/css/Style.css\" rel=\"stylesheet\" />\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("        <script src=\"https://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.2.1.min.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"https://code.jquery.com/ui/1.12.1/jquery-ui.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"https://cdn.datatables.net/v/dt/dt-1.10.13/datatables.min.css\"/>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"https://cdn.datatables.net/v/dt/dt-1.10.13/datatables.min.js\"></script>\r\n");
      out.write("    <center>\r\n");
      out.write("    <h2>Add / Update Doctor</h2>\r\n");
      out.write("    </center>\r\n");
      out.write("    <br>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("    <form name=\"DoctorForm\" method=\"post\" action=\"Doctor\">\r\n");
      out.write("        <div class=\"container form-horizontal\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-7 col-md-offset-3\">\r\n");
      out.write("                <div class=\"custom\">\r\n");
      out.write("                    ");

                        String idDoctor;
                        MDoctor mDoc = new MDoctor();

                        idDoctor = mDoc.autoid();
                        
      out.write("\r\n");
      out.write("                    <fieldset disabled>\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                          <label class=\"col-md-3 control-label\" for=\"txtIdDoctor\">ID Doctor</label>\r\n");
      out.write("                          <div class=\"col-md-9\">\r\n");
      out.write("                              <input type=\"text\" id=\"txtID\" name=\"txtID\" required=\"required\" class=\"form-control col-md-7 col-xs-12\" value=\"");
      out.print(idDoctor);
      out.write("\">\r\n");
      out.write("                          </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </fieldset>\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                  <label class=\"col-md-3 control-label\" for=\"DDIdSpecialist\">ID Specialist</label>\r\n");
      out.write("                  <div class=\"col-md-9\">\r\n");
      out.write("                     <select name=\"specialist\">\r\n");
      out.write("                         ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                      </select> \r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                  <label class=\"col-md-3 control-label\" for=\"txtDoctorname\">Doctor Name</label>\r\n");
      out.write("                  <div class=\"col-md-9\">\r\n");
      out.write("                    <input type=\"text\" id=\"txtName\" name=\"txtName\" required=\"required\" class=\"form-control col-md-7 col-xs-12\" value=\"\">\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                  <label class=\"col-md-3 control-label\" for=\"gender\">Gender</label>\r\n");
      out.write("                  <div class=\"col-md-9\">\r\n");
      out.write("                    <input type=\"radio\" name=\"gender\" value=\"male\"> Male\r\n");
      out.write("                    <input type=\"radio\" name=\"gender\" value=\"female\"> Female\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                  <label class=\"col-md-3 control-label\" for=\"txtDateofbirth\">Date of Birth</label>\r\n");
      out.write("                  <div class=\"col-md-9\">\r\n");
      out.write("                      <input type=\"date\" name=\"dob\">\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                  <label class=\"col-md-3 control-label\" for=\"txtPhonenumber\">Phone Number</label>\r\n");
      out.write("                  <div class=\"col-md-9\">\r\n");
      out.write("                    <input type=\"text\" id=\"txtPhone\" name=\"txtPhone\" required=\"required\" class=\"form-control col-md-7 col-xs-12\" value=\"\">\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                              ");

                              String status;
                          status = request.getParameter("status");
                          if(status != null){
                            if(status.equals("Add") && status != null){
      out.write("\r\n");
      out.write("                               <div class=\"form-group\">\r\n");
      out.write("                  <div class=\"col-md-12 text-right\">\r\n");
      out.write("                      <input type=\"submit\" value=\"Save\" name=\"Btn\">\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>");

                            }else if(status.equals("Update") && status != null){
      out.write("\r\n");
      out.write("                               <div class=\"form-group\">\r\n");
      out.write("                                <div class=\"col-md-12 text-right\">\r\n");
      out.write("                                    <input type=\"submit\" value=\"Update\" name=\"Btn\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                              </div> \r\n");
      out.write("                            }\r\n");
      out.write("                          }\r\n");
      out.write("                              %>\r\n");
      out.write("                \r\n");
      out.write("                </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </form>\r\n");
      out.write("    <script src=\"assets/js/jquery-3.1.1.min.js\"></script>\r\n");
      out.write("    <script src=\"assets/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("      $(document).ready(function(){\r\n");
      out.write("        $('.table').DataTable();\r\n");
      out.write("      });\r\n");
      out.write("    </script>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("        $(function () {\r\n");
      out.write("            $('[data-toggle=\"tooltip\"]').tooltip()\r\n");
      out.write("        })\r\n");
      out.write("    </script>\r\n");
      out.write("                    \r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("dropdownValue");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dropdownList}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                             <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dropdownValue}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\r\n");
          out.write("                                 ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dropdownValue}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\r\n");
          out.write("                             </option>\r\n");
          out.write("                         ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
