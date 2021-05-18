package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Add operation.
 */
public class Add implements Calculate{
    // TODO - add your solution here.
    public void calculate(int value1,int value2){
        int a = value1 + value2;//adds two values
        Integer ob = new Integer(a);
        String str = ob.toString();//toString conversion
        System.out.println(str);//string representation
    }
}
