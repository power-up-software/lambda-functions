package com.powerup.lambda.functions.api;

/**
 * The <code>TwoParameterFunction</code> class defines a lambda expression function that takes two parameters and returns a value.
 *
 * @param <T> The first parameter of the function.
 * @param <U> The second parameter of the function.
 * @param <R> The return value of the function.
 *
 * @author Chris Picard
 */
@SuppressWarnings("unused")
@FunctionalInterface
public interface TwoParameterFunction<T, U, R> {

    /**
     * Apply invokes the function this lambda function represents.
     *
     * @param one The first parameter of the function.
     * @param two The second parameter of the function.
     *
     * @return The return value of the function.
     */
    R apply(T one, U two);
}