/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package utils;

import java.util.Scanner;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Abner Arboleda, Logic Legion, DCCO-ESPE
 */
public class ValidationTest {

    public ValidationTest() {
    }

    /**
     * Test of validationOfInt method, of class Validation.
     */
    @Test
    public void testValidationOfInt_ValidInt() {
        System.out.println("validationOfInt - Valid Int");
        int number = 5;
        Scanner scanner = new Scanner("5");
        int expResult = 5;
        int result = ValidationOfData.validationOfInt(number, scanner);
        assertEquals(expResult, result);
    }

    @Test
    public void testValidationOfInt_InvalidInt() {
        System.out.println("validationOfInt - Invalid Int");
        int number = 0;
        Scanner scanner = new Scanner("a");
        int expResult = 0;
        int result = ValidationOfData.validationOfInt(number, scanner);
        assertEquals(expResult, result);
    }

    @Test
    public void testValidationOfInt_NegativeInt() {
        System.out.println("validationOfInt - Negative Int");
        int number = -3;
        Scanner scanner = new Scanner("-3");
        int expResult = -3;
        int result = ValidationOfData.validationOfInt(number, scanner);
        assertEquals(expResult, result);
    }

    @Test
    public void testValidationOfInt_Zero() {
        System.out.println("validationOfInt - Zero");
        int number = 0;
        Scanner scanner = new Scanner("0");
        int expResult = 0;
        int result = ValidationOfData.validationOfInt(number, scanner);
        assertEquals(expResult, result);
    }

    @Test
    public void testValidationOfInt_PositiveInt() {
        System.out.println("validationOfInt - Positive Int");
        int number = 123;
        Scanner scanner = new Scanner("123");
        int expResult = 123;
        int result = ValidationOfData.validationOfInt(number, scanner);
        assertEquals(expResult, result);
    }

    @Test
    public void testValidationOfInt_Whitespace() {
        System.out.println("validationOfInt - Whitespace");
        int number = 0;
        Scanner scanner = new Scanner(" ");
        int expResult = 0;
        int result = ValidationOfData.validationOfInt(number, scanner);
        assertEquals(expResult, result);
    }

    @Test
    public void testValidationOfInt_EmptyInput() {
        System.out.println("validationOfInt - Empty Input");
        int number = 0;
        Scanner scanner = new Scanner("");
        int expResult = 0;
        int result = ValidationOfData.validationOfInt(number, scanner);
        assertEquals(expResult, result);
    }

    @Test
    public void testValidationOfInt_MaxInt() {
        System.out.println("validationOfInt - Max Int");
        int number = Integer.MAX_VALUE;
        Scanner scanner = new Scanner(String.valueOf(Integer.MAX_VALUE));
        int expResult = Integer.MAX_VALUE;
        int result = ValidationOfData.validationOfInt(number, scanner);
        assertEquals(expResult, result);
    }

    @Test
    public void testValidationOfInt_MinInt() {
        System.out.println("validationOfInt - Min Int");
        int number = Integer.MIN_VALUE;
        Scanner scanner = new Scanner(String.valueOf(Integer.MIN_VALUE));
        int expResult = Integer.MIN_VALUE;
        int result = ValidationOfData.validationOfInt(number, scanner);
        assertEquals(expResult, result);
    }

    @Test
    public void testValidationOfInt_NonNumericString() {
        System.out.println("validationOfInt - Non Numeric String");
        int number = 0;
        Scanner scanner = new Scanner("abc");
        int expResult = 0;
        int result = ValidationOfData.validationOfInt(number, scanner);
        assertEquals(expResult, result);
    }

    /**
     * Test of validationOfFloat method, of class Validation.
     */
    @Test
    public void testValidationOfFloat_ValidFloat() {
        Scanner scanner = new Scanner("3.14");
        float result = ValidationOfData.validationOfFloat(3.14f, scanner);
        assertEquals(3.14f, result);
    }

    @Test
    public void testValidationOfFloat_InvalidFloat() {
        Scanner scanner = new Scanner("abc");
        float result = ValidationOfData.validationOfFloat(0.0f, scanner);
        assertEquals(0.0f, result); // Suponiendo que devuelve 0.0 si es inválido
    }

