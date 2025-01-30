import java.util.Scanner;
public class FifthTypeFunction {
		// TODO Auto-generated method stub
		static float m1(String country,int amt) {
			float res=0.0f;
			if(country.equalsIgnoreCase("USA")) {
				res=amt*78.67f;
			}
			else if(country.equalsIgnoreCase("UK")) {
			res=amt*120.56f;
		}
		else if(country.equalsIgnoreCase("UAE")) {
			res=amt*20.56f;
	}
		return res;
		}
	static int getAmt() {
		return 100;
	}
		public static void main(String[] args) {  
			Scanner sc = new Scanner(System.in);
			System.out.println("enter country....");
			String country = sc.next();
			String cC= getAmtDetails(country); 
			System.out .println("please enter "+cC);
			if(cC.equalsIgnoreCase("country not Found")) {
				System.out.println("not able to process");
			}
			else {
				int amt=sc.nextInt();
				System.out.println("For this "+country+
						"for this amt="+amt+" indian amt="
						+m1(country,amt));
			}
		}
			static String getAmtDetails(String country) {
				String res="";
                if(country.equalsIgnoreCase("USA")) {
                	res ="Dollar";
                }
                else if(country.equalsIgnoreCase("UK")) {
                	res = "Pound";
                }
                else if(country.equalsIgnoreCase("UAE")) {
                	res = "Diram";
                }
                else {
                	res ="Country not Found";
                }
                return  res;
			}
		}
