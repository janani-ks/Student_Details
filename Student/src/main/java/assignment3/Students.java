package assignment3;
import java.util.logging.Logger;
class Details{
    private String studentname;
    private String gradelevel;
    private double gpa;
    Details(String sn,String gl,double g){
        this.studentname = sn;
        this.gradelevel = gl;
        this.gpa = g;
    }
    void update(double g){
        this.gpa = g;
    }
    String print(){
        return studentname+" has a GPA as "+gpa;
    }
}
public class Students
{
	public static void main(String[] args) {
		Logger l = Logger.getLogger("com.api.jar");
		Details s = new Details ( "Janani", "5th" , 9.01 );
		String s1 = "9.2";
		float f = Float.parseFloat(s1);
        s.update(f);
        String l1 = s.print();
        l.info(l1);
	}
}
