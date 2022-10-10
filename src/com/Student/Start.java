package com.Student;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Start {

	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("Welcome To Student Management App");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true)
		{
			System.out.println("PRESS 1 to Add Student");
			System.out.println("PRESS 2 to Delete Student");
			System.out.println("PRESS 3 to Display Student");
			System.out.println("PRESS 4 to Exit App");
			
			int c = Integer.parseInt(br.readLine());
			
			if(c==1)
			{
				//Add student
				System.out.println("Enter user name : ");
				String name = br.readLine();
				
				System.out.println("Enter user phone : ");
				String phone =br.readLine();
				
				System.out.println("Enter user city : ");
				String city = br.readLine();
				
				//Create student object to Store Student
				Student st = new Student(name,phone,city);
				boolean answer = StudentDao.insertStudentToDB(st);
				if(answer)
				{
					System.out.println("Student is added Successfully...");
				}
				else
				{
					System.out.println("Something Went Wrong....");
				}
				System.out.println(st);
			}
			else if(c==2)
			{
				//Delete Student
				System.out.println("Enter userid to delete");
				int userId = Integer.parseInt(br.readLine());
				boolean f = StudentDao.deleteStudent(userId);
			    if(f)
			    {
			    	System.out.println("Deleted....");
			    }
			    else
			    {
			    	System.out.println("Something Went Wrong....");
			    }
			}
			else if(c==3)
			{
				//Display Student
				StudentDao.showAllStudents();
				
			}
			else if(c==4)
			{
				//Exit
				break;
			}
			else
			{
				
			}
		}
		
		System.out.println("Thank You for Using my Application....");
		System.out.println("See You Soon.... Byee Byee");


	}

}
