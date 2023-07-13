package javaproject;

import java.util.List;

public class DepartmentServicesIMP implements IDepartmentServices {

	
private	DepartmentDAO  dao = new DepartmentDAO();
	
	@Override
	public int addDept(Department dept) {
		// TODO Auto-generated method stub
		return dao.addDept(dept);
	}

	@Override
	public int updateDept(Department dept) {
		// TODO Auto-generated method stub
		return dao.updateDept(dept);
	}

	@Override
	public int deleteDeptByNo(int deptNo) {
		// TODO Auto-generated method stub
		return dao.deleteDeptByNo(deptNo);
	}

	@Override
	public Department getDeptByNo(int deptNo) {
		// TODO Auto-generated method stub
		return dao.getDeptByNo(deptNo);
	}

	@Override
	public List<Department> getAll() {
		// TODO Auto-generated method stub
		return dao.getAll();
	}
	
	
	public static boolean  dataValidation(Department dept) {
		
		boolean flag = false;
		
		if(dept.getDno() > 99 
		&& dept.getDname().length() >= 4 
		&& dept.getLocation().equals(dept.getLocation().toUpperCase())					
				                ) {
			
				flag = true;
		}
		
		return flag;
	}
	
	
	
	

}
