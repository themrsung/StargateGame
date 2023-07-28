package civitas.celestis.util;

import civitas.celestis.number.Vector;

import javax.annotation.Nonnull;

/**
 * <h2>Coordinate</h2>
 * <p>
 *     A coordinate.
 *     While this is not very efficient, this coordinate system is still used
 *     to honor the Stargate spirit.
 * </p>
 *
 * @param a Point A
 * @param b Point B
 * @param c Point C
 * @param d Point D
 * @param e Point E
 * @param f Point F
 */
public record Coordinate(
        @Nonnull Vector a,
        @Nonnull Vector b,
        @Nonnull Vector c,
        @Nonnull Vector d,
        @Nonnull Vector e,
        @Nonnull Vector f
) {
}
