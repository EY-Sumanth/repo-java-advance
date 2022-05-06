package com.dev;
	import java.time.LocalDateTime;
	import java.time.ZoneId;
	import java.util.Date;
	import java.util.HashSet;
	import java.util.List;
	import java.util.Set;
	import java.util.UUID;
	public class StudentDataBase {
		
		public static Set<Student> populateStudentsInfo(String objFormStrategy) throws Exception {
			Set<Student> listStudents = new HashSet<>();
			
			if(objFormStrategy.equalsIgnoreCase(SmsConstants.STUD_INSTANCES_DYNAMIC)) {
				Student std1 = new Student();
				String uniqueID = UUID.randomUUID().toString();
				std1.setId(uniqueID);
				std1.setRollNo(std1.getId());	
				std1.setName("jacob");
				std1.setAge(24);
				std1.setEmail("jacob.marsh@gmail.com");
				std1.setCourse("PGD-python");
				std1.setAddress("Mumbai, India");
				std1.setPrevEducation("BTECH-CS");
				std1.setSubmittedFees(200000);
				std1.setTotalCourseFees(300000);
				std1.setCourseFeeStatus(CourseFeeStatus.PENDING.name());
				std1.setResultStatus(ResultStatus.CONTINUEING.name());
				std1.setCourseDuration(365);
				std1.setAttendance(64);
				std1.setAdmissionYear("2018");
				
				Student std2 = new Student();
				String uniqueID2 = UUID.randomUUID().toString();
				std2.setId(uniqueID2);
				std2.setRollNo(std2.getId());	
				std2.setName("sunil");
				std2.setAge(22);
				std2.setEmail("sami.sunil@gmail.com");
				std2.setCourse("PGD-python");
				std2.setAddress("vizag, India");
				std2.setPrevEducation("BTECH-CS");
				std2.setSubmittedFees(300000);
				std2.setTotalCourseFees(400000);
				std2.setCourseFeeStatus(CourseFeeStatus.PENDING.name());
				std2.setResultStatus(ResultStatus.CONTINUEING.name());
				std2.setCourseDuration(365);
				std2.setAttendance(150);
				std2.setAdmissionYear("2018");
				
				Student std3 = new Student();
				String uniqueID3 = UUID.randomUUID().toString();
				std3.setId(uniqueID3);
				std3.setRollNo(std3.getId());	
				std3.setName("mahesh");
				std3.setAge(24);
				std3.setEmail("mahesh.babu@gmail.com");
				std3.setCourse("PGD-Java");
				std3.setAddress("Bangalore, India");
				std3.setPrevEducation("BTECH-CS");
				std3.setSubmittedFees(250000);
				std3.setTotalCourseFees(300000);
				std3.setCourseFeeStatus(CourseFeeStatus.PENDING.name());
				std3.setResultStatus(ResultStatus.CONTINUEING.name());
				std3.setCourseDuration(365);
				std3.setAttendance(130);
				std3.setAdmissionYear("2018");
				
				
				Student std4 = new Student();
				String uniqueID4 = UUID.randomUUID().toString();
				std4.setId(uniqueID4);
				std4.setRollNo(std4.getId());	
				std4.setName("ismail");
				std4.setAge(24);
				std4.setEmail("mohammed.ismail@gmail.com");
				std4.setCourse("PGD-DBMS");
				std4.setAddress("Hyd, India");
				std4.setPrevEducation("BTECH-CS");
				std4.setSubmittedFees(350000);
				std4.setTotalCourseFees(400000);
				std4.setCourseFeeStatus(CourseFeeStatus.PENDING.name());
				std4.setResultStatus(ResultStatus.CONTINUEING.name());
				std4.setCourseDuration(365);
				std4.setAttendance(120);
				std4.setAdmissionYear("2018");
				
				
				Student std5 = new Student();
				String uniqueID5 = UUID.randomUUID().toString();
				std5.setId(uniqueID5);
				std5.setRollNo(std5.getId());	
				std5.setName("sumanth");
				std5.setAge(24);
				std5.setEmail("Sumanth.reddy@gmail.com");
				std5.setCourse("PGD-Java");
				std5.setAddress("Assam, India");
				std5.setPrevEducation("BTECH-CS");
				std5.setSubmittedFees(360000);
				std5.setTotalCourseFees(400000);
				std5.setCourseFeeStatus(CourseFeeStatus.PENDING.name());
				std5.setResultStatus(ResultStatus.CONTINUEING.name());
				std5.setCourseDuration(365);
				std5.setAttendance(100);
				std5.setAdmissionYear("2018");
				
				
		
			
								
				listStudents.add(std1);
				listStudents.add(std2);
				listStudents.add(std3);
				listStudents.add(std4);
				listStudents.add(std5);
				
			}else if(objFormStrategy.equalsIgnoreCase(SmsConstants.STUD_INSTANCES_STATIC)) {
				//Load from file
				
			}else {
				//Do nothing and display warning by throwing exception
				throw new Exception("Please provide strategy to load students information..");
			}
			
			return listStudents;
		}

	}


