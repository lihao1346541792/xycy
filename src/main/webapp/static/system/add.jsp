<%@page language="java" pageEncoding="UTF-8" contentType="text/html; utf-8" %>
<script>
    $(function () {
        $("#ff").form();
    });
</script>
<div style="text-align: center;" >

    <form id="ff" method="post">
        <div style="margin-top:40px;">
            姓名:<input class="easyui-textbox" name="name" data-options="required:true"><br/>
        </div>

        <div style="margin-top: 20px;">
            密码:<input class="easyui-textbox" name="password" data-options="required:true"><br/>
        </div>
        <div style="margin-top: 20px;">
            手机号:<input class="easyui-textbox" name="tel" data-options="required:true"><br/>
        </div>
    </form>

</div>

