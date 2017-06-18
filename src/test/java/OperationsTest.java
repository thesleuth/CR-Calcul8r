import org.junit.Test;
import org.junit.Assert;

public class OperationsTest {
    @Test
    public void testAdd() throws Exception {
        Assert.assertEquals(2, Operations.add(1, 1));
    }
}
