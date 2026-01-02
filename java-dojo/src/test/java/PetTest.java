// import static org.mockito.Mockito.mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import com.armando.sandbox.CodingExercises.BDD.MockitoExample.Pet;

import org.junit.jupiter.api.DisplayName;
// import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
// import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

// public class PetTest {
    // * Method 1) Creating mock object using the mock() method
    // Pet petMock = mock(Pet.class);

    // * Method 2) Using the @Mock annotation
    // * (requires initialization with MockitoAnnotations.openMocks(this) or @ExtendWith(MockitoExtension.class)
    // @Mock
    // Pet petMock;

    // @BeforeEach
    // public void setUpTests() {
    //     MockitoAnnotations.openMocks(this);
    // }

    // * OR
// }

@ExtendWith(MockitoExtension.class)
public class PetTest {
    @Mock
    Pet petMock;

    @DisplayName("Testing w/o Stubbing")
    @Test
    public void talk_returnsNull() {
        String actual = petMock.talk();
        String expected = null;

        assertEquals(expected, actual); // test passes
    }

    @DisplayName("Testing w/ Stubbing")
    @Test
    public void talk_returnsMeow() {
        when(petMock.talk()).thenReturn("Meow");
        assertEquals("Meow", petMock.talk());
    }
}