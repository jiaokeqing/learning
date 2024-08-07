package com.jiaokeqing.java.proxy.cglib;

import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Interface for intercepting method calls on a CGLIB proxy.
 * <p>
 * The `MethodInterceptor` interface allows you to define custom behavior
 * when methods on a proxy instance are called. It is part of the CGLIB
 * library, which is used for creating dynamic proxies in Java.
 * <p>
 * Implement this interface to provide logic that executes before, after,
 * or around the method invocation on the proxy object.
 *
 * @author jiaokeqing
 * @since 2024-08-06
 */
public interface MethodInterceptor extends Callback {

    /**
     * Intercepts method calls on the proxy instance.
     *
     * @param obj    the proxy instance on which the method is being called
     * @param method the method being intercepted
     * @param args   the arguments passed to the method
     * @param proxy  a MethodProxy instance that can be used to invoke the original method
     * @return the result of the method invocation
     * @throws Throwable if any error occurs during method invocation
     */
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable;
}
