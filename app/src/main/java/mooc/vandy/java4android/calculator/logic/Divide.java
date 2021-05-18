package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Divide operation.
 */
public class Divide implements Calculate{
    // TODO - add your solution here.
    public void calculate(int value1,int value2){
        if(value2 == 0){
            System.out.println("Division by 0");//invalid division
        }
        else{
          int d = value1 / value2;//calculating quotient
          int e = value1 % value2;//calculating remainder
          Integer ob = new Integer(d);
          String f = ob.toString();//toString conversion for quotient
          Integer obj = new Integer(e);
          String g = obj.toString();//toString conversion for remainder
          System.out.println(f + " R: " + g);//string representation
        }

    }
}
