package inheritancePrj;

import java.util.Scanner;

public class labSecond extends selectALab
{
	int cdOfTst;
	String patNm;
	String patSex;
	int patAge;	
	
	labSecond()
	{
		cdOfTst = 0;
		patNm = null;
		patSex = null;
		patAge = 0;
	}
	labSecond(String doc_nm, String name, int lab_id, int cdOFTest, String patNm, String patSex, int patAge)
	{
		super(doc_nm, name, lab_id);
		this.cdOfTst = cdOfTst;
		this.patNm = patNm;
		this.patSex = patSex;
		this.patAge = patAge;
	}
	labSecond(labSecond L)
	{
		super(L);
		cdOfTst = L.cdOfTst;
		patNm = L.patNm;
		patSex = L.patSex;
		patAge = L.patAge;
	}
	void readLab2()
	{
		this.readSal();
		Scanner sc = new Scanner(System.in);
		//System.out.println("since the test was not available in laboratory 1, you have been transferred here, please enter the code of the test you wanna do: ");
		cdOfTst = sc.nextInt();
		if(cdOfTst == 1)
		{
			System.out.println("this test can be done here, the name of the test is : ");
			System.out.println("C.B.C");
		}
		else
			if(cdOfTst == 2)
			{
				System.out.println("this test can be done here, the name of the test is : ");
				System.out.println("P.T.I.N.R");
			}
			else
				if(cdOfTst == 3)
				{
					System.out.println("this test can be done here, the name of the test is : ");
					System.out.println("L.F.T");
				}
				else
					if(cdOfTst == 4)
					{
						System.out.println("this test can be done here, the name of the test is : ");
						System.out.println("K.F.T");
					}
					else
					{
						System.out.println("this test can not be done here, please leave");
						return;
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
	void showLab2()
	{
		this.showSal();
		System.out.println("the name of the patient is: " + patNm);
		if(patSex == "male")
		{
			System.out.println("the patient is a : " + patSex);
		}
		else 
			if(patSex == "female")
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
