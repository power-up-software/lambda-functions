package com.powerup.lambda.functions.api;

/**
 * The <code>ThreeParameterFunction</code> class defines a lambda expression function that takes three parameters and returns a value.
 *
 * @param <T> The first parameter of the function.
 * @param <U> The second parameter of the function.
 * @param <V> The third parameter of the function.
 * @param <W> The fourth parameter of the function.
 * @param <X> The fifth parameter of the function.
 * @param <R> The return value of the function.
 *
 * @author Chris Picard
 */
@SuppressWarnings("unused")
@FunctionalInterface
public interface FiveParameterFunction<T, U, V, R, W, X> {

    /**
     * Apply invokes the function this lambda function represents.
     *
     * @param one The first parameter of the function.
     * @param two The second parameter of the function.
     * @param three The third parameter of the function.
     * @param four The fourth parameter of the function.
     * @param five The fifth parameter of the function.
     *
     * @return The return value of the function.
     */
    R apply(T one, U two, V three, W four, X five);
}