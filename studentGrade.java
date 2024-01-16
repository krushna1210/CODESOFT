import java.util.*;

class studentGrade
{

	static String gradeCalculation(float average)
	{
		if(average >95 && average <=100)
		{
			return "A+";
		}
		else if(average > 90 && average <= 95)
		{
			return "A";
		}
		else if(average > 85 && average <= 90)
		{
			return "B+";
		}
		else if(average > 80 && average <= 85)
		{
			return "B";
		}
		else if(average > 75 && average <= 80)
		{
			return "C+";
		}
		else if(average > 70 && average <= 75)
		{
			return "C";
		}
		else if(average > 65 && average <= 70)
		{
			return "D+";
		}
		else if(average > 60 && average <= 65)
		{
			return "D";
		}
		else if(average > 40 && average <= 60)
		{
			return "E";
		}
		else if(average > 0 && average <= 35)
		{
			return "F";
		}
		return "F";

	}

	static float averageMarks(float totalMarks)
	{
		float average=totalMarks/5;
		return average;
	}


	public static void main(String args[])
	{
		System.out.println("********* STUDENT GRADE CALCULATER ************");
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the name of student: ");
		String name=sc.nextLine();
		System.out.print("Enter the Roll NO : ");
		int rollNo=sc.nextInt();
		System.out.println("\n Enter the marks of each subject out of(100)");
		System.out.print("Theory of Computation: ");
		int toc=sc.nextInt();
		System.out.print("Database Manegement System : ");
		int dbms=sc.nextInt();
		System.out.print("Computer Network & Security : ");
		int cns=sc.nextInt();
		System.out.print("Internet of Things & Embedded System : ");
		int iotes=sc.nextInt();
		System.out.print("Oprating System : ");
		int os=sc.nextInt();

		float totalMarks=toc+dbms+cns+iotes+os;
		

		float average=averageMarks(totalMarks);

		String s=gradeCalculation(average);
		

		System.out.println("######  STUDENT RESULT  ####### ");
		System.out.println("STUDENT NAME : "+name);
		System.out.println("ROLL NO : "+rollNo);
		System.out.println("Makrs Per Subjects out of 100");
		System.out.println("Theory of Computation: "+toc);
		System.out.println("Database Manegement System : "+dbms);
		System.out.println("Computer Network & Security : "+cns);
		System.out.println("Internet of Things & Embedded System : "+iotes);
		System.out.println("Oprating System : "+os);
		System.out.print("\n\n Total Marks : "+totalMarks+"  ");
		System.out.print(" Average Marks : "+average+"  ");
		System.out.print("Grade: "+s);
			
	}
}
