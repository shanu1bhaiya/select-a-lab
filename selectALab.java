package inheritancePrj;

import java.util.Scanner;

public class selectALab 
{
	String doc_nm;
	String name;
	int lab_id;
	
	selectALab()
	{
		doc_nm = null;
		name = null;
		lab_id = 0;
	}
	selectALab(String doc_nm, String name, int lab_id)
	{
		this.doc_nm = doc_nm;
		this.name=name;
		this.lab_id = lab_id;
	}
	selectALab(selectALab S)
	{
		doc_nm = S.doc_nm;
		name = S.name;
		lab_id = S.lab_id;
	}
	void readSal()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the name of the doctor whom the patient has consulted: ");
		doc_nm = sc.nextLine();
		//sc.nextLine();
		System.out.println("enter name of the laboratory: ");
		name = sc.nextLine();
		//sc.nextLine();
		System.out.println("enter the laboratory id: ");
		lab_id = sc.nextInt();
		if(lab_id == 1)
		{
			System.out.println("since you have selected laboratory 1, please enter the code of the test you wanna do: ");
		}
		else
			if(lab_id == 2)
			{
				System.out.println("since the test was not available in laboratory 1, you have been transferred here, please enter the code of the test you wanna do: ");
			}
			else
			{
				System.out.println("please enter a valid id of the lab");
			}
	}
	void showSal()
	{
		System.out.println("the name of the doctor is: " + doc_nm);
		System.out.println("the name of the laboratory is: " + name);
		System.out.println("the id of the laboratory is: " + lab_id);
		//System.out.println();
	}
}
