package com.jiaokeqing.java.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;

/**
 * Factory class for creating CGLIB proxies.
 * <p>
 * The `CglibProxyFactory` class provides a method to create proxy instances
 * for any given class using CGLIB. It sets up the proxy with a custom
 * method interceptor (`DebugMethodInterceptor`) to log method calls.
 * <p>
 * Example usage:
 * <pre>
 *     UseService useService = (UseService) CglibProxyFactory.getProxy(UseService.class);
 *     useService.send();
 * </pre>
 *
 * @author jiaokeqing
 * @since 2024-08-05
 */
public class CglibProxyFactory {

    /**
     * Creates a CGLIB proxy for the specified class.
     * <p>
     * This method sets up the `Enhancer` to create a proxy for the given class.
     * It configures the class loader, sets the superclass, and assigns a
     * custom method interceptor (`DebugMethodInterceptor`) to log method calls.
     *
     * @param clazz the class for which the proxy should be created.
     *              This is the class that the proxy will extend.
     * @return the proxy instance created by CGLIB.
     */
    public static Object getProxy(Class<?> clazz) {
        Enhancer enhancer = new Enhancer();

        // Set the class loader for the proxy class
        enhancer.setClassLoader(clazz.getClassLoader());

        // Set the superclass of the proxy to be the provided class
        enhancer.setSuperclass(clazz);

        // Set the callback to our custom method interceptor
        enhancer.setCallback(new DebugMethodInterceptor());

        // Create and return the proxy instance
        return enhancer.create();
    }
}
