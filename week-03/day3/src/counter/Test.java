package counter;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test {
    Counter c = new Counter();

    @org.junit.Test
    public void addMore () {
        c.add(5);
        assertEquals(5, c.get());
    }

    @org.junit.Test
    public void addOne () {
        c.add();
        assertEquals(1, c.get());
    }

    @org.junit.Test
    public void getZero () {
        assertEquals(0, c.get());
    }

    @org.junit.Test
    public void getInit () {
        Counter c = new Counter(7);
        assertEquals(7, c.get());
    }

    @org.junit.Test
    public void resetToZero () {
        c.add();
        c.reset();
        assertEquals(0, c.get());
    }

    @org.junit.Test
    public void resetToInit () {
        Counter c = new Counter(7);
        c.add(5);
        c.reset();
        assertEquals(7, c.get());
    }
}
