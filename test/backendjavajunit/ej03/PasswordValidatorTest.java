package backendjavajunit.ej03;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author juan
 */
public class PasswordValidatorTest {
    
    private static PasswordValidator pv;
    private static String validPassword;
    private static String invalidPasswordNoDigitsNoMinLength;
    private static String invalidPasswordNoUpperCase;
    private static String invalidPasswordNoLowerCase;
    private static String invalidPasswordNoSpecialChars;
    
    @BeforeClass
    public static void setUpClass() {
        pv = new PasswordValidator();
        validPassword = "123qweASD$%&";
        invalidPasswordNoDigitsNoMinLength = "asdASD$%&";
        invalidPasswordNoUpperCase = "1234qwe$%&";
        invalidPasswordNoLowerCase = "1234ASD$%&";
        invalidPasswordNoSpecialChars = "1234qweASD";
    }

    @Test
    public void testHasMinimumLengthValid() {
        assertTrue(pv.hasMinimumLength(validPassword));
    }

    @Test
    public void testHasMinimumLengthInvalid() {
        assertFalse(pv.hasMinimumLength(invalidPasswordNoDigitsNoMinLength));
    }

    @Test
    public void testHasSpecialCharactersValid() {
        assertTrue(pv.hasSpecialCharacters(validPassword));
    }

    @Test
    public void testHasSpecialCharactersInvalid() {
        assertFalse(pv.hasSpecialCharacters(invalidPasswordNoSpecialChars));
    }

    @Test
    public void testHasLowerCaseLetterValid() {
        assertTrue(pv.hasLowerCaseLetter(validPassword));
    }

    @Test
    public void testHasLowerCaseLetterInvalid() {
        assertFalse(pv.hasLowerCaseLetter(invalidPasswordNoLowerCase));
    }

    @Test
    public void testHasUpperCaseLetterValid() {
        assertTrue(pv.hasUpperCaseLetter(validPassword));
    }

    @Test
    public void testHasUpperCaseLetterInvalid() {
        assertFalse(pv.hasUpperCaseLetter(invalidPasswordNoUpperCase));
    }

    @Test
    public void testHasNumericValueValid() {
        assertTrue(pv.hasNumericValue(validPassword));
    }
    
    @Test
    public void testHasNumericValueInvalid() {
        assertFalse(pv.hasNumericValue(invalidPasswordNoDigitsNoMinLength));
    }
    
}
