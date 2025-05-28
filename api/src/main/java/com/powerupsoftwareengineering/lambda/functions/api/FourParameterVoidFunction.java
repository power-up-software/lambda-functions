package com.powerupsoftwareengineering.lambda.functions.api;

/**
 * The <code>ThreeParameterVoidFunction</code> class defines a lambda expression function that takes three parameters with no return value.
 *
 * @param <T> The first parameter of the function.
 * @param <U> The second parameter of the function.
 * @param <V> The third parameter of the function.
 * @param <W> The fourth parameter of the function.
 *
 * @author Chris Picard
 */
@SuppressWarnings("unused")
@FunctionalInterface
public interface FourParameterVoidFunction<T, U, V, W> {

    /**
     * Apply invokes the function this lambda function represents.
     *
     * @param one The first parameter of the function.
     * @param two The second parameter of the function.
     * @param three The third parameter of the function.
     * @param four The fourth parameter of the function.
     */
    void apply(T one, U two, V three, W four);
}