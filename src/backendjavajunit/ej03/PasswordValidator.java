package backendjavajunit.ej03;

public class PasswordValidator {
    
    public static int MINIMUM_LENGTH = 10;
    
    public boolean hasMinimumLength(String password) {
        return password.length() >= MINIMUM_LENGTH;
    }
    
    public boolean hasSpecialCharacters(String password) {
        return !password.chars().noneMatch(c -> 
                !Character.isLetterOrDigit(c)
                && !Character.isWhitespace(c));
    }
    
    public boolean hasLowerCaseLetter(String password) {
        return !password.chars().noneMatch(Character::isLowerCase);
    }
    
    public boolean hasUpperCaseLetter(String password) {
        return !password.chars().noneMatch(Character::isUpperCase);
    }
    
    public boolean hasNumericValue(String password) {
        return !password.chars().noneMatch(Character::isDigit);
    }
    
}
