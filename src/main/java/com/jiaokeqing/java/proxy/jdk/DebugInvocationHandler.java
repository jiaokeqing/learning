package com.jiaokeqing.java.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * The {@code DebugInvocationHandler} class is a JDK dynamic proxy handler.
 * <p>
 * This class implements the {@link InvocationHandler} interface and provides dynamic proxying for the {@link UseService}.
 * It intercepts method calls and adds debugging functionality.
 * </p>
 * <p>
 * Example usage:
 * <pre>
 *     UseService useService = new UseServiceImpl();
 *     UseService proxy = (UseService) Proxy.newProxyInstance(
 *         useService.getClass().getClassLoader(),
 *         useService.getClass().getInterfaces(),
 *         new DebugInvocationHandler(useService)
 *     );
 *     proxy.use();
 * </pre>
 *
 * @author jiaokeqing
 * @version 1.0
 * @since 2024-08-06
 */
public class DebugInvocationHandler implements InvocationHandler {

    private final Object target;

    /**
     * Constructs a new {@code DebugInvocationHandler} with the specified target object.
     *
     * @param target the target object to be proxied
     */
    public DebugInvocationHandler(Object target) {
        this.target = target;
    }

    /**
     * Processes a method invocation on a proxied instance and adds debugging functionality.
     *
     * @param proxy  the proxy instance that the method was invoked on
     * @param method the {@code Method} instance corresponding to the interface method invoked on the proxy instance
     * @param args   an array of objects containing the values of the arguments passed in the method invocation on the proxy instance
     * @return the value to return from the method invocation
     * @throws Throwable the exception to throw from the method invocation
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Before method: " + method.getName());
        Object result = method.invoke(target, args);
        System.out.println("After method: " + method.getName());
        return result;

    }
}
