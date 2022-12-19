package com.luv2code.junitdemo;

import org.junit.jupiter.api.*;

import java.time.Duration;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.DisplayName.class)
class DemoUtilsTest {

    DemoUtils demoUtils;


    @BeforeEach
    void setUpBeforeEach() {
        demoUtils = new DemoUtils();
//        System.out.println("@BeforeEach executes before the execution of each test method");
    }

    @DisplayName("Multiply")
    @Test
    void testMultiply() {
        assertEquals(12, demoUtils.multiply(4, 3), "4 * 3 must be 12");
    }

    @Test
    @DisplayName("Equals and not equals")
    void testEqualsAndNotEquals() {
        System.out.println("Running test: testEqualsAndNotEquals");

        assertEquals(6, demoUtils.add(3, 3), " 3 + 3 equals 6");
        assertNotEquals(6, demoUtils.add(1, 9), " 1 + 9 must not be 6");
    }

    @Test
    @DisplayName("Null and not null")
    void testNullAndNotNull() {
        System.out.println("Running test: testNullAndNotNull");

        String str1 = new String("Not Null");
        String str2 = null;

        assertNotNull(demoUtils.checkNull(str1), "object should not be null");
        assertNull(demoUtils.checkNull(str2), "object should be null");
    }

    @DisplayName("Same and not same")
    @Test
    void sameAndNotSame() {
        String str = "luv2Code";

        assertSame(demoUtils.getAcademy(), demoUtils.getAcademyDuplicate(), "object should refer to the same object");
        assertNotSame(str, demoUtils.getAcademy(), "objects should not refer to the same object");
    }

    @DisplayName("True or false")
    @Test
    void trueOrFalse(){
        int num1 = 3;
        int num2 = 2;
        int num3 = 4;
        int num4 = 5;

        assertTrue(demoUtils.isGreater(num1, num2), "This should return true");
        assertFalse(demoUtils.isGreater(num3, num4), "This should return false");
    }

    @DisplayName("Array Equals")
    @Test
    void testArrayEquals(){
        String[] stringArr = { "A", "B", "C"};

        assertArrayEquals(stringArr, demoUtils.getFirstThreeLettersOfAlphabet(), "Arrays should be the same");
    }

    @DisplayName("Iterable Equals")
    @Test
    void testIterableEquals(){
        List<String> theList = List.of("luv", "2", "code");


        assertIterableEquals(theList, demoUtils.getAcademyInList(), "Iterable should be the same");
    }

    @DisplayName("Lines match")
    @Test
    void testLinesMatch(){
        List<String> theList = List.of("luv", "2", "code");


        assertLinesMatch(theList, demoUtils.getAcademyInList(), "Lines should match");
    }

    @DisplayName("Throws and does not throw")
    @Test
    void testThrowsAndDoesNotThrow(){
        assertThrows(Exception.class, () -> demoUtils.throwException(-1), "should throw exception");
        assertDoesNotThrow(() -> demoUtils.throwException(1), "should not throw exception");
    }

    @DisplayName("Timeout")
    @Test
    void testTimeout(){
        assertTimeoutPreemptively(Duration.ofSeconds(3), () -> demoUtils.checkTimeout(), "Method should execute in 3 seconds");
    }
//    @BeforeAll
//    static void setUpBeforeEachClass() {
//        System.out.println("@BeforeAll executes only once before all test methods");
//    }
//
//    @AfterAll
//    static void tearDownAfterAll() {
//        System.out.println("@AfterAll executes only once after all test methods");
//    }
//
//    @AfterEach
//    void teardownAfterEach() {
//        System.out.println("Running @AfterEach");
//    }


}
