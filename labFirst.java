package inheritancePrj;

import java.util.Scanner;

public class labFirst extends selectALab
{
	int cdOfTest;
	String patNm;
	String patSex;
	int patAge;
	
	labFirst()
	{
		cdOfTest = 0;
		patNm = null;
		patSex = null;
		patAge = 0;
	}
	labFirst(String doc_nm, String name, int lab_id,int cdOFTest, String patNm, String patSex, int patAge)
	{
		super(doc_nm, name, lab_id);
		this.cdOfTest = cdOfTest;
		this.patNm = patNm;
		this.patSex = patSex;
		this.patAge = patAge;
	}
	labFirst(labFirst L)
	{
		super(L);
		cdOfTest = L.cdOfTest;
		patNm = L.patNm;
		patSex = L.patSex;
		patAge = L.patAge;
	}
	void readLab1()
	{
		this.readSal();
		Scanner sc = new Scanner(System.in);
		//System.out.println("since you have selected laboratory 1, please enter the code of the test you wanna do: ");
		cdOfTest = sc.nextInt();
		if(cdOfTest == 1)
		{
			System.out.println("this test can be done here, the name of the test is : ");
			System.out.println("Xray");
		}
		else
			if(cdOfTest == 2)
			{
				System.out.println("this test can be done here, the name of the test is : ");
				System.out.println("Sonography");
			}
			else
				if(cdOfTest == 3)
				{
					System.out.println("this test can be done here, the name of the test is : ");
					System.out.println("M.R.I");
				}
				else
					if(cdOfTest == 4)
					{
						System.out.println("this test can be done here, the name of the test is : ");
						System.out.println("Angiography");
					}
					else
					{
						System.out.println("this test can not be done here, please go to lab 2");
						labSecond labSecond = new labSecond();
						labSecond.readLab2();
					}
		sc.nextLine();
		System.out.println("enter name of the patient: ");
		patNm = sc.nextLine();
		//sc.nextLine();
		System.out.println("enter the patient's sex: ");
		patSex = sc.nextLine();
		
		System.out.println("enter patient's age: ");
		patAge = sc.nextInt();
	}
	void showLab1()
	{
		this.showSal();
		System.out.println("the name of the patient is: " + patNm);
		if(patSex == "m")
		{
			System.out.println("the patient is a : " + patSex);
		}
		else 
			if(patSex == "f")
			{
				System.out.println("the patient is a : " + patSex);
			}
			else
			{
				System.out.println("please enter a valid sex of the person");
			}
		System.out.println("the patient's age is: " + patAge);
		System.out.println();
	}
}
