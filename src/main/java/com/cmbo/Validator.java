package com.cmbo;

import com.cmbo.Employee;
import com.google.gson.Gson;

import java.util.Arrays;

public class Validator {

    public String validate(String payload) {
        Employee employee = new Employee();
        employee.setId(1);
        employee.setFirstName("Lokesh");
        employee.setLastName("Gupta");
        employee.setRoles(Arrays.asList("ADMIN", "MANAGER"));

        Gson gson = new Gson();
        Employee generated = gson.fromJson(payload, Employee.class);
        Class classType = Employee.class;

        System.out.println(gson.toJson(employee));
        return gson.toJson(generated);
    }

    public String validate(String payload, String type) {
        String result = "";
        try {
            Class cls = Class.forName(type);
            if (cls instanceof Class) {
                @SuppressWarnings("unchecked")
                Class<?> clazz = (Class<?>) cls;
                Gson gson = new Gson();
                Object generated = gson.fromJson(payload, clazz.getClass());
                if (generated instanceof Employee) {

                }
                result = gson.toJson(generated);
                //generated
                //Employee employee = (Employee) generated;
                //otherMethod(clazz);
            }
        } catch (Exception e) {

        }
        return result;
    }

   /* public String validate(String payload, String classType) {
        try {
            Class cls = Class.forName(classType);
            Gson gson = new Gson();
            String test = gson.fromJson(payload, cls.getClass());
            Employee generated = gson.fromJson(payload, cls.getClass());
            //Class classType = Employee.class;

            System.out.println(gson.toJson(employee));
            return gson.toJson(generated);
            *//*Class partypes[] = new Class[2];
            partypes[0] = Integer.TYPE;
            partypes[1] = Integer.TYPE;
            Method meth = cls.getMethod(
                    "add", partypes);
            method2 methobj = new method2();
            Object arglist[] = new Object[2];
            arglist[0] = new Integer(37);
            arglist[1] = new Integer(47);
            Object retobj
                    = meth.invoke(methobj, arglist);
            Integer retval = (Integer)retobj;
            System.out.println(retval.intValue());*//*
        }
        catch (Throwable e) {
            System.err.println(e);
        }
    }*/
   // }
}
