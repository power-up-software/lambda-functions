/*
 * Copyright (c) Power Up Software Engineering LLC 2026.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <https://www.gnu.org/licenses/>.
 */

package com.powerupsoftwareengineering.lambda.functions.api;

/**
 * The <code>ThreeParameterFunction</code> class defines a lambda expression function that takes three parameters and returns a value.
 *
 * @param <T> The first parameter of the function.
 * @param <U> The second parameter of the function.
 * @param <V> The third parameter of the function.
 * @param <W> The fourth parameter of the function.
 * @param <R> The return value of the function.
 *
 * @author Chris Picard
 */
@SuppressWarnings("unused")
@FunctionalInterface
public interface FourParameterFunction<T, U, V, W, R> {

    /**
     * Apply invokes the function this lambda function represents.
     *
     * @param one The first parameter of the function.
     * @param two The second parameter of the function.
     * @param three The third parameter of the function.
     * @param four The fourth parameter of the function.
     *
     * @return The return value of the function.
     */
    R apply(T one, U two, V three, W four);
}