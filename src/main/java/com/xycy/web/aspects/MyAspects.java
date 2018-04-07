package com.xycy.web.aspects;

import com.xycy.web.admin.entity.User;
import com.xycy.web.annotations.Power;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

@Configuration
@Aspect
public class MyAspects {

    @Resource
    private HttpServletRequest request;

    @Around(value = "@annotation(com.xycy.web.annotations.Power)")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        User user = (User) request.getSession().getAttribute("user");
        List<String> powers = new ArrayList<String>();
        
        //获取用户所持有角色数组
        for (String powerString : user.getPowers()) {
            powers.add(powerString);
        }
        
        //获取方法上的角色数组
        MethodSignature signature = (MethodSignature) proceedingJoinPoint.getSignature();
        Method method = signature.getMethod();
        Power power = method.getAnnotation(Power.class);
        String[] strs = power.strs();
        //System.out.println(strs[0]);

        //两个数组比较，有重合则放行，不重合则返回“您没有权限”
        int a= 0;
        for (int i = 0; i < strs.length; i++) {
            if(powers.contains(strs[i])){
                a=1;
            }
        }
        Object pro = null;
        if(a>=1){
            pro = proceedingJoinPoint.proceed();
        }else{
            return "您没有权限！";
        }
        return pro;
    }
}
