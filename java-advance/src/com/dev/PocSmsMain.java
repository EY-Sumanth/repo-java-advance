package com.dev;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
	
	
	 public class PocSmsMain {

		
		private static Set<Student> lstObj;
		
		private static Map<String, Student> mpObj = new HashMap<>();
		
		private static Map<Student, Student> mpObjOne = new HashMap<>();
		
		static {
			try {
				lstObj = StudentDataBase.populateStudentsInfo(SmsConstants.STUD_INSTANCES_DYNAMIC);
				lstObj.forEach(std->
				{
						mpObj.put(std.getId(), std);
						mpObjOne.put(std, std);
				});
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("********STUDENT MANAGEMENT SYSTEM*********");		
			try {
				
				printInstructions();
									
				String userStatus = null;
				
				while(true) { 
					
					userStatus = sc.next();
					
					switch(userStatus) {
					
						case "1":
							listStudents();
							while(true) {
								System.out.println("Do you want to view student again ? Y OR N");
								String oprStatus = sc.next();
								if(oprStatus.equalsIgnoreCase("Y")) {
									listStudents();
								}else if(oprStatus.equalsIgnoreCase("N")) {
									break;
								}else {
									System.out.println("Please provide a valid input..");
								}
								
							}
							break;
							
						case "2":
							addStudent();
							while(true) {
								System.out.println("Do you want to add student again ? Y OR N");
								String oprStatus = sc.next();
								if(oprStatus.equalsIgnoreCase("Y")) {
										addStudent();
								}else if(oprStatus.equalsIgnoreCase("N")) {
									break;
								}else {
									System.out.println("Please provide a valid input..");
								}
								
							}
							break;
							
							
						case "3":
							updateStudent();
							while(true) {
								System.out.println("Do you want to update student again ? Y OR N");
								String oprStatus = sc.next();
								if(oprStatus.equalsIgnoreCase("Y")) {
									updateStudent();
								}else if(oprStatus.equalsIgnoreCase("N")) {
									break;
								}else {
									System.out.println("Please provide a valid input..");
								}							
							}
							break;
							
						case "4":
						deleteStudent();
							while(true) {
								System.out.println("Do you want to delete student again ? Y OR N");
								String oprStatus = sc.next();
								if(oprStatus.equalsIgnoreCase("Y")) {
								deleteStudent();
								}else if(oprStatus.equalsIgnoreCase("N")) {
									break;
								}else {
									System.out.println("Please provide a valid input..");
								}							
							}
							break;
							
						case "5":
							sortStudent();
							while(true) {
								System.out.println("Do you want to Sort student again ? Y OR N");
								String oprStatus = sc.next();
								if(oprStatus.equalsIgnoreCase("Y")) {
									sortStudent();
								}else if(oprStatus.equalsIgnoreCase("N")) {
									break;
								}else {
									System.out.println("Please provide a valid input..");
								}							
							}
							break;
							
						case "6":
							IndividualStudent();						
							while(true) {
								System.out.println("Do you want to View student again ? Y OR N");
								String oprStatus = sc.next();
								if(oprStatus.equalsIgnoreCase("Y")) {
								IndividualStudent();	
								}else if(oprStatus.equalsIgnoreCase("N")) {
									break;
								}else {
									System.out.println("Please provide a valid input..");
								}							
							}
							break;
							
						case "7":
							maximumFees();
							while(true) {
								System.out.println("Do you want to ViewMax fee of a student again ? Y OR N");
								String oprStatus = sc.next();
								if(oprStatus.equalsIgnoreCase("Y")) {
								maximumFees();	
								}else if(oprStatus.equalsIgnoreCase("N")) {
									break;
								}else {
									System.out.println("Please provide a valid input..");
								}							
							}
							break;
							
						case "8":
							pendingFees();
							while(true) {
								System.out.println("Do you want to view the Pending fees of a student again ? Y OR N");
								String oprStatus = sc.next();
								if(oprStatus.equalsIgnoreCase("Y")) {
								pendingFees();	
								}else if(oprStatus.equalsIgnoreCase("N")) {
									break;
								}else {
									System.out.println("Please provide a valid input..");
								}							
							}
							break;
							
						case "9":
							bunksInDays();
							while(true) {
								System.out.println("Do you want to ViewBunksinDays of a student again ? Y OR N");
								String oprStatus = sc.next();
								if(oprStatus.equalsIgnoreCase("Y")) {
									bunksInDays();	
								}else if(oprStatus.equalsIgnoreCase("N")) {
									break;
								}else {
									System.out.println("Please provide a valid input..");
								}							
							}
							break;
							
						case "10":
							studentsCount();
							while(true) {
								System.out.println("Do you want to know the  students count again ? Y OR N");
								String oprStatus = sc.next();
								if(oprStatus.equalsIgnoreCase("Y")) {
									studentsCount();	
								}else if(oprStatus.equalsIgnoreCase("N")) {
									break;
								}else {
									System.out.println("Please provide a valid input..");
								}							
							}
							break;
							
							
						case "11":
							viewWithArguments();
							while(true) {
								System.out.println("Do you want to viewwith arguments of a student again ? Y OR N");
								String oprStatus = sc.next();
								if(oprStatus.equalsIgnoreCase("Y")) {
									viewWithArguments();	
								}else if(oprStatus.equalsIgnoreCase("N")) {
									break;
								}else {
									System.out.println("Please provide a valid input..");
								}							
							}
							break;
							
						case "12":
							 pendingWithMinFees();
							while(true) {
								System.out.println("Do you want to view pendingwithminfees of student again ? Y OR N");
								String oprStatus = sc.next();
								if(oprStatus.equalsIgnoreCase("Y")) {
									 pendingWithMinFees();	
								}else if(oprStatus.equalsIgnoreCase("N")) {
									break;
								}else {
									System.out.println("Please provide a valid input..");
								}							
							}
							break;
							
						case "13":
							pendingWithMaxFees();
							while(true) {
								System.out.println("Do you want to view pendingwithminfees student again ? Y OR N");
								String oprStatus = sc.next();
								if(oprStatus.equalsIgnoreCase("Y")) {
									pendingWithMaxFees();	
								}else if(oprStatus.equalsIgnoreCase("N")) {
									break;
								}else {
									System.out.println("Please provide a valid input..");
								}							
							}
							break;
							
						case "14":
							sortBySubmittedFees();
							while(true) {
								System.out.println("Do you want to Sortbysubmittedfees of student again ? Y OR N");
								String oprStatus = sc.next();
								if(oprStatus.equalsIgnoreCase("Y")) {
									sortBySubmittedFees();	
								}else if(oprStatus.equalsIgnoreCase("N")) {
									break;
								}else {
									System.out.println("Please provide a valid input..");
								}							
							}
							break;
							
						case "15":
							 sortStudentAttendance();
							while(true) {
								System.out.println("Do you want to SortStudentAttendance student again ? Y OR N");
								String oprStatus = sc.next();
								if(oprStatus.equalsIgnoreCase("Y")) {
									 sortStudentAttendance();	
								}else if(oprStatus.equalsIgnoreCase("N")) {
									break;
								}else {
									System.out.println("Please provide a valid input..");
								}							
							}
							break;
							
						case "16":
							mapBySubmittedFees();
							while(true) {
								System.out.println("Do you want to mapBySubmittedFees of  student again ? Y OR N");
								String oprStatus = sc.next();
								if(oprStatus.equalsIgnoreCase("Y")) {
									mapBySubmittedFees();	
								}else if(oprStatus.equalsIgnoreCase("N")) {
									break;
								}else {
									System.out.println("Please provide a valid input..");
								}							
							}
							break;
							
						case "17":
							verifyStudentObjIdentityThroughMap();
							while(true) {
								System.out.println("Do you want to verifyStudentObjIdentityThroughMap of student again ? Y OR N");
								String oprStatus = sc.next();
								if(oprStatus.equalsIgnoreCase("Y")) {
									verifyStudentObjIdentityThroughMap();	
								}else if(oprStatus.equalsIgnoreCase("N")) {
									break;
								}else {
									System.out.println("Please provide a valid input..");
								}							
							}
							break;
						
						case "quit":
							System.out.println("Exited from the CA - SMS App");
							break;
							
						default:
							System.out.println("No matched operations found");
							break;
						
						}
					
					if(userStatus.equalsIgnoreCase("quit")) {
						break;
					}else {
						printInstructions();
					}
					
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}finally {
				sc.close();
			}
			
		}
		
		private static void addStudent() {
			
				System.out.println("Kindly Provide New Students Information as Instructed below::");
				Scanner sc=new Scanner(System.in);
				Student sObj = new Student();
				
				String uniqueID = UUID.randomUUID().toString();
				sObj.setId(uniqueID);
				sObj.setRollNo(sObj.getId());
				
				System.out.println("Please input Student name");
				String name = sc.next();
				if(null!=name)
					sObj.setName(name);
				
				System.out.println("Please input Student age");
				int age = sc.nextInt();
				
					sObj.setAge(age);
				
				System.out.println("Please input Student email");
				String email = sc.next();
				if(null!=email)
					sObj.setEmail(email);
				
				//For consuming end of line
				sc.nextLine();
				
				System.out.println("Please input Student course");
				String course = sc.nextLine();
				if(null!=course)
					sObj.setCourse(course);
				
				
				System.out.println("Please input Student address");
				String adr = sc.nextLine();
				if(null!=adr)
					sObj.setAddress(adr);
				
				System.out.println("Please input Student previous education");
				String prevEdu = sc.nextLine();
				if(null!=prevEdu)
					sObj.setPrevEducation(prevEdu);
				
				System.out.println("Please input Student submitted fees");
				String subFees = sc.next();
				if(null!=subFees)
					sObj.setSubmittedFees(Double.valueOf(subFees));
				
				System.out.println("Please input Student total course fees");
				String totalCourseFees = sc.next();
				if(null!=totalCourseFees)
					sObj.setTotalCourseFees(Double.valueOf(totalCourseFees));
				
				
				System.out.println("Please input Student course fee status");
				String courseFeeStatus = sc.next();
				if(null!=courseFeeStatus)
					sObj.setCourseFeeStatus(courseFeeStatus);
				
				
				System.out.println("Please input Student result status");
				String resultStatus = sc.next();
				if(null!=resultStatus)
					sObj.setResultStatus(resultStatus);
				
				System.out.println("Please input Student course duration");
				String courseDur = sc.next();
				if(null!=courseDur)
					sObj.setCourseDuration(Integer.valueOf(courseDur));
				
				
				System.out.println("Please input Student attendance");
				String studAttendance = sc.next();
				if(null!=studAttendance)
					sObj.setAttendance(Integer.valueOf(studAttendance));
				
				
				System.out.println("Please input Student admission year");
				String admYear = sc.next();
				if(null!=admYear)
					sObj.setAdmissionYear(admYear);
					
				boolean studRegStatus = lstObj.add(sObj);
				mpObj.put(sObj.getId(), sObj);
				if(studRegStatus)
					System.out.println("Student was registered successfull");
				else
					System.out.println("Student registration was unsuccessfull");
		}
		
	
		
		private static void listStudents() throws Exception {
			if(lstObj==null || lstObj.isEmpty())
				throw new Exception("Student list is empty or null::");
			
			lstObj.forEach(stdObj->System.out.println(stdObj));
			
			System.out.println("All Students are listed");
		}
		
		private static void updateStudent() throws Exception {
			boolean updStatus = true;
			Scanner sc=new Scanner(System.in); 
			listStudents();
			System.out.println("Please provide the student id/roll no to edit/update the student::");
			String stdIdOrRoll = sc.next();
					
			//Get a particular student by using id or roll
			Student s = mpObj.get(stdIdOrRoll);
			
			if(s==null)
				throw new Exception("Provided Student Information was NOT Found::");
			
			
			boolean isStudObjDirty = selectAndInputStudentFieldsForEdit(s);
					
			if(isStudObjDirty) {
				//Update above Student in the collection.
				updStatus = lstObj.add(s);
			}
			
			if(!updStatus)
				System.out.println("Student was updated successfully..");
			else
				System.out.println("Student Updation was unsuccessful..");
			
			listStudents();
		}
	 
		
		
		private static boolean selectAndInputStudentFieldsForEdit(Student s) throws Exception {
			Map<Integer, String> mpObj = new HashMap<>();
			boolean isStudObjDirty = true;
			while(true) {
				printStudFieldSelInstructions();
				Scanner sc=new Scanner(System.in);
				String regex = "\\d+";
				String str = sc.next();
				while(!str.matches(regex)) {
					System.out.println("Given Input is Invalid : Kindly select one of the Number Given Below::");
					printStudFieldSelInstructions();
					str = sc.next();
				}
				
				Integer fieldToUpdate = Integer.valueOf(str);
				
				while(fieldToUpdate<1 || fieldToUpdate>13) {
					System.out.println("Invalid input.Please select one of numbers in below range..");
					printStudFieldSelInstructions();
					fieldToUpdate = sc.nextInt();
				}
				
				System.out.println("Kindly Provide Input Value for Student Property");
				String valForField = sc.next();
				
				mpObj.put(fieldToUpdate, valForField);			
				
				System.out.println("do you want to update any more field..? Y OR N");
				
				String usrStatus = sc.next();
				
				if(usrStatus.equalsIgnoreCase("Y"))
					//Nothing to do here
					continue;
				else if(usrStatus.equalsIgnoreCase("N"))
					break;
				else
					System.out.println("Invalid input..");
			}
			
			for(int fieldSel:mpObj.keySet()) {
				switch(fieldSel){
					case 1:
						s.setName(mpObj.get(fieldSel));
						break;
					case 2:
						s.setAge(Integer.valueOf(mpObj.get(fieldSel)));
						break;
					case 3:
						s.setEmail(mpObj.get(fieldSel));
						break;
					case 4:
						s.setCourse(mpObj.get(fieldSel));
						break;
					case 5:
						s.setAddress(mpObj.get(fieldSel));
						break;
					case 6:
						s.setPrevEducation(mpObj.get(fieldSel));
						break;
					case 7:
						s.setSubmittedFees(Double.valueOf(mpObj.get(fieldSel)));
						break;
					case 8:
						s.setTotalCourseFees(Double.valueOf(mpObj.get(fieldSel)));
						break;
					case 9:
						s.setCourseFeeStatus(mpObj.get(fieldSel));
						break;
					case 10:
						s.setResultStatus(mpObj.get(fieldSel));
						break;
					case 11:
						s.setCourseDuration(Integer.valueOf(mpObj.get(fieldSel)));
						break;
					case 12:
						s.setAttendance(Integer.valueOf(mpObj.get(fieldSel)));
						break;
					case 13:
						s.setAdmissionYear(mpObj.get(fieldSel));
						break;
					default:
						System.out.println("No matched operation found::");
						break;
				}
			}
			
			if(mpObj==null || mpObj.isEmpty() || mpObj.keySet()==null || mpObj.keySet().isEmpty()) {
				isStudObjDirty = false;
			}
			
			return isStudObjDirty;
		}
		
		private static void printStudFieldSelInstructions() {
			
			System.out.println("Please select below options to update fields");
			
			System.out.println("press 1 & hit enter key to input name :");
			
			System.out.println("press 2 & hit enter key to input age :");
			
			System.out.println("press 3 & hit enter key to input email :");
			
			System.out.println("Press 4 & hit enter key to input course name :");
			
			
			System.out.println("Press 5 & hit enter key to input address :");
			
			System.out.println("Press 6 & hit enter key to input prev education :");
			
			System.out.println("Press 7 & hit enter key to input submitted fees:");
			
			System.out.println("Press 8 & hit enter key to input total course fees :");
			
			
			System.out.println("Press 9 & hit enter key to input course fee status :");
			
			System.out.println("Press 10 & hit enter key to input result status :");
			
			System.out.println("Press 11 & hit enter key to input course duration :");
			
			System.out.println("Press 12 & hit enter key to input attendance :");
			
			System.out.println("Press 13 & hit enter key to input admission year :");
			
			
			
		}
		
		private static void deleteStudent() throws Exception{
			listStudents();
			Scanner sc=new Scanner(System.in); 
			System.out.println("Please provide the student id/roll no to delete the student..");
			String stdIdOrRoll = sc.next();
			
			//Get a particular student by using id or roll
			Student s = mpObj.get(stdIdOrRoll);
			
			//Delete above Student from the collection.
			boolean delStatus = lstObj.remove(s);
			
			if(delStatus)
				System.out.println("Student was deleted successfully::");
			else
				System.out.println("Deletion was unsuccessful::");
			
			listStudents();
		}
		
			
		
		private static void sortStudent() {

			Scanner st=new Scanner(System.in);
			List<Student>lst;
			System.out.print("Enter the Option:");
			int option=st.nextInt();
			switch(option)
			{
			case 1:
			   System.out.print("Enter the Student name to sort:");

			lst = lstObj.stream().sorted(Comparator.comparing(Student::getName)).collect(Collectors.toList());

			for(Student s:lst)
			   System.out.println(s);
			break;

			default:
			   System.out.println("No Fields to Sort");
			break;
			}

			}
		
		private static Student IndividualStudent()
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Please Enter the Individual Student ID/ RollNo");
			String ID = sc.next();
			Student std=mpObj.get(ID);
			System.out.println(std);
			return std;
		}
		
		
		private static void maximumFees()
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the student id/roll no");
		String sc0=sc.next();
		Student s=mpObj.get(sc);
		String sc1=sc.next();
		Student s1=mpObj.get(sc1);
		String sc2=sc.next();
		Student s2=mpObj.get(sc2);
		String sc3=sc.next();
		Student s3=mpObj.get(sc3);
		String sc4=sc.next();
		Student s4=mpObj.get(sc4);

		System.out.println("Enter the Student's Course fee:");
		double TotalcourseFee=sc.nextDouble();
		System.out.println("Enter the Student's Submitted fee:");
		double submittedFee=sc.nextDouble();

		System.out.println("Enter the Student's Course fee:");
		double TotalcourseFee1=sc.nextDouble();
		System.out.println("Enter the Student's Submitted fee:");
		double submittedFee1=sc.nextDouble();

		System.out.println("Enter the Student's Course fee:");
		double TotalcourseFee2=sc.nextDouble();
		System.out.println("Enter the Student's Submitted fee:");
		double submittedFee2=sc.nextDouble();

		System.out.println("Enter the Student's Course fee:");
		double TotalcourseFee3=sc.nextDouble();
		System.out.println("Enter the Student's Submitted fee:");
		double submittedFee3=sc.nextDouble();

		System.out.println("Enter the Student's Course fee:");
		double TotalcourseFee4=sc.nextDouble();
		System.out.println("Enter the Student's Submitted fee:");
		double submittedFee4=sc.nextDouble();

		double pending=TotalcourseFee-submittedFee;
		double maximumFee=TotalcourseFee*0.8;

		double pending1=TotalcourseFee1-submittedFee1;
		double maximumFee1=TotalcourseFee1*0.8;

		double pending2=TotalcourseFee2-submittedFee2;
		double maximumFee2=TotalcourseFee2*0.8;

		double pending3=TotalcourseFee3-submittedFee3;
		double maximumFee3=TotalcourseFee3*0.8;

		double pending4=TotalcourseFee4-submittedFee4;
		double maximumFee4=TotalcourseFee4*0.8;

		if(pending>maximumFee)
		{
		  System.out.println("Student has not submitted Maximum fee");
		}
		else
		{
		  System.out.println(s);
		  System.out.println("Student has submitted Maximum fee with "+maximumFee+" and pending with "+pending);
		}

		if(pending1>maximumFee1)
		{
		  System.out.println("Student has not submitted Maximum fee");
		}
		else
		{
		  System.out.println(s1);
		  System.out.println("Student has submitted Maximum fee with "+maximumFee1+" and pending with "+pending1);
		}

		if(pending2>maximumFee2)
		{
		  System.out.println("Student has not submitted Maximum fee");
		}
		else
		{
		  System.out.println(s2);
		  System.out.println("Student has submitted Maximum fee with "+maximumFee2+" and pending with "+pending2);
		}

		if(pending3>maximumFee3)
		{
		  System.out.println("Student has not submitted Maximum fee");
		}
		else
		{
		  System.out.println(s3);
		  System.out.println("Student has submitted Maximum fee with "+maximumFee3+" and pending with "+pending3);
		}

		if(pending4>maximumFee4)
		{
		  System.out.println("Student has not submitted Maximum fee");
		}
		else
		{
		  System.out.println(s4);
		  System.out.println("Student has submitted Maximum fee with "+maximumFee4+" and pending with "+pending4);
		}
		}
		
		private static void pendingFees()
		{
		   Scanner sc=new Scanner(System.in);
		   System.out.print("Enter the Student Id/roll no:");
		   String id=sc.next();
		   Student st=mpObj.get(id);
	       double pendingFees=st.getTotalCourseFees()-st.getSubmittedFees();
		if(pendingFees>0)
		{
		  System.out.println(st);
		  System.out.println("StudentFees not Submitted and pending with "+pendingFees);
		}
		 else
		{
		  System.out.println("StudentFees Submitted");
		}
		}
		
		
		private static void bunksInDays() {
		
		Scanner sc=new Scanner(System.in);
		  System.out.print("Enter the Student Id/roll no:");
		  String id=sc.next();
		  Student st=mpObj.get(id);
		    int absentInDays=st.getCourseDuration()-st.getAttendance();
		  if(absentInDays==0)
		{
			System.out.println("Student has no absents in his academic year");
		}
		else
		{
			System.out.println(st);
			System.out.println("Student with bunks in days are: "+absentInDays);
		}
		}
        
		
		
		private static void studentsCount() {
		
		  Scanner sc=new Scanner(System.in);
		  long count=0;
		  printStudCount();
		    System.out.print("Enter One of the Options:");
		    int choice=sc.nextInt();
		switch(choice)
		{
		  case 1:
		    System.out.print("Enter Student's Course name:");
		    String Student1=sc.next();
		    count=lstObj.stream().filter(std->std.getCourse().equalsIgnoreCase(Student1)).count();
		    if(count>0)
		{
		    System.out.println("No of Students on the year "+Student1+" is: "+count);
		}
		else
		{
		    System.out.println("No students are there in that year");
		}
		break;
		
		case 2:
		    System.out.print("Enter Student's admission Year:");
		    String year1=sc.next();
		    count=lstObj.stream().filter(std->std.getAdmissionYear().equals(year1)).count();
		if(count>0)
		{
		    System.out.println("No of Students on the year "+year1+" is: "+count);
		}
		else
		{
		    System.out.println("No students are there in that year");
		}
		break;
		
		case 3:
		    System.out.print("Enter Student's Course name:");
		    String Student2=sc.next();
	      	System.out.print("Enter Student's admission Year:");
		    String year2=sc.next();
		    count=lstObj.stream().filter(std->std.getAdmissionYear().equals(year2) && std.getCourse().equalsIgnoreCase(Student2)).count();
		if(count>0)
		{
		    System.out.println("Number of Students on that course name and year is "+count);
		}
		else
		{
		    System.out.println("no students are present in that year");
		}
		break;
		default:
		    System.out.println("No matches provided");
		break;
		}
		
	}

		private static void printStudCount() {

			System.out.println("Enter 1 to get students count on a particular course name");
			System.out.println("Enter 2 to get students count on a particular admission year");
			System.out.println("Enter 3 to get students count on both course & year ");
	}
		
		private static Set<Student> searchStudents(){
			
			Set<Student> searchstudent = null;
			Scanner sc = new Scanner(System.in);
			printSearchStudentsOptions();
			String searchOpt = sc.next();		
			
			switch(searchOpt) {
			
				case "1":
					if(lstObj==null || lstObj.isEmpty()) {
						System.out.println("Student data store is empty");
						break;
					}
					
					System.out.println("Please input admission year at console..");
					String admYearOpt = sc.next();
					
					searchstudent = lstObj.stream().filter(std->std.getAdmissionYear().equals(admYearOpt)).collect(Collectors.toSet());
					
					if(searchstudent == null || searchstudent.isEmpty()) {
						System.out.println("No Students found on your search criteria, Please choose other search options..");
					}else {
						searchstudent.forEach(System.out::println);
					}				
					break;
					
				case "2":
					if(lstObj==null || lstObj.isEmpty()) {
						System.out.println("Student data store is empty");
						break;
					}
					
					System.out.println("Please input exact course name at console..");
					String selectedCourse = sc.next();
					
					searchstudent = lstObj.stream().filter(std->std.getCourse().equalsIgnoreCase(selectedCourse)).collect(Collectors.toSet());
					
					if(searchstudent == null || searchstudent.isEmpty()) {
						System.out.println("No Students found on your search criteria, Please choose other search options..");
					}else {
						searchstudent.forEach(System.out::println);
					}
					
					break;
					
				case "3":
					if(lstObj==null || lstObj.isEmpty()) {
						System.out.println("Student data store is empty");
						break;
					}
					
					System.out.println("Please input exact year at console..");
					String admYear = sc.next();
					
					System.out.println("Please input exact course name at console..");
					String courseName = sc.next();
					
					searchstudent = lstObj.stream().filter(std->{
						if(std.getAdmissionYear().equals(admYear) && std.getCourse().equalsIgnoreCase(courseName))
							return true;
						else
							return false;
					}).collect(Collectors.toSet());
					
					if(searchstudent == null || searchstudent.isEmpty()) {
						System.out.println("No Students found on your search criteria, Please choose other search options..");
					}else {
						searchstudent.forEach(System.out::println);
					}				
					break;
				
				case "4":
					if(lstObj==null || lstObj.isEmpty()) {
						System.out.println("Student data store is empty");
						break;
					}
					
					System.out.println("Please input exact year at console..");
					String admYearForName = sc.next();
					
					System.out.println("Please input exact course name at console..");
					String courseNameForName = sc.next();
					
					System.out.println("Please input exact student name provided at admission time..");
					String stdName = sc.next();
					
					//This is just to make the operation user friendly, no performance improvement here, 
					//indexing is still required at database level.
					searchstudent = lstObj.stream().filter(std->{
						if(std.getAdmissionYear().equals(admYearForName) && 
								std.getCourse().equalsIgnoreCase(courseNameForName) &&
								std.getName().equalsIgnoreCase(stdName))
							return true;
						else
							return false;
					}).collect(Collectors.toSet());
					
					if(searchstudent == null || searchstudent.isEmpty()) {
						System.out.println("No Students found on your search criteria, Please choose other search options..");
					}else {
						searchstudent.forEach(System.out::println);
					}				
					break;
					
				case "5":
					if(lstObj==null || lstObj.isEmpty()) {
						System.out.println("Student data store is empty");
						break;
					}
					
					System.out.println("Please input exact year at console..");
					String admYearForEmail = sc.next();
					
					System.out.println("Please input exact course name at console..");
					String courseNameForEmail = sc.next();
					
					System.out.println("Please input exact email id at console..");
					String emailId = sc.next();
					
					//This is just to make the operation user friendly, no performance improvement here, 
					//indexing is still required at database level.
					searchstudent = lstObj.stream().filter(std->{
						if(std.getAdmissionYear().equals(admYearForEmail) && 
								std.getCourse().equalsIgnoreCase(courseNameForEmail) &&
								std.getEmail().equalsIgnoreCase(emailId))
							return true;
						else
							return false;
					}).collect(Collectors.toSet());
					
					if(searchstudent == null || searchstudent.isEmpty()) {
						System.out.println("No Students found on your search criteria, Please choose other search options..");
					}else {
						searchstudent.forEach(System.out::println);
					}				
					break;
					
				case "6":
					if(lstObj==null || lstObj.isEmpty()) {
						System.out.println("Student data store is empty");
						break;
					}
					
					System.out.println("Please input exact year at console..");
					String admYearForRoll = sc.next();
					
					System.out.println("Please input exact course name at console..");
					String courseNameForRole = sc.next();
					
					System.out.println("Please input exact roll no at console..");
					String rollNo = sc.next();
					
					//This is just to make the operation user friendly, no performance improvement here, 
					//indexing is still required at database level.
					searchstudent = lstObj.stream().filter(std->{
						if(std.getAdmissionYear().equals(admYearForRoll) && 
								std.getCourse().equalsIgnoreCase(courseNameForRole) &&
								std.getRollNo().equalsIgnoreCase(rollNo))
							return true;
						else
							return false;
					}).collect(Collectors.toSet());
					
					if(searchstudent == null || searchstudent.isEmpty()) {
						System.out.println("No Students found on your search criteria, Please choose other search options..");
					}else {
						searchstudent.forEach(System.out::println);
					}				
					break;
					
				case "7":
					if(lstObj==null || lstObj.isEmpty()) {
						System.out.println("Student data store is empty");
						break;
					}
					
					System.out.println("Please input exact name provided at admission time..");
					String stdNameOnly = sc.next();
					
					searchstudent = lstObj.stream().filter(std->std.getName().equalsIgnoreCase(stdNameOnly)).collect(Collectors.toSet());
					
					if(searchstudent == null || searchstudent.isEmpty()) {
						System.out.println("No Students found on your search criteria, Please choose other search options..");
					}else {
						searchstudent.forEach(System.out::println);
					}
					
					break;
					
				case "8":
					if(lstObj==null || lstObj.isEmpty()) {
						System.out.println("Student data store is empty");
						break;
					}
					
					System.out.println("Please input exact email at console..");
					String stdEmailOnly = sc.next();
					
					searchstudent = lstObj.stream().filter(std->std.getEmail().equalsIgnoreCase(stdEmailOnly)).collect(Collectors.toSet());
					
					if(searchstudent == null || searchstudent.isEmpty()) {
						System.out.println("No Students found on your search criteria, Please choose other search options..");
					}else {
						searchstudent.forEach(System.out::println);
					}
					
					break;
					
				case "9":
					if(lstObj==null || lstObj.isEmpty()) {
						System.out.println("Student data store is empty");
						break;
					}
					
					System.out.println("Please input exact student roll no at console..");
					String rollNoOnly = sc.next();
					
					searchstudent = lstObj.stream().filter(std->std.getRollNo().equalsIgnoreCase(rollNoOnly)).collect(Collectors.toSet());
					
					if(searchstudent == null || searchstudent.isEmpty()) {
						System.out.println("No Students found on your search criteria, Please choose other search options..");
					}else {
						searchstudent.forEach(System.out::println);
					}
					
					break;
					
				default:
					System.out.println("No matched option provided, Please input correctly again");
					break;
			}
			
			
			return searchstudent;
		}
		
		private static void viewWithArguments()
		{
		    Scanner sc=new Scanner(System.in);
		    Set<Student>searchstud;
		    viewStudentsOptions();
		    System.out.print("Enter One of the Options:");
		    int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
		   System.out.print("Enter Student's Course name:");
		   String courseName=sc.next();
		   searchstud = lstObj.stream().filter(std->std.getCourse().equalsIgnoreCase(courseName)).collect(Collectors.toSet());
		   if(searchstud.isEmpty()) {
		   System.out.println("No Students found on the search");
		}
		   else
		   {
		for(Student s:searchstud)
		     System.out.println(s);
		}
		break;

		case 2:
		    System.out.print("Enter the admission year:");
		    String courseYear=sc.next();
		    searchstud = lstObj.stream().filter(std->std.getAdmissionYear().equals(courseYear)).collect(Collectors.toSet());
		if(searchstud.isEmpty())
		{
		   System.out.println("No Students found on the search");
		}
		else
		{
		for(Student s:searchstud)
		   System.out.println(s);
		}
		break;

		case 3:
			Set<Student>searchedstudents;
			
			System.out.print("Enter Student's Course name:");
			String courseNameForAge = sc.next();

			System.out.print("Enter Student's Admission Year:");
			String admYearForAge = sc.next();
			
			
			Set<Student> stdListForAge = getStudentsByYearAndCourse(admYearForAge,courseNameForAge);

			if(stdListForAge!=null && !stdListForAge.isEmpty()) {

			System.out.print("Enter Student's age:");
			String stdAge = sc.next();

			searchedstudents = stdListForAge.stream().filter(std->(std.getAge()<Integer.valueOf(stdAge))).collect(Collectors.toSet());
			if(searchedstudents == null || searchedstudents.isEmpty()) {
			System.out.println("No Students found below provided age..");
			}else {
			System.out.println("Students found below provided age are..");
			searchedstudents.forEach(System.out::println);
			}

			searchedstudents = stdListForAge.stream().filter(std->(std.getAge()>Integer.valueOf(stdAge))).collect(Collectors.toSet());
			if(searchedstudents == null || searchedstudents.isEmpty()) {
			System.out.println("No Students found above provided age..");
			}else {
			System.out.println("Students found above provided age are..");
			searchedstudents.forEach(System.out::println);
			}

			searchedstudents = stdListForAge.stream().filter(std->(std.getAge()==Integer.valueOf(stdAge))).collect(Collectors.toSet());

			if(searchedstudents == null || searchedstudents.isEmpty()) {
			System.out.println("No Students found having age equal to provided age..");
			}else {
			System.out.println("Students found at provided age are..");
			searchedstudents.forEach(System.out::println);
			}
			}else {
			System.out.println("No Students found on your search criteria, Please choose other search options..");
			}
			break;
			

		case 4:
		   System.out.print("Enter Student's Course name:");
		   String courseName2=sc.next();
		   System.out.print("Enter the admission year:");
		   String courseYear2=sc.next();
		   System.out.print("Enter Student's Fee Status:");
		   String feeStatus=sc.next();
		   searchstud = lstObj.stream().filter(std->{
		if(std.getAdmissionYear().equals(courseYear2) && std.getCourse().equalsIgnoreCase(courseName2) && std.getCourseFeeStatus().equalsIgnoreCase(feeStatus))
		return true;
		else
		return false;
		}).collect(Collectors.toSet());
		if(searchstud.isEmpty()) {
		   System.out.println("No Students found on the search");
		}
		else
		{
		for(Student s:searchstud)
		   System.out.println(s);
		}
		break;

		case 5:
		    System.out.print("Enter Student's Course name:");
		String courseName3=sc.next();
		System.out.print("Enter the admission year:");
		String courseYear3=sc.next();
		System.out.print("Enter Student's Fee Status:");
		String resultStatus=sc.next();
		searchstud = lstObj.stream().filter(std->{
		if(std.getAdmissionYear().equals(courseYear3) && std.getCourse().equalsIgnoreCase(courseName3) && std.getResultStatus().equalsIgnoreCase(resultStatus))
		return true;
		else
		return false;
		}).collect(Collectors.toSet());
		if(searchstud.isEmpty()) {
		     System.out.println("No Students found on the search");
		}
		else
		{
		for(Student s:searchstud)
		     System.out.println(s);
		}
		break;
		
		default:
			System.out.println("No matched option provided, Please input correctly again");
			break;
		}
		}
		
		
		private static Set<Student> pendingWithMinFees(){
			Set<Student> searchedstudents = new HashSet<>();
			Scanner sc=new Scanner(System.in);
			
			if(lstObj==null || lstObj.isEmpty()) {
				System.out.println("Student data store is empty");
				return searchedstudents;
			}
			
			System.out.println("Please input exact year at console..");
			String admYear = sc.next();
			
			System.out.println("Please input exact course name at console..");
			String courseName = sc.next();
			
			Set<Student> studListTemp = lstObj.stream().filter(std->{
				if(std.getAdmissionYear().equals(admYear) && std.getCourse().equalsIgnoreCase(courseName))
					return true;
				else
					return false;
			}).filter(s->s.getCourseFeeStatus().equalsIgnoreCase("PENDING"))
			.collect(Collectors.toSet());
			
			if(studListTemp != null && !studListTemp.isEmpty()) {
				double minSubFees = studListTemp.stream().min(Comparator.comparingDouble(Student::getSubmittedFees)).get().getSubmittedFees();
				
				searchedstudents = studListTemp.stream().filter(s->s.getSubmittedFees()==minSubFees)
				.collect(Collectors.toSet());	
				
				if(searchedstudents == null || searchedstudents.isEmpty()) {
					System.out.println("No Students found on your search criteria, Please choose other search options..");
				}else {
					searchedstudents.forEach(System.out::println);
				}
			}else {
				System.out.println("No Students found on your search criteria, Please choose other search options..");
			}
			return searchedstudents;

		}
		
		
		private static Set<Student> pendingWithMaxFees(){
			Set<Student> searchedstudents = new HashSet<>();
			Scanner sc=new Scanner(System.in);
			
			if(lstObj==null || lstObj.isEmpty()) {
				System.out.println("Student data store is empty");
				return searchedstudents;
			}
			
			System.out.println("Please input exact year at console..");
			String admYear = sc.next();
			
			System.out.println("Please input exact course name at console..");
			String courseName = sc.next();
			
			Set<Student> studListTemp = lstObj.stream().filter(std->{
				if(std.getAdmissionYear().equals(admYear) && std.getCourse().equalsIgnoreCase(courseName))
					return true;
				else
					return false;
			}).filter(s->s.getCourseFeeStatus().equalsIgnoreCase("PENDING"))
			.collect(Collectors.toSet());
			
			if(studListTemp != null && !studListTemp.isEmpty()) {
				double maxSubFees = studListTemp.stream().max(Comparator.comparingDouble(Student::getSubmittedFees)).get().getSubmittedFees();
				
				searchedstudents = studListTemp.stream().filter(s->s.getSubmittedFees()==maxSubFees)
				.collect(Collectors.toSet());	
				
				if(searchedstudents == null || searchedstudents.isEmpty()) {
					System.out.println("No Students found on your search criteria, Please choose other search options..");
				}else {
					searchedstudents.forEach(System.out::println);
				}
			}else {
				System.out.println("No Students found on your search criteria, Please choose other search options..");
			}
			return searchedstudents;

		}
		
		
		private static void sortBySubmittedFees() {
			if(lstObj==null || lstObj.isEmpty() || mpObj==null || mpObj.isEmpty()) {
				System.out.println("Student data store is empty");
				return;
			}
			
			Set<Student> searchedstudents = new HashSet<>();
			
			Map<Student, Integer> stMpObj = new HashMap<>();
			
			System.out.println("Please input exact year at console..");
			Scanner sc=new Scanner(System.in);
			String admYear = sc.next();
			
			
			System.out.println("Please input exact course name at console..");
			String courseName = sc.next();
			
			Set<Student> studListTemp = lstObj.stream().filter(std->{
				if(std.getAdmissionYear().equals(admYear) && std.getCourse().equalsIgnoreCase(courseName))
					return true;
				else
					return false;
			}).collect(Collectors.toSet());
			
			if(studListTemp!=null && !studListTemp.isEmpty()) {
				for(Student stdObj:studListTemp) {
					stMpObj.put(stdObj, stdObj.getAttendance());
				}
				System.out.println("Before sorting: ");
				stMpObj.entrySet().forEach(e->System.out.println(e.getKey().getRollNo()+" : "+e.getKey().getName()+" SubFees: "+e.getKey().getSubmittedFees()+" Attend: "+e.getValue()));
                Comparator<Student> bySubFeesStudComp = (Student o1, Student o2)-> Double.valueOf(o1.getSubmittedFees()).compareTo(Double.valueOf(o2.getSubmittedFees()));
				stMpObj = stMpObj.entrySet().stream().sorted(Map.Entry.comparingByKey( bySubFeesStudComp))
						.collect(Collectors.toMap(x->x.getKey(), x->x.getValue(), (oldVal,newVal)->oldVal, LinkedHashMap::new));
				
				System.out.println("=====================================================================================");
				System.out.println("After sorting: ");
				stMpObj.entrySet().forEach(e->System.out.println(e.getKey().getRollNo()+" : "+e.getKey().getName()+" SubFees: "+e.getKey().getSubmittedFees()+" Attend: "+e.getValue()));
			}else {
				System.out.println("No Students found on your search criteria, Please choose other search options..");
			}

		}
		

		private static void sortStudentAttendance()
		{
		     Scanner sc=new Scanner(System.in);
		     Set<Student>stList;
		     Map<Student,Integer>mpOne=new HashMap<>();
		     System.out.print("Enter Student's Course Name:");
		     String courseName=sc.next();
		     System.out.print("Enter Student's Course Year:");
		     String courseYear=sc.next();

		Set<Student>stTemp=lstObj.stream().filter(s->{
		if(s.getCourse().equalsIgnoreCase(courseName) && s.getAdmissionYear().equals(courseYear))
		     return true;
		else
		     return false;
		}).collect(Collectors.toSet());

		if(!stTemp.isEmpty())
		{
		     for(Student st:stTemp)
		     mpOne.put(st, st.getAttendance());

		    System.out.println(" Sort by Attendance Before Sort:");
		    mpOne.entrySet().forEach(std->System.out.println(std.getKey().getId()+":"+std.getKey().getName()+" Attendance: "+std.getValue()));
		    mpOne=mpOne.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).collect(Collectors.toMap(t->t.getKey(), t->t.getValue(), (oldVal,newVal)->oldVal,LinkedHashMap::new));
		    System.out.println(" Sort by Attendance After Sort:");
		    mpOne.entrySet().forEach(std->System.out.println(std.getKey().getId()+":"+std.getKey().getName()+" Attendance: "+std.getValue()));
		}
		else
		{
		    System.out.println("No Students Found");
		  }
		}
		
		
		private static void mapBySubmittedFees()
		{
		  Scanner sc=new Scanner(System.in);
		  Set<Student>stList;
		  Map<Student,Double>mpOne=new HashMap<>();
		    System.out.print("Enter Student's Course Name:");
		  String courseName=sc.next();
		    System.out.print("Enter Student's Course Year:");
		    String courseYear=sc.next();
		Set<Student>stTemp=lstObj.stream().filter(s->{
		if(s.getCourse().equalsIgnoreCase(courseName) && s.getAdmissionYear().equals(courseYear))
		     return true;
		else
		     return false;
		}).collect(Collectors.toSet());
		if(!stTemp.isEmpty())
		{
		     for(Student st:stTemp)
		           mpOne.put(st, st.getSubmittedFees());
		      System.out.println(" Sort by SubmittedFees Before Sort:");
		      mpOne.entrySet().forEach(std->System.out.println(std.getKey().getId()+":"+std.getKey().getName()+" SubmittedFees: "+std.getValue()));
		      mpOne=mpOne.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).collect(Collectors.toMap(t->t.getKey(), t->t.getValue(), (oldVal,newVal)->oldVal,LinkedHashMap::new));
		      System.out.println(" Sort by SubmittedFees After Sort:");
	        mpOne.entrySet().forEach(std->System.out.println(std.getKey().getId()+":"+std.getKey().getName()+" SubmittedFees: "+std.getValue()));
		}
		   else
		{
		      System.out.println("No Students Found");
		   }
		}

		
		
		private static Set<Student> getStudentsByYearAndCourse(String admYear, String courseName){
		Set<Student> studListTemp = lstObj.stream().filter(std->{
		if(std.getAdmissionYear().equals(admYear) && std.getCourse().equalsIgnoreCase(courseName))
		return true;
		else
		return false;
		}).collect(Collectors.toSet());
		return studListTemp;
		}

		
		private static void custViewOfStudentsByYearAndCourse() {
		if(lstObj==null || lstObj.isEmpty()) {
		        System.out.println("Student data store is empty");
		return;
		}
		        System.out.println("Please input exact year at console..");
		        Scanner sc=new Scanner(System.in);
		        String admYear = sc.next();
	         	System.out.println("Please input exact course name at console..");
		        String courseName = sc.next();
		Set<Student> studList = getStudentsByYearAndCourse(admYear, courseName);
		if(studList!=null && !studList.isEmpty()) {
		List<String> lstCustInfo = studList.stream().map(s-> "Roll: "+s.getRollNo()+", Address: "+s.getAddress()
		+", Course: "+s.getCourse()+", Admission Year: "+s.getAdmissionYear()).collect(Collectors.toList());
		lstCustInfo.forEach(System.out::println);
		}
		else  {
			
		    System.out.println("No Students found on your search criteria, Please choose other search options..");
		  }
		}

		
		private static void verifyStudentObjIdentityThroughMap() {
		if(lstObj==null || lstObj.isEmpty()) {
		         System.out.println("Student data store is empty");
		return;
		}
		         System.out.println("Please input exact year at console..");
		         Scanner sc=new Scanner(System.in);
	           	String admYear = sc.next();
	        	System.out.println("Please input exact course name at console..");
		        String courseName = sc.next();
		Set<Student> studList = getStudentsByYearAndCourse(admYear, courseName);
		Map<Student, Student> mp = new HashMap<>();
		if(studList!=null && !studList.isEmpty()) {
		for(Student s:studList) {
		mp.put(s, s);
	}
		studList.forEach(System.out::println);
		       Student sObjOne = IndividualStudent();
		       Student sOrg = mp.get(sObjOne);
		        System.out.println("Original Student object from map before updation: "+sOrg);
		   sObjOne.setSubmittedFees(4000);
		   mp.put(sObjOne, sObjOne);
		      Student sUpd = mp.get(sObjOne);
		      System.out.println("Student object from map after updation: "+sUpd);
		System.out.println("sOrg==sUpd: "+(sOrg==sUpd));
		System.out.println("Original Student object from map after updation: "+sOrg); System.out.println("sObjOne==sOrg: "+(sObjOne==sOrg));
		System.out.println("sObjOne==sUpd: "+(sObjOne==sUpd));
		}
		}



		private static void viewStudentsOptions() {
		System.out.println("Enter 1 to find students on a particular course name");
		System.out.println("Enter 2 to find students those opted a particular year");
		System.out.println("Enter 3 to find students on the basis of both course, year and age");
		System.out.println("Enter 4 to find students on the basis of course, year and feestatus");
		System.out.println("Enter 5 to find a student on the basis of course, year and resultstatus");
		}


		
		private static void printSearchStudentsOptions() {
			
			System.out.println("Please select any of below options at console:");
			
			System.out.println("Press 1 & hit enter key to find students those admitted on a particular year :");
			
			System.out.println("Press 2 & hit enter key to find students those opted a particular course :");
			
			System.out.println("Press 3 & hit enter key to find students on the basis of both course & year : ");
			
			System.out.println("Press 4 & hit enter key to find students on the basis of course, year & name :");
			
			System.out.println("Press 5 & hit enter key to find a student on the basis of course, year & email :");
			
			System.out.println("Press 6 & hit enter key to find a student on the basis of course, year & roll no :");
			
			System.out.println("Press 7 & hit enter key to find a student on the basis of only name :");
			
			System.out.println("Press 8 & hit enter key to find a student on the basis of only email :");
			
			System.out.println("Press 9 & hit enter key to find a student on the basis of only roll no :");
					
		}
		


		private static void printInstructions() {
			
			System.out.println("Please select any of below options at console :");
			
			System.out.println("1. view  all students :");
			
			System.out.println("2. add a new student :");
			
			System.out.println("3 update an existing student :");
			
			System.out.println("4 delete an existing student :");
			
			System.out.println("5 sort an existing student :");
			
			System.out.println("6 view an Individual Student by ID/RollNo :");
			
			System.out.println("7 view an MaxFeeDue of a Student :");
			
            System.out.println("8 view an Pendingfee of a Student :");
			
			System.out.println("9 view an BunkIndays of a Student :");
			
			System.out.println("10 view an StudentsCount :");
			
			System.out.println("11 view argumentof a Student :");
			
			System.out.println("12 view pendingWithMinFees of a Student :");
			
			System.out.println("13 view pendingWithMaxFees of a Student :");
			
			System.out.println("14 sortbysubmittedfees of a Student :");
			
			System.out.println("15 view sortStudentAttendance of a Student :");
			
			System.out.println("16 view mapBySubmittedFees of a Student :");
			
			System.out.println("17 view  verifyStudentObjIdentityThroughMap of a Student :");
			
			
			
			
			System.out.println("Type quit & hit enter key to exit :");
			
		  }

		}
	 
	 
	