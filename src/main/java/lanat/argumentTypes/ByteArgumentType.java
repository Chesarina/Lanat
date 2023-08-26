package lanat.argumentTypes;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.function.Function;

/**
 * An argument type that takes a byte value.
 */
public class ByteArgumentType extends NumberArgumentType<Byte> {
	@Override
	protected @NotNull Function<@NotNull String, @NotNull Byte> getParseFunction() {
		return Byte::parseByte;
	}

	@Override
	public @Nullable String getDescription() {
		return "A small integer value. (-128 to 127)";
	}
}