/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-07-18 09:42:37 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("\t<meta charset=\"UTF-8\">\n");
      out.write("\t<title>小说网站后台系统</title>\n");
      out.write("\t<meta name=\"renderer\" content=\"webkit|ie-comp|ie-stand\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi\" />\n");
      out.write("    <meta http-equiv=\"Cache-Control\" content=\"no-siteapp\" />\n");
      out.write("\n");
      out.write("    <link rel=\"shortcut icon\" href=\"/favicon.ico\" type=\"image/x-icon\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"/static/css/font.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"/static/css/xadmin.css\">\n");
      out.write("    <script type=\"text/javascript\" src=\"https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("    <script src=\"/static/lib/layui/layui.js\" charset=\"utf-8\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"/static/js/xadmin.js\"></script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <!-- 顶部开始 -->\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"logo\"><a href=\"/static/index.html\">小说网站后台系统</a></div>\n");
      out.write("        <div class=\"left_open\">\n");
      out.write("            <i title=\"展开左侧栏\" class=\"iconfont\">&#xe699;</i>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <ul class=\"layui-nav right\" lay-filter=\"\">\n");
      out.write("          <li class=\"layui-nav-item\">\n");
      out.write("            <a href=\"javascript:;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${admin.adminName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</a>\n");
      out.write("            <dl class=\"layui-nav-child\"> <!-- 二级菜单 -->\n");
      out.write("              <dd><a onclick=\"x_admin_show('个人信息','http://www.baidu.com')\">个人信息</a></dd>\n");
      out.write("              <dd><a onclick=\"x_admin_show('切换帐号','http://www.baidu.com')\">切换帐号</a></dd>\n");
      out.write("              <dd><a href=\"javascript:logout();\">退出</a></dd>\n");
      out.write("            </dl>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"layui-nav-item to-index\"><a href=\"/\">前台首页</a></li>\n");
      out.write("        </ul>\n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("    <!-- 顶部结束 -->\n");
      out.write("    <!-- 中部开始 -->\n");
      out.write("     <!-- 左侧菜单开始 -->\n");
      out.write("    <div class=\"left-nav\">\n");
      out.write("      <div id=\"side-nav\">\n");
      out.write("        <ul id=\"nav\">\n");
      out.write("            <li>\n");
      out.write("                <a href=\"javascript:;\">\n");
      out.write("                    <i class=\"iconfont\">&#xe6b8;</i>\n");
      out.write("                    <cite>读者管理</cite>\n");
      out.write("                    <i class=\"iconfont nav_right\">&#xe697;</i>\n");
      out.write("                </a>\n");
      out.write("                <ul class=\"sub-menu\">\n");
      out.write("                    <li>\n");
      out.write("                        <a _href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/reader/list\">\n");
      out.write("                            <i class=\"iconfont\">&#xe6a7;</i>\n");
      out.write("                            <cite>读者列表</cite>\n");
      out.write("\n");
      out.write("                        </a>\n");
      out.write("                    </li >\n");
      out.write("                    <li>\n");
      out.write("                        <a _href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/reader/deleteList\">\n");
      out.write("                            <i class=\"iconfont\">&#xe6a7;</i>\n");
      out.write("                            <cite>读者删除</cite>\n");
      out.write("\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a _href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/reader/collect\">\n");
      out.write("                            <i class=\"iconfont\">&#xe6a7;</i>\n");
      out.write("                            <cite>读者收藏</cite>\n");
      out.write("                        </a>\n");
      out.write("\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <li>\n");
      out.write("                <a href=\"javascript:;\">\n");
      out.write("                    <i class=\"iconfont\">&#xe6b8;</i>\n");
      out.write("                    <cite>留言管理</cite>\n");
      out.write("                    <i class=\"iconfont nav_right\">&#xe697;</i>\n");
      out.write("                </a>\n");
      out.write("                <ul class=\"sub-menu\">\n");
      out.write("                    <li>\n");
      out.write("                        <a _href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/message/list\">\n");
      out.write("                            <i class=\"iconfont\">&#xe6a7;</i>\n");
      out.write("                            <cite>留言列表</cite>\n");
      out.write("                        </a>\n");
      out.write("                    </li >\n");
      out.write("                </ul>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("                <a href=\"javascript:;\">\n");
      out.write("                    <i class=\"iconfont\">&#xe6b8;</i>\n");
      out.write("                    <cite>管理员管理</cite>\n");
      out.write("                    <i class=\"iconfont nav_right\">&#xe697;</i>\n");
      out.write("                </a>\n");
      out.write("                <ul class=\"sub-menu\">\n");
      out.write("                    <li>\n");
      out.write("                        <a _href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/admin/list\">\n");
      out.write("                            <i class=\"iconfont\">&#xe6a7;</i>\n");
      out.write("                            <cite>管理员列表</cite>\n");
      out.write("                        </a>\n");
      out.write("                    </li >\n");
      out.write("\n");
      out.write("                </ul>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <li>\n");
      out.write("                <a href=\"javascript:;\">\n");
      out.write("                    <i class=\"iconfont\">&#xe723;</i>\n");
      out.write("                    <cite>订阅订单管理</cite>\n");
      out.write("                    <i class=\"iconfont nav_right\">&#xe697;</i>\n");
      out.write("                </a>\n");
      out.write("                <ul class=\"sub-menu\">\n");
      out.write("                    <li>\n");
      out.write("                        <a _href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/bookorder/bookorderlist\">\n");
      out.write("                            <i class=\"iconfont\">&#xe6a7;</i>\n");
      out.write("                            <cite>订阅订单列表</cite>\n");
      out.write("                        </a>\n");
      out.write("                    </li >\n");
      out.write("                </ul>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("                <a href=\"javascript:;\">\n");
      out.write("                    <i class=\"iconfont\">&#xe723;</i>\n");
      out.write("                    <cite>充值订单管理</cite>\n");
      out.write("                    <i class=\"iconfont nav_right\">&#xe697;</i>\n");
      out.write("                </a>\n");
      out.write("                <ul class=\"sub-menu\">\n");
      out.write("                    <li>\n");
      out.write("                        <a _href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/rechargeorder/rechargeorderlist\">\n");
      out.write("                            <i class=\"iconfont\">&#xe6a7;</i>\n");
      out.write("                            <cite>充值订单列表</cite>\n");
      out.write("                        </a>\n");
      out.write("                    </li >\n");
      out.write("                </ul>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("                <a href=\"javascript:;\">\n");
      out.write("                    <i class=\"iconfont\">&#xe723;</i>\n");
      out.write("                    <cite>折扣活动管理</cite>\n");
      out.write("                    <i class=\"iconfont nav_right\">&#xe697;</i>\n");
      out.write("                </a>\n");
      out.write("                <ul class=\"sub-menu\">\n");
      out.write("                    <li>\n");
      out.write("                        <a _href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/discount/discountlist\">\n");
      out.write("                            <i class=\"iconfont\">&#xe6a7;</i>\n");
      out.write("                            <cite>折扣活动列表</cite>\n");
      out.write("                        </a>\n");
      out.write("                    </li >\n");
      out.write("                </ul>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <li>\n");
      out.write("                <a href=\"javascript:;\">\n");
      out.write("                    <i class=\"iconfont\">&#xe6b8;</i>\n");
      out.write("                    <cite>作者管理</cite>\n");
      out.write("                    <i class=\"iconfont nav_right\">&#xe697;</i>\n");
      out.write("                </a>\n");
      out.write("                <ul class=\"sub-menu\">\n");
      out.write("                    <li>\n");
      out.write("                        <a _href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/author/list\">\n");
      out.write("                            <i class=\"iconfont\">&#xe6a7;</i>\n");
      out.write("                            <cite>作者列表</cite>\n");
      out.write("                        </a>\n");
      out.write("                    </li >\n");
      out.write("                    <li>\n");
      out.write("                        <a _href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/author/deleteList\">\n");
      out.write("                            <i class=\"iconfont\">&#xe6a7;</i>\n");
      out.write("                            <cite>作者删除</cite>\n");
      out.write("\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                </ul>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("                <a href=\"javascript:;\">\n");
      out.write("                    <i class=\"iconfont\">&#xe6b8;</i>\n");
      out.write("                    <cite>作品管理</cite>\n");
      out.write("                    <i class=\"iconfont nav_right\">&#xe697;</i>\n");
      out.write("                </a>\n");
      out.write("                <ul class=\"sub-menu\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <li>\n");
      out.write("                        <a _href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/history/list\">\n");
      out.write("                            <i class=\"iconfont\">&#xe6a7;</i>\n");
      out.write("                            <cite>浏览记录</cite>\n");
      out.write("\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- <div class=\"x-slide_left\"></div> -->\n");
      out.write("    <!-- 左侧菜单结束 -->\n");
      out.write("    <!-- 右侧主体开始 -->\n");
      out.write("    <div class=\"page-content\">\n");
      out.write("        <div class=\"layui-tab tab\" lay-filter=\"xbs_tab\" lay-allowclose=\"false\">\n");
      out.write("          <ul class=\"layui-tab-title\">\n");
      out.write("            <li class=\"home\"><i class=\"layui-icon\">&#xe68e;</i>我的桌面</li>\n");
      out.write("          </ul>\n");
      out.write("          <div class=\"layui-tab-content\">\n");
      out.write("            <div class=\"layui-tab-item layui-show\">\n");
      out.write("                <iframe src='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/welcome' frameborder=\"0\" scrolling=\"yes\" class=\"x-iframe\"></iframe>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"page-content-bg\"></div>\n");
      out.write("    <!-- 右侧主体结束 -->\n");
      out.write("    <!-- 中部结束 -->\n");
      out.write("    <!-- 底部开始 -->\n");
      out.write("    <div class=\"footer\">\n");
      out.write("        <div class=\"copyright\"></div>\n");
      out.write("    </div>\n");
      out.write("    <!-- 底部结束 -->\n");
      out.write("    <script>\n");
      out.write("        /**\n");
      out.write("         * 退出登陆的方法\n");
      out.write("         */\n");
      out.write("        function logout() {\n");
      out.write("            layer.confirm('确定退出吗?',function(index){\n");
      out.write("                location.href = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/logout\";\n");
      out.write("            });\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
