import org.junit.* ;
import static org.junit.Assert.* ;

import com.google.common.base.Joiner;

public class HoustonTest {
    @Test
    public void joinerShouldJoin() {
        Joiner j = Joiner.on("; ").skipNulls();
        assertTrue(j.join("Foo", null, "Bar").equals("Foo; Bar"));
    }
}

