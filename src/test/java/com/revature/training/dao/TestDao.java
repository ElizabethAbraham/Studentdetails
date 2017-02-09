package com.revature.training.dao;



import com.revature.training.model.StudentDetails;

public class TestDao {

	public static void main(String[] args) {
	{
			
				StudentDetails student1=new StudentDetails();
				student1.setId(36);
				student1.setName("Elizabeth Abraham");
				student1.setClasspost("trendupdater");
				  StudentDetailsDao studentdao=new StudentDetailsDao();
				  studentdao.save(student1);
						 
			}
			
		

	}

}
