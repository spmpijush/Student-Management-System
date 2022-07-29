import java.util.Scanner;

public class SchoolManagementSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("############# STUDENT MANAGEMENT SYSTEM #############");
		int InternalMark = 10 , ExternalMark = 40 , TotalSubject = 6 , TotalStudent;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the total number of students");
		TotalStudent = sc.nextInt();
		
		//array create 
		//array for student name entry ----->
		String[] Student = new String[TotalStudent];
		//array for student roll entry ----->
		int Roll[] = new int[TotalStudent];
		//array for internal mark 
		float InternalMarks[] = new float[TotalSubject];
		//array for external mark
		float ExternalMarks[] = new float[TotalSubject];
		//array for IntExtTotalMarks mark
		float IntExtTotalMarks[] = new float[TotalSubject];
		//array for MarkObtained mark
		float MarkObtained[] = new float[TotalStudent];
		//array for Percentage mark
		float Percentage[] = new float[TotalStudent];
		//array for grade entry
		String[] Grade = new String[TotalStudent];
		
		
		//for loop for student name entry
		for(int i = 0 ; i<TotalStudent;i++) {
			System.out.println("Enter the student name : ");
			Student[i] = sc.next();
			
			//roll number automatic generate
			Roll[i] = (i + 1);
			
			// for loop for internal and external mark entry
			for(int j = 0;j<TotalSubject;j++) {
				//using switch case for one by one mark entry for every subject
				switch(j) {
					case 0:
						System.out.println("Enter Object Oriented Programming with JAVA Internal Mark out of : "+InternalMark);
						InternalMarks[j] = sc.nextFloat();
						System.out.println("Enter Object Oriented Programming with JAVA External Mark out of : "+ExternalMark);
						ExternalMarks[j] = sc.nextFloat();
						IntExtTotalMarks[j] = (InternalMarks[j] + ExternalMarks[j]);
						System.out.println(Student[i]+"'s -> Object Oriented Programming with JAVA Internal & External Mark out of : "+IntExtTotalMarks[j]);
						break;
					
					case 1:
						System.out.println("Enter Object Oriented Programming with JAVA Lab Internal Mark out of : "+InternalMark);
						InternalMarks[j] = sc.nextFloat();
						System.out.println("Enter Object Oriented Programming with JAVA Lab External Mark out of : "+ExternalMark);
						ExternalMarks[j] = sc.nextFloat();
						IntExtTotalMarks[j] = (InternalMarks[j] + ExternalMarks[j]);
						System.out.println(Student[i]+"'s -> Object Oriented Programming with JAVA Lab Internal & External Mark out of : "+IntExtTotalMarks[j]);
						break;
						
					case 2:
						System.out.println("Enter Advanced Software Engineering Internal Mark out of : "+InternalMark);
						InternalMarks[j] = sc.nextFloat();
						System.out.println("Enter Advanced Software Engineering External Mark out of : "+ExternalMark);
						ExternalMarks[j] = sc.nextFloat();
						IntExtTotalMarks[j] = (InternalMarks[j] + ExternalMarks[j]);
						System.out.println(Student[i]+"'s -> Advanced Software Engineering Internal & External Mark out of : "+IntExtTotalMarks[j]);
						break;
						
					case 3:
						System.out.println("Enter Discrete Mathematics & Graph Theory Internal Mark out of : "+InternalMark);
						InternalMarks[j] = sc.nextFloat();
						System.out.println("Enter Discrete Mathematics & Graph Theory External Mark out of : "+ExternalMark);
						ExternalMarks[j] = sc.nextFloat();
						IntExtTotalMarks[j] = (InternalMarks[j] + ExternalMarks[j]);
						System.out.println(Student[i]+"'s -> Discrete Mathematics & Graph Theory Internal & External Mark out of : "+IntExtTotalMarks[j]);
						break;
						
					case 4:
						System.out.println("Enter Advanced Compiler Design Internal Mark out of : "+InternalMark);
						InternalMarks[j] = sc.nextFloat();
						System.out.println("Enter Advanced Compiler Design External Mark out of : "+ExternalMark);
						ExternalMarks[j] = sc.nextFloat();
						IntExtTotalMarks[j] = (InternalMarks[j] + ExternalMarks[j]);
						System.out.println(Student[i]+"'s -> Advanced Compiler Design Internal & External Mark out of : "+IntExtTotalMarks[j]);
						break;
						
					case 5:
						System.out.println("Enter Information Security Internal Mark out of : "+InternalMark);
						InternalMarks[j] = sc.nextFloat();
						System.out.println("Enter Information Security External Mark out of : "+ExternalMark);
						ExternalMarks[j] = sc.nextFloat();
						IntExtTotalMarks[j] = (InternalMarks[j] + ExternalMarks[j]);
						System.out.println(Student[i]+"'s -> Information Security Internal & External Mark out of : "+IntExtTotalMarks[j]);
						break;
						
					default :
						System.out.println("Please Enter valid details !");
				}
			}
			System.out.println("#######################################################");
			//after complete all internal and external marks than
			System.out.println("Student Name : "+Student[i]);
			System.out.println("Student Roll No : "+Roll[i]);
			//total number calculate
			float TotalNumber = 0;
			for(int j = 0;j<IntExtTotalMarks.length;j++) {
				TotalNumber += IntExtTotalMarks[i];
			}
			MarkObtained[i] = TotalNumber;
			System.out.println("Total Mark Obtained : "+MarkObtained[i]);
			//calculate percentage
			float percent;
			percent = ((TotalNumber * 100)/((InternalMark + ExternalMark)*TotalSubject));
			Percentage[i] = percent;
			System.out.println("Percentage is : "+Percentage[i]+" %");
			//grade entry calculation
			String grade;
			if(TotalNumber >=80) {
				grade = "A";
			}else if(TotalNumber >=60) {
				grade = "b";
			}else if(TotalNumber >=40) {
				grade = "c";
			}else {
				grade = "FAIL";
			}
			Grade[i] = grade;
			System.out.println("Grade is : "+Grade[i]);
		}
		
		//after complete all task
		//making rank on total mark
		for(int i = 0;i<MarkObtained.length;i++) {
			for(int j = 0;j<MarkObtained.length-1;j++) {
				if(MarkObtained[i] > MarkObtained[j]) {
					float temp = MarkObtained[i];
					MarkObtained[i] = MarkObtained[j];
					MarkObtained[j] = temp;
					
					//using this method student name sort 
					String StudentDemo = Student[i];
					Student[i] = Student[j];
					Student[j] = StudentDemo;
					
					//using this method student roll sort 
					int DemoRoll = Roll[i];
					Roll[i] = Roll[j];
					Roll[j] = DemoRoll;
					
					//using this method student grade sort 
					String DemoGrade = Grade[i];
					Grade[i] = Grade[j];
					Grade[j] = DemoGrade;
					
					//using this method student percentage sort 
					float DemoPercentage = Percentage[i];
					Percentage[i] = Percentage[j];
					Percentage[j] = DemoPercentage;
				}
			}
		}
		
		System.out.println();
		System.out.println("########## Making rank on total mark ##########");
		System.out.println();
		for(int i=0;i<Student.length;i++) {
			System.out.println("########################################################");
			System.out.println("Rank is : "+(i + 1));
			System.out.println("Student Name : "+Student[i]);
			
			for(int j = i;j<i+1;j++) {
				System.out.println("Student Roll No : "+Roll[j]);
			}
			
			for(int k = i;k<i+1;k++) {
				System.out.println("Total Mark Obtained : "+MarkObtained[k]);
			}
			for(int l = i;l<i+1;l++) {
				System.out.println("Percentage is : "+Percentage[l]);
			}
			for(int m = i;m<i+1;m++) {
				System.out.println("Grade is : "+Grade[m]);
			}
		}
		System.out.println();
		System.out.println();

		
	}

}
