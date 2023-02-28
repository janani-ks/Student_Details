package student;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Students
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Scanner scan1 = new Scanner(System.in);
		PrintStream display=new PrintStream((new FileOutputStream(FileDescriptor.out)));
		display.println("Enter Student Details : ");
		display.print("Student Name = ");
		String studentname = scan1.nextLine();
		display.print("Student Grade = ");
		String studentgrade = scan1.nextLine();
		display.print("Student GPA = ");
		double gpa = scan.nextDouble();
		Details obj = new Details ( studentname, studentgrade , gpa );
		display.println("Enter the choice you want \n \t1.Update GPA \n\t2.Display GPA");
		int choice = scan.nextInt();
		switch(choice) {
		case 1:
		display.print("Student New GPA = ");
		gpa = scan.nextDouble();
        obj.update(gpa);
		case 2:
        display.println(obj.print());
        break;
        default:
        display.print("Invalid Choice");
		}
		display.println("--------------------X---------------------");
	}
}
