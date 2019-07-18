package com.tk.common.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.util.Enumeration;
import java.util.Map;
import java.util.Vector;

/**
 * @Desc tk-admin
 * @Author jx111
 * @Date 2019/3/7-17:57
 */
public class ParameterRequestWrapper extends HttpServletRequestWrapper {
    private Map params;

    public ParameterRequestWrapper(HttpServletRequest request, Map newParams) {
        super(request);
        this.params = newParams;
    }

    @Override
    public Map getParameterMap() {
        return params;
    }

    @Override
    public Enumeration getParameterNames() {
        Vector l = new Vector(params.keySet());
        return l.elements();
    }

    @Override
    public String[] getParameterValues(String name) {
        Object v = params.get(name);
        if (v == null) {
            return null;
        } else if (v instanceof String[]) {
            return (String[]) v;
        } else if (v instanceof String) {
            return new String[] { (String) v };
        } else {
            return new String[] { v.toString() };
        }
    }

    @Override
    public String getParameter(String name) {
        Object v = params.get(name);
        if (v == null) {
            return null;
        } else if (v instanceof String[]) {
            String[] strArr = (String[]) v;
            if (strArr.length > 0) {
                return strArr[0];
            } else {
                return null;
            }
        } else if (v instanceof String) {
            return (String) v;
        } else {
            return v.toString();
        }
    }
}
