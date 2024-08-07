package com.jiaokeqing.java.proxy.jdk;

import java.lang.reflect.Proxy;

/**
 * The {@code JdkProxyFactory} class provides a factory method to create JDK dynamic proxy instances.
 * <p>
 * This class includes a static method {@code getProxy} which takes a target object and returns a proxy instance
 * that implements the same interfaces as the target object and uses the {@link DebugInvocationHandler} to handle method invocations.
 * </p>
 * <p>
 * Example usage:
 * <pre>
 *     UseService useService = new UseServiceImpl();
 *     UseService proxy = (UseService) JdkProxyFactory.getProxy(useService);
 *     proxy.use();
 * </pre>
 *
 * @author jiaokeqing
 * @version 1.0
 * @since 2024-08-05
 */
public class JdkProxyFactory {

    /**
     * Creates a proxy instance for the specified target object.
     * <p>
     * The proxy instance will implement all interfaces implemented by the target object and
     * will delegate method invocations to a {@link DebugInvocationHandler}.
     * </p>
     *
     * @param target the target object for which to create a proxy
     * @return a proxy instance that implements the same interfaces as the target object
     */
    public static Object getProxy(Object target) {
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new DebugInvocationHandler(target)
        );
    }
}