/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-07-26 03:19:39 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class agreeLineAndBar_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\r');
      out.write('\n');

	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("<title>My JSP 'showStudentInfo.jsp' starting page</title>\r\n");
      out.write("\r\n");
      out.write("<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("<meta http-equiv=\"expires\" content=\"0\">\r\n");
      out.write("<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("<!--\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"styles.css\">\r\n");
      out.write("\t-->\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery-3.3.1.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/echarts.js\"></script>\r\n");
      out.write("<body>\r\n");
      out.write("\t<!-- 显示Echarts图表 -->\r\n");
      out.write("\t<div style=\"height:410px;min-height:100px;margin:0 auto;\" id=\"main\"></div>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t// 基于准备好的dom，初始化echarts实例\r\n");
      out.write("\t\tvar myChart = echarts.init(document.getElementById('main'));\r\n");
      out.write("\t\r\n");
      out.write("\t\t// 指定图表的配置项和数据\r\n");
      out.write("\t\tvar option = {\r\n");
      out.write("\t\t\t//标题\r\n");
      out.write("\t\t\ttitle : { //图表标题\r\n");
      out.write("\t\t\t\ttext : '知乎前10赞同数', //主标题\r\n");
      out.write("\t\t\t\tsubtext : 'SSM实现知乎前10赞同数统计', //副标题\r\n");
      out.write("\t\t\t\tleft : \"center\", //left 的值可以是像 20 这样的具体像素值，可以是像 '20%' 这样相对于容器高宽的百分比，也可以是 'left', 'center', 'right',如果 left 的值为'left', 'center', 'right'，组件会根据相应的位置自动对齐。\r\n");
      out.write("\t\t\t\t//top : \"center\", //left 的值可以是像 20 这样的具体像素值，可以是像 '20%' 这样相对于容器高宽的百分比，也可以是 'left', 'center', 'right',如果 left 的值为'left', 'center', 'right'，组件会根据相应的位置自动对齐。\r\n");
      out.write("\t\t\t\tright : \"auto\", //right 的值可以是像 20 这样的具体像素值，可以是像 '20%' 这样相对于容器高宽的百分比。\r\n");
      out.write("\t\t\t//bottom : \"auto\" //bottom 的值可以是像 20 这样的具体像素值，可以是像 '20%' 这样相对于容器高宽的百分比。\t\t\t\t\r\n");
      out.write("\t\t\t//borderColor : 'red', //边框颜色\r\n");
      out.write("\t\t\t//borderWidth : 10, //边框宽度\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\ttooltip : {\r\n");
      out.write("\t\t\t\ttrigger : 'axis', //坐标轴触发提示框，多用于柱状、折线图中\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\t//缩放视图\r\n");
      out.write("\t\t\tdataZoom : [\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\ttype : 'slider', //支持鼠标滚轮缩放\r\n");
      out.write("\t\t\t\t\tstart : 0, //默认数据初始缩放范围为10%到90%\r\n");
      out.write("\t\t\t\t\tend : 100\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\ttype : 'inside', //支持单独的滑动条缩放\r\n");
      out.write("\t\t\t\t\tstart : 0, //默认数据初始缩放范围为10%到90%\r\n");
      out.write("\t\t\t\t\tend : 100\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t],\r\n");
      out.write("\t\t\t//图例\r\n");
      out.write("\t\t\tlegend : { //图表上方的类别显示           \t\r\n");
      out.write("\t\t\t\tshow : true,\r\n");
      out.write("\t\t\t\tdata : [ '赞同数', ]\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tcolor : [\r\n");
      out.write("\t\t\t\t'#FF3333', //曲线颜色\r\n");
      out.write("\t\t\t],\r\n");
      out.write("\t\t\ttoolbox : {\r\n");
      out.write("\t\t\t\tfeature : {\r\n");
      out.write("\t\t\t\t\t//dataView:数据视图\r\n");
      out.write("\t\t\t\t\tdataView : {\r\n");
      out.write("\t\t\t\t\t\tshow : true,\r\n");
      out.write("\t\t\t\t\t\treadOnly : false\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t//动态类型切换\r\n");
      out.write("\t\t\t\t\tmagicType : {\r\n");
      out.write("\t\t\t\t\t\tshow : true,\r\n");
      out.write("\t\t\t\t\t\ttype : [ 'line', 'bar' ]\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t//还原\r\n");
      out.write("\t\t\t\t\trestore : {\r\n");
      out.write("\t\t\t\t\t\tshow : true\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t//保存图片选项\r\n");
      out.write("\t\t\t\t\tsaveAsImage : {\r\n");
      out.write("\t\t\t\t\t\tshow : true\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\txAxis : { //X轴       \t\r\n");
      out.write("\t\t\t\ttype : 'category',\r\n");
      out.write("\t\t\t\tdata : [] //先设置数据值为空，后面用Ajax获取动态数据填入\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tyAxis : [\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\ttype : 'value',\r\n");
      out.write("\t\t\t\t\tname : '赞同数',\r\n");
      out.write("\t\t\t\t\t/* max: 120,\r\n");
      out.write("\t\t\t\t\tmin: -40, */\r\n");
      out.write("\t\t\t\t\t//yAxis.scale:boolean 是否是脱离 0 值比例。设置成 true 后坐标刻度不会强制包含零刻度。在双数值轴的散点图中比较有用。在设置 min 和 max 之后该配置项无效\r\n");
      out.write("\t\t\t\t\tscale : false,\r\n");
      out.write("\t\t\t\t\taxisLabel : {\r\n");
      out.write("\t\t\t\t\t\t//xAxis.axisLabel.formatter string, Function: 刻度标签的内容格式器，支持字符串模板和回调函数两种形式。\r\n");
      out.write("\t\t\t\t\t\t//formatter : '{value} ℃ ', //控制输出格式，也就是坐标轴显示的格式 [ default: null ]\r\n");
      out.write("\t\t\t\t\t\tmargin : 10, //刻度标签与轴线之间的距离。[ default: 8 ]\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t],\r\n");
      out.write("\t\t\t//series[i]:系列列表。每个系列通过 type 决定自己的图表类型\r\n");
      out.write("\t\t\tseries : [ //系列（内容）列表                      \r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\tname : '赞同数',\r\n");
      out.write("\t\t\t\t\ttype : 'line', //折线图表示（生成温度曲线）\r\n");
      out.write("\t\t\t\t\tsymbol : 'emptycircle', //设置折线图中表示每个坐标点的符号；emptycircle：空心圆；emptyrect：空心矩形；circle：实心圆；emptydiamond：菱形\t                    \r\n");
      out.write("\t\t\t\t\tdata : [], //数据值通过Ajax动态获取\r\n");
      out.write("\t\t\t\t\t//图标上显示出最大值和最小值，symbol属性可以改变标记图形\r\n");
      out.write("\t\t\t\t\tmarkPoint : {\r\n");
      out.write("\t\t\t\t\t\tdata : [ {\r\n");
      out.write("\t\t\t\t\t\t\ttype : 'max',\r\n");
      out.write("\t\t\t\t\t\t\tname : '最大值'\r\n");
      out.write("\t\t\t\t\t\t}, {\r\n");
      out.write("\t\t\t\t\t\t\ttype : 'min',\r\n");
      out.write("\t\t\t\t\t\t\tname : '最小值'\r\n");
      out.write("\t\t\t\t\t\t} ],\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t//图标上显示平局值\r\n");
      out.write("\t\t\t\t\tmarkLine : {\r\n");
      out.write("\t\t\t\t\t\tdata : [ {\r\n");
      out.write("\t\t\t\t\t\t\ttype : 'average',\r\n");
      out.write("\t\t\t\t\t\t\tname : '平均值'\r\n");
      out.write("\t\t\t\t\t\t} ]\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t]\r\n");
      out.write("\t\t};\r\n");
      out.write("\t\t//数据加载完之前先显示一段简单的loading动画,在数据加载完成后调用 hideLoading 隐藏加载动画。\r\n");
      out.write("\t\t//下面ajax请求成功获取数据后，调用了hideLoading 隐藏加载动画\r\n");
      out.write("\t\tmyChart.showLoading();\r\n");
      out.write("\t\r\n");
      out.write("\t\tvar names = []; //姓名\r\n");
      out.write("\t\tvar nums = []; //赞同数\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\ttype : \"post\",\r\n");
      out.write("\t\t\tasync : true, //异步请求（同步请求将会锁住浏览器，用户其他操作必须等待请求完成才可以执行）\r\n");
      out.write("\t\t\turl : \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/echarts/agreeLineAndBar\", //请求发送到TestServlet处\r\n");
      out.write("\t\t\tdata : {},\r\n");
      out.write("\t\t\tdataType : \"json\", //返回数据形式为json\r\n");
      out.write("\t\t\tsuccess : function(result) {\r\n");
      out.write("\t\t\t\t//请求成功时执行该函数内容，result即为服务器返回的json对象\r\n");
      out.write("\t\t\t\tif (result) {\r\n");
      out.write("\t\t\t\t\tfor (var i = 0; i < result.length; i++) {\r\n");
      out.write("\t\t\t\t\t\tnames.push(result[i].username); //挨个取出类别并填入类别数组\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\tfor (var i = 0; i < result.length; i++) {\r\n");
      out.write("\t\t\t\t\t\tnums.push(result[i].agrees); //挨个取出销量并填入销量数组\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\tmyChart.hideLoading(); //隐藏加载动画\r\n");
      out.write("\t\t\t\t\tmyChart.setOption({ //加载数据图表\r\n");
      out.write("\t\t\t\t\t\txAxis : {\r\n");
      out.write("\t\t\t\t\t\t\tdata : names\r\n");
      out.write("\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\tseries : [ {\r\n");
      out.write("\t\t\t\t\t\t\t// 根据名字对应到相应的系列\r\n");
      out.write("\t\t\t\t\t\t\tname : '赞同数量',\r\n");
      out.write("\t\t\t\t\t\t\tdata : nums\r\n");
      out.write("\t\t\t\t\t\t} ]\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t//返回的数据为空时显示提示信息\r\n");
      out.write("\t\t\t\t\talert(\"图表请求数据为空，可能服务器暂未录入近五天的观测数据，您可以稍后再试！\");\r\n");
      out.write("\t\t\t\t\tmyChart.hideLoading();\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\terror : function(errorMsg) {\r\n");
      out.write("\t\t\t\t//请求失败时执行该函数\r\n");
      out.write("\t\t\t\talert(\"图表请求数据失败，可能是服务器开小差了\");\r\n");
      out.write("\t\t\t\tmyChart.hideLoading();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t})\r\n");
      out.write("\t\r\n");
      out.write("\t\tmyChart.setOption(option); //载入图表\r\n");
      out.write("\t</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
