<%@page language="java" pageEncoding="UTF-8" contentType="text/html; utf-8" %>
<%--<html>
<head>
    <link rel="stylesheet" type="text/css" href="/xycy/static/easyui/themes/black/easyui.css">
    <link rel="stylesheet" type="text/css" href="/xycy/static/easyui/themes/icon.css">
    <script type="text/javascript" src="/xycy/static/easyui/js/jquery.min.js"></script>
    <script type="text/javascript" src="/xycy/static/easyui/js/jquery.easyui.min.js"></script>
    &lt;%&ndash;<script type="text/javascript" src="/xycy/static/easyui/js/easyui-lang-zh_CN.js"></script>&ndash;%&gt;
    <script type="text/javascript" src="/xycy/static/easyui/js/jquery-easyui-validater.js"></script>--%>
    <script type="text/javascript">
        $(function () {
            $('#goto').click(function () {
                location.href="/xycy/static/user/getAll";
            });
            $('#dg').datagrid({
                url:"/xycy/static/user/showAll"
            });


            $('#dg').datagrid({
                toolbar:'#tb',
                fit:true,
                fitColumns:true,
                remoteSort:false,
                striped:true,
                pagination:true,
                pageNumber:1,
                pageSize:5,
                pageList:[5,10,20,50],
                /*data:[{'code':10001,'name':'胖仔','price':'10000000'}],*/
                columns:[[
                    {title:"cks",field:"cks",checkbox:true,},
                    {field:'id',title:'代码',width:100,height:40,sortable:true},
                    {field:'name',title:'用户名',width:100,height:40},
                    {field:'password',title:'密码',width:100,align:'left',height:40},
                    {field:'tel',title:'电话',width:100,align:'left',height:40},
                    {field:'status',title:'状态',width:100,align:'left',height:40},
                    {field:'ca',title:'操作',width:100,
                        formatter:function(value,row,index){


                            return "<a class='del' onclick=\"deluser('"+row.id+"')\" data-options=\"plain:true,iconCls:'icon-remove'\">[删除]</a>&nbsp;&nbsp;" +
                                "<a class='upd' onclick=\"openUserDialog('"+row.id+"')\" data-options=\"plain:true,iconCls:'icon-edit'\">[冻结/激活]</a>";
                        }
                    }
                ]],
                onLoadSuccess:function (data) {

                    $(".del").linkbutton();
                    $(".upd").linkbutton();
                }
            });
            $("#add").click(

                function openUserDialog(){

                    //创建对话框
                    $("#aa").dialog({
                        title:"保存用户信息",
                        iconCls:'icon-man',
                        width:500,
                        height:300,
                        draggable:false,
                        href:'/xycy/static/add.jsp',//easyui在做多个页面引入时 相当于页面的源码包含 1.注意一定保证id唯一 2.子页面不能再出现body head html 等标签(保证父子页面在同一个body中)
                        buttons:[{
                            text:'保存用户',
                            iconCls:'icon-save',
                            handler:function () {

                                $("#ff").form('submit',{
                                    url:"/xycy/static/user/add",
                                    onSubmit:function () {

                                        return true;
                                    },
                                    success:function (result) {

                                        $("#aa").dialog('close');
                                        $('#dg').datagrid({
                                            url:"/xycy/static/user/showAll"
                                        });
                                        $.messager.show({
                                            title:'添加消息',
                                            msg:result,
                                            showType:'show',
                                            style:{
                                                right:'',
                                                top:document.body.scrollTop+document.documentElement.scrollTop,
                                                bottom:''
                                            }
                                        });

                                    }
                                });
                            },
                        },{
                            text: '关闭',
                            iconCls: 'icon-cancel',
                            handler: function () {
                                $("#aa").dialog('close');
                            }
                        }]
                    });

                }

            );






        });
        function deluser(id){
            /*console.log(id);*/
            //友情提醒
            $.messager.confirm('提示','确定要删除'+id+'吗?',function(r){

                if(r){
                    //发送ajax请求删除用户
                    $.get('/xycy/static/user/cancel?id='+id,function(result){
                        $.messager.show({
                            title:'提示',
                            msg:result,
                        });

                    });

                    //刷新datagrid
                    //$("#dg").datagrid('load');//始终保持在第一页展示
                    $("#dg").datagrid('reload');//始终保持在当前页展示
                    $("#dg").datagrid('reload');//始终保持在当前页展示
                    $("#dg").datagrid('reload');//始终保持在当前页展示
                    $("#dg").datagrid('reload');//始终保持在当前页展示
                    $("#dg").datagrid('reload');//始终保持在当前页展示
                    $("#dg").datagrid('reload');//始终保持在当前页展示
                    $("#dg").datagrid('reload');//始终保持在当前页展示
                    $("#dg").datagrid('reload');//始终保持在当前页展示
                    $("#dg").datagrid('reload');//始终保持在当前页展示
                    $("#dg").datagrid('reload');//始终保持在当前页展示
                    $("#dg").datagrid('reload');//始终保持在当前页展示
                    $("#dg").datagrid('reload');//始终保持在当前页展示
                }

            });
        }
        function openUserDialog(id){

            //友情提醒
            $.messager.confirm('提示','确定要改变'+id+'的状态吗?',function(r){

                if(r){
                    //发送ajax请求删除用户
                    $.get('/xycy/static/user/update?id='+id,function(result){
                        $.messager.show({
                            title:'提示',
                            msg:result,
                        });

                    });

                    //刷新datagrid
                    //$("#dg").datagrid('load');//始终保持在第一页展示
                    $("#dg").datagrid('reload');//始终保持在当前页展示
                    $("#dg").datagrid('reload');//始终保持在当前页展示
                    $("#dg").datagrid('reload');//始终保持在当前页展示
                    $("#dg").datagrid('reload');//始终保持在当前页展示
                    $("#dg").datagrid('reload');//始终保持在当前页展示
                    $("#dg").datagrid('reload');//始终保持在当前页展示
                    $("#dg").datagrid('reload');//始终保持在当前页展示
                    $("#dg").datagrid('reload');//始终保持在当前页展示
                    $("#dg").datagrid('reload');//始终保持在当前页展示
                    $("#dg").datagrid('reload');//始终保持在当前页展示
                }

            });

            //创建对话框
            /*$("#aa").dialog({
                title:"修改用户信息",

                iconCls:'icon-man',
                width:500,
                height:300,
                draggable:false,

                href:'/xycy/static/upd.jsp?id='+id,//easyui在做多个页面引入时 相当于页面的源码包含 1.注意一定保证id唯一 2.子页面不能再出现body head html 等标签(保证父子页面在同一个body中)
                buttons:[{
                    text:'确认修改',
                    iconCls:'icon-save',
                    handler:function () {
                        $("#ff").form('submit',{
                            url:"/xycy/static/user/modify",
                            onSubmit:function () {
                                return true;
                            },
                            success:function () {
                                $("#aa").dialog('close');
                                $('#dg').datagrid({
                                    url:"/xycy/static/user/showAll"
                                });
                                $.messager.show({
                                    title:'修改消息',
                                    msg:'修改成功。',
                                    showType:'show',
                                    style:{
                                        right:'',
                                        top:document.body.scrollTop+document.documentElement.scrollTop,
                                        bottom:''
                                    }
                                });

                            }
                        });
                    },
                },{
                    text: '关闭',
                    iconCls: 'icon-cancel',
                    handler: function () {
                        $("#aa").dialog('close');
                    }
                }]
            });*/

        }
        function qq(value,name){
           $("#dg").datagrid({
                url:"/xycy/static/user/showSome?col="+name+"&value="+value
            })
        }


    </script>