    @Test
    public void testValidationOfFloat_NegativeFloat() {
        Scanner scanner = new Scanner("-3.14");
        float result = ValidationOfData.validationOfFloat(-3.14f, scanner);
        assertEquals(-3.14f, result);
    }

    @Test
    public void testValidationOfFloat_Zero() {
        Scanner scanner = new Scanner("0.0");
        float result = ValidationOfData.validationOfFloat(0.0f, scanner);
        assertEquals(0.0f, result);
    }

    @Test
    public void testValidationOfFloat_PositiveFloat() {
        Scanner scanner = new Scanner("123.456");
        float result = ValidationOfData.validationOfFloat(123.456f, scanner);
        assertEquals(123.456f, result);
    }

    @Test
    public void testValidationOfFloat_Whitespace() {
        Scanner scanner = new Scanner(" ");
        float result = ValidationOfData.validationOfFloat(0.0f, scanner);
        assertEquals(0.0f, result); // Suponiendo que devuelve 0.0 si es inválido
    }

    @Test
    public void testValidationOfFloat_EmptyInput() {
        Scanner scanner = new Scanner("");
        float result = ValidationOfData.validationOfFloat(0.0f, scanner);
        assertEquals(0.0f, result); // Suponiendo que devuelve 0.0 si es inválido
    }

    @Test
    public void testValidationOfFloat_MaxFloat() {
        Scanner scanner = new Scanner(String.valueOf(Float.MAX_VALUE));
        float result = ValidationOfData.validationOfFloat(Float.MAX_VALUE, scanner);
        assertEquals(Float.MAX_VALUE, result);
    }

    @Test
    public void testValidationOfFloat_MinFloat() {
        Scanner scanner = new Scanner(String.valueOf(Float.MIN_VALUE));
        float result = ValidationOfData.validationOfFloat(Float.MIN_VALUE, scanner);
        assertEquals(Float.MIN_VALUE, result);
    }

    @Test
    public void testValidationOfFloat_NonNumericString() {
        Scanner scanner = new Scanner("abc");
        float result = ValidationOfData.validationOfFloat(0.0f, scanner);
        assertEquals(0.0f, result); // Suponiendo que devuelve 0.0 si es inválido
    }

    /**
     * Test of validationOfCharacter method, of class Validation.
     */
    @Test
    public void testValidationOfCharacter_OnlyLetters() {
        String phrase = "abcDEF";
        boolean result = ValidationOfData.validationOfCharacter(phrase);
        assertTrue(result);
    }

    @Test
    public void testValidationOfCharacter_ContainsNumbers() {
        String phrase = "abc123";
        boolean result = ValidationOfData.validationOfCharacter(phrase);
        assertFalse(result);
    }

    @Test
    public void testValidationOfCharacter_ContainsSpecialCharacters() {
        String phrase = "abc@#";
        boolean result = ValidationOfData.validationOfCharacter(phrase);
        assertFalse(result);
    }

    @Test
    public void testValidationOfCharacter_EmptyString() {
        String phrase = "";
        boolean result = ValidationOfData.validationOfCharacter(phrase);
        assertFalse(result);
    }

    @Test
    public void testValidationOfCharacter_NullString() {
        String phrase = null;
        boolean result = ValidationOfData.validationOfCharacter(phrase);
        assertFalse(result);
    }

    @Test
    public void testValidationOfCharacter_Whitespace() {
        String phrase = " ";
        boolean result = ValidationOfData.validationOfCharacter(phrase);
        assertFalse(result);
    }

    @Test
    public void testValidationOfCharacter_UppercaseLetters() {
        String phrase = "ABC";
        boolean result = ValidationOfData.validationOfCharacter(phrase);
        assertTrue(result);
    }

    @Test
    public void testValidationOfCharacter_LowercaseLetters() {
        String phrase = "abc";
        boolean result = ValidationOfData.validationOfCharacter(phrase);
        assertTrue(result);
    }

    @Test
    public void testValidationOfCharacter_MixedCaseLetters() {
        String phrase = "aBcDeF";
        boolean result = ValidationOfData.validationOfCharacter(phrase);
        assertTrue(result);
    }

