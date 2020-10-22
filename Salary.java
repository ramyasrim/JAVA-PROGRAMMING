import java.util.Scanner;
class Employee{
	String Emp_name;
	int Emp_id;
	String Address;
	String Mail_id;
	Long Mobile_no;
	Scanner sc=new Scanner(System.in);
	void getdata(){
		System.out.println("Enter Name of the Employee");
		Emp_name=sc.next();
		System.out.println("Enter Mail id");
		Mail_id=sc.next();
		System.out.println("Enter Address of the Employee");
		Address=sc.next();
		System.out.println("Enter Employee id");
		Emp_id=sc.nextInt();
		System.out.println("Enter Mobile number");
		Mobile_no=sc.nextLong();
	}
	void display(){
		System.out.println("Employee Name:"+Emp_name);
		System.out.println("Employee Mail id:"+Mail_id);
		System.out.println("Employee Address:"+Address);
		System.out.println("Employee id:"+Emp_id);
		System.out.println("Employee Mobile no:"+Mobile_no);
	}
}
class Programmer extends Employee{
	double BP,DA,HRA,PF,club_fund,net_salary,gross;
	void getProgrammer(){
		System.out.println("enter basic pay");
		BP=sc.nextDouble();
	}
	void calculateprog(){
		DA=(0.97*BP);
		HRA=(0.10*BP);
		PF=(0.12*BP);
		club_fund=(0.1*BP);
		gross=(BP+DA+HRA);
		net_salary=(gross-PF-club_fund);
		System.out.println("************************************************");
		System.out.println("PAY SLIP FOR PROGRAMMER");
		System.out.println("************************************************");
		System.out.println("Basic Pay:Rs."+BP);
		System.out.println("DA:Rs."+DA);
		System.out.println("HRA:Rs."+HRA);
		System.out.println("PF:Rs."+PF);
		System.out.println("club_fund:Rs."+club_fund);
		System.out.println("gross pay:Rs."+gross);
		System.out.println("net_salary:Rs."+net_salary);
	}
}
class Asstprofessor extends Employee{
	double BP,DA,HRA,PF,club_fund,net_salary,gross;
	void getasst(){
		System.out.println("enter basic pay");
		BP=sc.nextDouble();
	}
	void calculateasst(){
		DA=(0.97*BP);
		HRA=(0.10*BP);
		PF=(0.12*BP);
		club_fund=(0.1*BP);
		gross=(BP+DA+HRA);
		net_salary=(gross-PF-club_fund);
		System.out.println("************************************************");
		System.out.println("PAY SLIP FOR ASSISTANT PROFESSOR");
		System.out.println("************************************************");
		System.out.println("Basic Pay:Rs."+BP);
		System.out.println("DA:Rs."+DA);
		System.out.println("HRA:Rs."+HRA);
		System.out.println("PF:Rs."+PF);
		System.out.println("club_fund:Rs."+club_fund);
		System.out.println("gross pay:Rs."+gross);
		System.out.println("net_salary:Rs."+net_salary);
	}
}
class Associateprofessor extends Employee{
	double BP,DA,HRA,PF,club_fund,net_salary,gross;
	void getassociate(){
		System.out.println("enter basic pay");
		BP=sc.nextDouble();
	}
	void calculateassociate(){
		DA=(0.97*BP);
		HRA=(0.10*BP);
		PF=(0.12*BP);
		club_fund=(0.1*BP);
		gross=(BP+DA+HRA);
		net_salary=(gross-PF-club_fund);
		System.out.println("************************************************");
		System.out.println("PAY SLIP FOR ASSOCIATE PROFESSOR");
		System.out.println("************************************************");
		System.out.println("Basic Pay:Rs."+BP);
		System.out.println("DA:Rs."+DA);
		System.out.println("HRA:Rs."+HRA);
		System.out.println("PF:Rs."+PF);
		System.out.println("club_fund:Rs."+club_fund);
		System.out.println("gross pay:Rs."+gross);
		System.out.println("net_salary:Rs."+net_salary);
	}
}
class Professor extends Employee{
	double BP,DA,HRA,PF,club_fund,net_salary,gross;
	void getprofessor(){
		System.out.println("enter basic pay");
		BP=sc.nextDouble();
	}
	void calculateprofessor(){
		DA=(0.97*BP);
		HRA=(0.10*BP);
		PF=(0.12*BP);
		club_fund=(0.1*BP);
		gross=(BP+DA+HRA);
		net_salary=(gross-PF-club_fund);
		System.out.println("************************************************");
		System.out.println("PAY SLIP FOR PROFESSOR");
		System.out.println("************************************************");
		System.out.println("Basic Pay:Rs."+BP);
		System.out.println("DA:Rs."+DA);
		System.out.println("HRA:Rs."+HRA);
		System.out.println("PF:Rs."+PF);
		System.out.println("club_fund:Rs."+club_fund);
		System.out.println("gross pay:Rs."+gross);
		System.out.println("net_salary:Rs."+net_salary);
	}
}
class Salary{
	public static void main(String args[]){
		int choice,cont;
		do{
			System.out.println("PAYROLL");
			System.out.println("1.PROGRAMMER\t2.ASSISTANT PROFESSOR\t3.ASSOCIATE PROFESSOR\t4.PROFESSOR");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your choice:");
			choice=sc.nextInt();
			switch(choice){
				case 1:
				{
					Programmer p=new Programmer();
					p.getdata();
					p.getProgrammer();
					p.display();
					p.calculateprog();
					break;
				}
				case 2:
				{
					Asstprofessor asst=new Asstprofessor();
					asst.getdata();
					asst.getasst();
					asst.display();
					asst.calculateasst();
					break;
				}
				case 3:
				{
					Associateprofessor asso=new Associateprofessor();
					asso.getdata();
					asso.getassociate();
					asso.display();
					asso.calculateassociate();
					break;
				}
				case 4:
				{
					Professor prof=new Professor();
					prof.getdata();
					prof.getprofessor();
					prof.display();
					prof.calculateprofessor();
					break;
				}
			}
			System.out.println("please enter 0 to quit and 1 to continue:");
			cont=sc.nextInt();
		}while(cont==1);
	}
}
					

	
