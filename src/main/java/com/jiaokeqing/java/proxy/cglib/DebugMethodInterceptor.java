package com.jiaokeqing.java.proxy.cglib;

import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * A custom implementation of the MethodInterceptor interface for debugging purposes.
 * <p>
 * The `DebugMethodInterceptor` class is used to log method calls on the proxy object.
 * It prints messages before and after the method execution to help with debugging and
 * understanding the flow of method invocations.
 *
 * @author jiaokeqing
 * @since 2024-08-06
 */
public class DebugMethodInterceptor implements MethodInterceptor {
    /**
     * Intercepts method calls on the proxy instance and logs debug information.
     * <p>
     * This method is invoked whenever a method on the proxy instance is called.
     * It prints a message before and after the method call to provide insights
     * into the method execution.
     *
     * @param obj    the proxy instance on which the method is being called.
     *               This is the proxy object created by CGLIB.
     * @param method the method being intercepted.
     *               This is the method that is being called on the proxy instance.
     * @param args   the arguments passed to the method.
     *               This array contains the parameters with which the method was invoked.
     * @param proxy  a MethodProxy instance that can be used to invoke the original method.
     *               This allows the method invocation to proceed as usual.
     * @return the result of the method invocation.
     * This is the value returned by the original method.
     * @throws Throwable if any error occurs during method invocation.
     *                   This exception will be propagated to the caller of the method.
     */
    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("Before method: " + method.getName());
        Object result = proxy.invokeSuper(obj, args);
        System.out.println("After method: " + method.getName());
        return result;
    }
}
