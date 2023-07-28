package civitas.celestis.util;

import civitas.celestis.number.Vector;

import javax.annotation.Nonnull;

/**
 * <h2>Wormhole</h2>
 * <p>A wormhole.</p>
 * @param origin
 * @param destination
 */
public record Wormhole(
        @Nonnull Vector origin,
        @Nonnull Coordinate destination
) {
}
