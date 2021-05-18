package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Multiply operation.
 */
public class Multiply implements Calculate{
    // TODO - add your solution here.
    public void calculate(int value1,int value2){
        int c = value1 * value2;//multiply two values
        Integer ob = new Integer(c);
        String str = ob.toString();//toString conversion
        System.out.println(str);//string representation
    }
}
