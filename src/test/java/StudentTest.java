import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void getName() {
        Student eins = new Student();
        eins.setName("Test");

        assertEquals("Test", eins.getName());
    }


    @Test
    void getAlter() {
            Student eins = new Student();
            eins.setAlter(12);

            assertEquals(12, eins.getAlter());
    }


    @Test
    void getGeschlecht() {
        Student eins = new Student();
        eins.setGeschlecht("Test");

        assertEquals("Test", eins.getGeschlecht());
    }


}