</head>
<body>

<table id="dg" >

</table>
<%--工具栏标签--%>
<div id="tb">
    <a id="add" class="easyui-linkbutton" data-options="iconCls:'icon-add'">添加</a>
    <a class="easyui-linkbutton" data-options="iconCls:'icon-remove'">帮助</a>
    <a id="goto" class="easyui-linkbutton" data-options="iconCls:'icon-man'">导出用户信息</a>
    <input id="ss" class="easyui-searchbox" style="width:300px"
           data-options="searcher:qq,prompt:'请输入查询条件',menu:'#mm'"></input>
   <%-- <input class="easyui-searchbox" style="width:300px" data-options="menu:'#mm'" />--%>

    <div id="mm" style="width:150px">
        <div data-options="name:'name'">姓名</div>
        <div data-options="name:'id',selected:true">ID</div>
        <div data-options="name:'status'">状态</div>
        <div data-options="name:'tel'">电话</div>
        <div data-options="name:'sex'">性别</div>
    </div>


</div>

<%--添加用户的对话框--%>
<div id="aa"></div>

<%--用户修改的对话框--%>
<div id="updUserDialog"></div>
<%--<div id="tb">
    <a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-add',plain:true,onClick:openUserDialog">添加</a>
    <a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-award_star_gold_3',plain:true">帮助</a>
</div>--%>
<%--</body>
</html>--%>
