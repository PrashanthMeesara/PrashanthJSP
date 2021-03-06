package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <title>Regna Bootstrap Template</title>\n");
      out.write("  <meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\">\n");
      out.write("  <meta content=\"\" name=\"keywords\">\n");
      out.write("  <meta content=\"\" name=\"description\">\n");
      out.write("\n");
      out.write("  <!-- Favicons -->\n");
      out.write("  <link href=\"img/favicon.png\" rel=\"icon\">\n");
      out.write("  <link href=\"img/apple-touch-icon.png\" rel=\"apple-touch-icon\">\n");
      out.write("\n");
      out.write("  <!-- Google Fonts -->\n");
      out.write("  <link href=\"https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,700,700i|Poppins:300,400,500,700\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("  <!-- Bootstrap CSS File -->\n");
      out.write("  <link href=\"lib/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("  <!-- Libraries CSS Files -->\n");
      out.write("  <link href=\"lib/font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("  <link href=\"lib/animate/animate.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("  <!-- Main Stylesheet File -->\n");
      out.write("  <link href=\"css/style.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("  <!-- =======================================================\n");
      out.write("    Theme Name: Regna\n");
      out.write("    Theme URL: https://bootstrapmade.com/regna-bootstrap-onepage-template/\n");
      out.write("    Author: BootstrapMade.com\n");
      out.write("    License: https://bootstrapmade.com/license/\n");
      out.write("  ======================================================= -->\n");
      out.write("</head>\n");
      out.write("    <body>\n");
      out.write("        <header id=\"header\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <nav id=\"nav-menu-container\">\n");
      out.write("        <ul class=\"nav-menu\">\n");
      out.write("          <li class=\"menu-active\"><a href=\"#hero\">Home</a></li>\n");
      out.write("           <li><a href=\"#register\">Register</a></li>\n");
      out.write("          <li><a href=\"#login\">Login</a></li>\n");
      out.write("         \n");
      out.write("        </ul>\n");
      out.write("      </nav><!-- #nav-menu-container -->\n");
      out.write("    </div>\n");
      out.write("  </header><!-- #header -->\n");
      out.write("\n");
      out.write("  <!--==========================\n");
      out.write("    Hero Section\n");
      out.write("  ============================-->\n");
      out.write("  <section id=\"hero\">\n");
      out.write("    <div class=\"hero-container\">\n");
      out.write("      <h1>Welcome to Student Portal</h1>  \n");
      out.write("    </div>\n");
      out.write("  </section>\n");
      out.write("  <main id=\"main\">\n");
      out.write(" <!--==========================\n");
      out.write("      Team Section\n");
      out.write("    ============================-->\n");
      out.write(" <section id=\"register\">\n");
      out.write("      <div class=\"container wow fadeInUp\">\n");
      out.write("        <div class=\"section-header\">\n");
      out.write("          <h3 class=\"section-title\">Register</h3>\n");
      out.write("          <p class=\"section-description\">Enter you Details to Register</p>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"container wow fadeInUp\">\n");
      out.write("        <div class=\"row justify-content-center\">\n");
      out.write("            <form action=\"Register\" method=\"post\" role=\"form\" class=\"contactForm\">\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                  <input type=\"text\" name=\"firstname\" class=\"form-control\" id=\"firstname\" placeholder=\"First Name\" data-rule=\"minlen:4\" data-msg=\"Please enter Your First Name\" />\n");
      out.write("                  <div class=\"validation\"></div>\n");
      out.write("                </div>\n");
      out.write("                 <div class=\"form-group\">\n");
      out.write("                  <input type=\"text\" name=\"lastname\" class=\"form-control\" id=\"lastname\" placeholder=\"Last Name\" data-rule=\"minlen:4\" data-msg=\"Please enter Your Last Name\" />\n");
      out.write("                  <div class=\"validation\"></div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                  <input type=\"text\" name=\"username\" class=\"form-control\" id=\"lastname\" placeholder=\"User Name\" data-rule=\"minlen:4\" data-msg=\"Please enter Your User Name\" />\n");
      out.write("                  <div class=\"validation\"></div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                  <input type=\"password\" name=\"password\" class=\"form-control\" id=\"lastname\" placeholder=\"Password\" data-rule=\"minlen:4\" data-msg=\"Please enter Your Password\" />\n");
      out.write("                  <div class=\"validation\"></div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                  <input type=\"password\" name=\"confirmpassword\" class=\"form-control\" id=\"lastname\" placeholder=\"Retype Password\" data-rule=\"minlen:4\" data-msg=\"Please re-enter Your Password\" />\n");
      out.write("                  <div class=\"validation\"></div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                  <input type=\"email\" class=\"form-control\" name=\"email\" id=\"email\" placeholder=\"Your Email\" data-rule=\"email\" data-msg=\"Please enter a valid email\" />\n");
      out.write("                  <div class=\"validation\"></div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                  <input type=\"text\" class=\"form-control\" name=\"course\" id=\"subject\" placeholder=\"Course Name\" data-rule=\"minlen:4\" data-msg=\"Please enter your course name\" />\n");
      out.write("                  <div class=\"validation\"></div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"text-center\"><button type=\"submit\" name=\"Register\">Register</button></div>\n");
      out.write("                 <p class=\"section-description\"></p>\n");
      out.write("              </form>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </section>\n");
      out.write(" <footer id=\"footer\">\n");
      out.write("    <div class=\"footer-top\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    \n");
      out.write("  </footer>\n");
      out.write(" <section id=\"login\">\n");
      out.write("      <div class=\"container wow fadeInUp\">\n");
      out.write("        <div class=\"section-header\">\n");
      out.write("          <h3 class=\"section-title\"></h3>\n");
      out.write("          <p class=\"section-description\"></p>\n");
      out.write("        </div><div class=\"section-header\">\n");
      out.write("          <h3 class=\"section-title\">Login</h3>\n");
      out.write("          <p class=\"section-description\">Enter you Username and Password to Login</p>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"container wow fadeInUp\">\n");
      out.write("        <div class=\"row justify-content-center\">\n");
      out.write("            <form action=\"login\" method=\"post\" role=\"form\" class=\"contactForm\">\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                  <input type=\"text\" name=\"loginusername\" class=\"form-control\" id=\"name\" placeholder=\"User Name\" data-rule=\"minlen:4\" data-msg=\"Please enter your username\" />\n");
      out.write("                  <div class=\"validation\"></div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                  <input type=\"password\" name=\"loginpassword\" class=\"form-control\" id=\"name\" placeholder=\"Password\" data-rule=\"minlen:4\" data-msg=\"Please enter your password\" />\n");
      out.write("                  <div class=\"validation\"></div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"text-center\"><button type=\"submit\" name=\"login\">Login</button></div>\n");
      out.write("                <p class=\"section-description\"></p>\n");
      out.write("              </form>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("<footer id=\"footer\">\n");
      out.write("    <div class=\"footer-top\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    \n");
      out.write("  </footer><!-- #footer -->\n");
      out.write("\n");
      out.write("  <a href=\"#\" class=\"back-to-top\"><i class=\"fa fa-chevron-up\"></i></a>\n");
      out.write("\n");
      out.write("  <!-- JavaScript Libraries -->\n");
      out.write("  <script src=\"lib/jquery/jquery.min.js\"></script>\n");
      out.write("  <script src=\"lib/jquery/jquery-migrate.min.js\"></script>\n");
      out.write("  <script src=\"lib/bootstrap/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("  <script src=\"lib/easing/easing.min.js\"></script>\n");
      out.write("  <script src=\"lib/wow/wow.min.js\"></script>\n");
      out.write("  <script src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyD8HeI8o-c1NppZA-92oYlXakhDPYR7XMY\"></script>\n");
      out.write("\n");
      out.write("  <script src=\"lib/waypoints/waypoints.min.js\"></script>\n");
      out.write("  <script src=\"lib/counterup/counterup.min.js\"></script>\n");
      out.write("  <script src=\"lib/superfish/hoverIntent.js\"></script>\n");
      out.write("  <script src=\"lib/superfish/superfish.min.js\"></script>\n");
      out.write("\n");
      out.write("  <!-- Contact Form JavaScript File -->\n");
      out.write("  <script src=\"contactform/contactform.js\"></script>\n");
      out.write("\n");
      out.write("  <!-- Template Main Javascript File -->\n");
      out.write("  <script src=\"js/main.js\"></script>\n");
      out.write("    </section>\n");
      out.write("        <h1>Hello World!</h1>\n");
      out.write("        <form action=\"login\" method=\"post\" role=\"form\" class=\"contactForm\">\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                  <input type=\"text\" name=\"loginusername\" class=\"form-control\" id=\"name\" placeholder=\"User Name\" data-rule=\"minlen:4\" data-msg=\"Please enter your username\" />\n");
      out.write("                  <div class=\"validation\"></div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                  <input type=\"password\" name=\"loginpassword\" class=\"form-control\" id=\"name\" placeholder=\"Password\" data-rule=\"minlen:4\" data-msg=\"Please enter your password\" />\n");
      out.write("                  <div class=\"validation\"></div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"text-center\"><button type=\"submit\" name=\"login\">Login</button></div>\n");
      out.write("                <p class=\"section-description\"></p>\n");
      out.write("              </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("    \n");
      out.write("\n");
      out.write("           ");
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
}
