import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.services.FreelanceServices;


public class FreelanceServicesTest {

    @Test
    public void testCalculate() {
        FreelanceServices services = new FreelanceServices();

        int actual = FreelanceServices.calculate(10_000, 3_000, 20_000);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCalculate2() {
        FreelanceServices services = new FreelanceServices();

        int actual = FreelanceServices.calculate(100_000, 60_000, 150_000);
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }
}
