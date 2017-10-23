package test.interceptors;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import test.domain.Student;
import test.domain.StudentExample;
import test.mapper.StudentMapper;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * 匹配方式
 * 0 精准
 * 1 模糊
 * 2 大于
 * 3 小于
 * 4 之间
 */
public class MyTestInterceptor implements HandlerInterceptor {
    final String TAG = "MyTestInterceptor";

    String[] args = {
            "studentId",
            "studentName",
            "studentSex",
            "studentCollege",
            "studentMajor",
            "studentTel",
            "studentEmail",
            "studentQq"
    };

    String[] methodSuffix = {
            "EqualTo",
            "Like",
            "GreaterThan",
            "LessThan",
            "Between"
    };
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        System.out.println(TAG+" : >>>>>>>>>>>>>>>>>>>>>>>>>preHandle<<<<<<<<<<<<<<<<<<<<<<");
        String[][] params = getParameters(httpServletRequest);
        StudentExample example = generateExample(params);
        httpServletRequest.setAttribute("example",example);
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        System.out.println(TAG+" : >>>>>>>>>>>>>>>>>>>>>>>>>postHandle<<<<<<<<<<<<<<<<<<<<<<");
    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        System.out.println(TAG+" : >>>>>>>>>>>>>>>>>>>>>>>>>afterComplete<<<<<<<<<<<<<<<<<<<<<<");
    }

    String[][] getParameters(HttpServletRequest request){
        String[][] params = new String[args.length][2];
        String[] selectArgs = new String[args.length];
        for (int i=0;i<args.length;i++){
            params[i][0] = request.getParameter(args[i]).trim();
            selectArgs[i] = args[i].substring(7).toLowerCase()+"Type";
        }
        for (int i=0;i<args.length;i++){
            params[i][1] = request.getParameter(selectArgs[i]).trim();
        }
        return params;
    }

    StudentExample generateExample(String[][] params){
        String order = "student_id asc";
        StudentExample example = new StudentExample();
        StudentExample.Criteria criteria = example.createCriteria();
        for (int i=0;i<args.length;i++){
            if (params[i][0]==null||params[i][0].equals("")) continue;
            addAndCondition(criteria,params[i],args[i]);
        }
        example.setOrderByClause(order);
        return example;
    }

    void addAndCondition(StudentExample.Criteria criteria, String[] a, String p) {
        Class clazz = criteria.getClass();
        String m = methodSuffix[Integer.parseInt(a[1])];
        String methodName = "and"+p.substring(0,1).toUpperCase()+p.substring(1,p.length())+m;

        Logger.getLogger(MyTestInterceptor.class).info(methodName);
        try {
            Field field = Student.class.getDeclaredField(p);
            Class c = field.getType();
            Method method;
            if (c==Integer.class) {
                if (a[1].equals("4")) {
                    String[] strArgu = a[0].split(" ");
                    Integer[] intArgu = {Integer.valueOf(strArgu[0]), Integer.valueOf(strArgu[1])};
                    method = clazz.getDeclaredMethod(methodName, new Class[]{c, c});
                    method.invoke(criteria, intArgu[0],intArgu[1]);
                }else{
                    method = clazz.getDeclaredMethod(methodName,new Class[]{c});
                    method.invoke(criteria,Integer.parseInt(a[0]));
                }
            }else{
                method = clazz.getDeclaredMethod(methodName,new Class[]{c});
                if (a[1].equals("1")){
                    method.invoke(criteria,"%"+a[0]+"%");
                }else {
                    method.invoke(criteria, a[0]);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
