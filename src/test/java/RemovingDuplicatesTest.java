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

    @Test
    public void testRemovingDuplicatesWithNullInput(){
        assertEquals("", RemovingDuplicates.removeDuplicates(null));
    }

    @Test
    public void testRemovingDuplicatesWithNoDuplicates(){
        assertEquals("ABCD123", RemovingDuplicates.removeDuplicates("ABCD123"));
    }

    @Test
    public void testRemovingDuplicatesWithAllSameDuplicates(){
        assertEquals("A", RemovingDuplicates.removeDuplicates("AAAAAAAAA"));
    }

    @Test
    public void testRemovingDuplicatesWithSpecialCharacters(){
        assertEquals("ABCD@%123", RemovingDuplicates.removeDuplicates("AABBCCD@@%1222233333"));
    }

}
