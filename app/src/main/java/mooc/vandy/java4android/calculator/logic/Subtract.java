package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Subtract operation.
 */
public class Subtract implements Calculate{
    // TODO - add your solution here.
    public void calculate(int value1,int value2){
        int b = value1 - value2;//subtract two values
        Integer ob = new Integer(b);
        String str = ob.toString();//toString conversion
        System.out.println(str);//string representation
    }
}
