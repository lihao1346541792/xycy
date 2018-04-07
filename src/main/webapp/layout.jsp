<%@page language="java" pageEncoding="UTF-8" contentType="text/html; utf-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>

    <link rel="stylesheet" type="text/css" href="/xycy/static/easyui/themes/default/easyui.css"/>
    <link rel="stylesheet" type="text/css" href="/xycy/static/easyui/themes/IconExtension.css"/>
    <link rel="stylesheet" type="text/css" href="/xycy/static/easyui/themes/icon.css"/>
    <script type="text/javascript" src="/xycy/static/easyui/js/jquery.min.js"></script>
    <script type="text/javascript" src="/xycy/static/echarts/echarts.simple.min.js"></script>
    <script type="text/javascript" src="/xycy/static/easyui/js/jquery.easyui.min.js"></script>
    <%--<script type="text/javascript" src="/firstui/easyui/js/easyui-lang-zh_CN.js"></script>--%>
    <script type="text/javascript" src="/xycy/static/easyui/js/jquery-easyui-validater.js"></script>


    <script type="text/javascript">

        $(function(){
            $("#btn").click(function () {
                location.href="/xycy/static/manager/login.jsp";
            });
            $.get("/xycy/static/category.json",function(result){
                //遍历读取的结果，获得一级菜单
                $.each(result,function(i,m){
                    var content = "<div style='text-align: center;'>";
                    //遍历一级菜单中的二级菜单
                    $.each(m.children,function(i,child){

                        var con = child.name+"#"+child.iconCls+"#"+child.href;

                        content += "<div onclick=\"getAll('"+con+"')\" style='width: 90%;margin:5px 0px 5px 0px; border:1px #95B8E7 solid;' class='easyui-linkbutton' data-options=\"plain:true,iconCls:'"+child.iconCls+"'\" >"+child.name+"</div><br/>";
                    });
                    content +="</div>";
                    //往accoridion中追加分类
                    $("#menus").accordion('add',{
                        title:m.name,
                        iconCls:m.iconCls,
                        content:content,
                    });
                });

            },"JSON");


        });
        function getAll(content) {

            var con = content.split("#");
            //获得名字
            var title = con[0];
            //获得图标
            var iconCls = con[1];
            //获得链接
            var href = con[2];
            /*if(!$('#tt').tabs('exists',title)){
                $('#tt').tabs('add',{
                    title:title,
                    iconCls : icon,
                    /!*content:'Tab Body',*!/
                    href  : href,
                    closable:true,
                    tools:[{
                        iconCls:'icon-arrow_rotate_anticlockwise',
                        handler:function(){
                            alert('refresh');
                            //获取当前选中面板
                            var tab = $("#tt").tabs('getSelected');
                            console.log(tab);
                            tab.panel('refresh');//调用panel刷新方法
                        }
                    }]
                });
            }else{
                $('#tt').tabs("select",title)
            }*/
            if (!$("#tt").tabs('exists', title)) {
                $("#tt").tabs('add', {
                    title: title,
                    iconCls: iconCls,
                    closable: true,
                    href: href,
                    tools: [{
                        iconCls: 'icon-reload',
                        handler: function () {
                            //获取当前选中面板
                            var tab = $("#tt").tabs('getSelected');
                            console.log(tab);
                            tab.panel('refresh');//调用panel刷新方法
                        }
                    }]
                });
            } else {//存在选中当前选项卡
                $("#tt").tabs('select', title);
            }
        }

    </script>

</head>

<body class="easyui-layout">
    <div data-options="region:'north',split:true" style="height:100px;text-align: center">
        <h1>香韵茶语后台管理系统v1.0</h1>
        <div style="text-align: left"><span>欢迎您，${name}管理员！</span>
             <input id="btn" type="button" value="登出"></div>
    </div>
    <div data-options="region:'south'" style="height:70px;text-align: center;">
        <div style="top: auto">

            <strong>欢迎光临香韵茶语后台管理中心！！</strong>

        </div>
    </div>
    <div data-options="region:'west',title:'系统管理',split:true" style="width:250px;">
        <%--遍历分类信息，生成accordion控件容器--%>
            <div id="menus" class="easyui-accordion" data-options="fit:true"></div>

    </div>
    <%--主页--%>
    <div data-options="region:'center'" style="padding:5px;">
            <div id="tt" class="easyui-tabs" data-options="fit:true"></div>

    </div>

</body>


</html>
