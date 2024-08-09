import java.util.HashMap;
import java.util.Scanner;
public class manager {
	
	
	public String toString() {
        return "ID: " + id + ", Phone: " + phoneNum + ", Email: " + email;
    }
	//Key will be an employee's name
	//Value will be additional details, such as phone number, employee ID, and email

	String name;
	String phoneNum;
	String email;
	String id; 
	
	public manager(String id, String phoneNum, String email)
	{
		this.id = id;
		this.phoneNum = phoneNum;
		this.email = email;
	}
	


public static void main(String[] args) {
	
	
		
		Scanner scanner = new Scanner (System.in);
		HashMap<String, manager> Manage = new HashMap<String, manager>();
		
		
		System.out.println("Welcome to the Employee Contact Manager mainframe.");
		
		while(true)
		{
			
			System.out.println("Please input the action you wish to perform (Store, Retrieve, Update, View, Remove, Exit)");
			String input = scanner.nextLine();
		
		
		switch(input) 
		{
		case "Store":
			System.out.println("Please input employee name:");
			String empName = scanner.nextLine();
			
			System.out.println("Please input employee ID:");
			String empID = scanner.nextLine();
			
			System.out.println("Please input employee phone number:");
			String empPNum = scanner.nextLine();
			
			System.out.println("Please input employee email:");
			String empEmail = scanner.nextLine();
			
			Manage.put(empName, new manager(empID, empPNum, empEmail));
			System.out.println("Successfully inputted employee \"" + empName + "\".");
			break;
			
		case "Retrieve":
			
			System.out.println("Please input the name of the employee you wish to retrieve.");
			String retrievedName = scanner.nextLine();
			
			if(!Manage.containsKey(retrievedName))
			{
				System.out.println("Invalid Name. Please try again.");
			}
			else
			{
				System.out.println(Manage.get(retrievedName));
				break;
			}
			
		case "Update":
			manager emp;
			
			System.out.println("Please input the name of the employee you wish to update.");
			String updateName = scanner.nextLine();
			
			if(!Manage.containsKey(updateName))
			{
				System.out.println("Invalid Name. Please try again.");
			}
			else
			{
				emp = Manage.get(updateName);
				System.out.println("Please input the value you wish to update (ID, Phone Number, Email");
				String updateValue = scanner.nextLine();
				
				switch(updateValue)
				{
				case "ID":
					System.out.println("Input the new ID:");
					String newID = scanner.nextLine();
					emp.id = newID;
					System.out.println("ID successfully updated.");
					break;
					
				case "Phone Number":
					System.out.println("Input the new phone number:");
					String newNumber = scanner.nextLine();
					emp.phoneNum = newNumber;
					System.out.println("Phone number successfully updated.");
					break;
					
				case "Email":
					System.out.println("Input the new Email:");
					String newEmail = scanner.nextLine();
					emp.email = newEmail;
					System.out.println("Email successfully updated.");
					break;
					
				}
				break;
			}
			
		case "View":
			System.out.println(Manage);
			break;
			
		case "Remove":
			System.out.println("Which employee would you like to remove from the mainframe?");
			String removeEmp = scanner.nextLine();
			Manage.remove(removeEmp);
			
			System.out.println("Employee successfully removed.");
			break;
			
		case "Exit":
			System.out.println("Thank you for using the mainframe.");
			System.exit(0);
			
			
		}
			
		}
		
			

}
}