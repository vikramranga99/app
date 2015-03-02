package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class uploadFile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/views/header.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fspring_005furl_0026_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fspring_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fspring_005furl_0026_005fvalue_005fnobody.release();
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("  <head>\r\n");
      out.write("   \t\r\n");
      out.write("   \t<title>File Stash</title> \r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width; initial-scale=1.0; maximum-scale=1.0; user-scalable=yes;\" />\r\n");
      out.write("\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("\t<meta name=\"description\" content=\"\">\r\n");
      out.write("    <meta name=\"author\" content=\"\">\r\n");
      out.write("    <meta name=\"apple-mobile-web-app-title\" content=\"File Stash\" />\r\n");
      out.write("\t\r\n");
      out.write("\t<link rel=\"icon\" href=\"");
      if (_jspx_meth_spring_005furl_005f0(_jspx_page_context))
        return;
      out.write("\">\r\n");
      out.write("\t<link rel=\"apple-touch-icon\" href=\"");
      if (_jspx_meth_spring_005furl_005f1(_jspx_page_context))
        return;
      out.write("\">\t\t\t\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      if (_jspx_meth_spring_005furl_005f2(_jspx_page_context))
        return;
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("  \t<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js\"></script>\r\n");
      out.write("\t<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js\"></script>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t    \r\n");
      out.write("\t$( document ).ready(function() {\r\n");
      out.write("\t\t//setUser('UNKNOWN');\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\t    function setUser(userNameToSet){\t    \t\r\n");
      out.write("\t    \t$.get('setUser?userName='+userNameToSet).done(function(){\r\n");
      out.write("\t    \t\t$( \"#userDetails\" ).empty();\r\n");
      out.write("\t\t    \tif(userNameToSet==''){\t\t    \t\t\r\n");
      out.write("\t\t    \t\t$( \"#userDetails\" ).append( \"<br><p>Who are you?</p>\");\t\r\n");
      out.write("\t\t    \t}else{\r\n");
      out.write("\t\t    \t\t$( \"#userDetails\" ).append( \"<p>Welcome \"+userNameToSet+\"</p>\");\r\n");
      out.write("\t\t    \t}\t\t    \t\r\n");
      out.write("\t\t    \t//location.reload();\r\n");
      out.write("\t    \t});\r\n");
      out.write("\t    }\t    \t    \r\n");
      out.write("\t</script>\r\n");
      out.write("\t<style>\r\n");
      out.write("\t.userDetails{\r\n");
      out.write("\t  color:white;\r\n");
      out.write("\t}\r\n");
      out.write("\t</style>\r\n");
      out.write("\t</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<!-- Page CSS -->\r\n");
      out.write("<!-- Page Jave Script -->\r\n");
      out.write("<script>\r\n");
      out.write("$(document).ready( function() {\r\n");
      out.write("\t$( \"#fileLoadBtn\" ).hide();\r\n");
      out.write("\t$( \"#fileLoadingBtn\" ).hide();\r\n");
      out.write("    $('.btn-file :file').on('fileselect', function(event, numFiles, label) {    \t\r\n");
      out.write("        $( \"#fileSelector\" ).hide();\r\n");
      out.write("        $( \"#fileLoadBtn\" ).show();\r\n");
      out.write("        $( \"#filesSelected\" ).empty();\r\n");
      out.write("        $( \"#filesSelected\" ).append( \"<p>You have selected \"+numFiles+\" files to upload</p>\" );\r\n");
      out.write("    });\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("$(document).on('change', '.btn-file :file', function() {\t\r\n");
      out.write("    var input = $(this),\r\n");
      out.write("        numFiles = input.get(0).files ? input.get(0).files.length : 1,\r\n");
      out.write("        label = input.val().replace(/\\\\/g, '/').replace(/.*\\//, '');\r\n");
      out.write("    input.trigger('fileselect', [numFiles, label]);\r\n");
      out.write("    $( \"#fileSelector\" ).hide();\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("function submitThis(){\r\n");
      out.write("\t$( \"#fileLoadBtn\" ).hide();\r\n");
      out.write("\t$( \"#fileLoadingBtn\" ).show();\r\n");
      out.write("\tdocument.getElementById('').submit('loadFile');\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("<!--    Nav Bar -->   \r\n");
      out.write("    <nav class=\"navbar navbar-inverse navbar-fixed-top\">\r\n");
      out.write("      <div class=\"container\">\r\n");
      out.write("        <div class=\"navbar-header\">\r\n");
      out.write("          <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\" aria-controls=\"navbar\">\r\n");
      out.write("            <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("            <span class=\"icon-bar\"></span>\r\n");
      out.write("            <span class=\"icon-bar\"></span>\r\n");
      out.write("            <span class=\"icon-bar\"></span>\r\n");
      out.write("          </button>\r\n");
      out.write("          <span class=\"navbar-brand\" style=\"color:white\">File Stash</span>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div id=\"navbar\" class=\"collapse navbar-collapse\">\r\n");
      out.write("          <ul class=\"nav navbar-nav\">\r\n");
      out.write("            <li><a href=\"home\">Home</a></li>\r\n");
      out.write("            <li class=\"active\"><a href=\"uploadFile\">Upload File</a></li>\r\n");
      out.write("            <li><a href=\"viewFiles\">View File</a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("          \r\n");
      out.write("          <div class=\"navbar-form navbar-right\">\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("              <button class=\"btn btn-success\" onClick=\"setUser('manasa')\"><span class=\"glyphicon \"></span> Manasa</button>\r\n");
      out.write("              <button class=\"btn btn-success\" onClick=\"setUser('vikram')\"><span class=\"glyphicon \"></span>Vikram</button>   \r\n");
      out.write("              <div id=\"userDetails\" class=\"userDetails\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Who are you?</div>                        \t             \r\n");
      out.write("            </div>\r\n");
      out.write("           </div>                    \r\n");
      out.write("          \r\n");
      out.write("          \r\n");
      out.write("          \r\n");
      out.write("        </div><!--/.nav-collapse -->\r\n");
      out.write("      </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("<!--    Container -->    \r\n");
      out.write("      <div class=\"container\">\r\n");
      out.write("      \t<div class=\"starter-template\">\r\n");
      out.write("      \t\t<br><br>\r\n");
      out.write("\t\t    <form method=\"POST\" enctype=\"multipart/form-data\" action=\"loadFile\">\r\n");
      out.write("\t\t    <div id=\"fileSelector\"><span class=\"btn btn-default btn-file\">Select files to load<input type=\"file\" name=\"file1\" multiple></span></div>\t\t     \t\t    \r\n");
      out.write("\t\t    <div id=\"fileLoadBtn\"><button class=\"btn btn-md btn-primary\" onClick=\"submitThis()\"><span class=\"glyphicon \"></span> Load selected files</button></div>\r\n");
      out.write("\t\t\t<div id=\"fileLoadingBtn\"><button class=\"btn btn-lg btn-warning\"><span class=\"glyphicon glyphicon-refresh spinning\"></span> Loading...</button></div>\t\t       \r\n");
      out.write("\t\t    <br>\r\n");
      out.write("\t\t    <div id=\"filesSelected\"></div>\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\t\t\t\t\t\t\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_spring_005furl_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_005furl_005f0 = (org.springframework.web.servlet.tags.UrlTag) _005fjspx_005ftagPool_005fspring_005furl_0026_005fvalue_005fnobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_spring_005furl_005f0.setParent(null);
    // /WEB-INF/views/header.jsp(12,24) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005furl_005f0.setValue("/resources/img/fileStash.ico");
    int[] _jspx_push_body_count_spring_005furl_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005furl_005f0 = _jspx_th_spring_005furl_005f0.doStartTag();
      if (_jspx_th_spring_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005furl_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005furl_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005furl_005f0.doFinally();
      _005fjspx_005ftagPool_005fspring_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_spring_005furl_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005furl_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_005furl_005f1 = (org.springframework.web.servlet.tags.UrlTag) _005fjspx_005ftagPool_005fspring_005furl_0026_005fvalue_005fnobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_005furl_005f1.setPageContext(_jspx_page_context);
    _jspx_th_spring_005furl_005f1.setParent(null);
    // /WEB-INF/views/header.jsp(13,36) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005furl_005f1.setValue("/resources/img/fileStash2.bmp");
    int[] _jspx_push_body_count_spring_005furl_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005furl_005f1 = _jspx_th_spring_005furl_005f1.doStartTag();
      if (_jspx_th_spring_005furl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005furl_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005furl_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005furl_005f1.doFinally();
      _005fjspx_005ftagPool_005fspring_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_spring_005furl_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005furl_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_005furl_005f2 = (org.springframework.web.servlet.tags.UrlTag) _005fjspx_005ftagPool_005fspring_005furl_0026_005fvalue_005fnobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_005furl_005f2.setPageContext(_jspx_page_context);
    _jspx_th_spring_005furl_005f2.setParent(null);
    // /WEB-INF/views/header.jsp(16,30) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005furl_005f2.setValue("/resources/css/base.css");
    int[] _jspx_push_body_count_spring_005furl_005f2 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005furl_005f2 = _jspx_th_spring_005furl_005f2.doStartTag();
      if (_jspx_th_spring_005furl_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005furl_005f2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005furl_005f2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005furl_005f2.doFinally();
      _005fjspx_005ftagPool_005fspring_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_spring_005furl_005f2);
    }
    return false;
  }
}
