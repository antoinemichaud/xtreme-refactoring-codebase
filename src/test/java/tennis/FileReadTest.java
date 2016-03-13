package tennis;

import com.google.common.io.Resources;
import org.junit.Test;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.fail;

public class FileReadTest {

    @Test
    public void should_read_resource_properly() {
        try {
            // Given / When
            String foobar = Resources.toString(Resources.getResource("foobar.txt"), StandardCharsets.UTF_8);

            // Then
            assertThat(foobar).isEqualTo("Can this file be read ?");
        } catch (IOException e) {
            fail("This test failed because of an exception :", e);
        }
    }
}
