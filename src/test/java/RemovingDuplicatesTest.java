import org.example.RemovingDuplicates;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RemovingDuplicatesTest {

    @Test
    public void testRemovingDuplicatesWithRegularInput(){
        assertEquals("ABCD123", RemovingDuplicates.removeDuplicates("AABBCCD112233"));
    }

    @Test
    public void testRemovingDuplicatesWithEmptyInput(){
        assertEquals("", RemovingDuplicates.removeDuplicates(""));
    }

}
