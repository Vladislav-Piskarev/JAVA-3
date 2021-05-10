package Java_3.Lesson_7.HomeWork_7.Testing;

public class TestPet {
    @BeforeSuite
    void setUp() {
        System.out.println("Settings up...");
    }

    @AfterSuite
    void tearDown() {
        System.out.println("Finalizing test class...");
    }

    @Test(order = 1)
    void shouldTestSomethingOne() {
        System.out.println("Method-1 with test annotation...");
    }

    @Test(order = 3)
    void shouldTestSomethingThree() {
        System.out.println("Method-3 with test annotation...");
    }

    @Test(order = 2)
    void shouldTestSomethingTwo() {
        System.out.println("Method-2 with test annotation...");
    }

    void shouldTestSomething2() {
        System.out.println("Method without test annotation...");
    }
}
