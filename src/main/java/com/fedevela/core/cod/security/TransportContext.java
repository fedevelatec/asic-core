package com.fedevela.core.cod.security;

/**
 * Created by Federico on 20/04/14.
 */
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TransportContext {

    private Logger log = LoggerFactory.getLogger(TransportContext.class);

    public static void transport(HttpServletRequest request, Object value) {
        request.getSession().getServletContext().setAttribute(request.getSession().getId(), value);
    }

    public static Object recovery(HttpServletRequest request, String crossContextName, String id) {
        ServletContext sc = request.getSession().getServletContext().getContext("/" + crossContextName);
        return sc.getAttribute(id);
    }

    public static void destroy(HttpServletRequest request) {
    }
}