    @Test
    public void testValidationOfCharacter_WhitespaceAndLetters() {
        String phrase = "a b c";
        boolean result = ValidationOfData.validationOfCharacter(phrase);
        assertFalse(result);
    }

    /**
     * Test of validationEmail method, of class Validation.
     */
    @Test
    public void testValidationEmail_ValidEmail() {
        String email = "test@example.com";
        boolean result = ValidationOfData.validationEmail(email);
        assertTrue(result);
    }

    @Test
    public void testValidationEmail_InvalidEmail_NoAtSymbol() {
        String email = "testexample.com";
        boolean result = ValidationOfData.validationEmail(email);
        assertFalse(result);
    }

    @Test
    public void testValidationEmail_InvalidEmail_NoDomain() {
        String email = "test@";
        boolean result = ValidationOfData.validationEmail(email);
        assertFalse(result);
    }

    @Test
    public void testValidationEmail_InvalidEmail_SpecialCharacters() {
        String email = "test@exam!ple.com";
        boolean result = ValidationOfData.validationEmail(email);
        assertFalse(result);
    }

    @Test
    public void testValidationEmail_EmptyString() {
        String email = "";
        boolean result = ValidationOfData.validationEmail(email);
        assertFalse(result);
    }

    @Test
    public void testValidationEmail_NullString() {
        String email = null;
        boolean result = ValidationOfData.validationEmail(email);
        assertFalse(result);
    }

    @Test
    public void testValidationEmail_Whitespace() {
        String email = " ";
        boolean result = ValidationOfData.validationEmail(email);
        assertFalse(result);
    }

    @Test
    public void testValidationEmail_ValidEmail_Subdomain() {
        String email = "test@mail.example.com";
        boolean result = ValidationOfData.validationEmail(email);
        assertTrue(result);
    }

    @Test
    public void testValidationEmail_ValidEmail_WithNumbers() {
        String email = "test123@example.com";
        boolean result = ValidationOfData.validationEmail(email);
        assertTrue(result);
    }

    @Test
    public void testValidationEmail_InvalidEmail_TwoAtSymbols() {
        String email = "test@@example.com";
        boolean result = ValidationOfData.validationEmail(email);
        assertFalse(result);
    }

    /**
     * Test of validationDni method, of class Validation.
     */
    @Test
    public void testValidationDni_ContainsLetters() {
        String dni = "12345abcde";
        boolean result = ValidationOfData.validationDni(10, dni);
        assertFalse(result);
    }

    @Test
    public void testValidationDni_ContainsSpecialCharacters() {
        String dni = "12345@#$%^";
        boolean result = ValidationOfData.validationDni(10, dni);
        assertFalse(result);
    }

    @Test
    public void testValidationDni_ValidLengthInvalidContent() {
        String dni = "abcdefghij";
        boolean result = ValidationOfData.validationDni(10, dni);
        assertFalse(result);
    }

    @Test
    public void testValidationDni_ValidLengthWhitespace() {
        String dni = "12345 6789";
        boolean result = ValidationOfData.validationDni(10, dni);
        assertFalse(result);
    }

    @Test
    public void testValidationDni_NullString() {
        String dni = null;
        boolean result = ValidationOfData.validationDni(10, dni);
        assertFalse(result);
    }

    @Test
    public void testValidationDni_AllZeros() {
        String dni = "0000000000";
        boolean result = ValidationOfData.validationDni(10, dni);
        assertFalse(result);
    }

    @Test
    public void testValidationDni_WhitespaceOnly() {
        String dni = "          ";
        boolean result = ValidationOfData.validationDni(10, dni);
        assertFalse(result);
    }

    public void testValidationDni_RealDni() {
        String dni = "1724122427";
        boolean result = ValidationOfData.validationDni(10, dni);
        assertTrue(result);
    }

    /**
     * Test of validationPhoneNumber method, of class Validation.
     */
    @Test
    public void testValidationPhoneNumber_ValidPhoneNumber() {
        String phoneNumber = "1234567890";
        boolean result = ValidationOfData.validationPhoneNumber(phoneNumber);
        assertTrue(result);
    }

