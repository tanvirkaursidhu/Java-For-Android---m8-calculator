package mooc.vandy.java4android.calculator.logic;

import java.util.HashMap;

import mooc.vandy.java4android.calculator.ui.ActivityInterface;

/**
 * Performs an operation selected by the user.
 */
public class Logic implements LogicInterface {

    private static final int ADDITION = 1;
    private static final int SUBTRACTION = 2;
    private static final int MULTIPLICATION = 3;
    private static final int DIVISION = 4;
    /**
     * Reference to the Activity output.
     */
    protected ActivityInterface mOut;

    
    /**
     * Constructor initializes the field.
     */
    public Logic(ActivityInterface out) {
        mOut = out;
        
    }

    

    /**
     * Perform the operation on argumentOne and argumentTwo.
     */
    public void process(int argumentOne, int argumentTwo, int operation) {
        // TODO - Put your code here


        Add a = new Add();//creates object for add class
         Subtract s = new Subtract();//creates object for subtract class
         Multiply m = new Multiply();//creates object for multiply class
         Divide d = new Divide();//creates object for divide class

         switch(operation){//using switch case to perform specified operation
           case ADDITION :
               a.calculate(argumentOne,argumentTwo);//calls add method from add class
               break;
           case SUBTRACTION :
               s.calculate(argumentOne,argumentTwo);//calls subtract method from subtract class
               break;
           case MULTIPLICATION :
               m.calculate(argumentOne,argumentTwo);//invokes multiply method
               break;
           case DIVISION :
               d.calculate(argumentOne,argumentTwo);//invokes divide method
               break;
           default : a.calculate(argumentOne,argumentTwo);//calls add method for default case
       }
    }
}
