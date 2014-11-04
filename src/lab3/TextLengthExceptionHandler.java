/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author Matthew
 */
public class TextLengthExceptionHandler extends IllegalArgumentException{
    private static String textLengthMessage = "Entry violates text length requirements!";

    public TextLengthExceptionHandler() {
        super(textLengthMessage);
    }

    public TextLengthExceptionHandler(String s) {
        super(textLengthMessage);
    }

    public TextLengthExceptionHandler(String message, Throwable cause) {
        super(textLengthMessage, cause);
    }

    public TextLengthExceptionHandler(Throwable cause) {
        super(cause);
    }
    
    
}