    @Test
    public void testValidationPhoneNumber_InvalidPhoneNumber_TooShort() {
        String phoneNumber = "12345";
        boolean result = ValidationOfData.validationPhoneNumber(phoneNumber);
        assertFalse(result);
    }

    @Test
    public void testValidationPhoneNumber_InvalidPhoneNumber_TooLong() {
        String phoneNumber = "123456789012345";
        boolean result = ValidationOfData.validationPhoneNumber(phoneNumber);
        assertFalse(result);
    }

    @Test
    public void testValidationPhoneNumber_EmptyString() {
        String phoneNumber = "";
        boolean result = ValidationOfData.validationPhoneNumber(phoneNumber);
        assertFalse(result);
    }

    @Test
    public void testValidationPhoneNumber_ContainsLetters() {
        String phoneNumber = "12345abcde";
        boolean result = ValidationOfData.validationPhoneNumber(phoneNumber);
        assertFalse(result);
    }

    @Test
    public void testValidationPhoneNumber_ContainsSpecialCharacters() {
        String phoneNumber = "12345@#$%^";
        boolean result = ValidationOfData.validationPhoneNumber(phoneNumber);
        assertFalse(result);
    }

    @Test
    public void testValidationPhoneNumber_ValidPhoneNumberWithSpaces() {
        String phoneNumber = "123 456 7890";
        boolean result = ValidationOfData.validationPhoneNumber(phoneNumber);
        assertFalse(result);
    }

    @Test
    public void testValidationPhoneNumber_NullString() {
        String phoneNumber = null;
        boolean result = ValidationOfData.validationPhoneNumber(phoneNumber);
        assertFalse(result);
    }

    @Test
    public void testValidationPhoneNumber_AllZeros() {
        String phoneNumber = "0000000000";
        boolean result = ValidationOfData.validationPhoneNumber(phoneNumber);
        assertFalse(result);
    }

    @Test
    public void testValidationPhoneNumber_WhitespaceOnly() {
        String phoneNumber = "          ";
        boolean result = ValidationOfData.validationPhoneNumber(phoneNumber);
        assertFalse(result);
    }

    /**
     * Test of validationGrade method, of class Validation.
     */
    @Test
    public void testValidationGrade_ValidGrade() {
        String grade = "85";
        boolean result = ValidationOfData.validationGrade(grade);
        assertTrue(result);
    }

    @Test
    public void testValidationGrade_InvalidGrade_NegativeNumber() {
        String grade = "-10";
        boolean result = ValidationOfData.validationGrade(grade);
        assertFalse(result);
    }

    @Test
    public void testValidationGrade_InvalidGrade_Above100() {
        String grade = "110";
        boolean result = ValidationOfData.validationGrade(grade);
        assertFalse(result);
    }

    @Test
    public void testValidationGrade_EmptyString() {
        String grade = "";
        boolean result = ValidationOfData.validationGrade(grade);
        assertFalse(result);
    }

    @Test
    public void testValidationGrade_ContainsLetters() {
        String grade = "85a";
        boolean result = ValidationOfData.validationGrade(grade);
        assertFalse(result);
    }

    @Test
    public void testValidationGrade_ContainsSpecialCharacters() {
        String grade = "85@";
        boolean result = ValidationOfData.validationGrade(grade);
        assertFalse(result);
    }

    @Test
    public void testValidationGrade_ValidDecimalGrade() {
        String grade = "85.5";
        boolean result = ValidationOfData.validationGrade(grade);
        assertTrue(result);
    }

    @Test
    public void testValidationGrade_ValidGradeWithSpaces() {
        String grade = " 85 ";
        boolean result = ValidationOfData.validationGrade(grade);
        assertTrue(result);
    }

    @Test
    public void testValidationGrade_NullString() {
        String grade = null;
        boolean result = ValidationOfData.validationGrade(grade);
        assertFalse(result);
    }

    @Test
    public void testValidationGrade_WhitespaceOnly() {
        String grade = " ";
        boolean result = ValidationOfData.validationGrade(grade);
        assertFalse(result);
    }

}
