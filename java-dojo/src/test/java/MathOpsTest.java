import static org.junit.jupiter.api.Assertions.assertEquals;

import com.dojo.sandbox.CodingExercises.TDD.MathOpsExample.MathOps;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MathOpsTest {
    // Arrange - set up the required objects/configurations
    MathOps mOps = new MathOps();

    @BeforeAll
    public static void displayBeforeStatement() {
        System.out.println("TESTING-MathOps");
    }

    @BeforeEach
    public void displayBeforeEachStatement() {
        System.out.println("Testing is amazing, wow!");
    }

    @AfterEach
    public void displayAfterEachStatement() {
        System.out.println("Look at my tests go!");
    }

    @DisplayName("Testing 2 Positive Numbers")
    @Test
    public void add_2_positive_numbers() {
        // Act - use (invoke) whatever you want to test
        int actual = mOps.add(5, 9);

        // Assert - check to see if the output is what you expected
        assertEquals(14, actual);
    }

    @DisplayName("Testing 2 Negative Numbers")
    @Test
    public void add_2_negative_numbers() {
        // Act - use (invoke) whatever you want to test
        int actual = mOps.add(-5, -9);

        // Assert - check to see if the output is what you expected
        assertEquals(-14, actual);
    }

    @DisplayName("Test 1 Negative # & 1 Positive #")
    @Test
    public void add_1positive_1negative_numbers() {
        // Act - use (invoke) whatever you want to test
        int actual = mOps.add(5, -9);

        // Assert - check to see if the output is what you expected
        assertEquals(-4, actual);
    }

    @AfterAll
    public static void displayAfterStatement() {
        System.out.println("DONE TESTING-MathOps");
    }

    
}