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
public class RequiredTextExceptionHandler extends IllegalArgumentException{
    private static String textMessage = "Text Entry is Required!";

    public RequiredTextExceptionHandler() {
        super(textMessage);
    }

    public RequiredTextExceptionHandler(String s) {
        super(textMessage);
    }

    public RequiredTextExceptionHandler(String message, Throwable cause) {
        super(textMessage, cause);
    }

    public RequiredTextExceptionHandler(Throwable cause) {
        super(cause);
    }
    
    
}
