package javaproject;

import java.util.List;
import java.util.Scanner;

public class Client {

		public static void main(String[] args) {

			boolean flag = true;

			Scanner scanner = new Scanner(System.in);

			DepartmentDAO dao = new DepartmentDAO();

			while (flag) {

				System.out.println("WELCOME TO DMS");
				System.out.println("1. ADD Department");
				System.out.println("2. UPDATE Department");
				System.out.println("3. DELETE Department");
				System.out.println("4. SELECT Department");
				System.out.println("5. SELECT ALL");
				System.out.println("0. EXIT");

				int choice = scanner.nextInt();

				switch (choice) {
				case 1:

					System.out.println("Enter Dept No.");
					int dno1 = scanner.nextInt();
					System.out.println("Enter Dept Name");
					String dname1 = scanner.next();
					System.out.println("Enter Location");
					String location1 = scanner.next();

					Department dept1 = new Department();

					dept1.setDno(dno1);
					dept1.setDname(dname1);
					dept1.setLocation(location1);
					int count = dao.addDept(dept1);

					System.out.println(count + " records inserted");

					break;
				case 2:

					System.out.println("Enter Dept No.");
					int dno2 = scanner.nextInt();
					System.out.println("Enter Dept Name");
					String dname2 = scanner.next();
					System.out.println("Enter Location");
					String location2 = scanner.next();

					Department dept2 = new Department();

					dept2.setDno(dno2);
					dept2.setDname(dname2);
					dept2.setLocation(location2);
					int count1 = dao.updateDept(dept2);

					System.out.println(count1 + " records updated");

					break;
				case 3:

					System.out.println("Enter DeptNo to delete one record");

					int dno3 = scanner.nextInt();

					int count3 = dao.deleteDeptByNo(dno3);

					System.out.println(count3 + " record deleted");

					break;
				case 4:

					System.out.println("Enter Dno to select record");
					int dno4 = scanner.nextInt();

					Department deptObj = dao.getDeptByNo(dno4);

					System.out.println(deptObj);

					break;

				case 5:

					List<Department> list = dao.getAll();

					for (Department department : list) {
						System.out.println(department);

					}

					break;

				case 0:

					flag = false;

					break;

				default:
					System.err.println("Invalid input");
					break;
				}

			}

		}


}
