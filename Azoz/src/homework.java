//Hussain_439100218_AbdulAziz_439100169
public class homework {
public static void main(String[] atgs){
	//geting ready to work
	double Bears = 8;
	double Deers = 55.0;
	double x = max(Bears,Deers);
	double n = min(Bears,Deers);
	//did a little search
	System.out.println("Bears has "+x+"Species");
	System.out.print("Deers has"+n+"Species");
	//then start working in methods
}
public static double max(double num1,double num2){
	double result = 0;
	if (num1>num2)
		result = num1;
	else 
		result = num2;
	return result;
	
}
private static double min(double num1,double num2){
	double result = 0;
	if (num1>num2)
		result = num2;
	else 
		result = num1;
	return result;
	//Hussain_439100218_AbdulAziz_439100169
}
}