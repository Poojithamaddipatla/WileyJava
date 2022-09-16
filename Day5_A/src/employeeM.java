
public class employeeM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		 Employee staff[]=new Employee[5];
	      staff[0] = new Employee(105,"A","Maths",13000);
	      staff[1] = new Employee(106,"B","Chemistry",8000);
	      staff[2] = new Employee(101,"C","English",5000);
	      staff[3] = new Employee(103,"D","Physics",20000);
	      staff[4] = new Employee(102,"E","Maths",15000);
	      
	     EmploeeU.sortEmployees(staff);

	}

}
