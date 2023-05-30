import static org.junit.jupiter.api.Assertions.*;

class MainTest {
// 윤년 맞추기
    @org.junit.jupiter.api.Test
    void checkLeapYear() {
        assertEquals(false, Main.checkLeapYear(1700));
    }

    @org.junit.jupiter.api.Test
    void testLeapYear() {
        assertEquals(true, Main.isLeapYear(2020));
        assertEquals(false, Main.isLeapYear(1900));
        assertEquals(true, Main.isLeapYear(2400));
    }
// 369게임
    @org.junit.jupiter.api.Test
    void testis369() {
        assertEquals("*", Main.is369(3));
        assertEquals("", Main.is369(15));
        assertEquals("**", Main.is369(33));
        assertEquals("***", Main.is369(333));
        assertEquals("****", Main.is369(3369));
    }
}
