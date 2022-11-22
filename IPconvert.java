import java.io.*;
import java.lang.*;
public class IPconvert{
public static void main(String args[]) throws IOException{

int position;

FileOutputStream out=new FileOutputStream("Patternset.txt");
PrintStream p= new PrintStream(out);

double A[]={0.207,0.821,-1.009,1.387,0.063,-0.6};
double R[]={-1.229,0.378,0.516,-0.328,-0.052,2.728};
double N[]={-1.009,-0.939,-0.428,-0.397	,-0.539,-0.605};
double D[]={-1.298,-0.444,-0.584,-0.175,-0.259,-1.762};
double C[]={0.997,0.021,-1.419,-2.08,-0.799,0.502};
double Q[]={-0.88,0.381,-0.044,-0.455,-0.04,0.405};
double E[]={-1.349,1.388,-0.361,0.213,0.424,-1.303};
double G[]={-0.205,-2.219,-1.656,1.229,	-1.115,-1.146};
double H[]={-0.27,0.461,-0.024,-1.407,0.001,0.169};
double I[]={1.524,0.536,0.809,0.734,-0.196,0.427};
double L[]={1.2,1.128,0.703,1.904,0.536,-0.141};
double K[]={-1.387,0.572,0.285,0.333,-0.169,1.157};
double M[]={0.886,1.346,0.277,-0.913,0.007,-0.265};
double F[]={1.247,0.293,1.336,-0.026,0.012,-0.015};
double P[]={-0.407,-2.038,-0.564,-0.128,3.847,-1.008};
double S[]={-0.495,-0.847,-1.079,0.582,0.035,-0.068};
double T[]={-0.032,-0.45,-0.61,0.341,0.117,0.577};
double W[]={0.844,-0.075,2.069,-1.36,-0.81,-0.38};
double Y[]={0.329,-0.858,1.753,-0.479,-0.835,0.289};
double V[]={1.332,0.545,0.029,1.026,-0.229,1.038};



String a="Y";
String b;

do{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enetr the position to be mutated\n");
        String str="";
        str=br.readLine();
        position=Integer.parseInt(str);
	System.out.println("Enter the aminoacid at that position\n");
	String aa="";
	aa=br.readLine();
	System.out.println("enter the activity");
	String act;
	act =br.readLine();            
char q;

double InputDescriptors[]= new double[2];

 q=aa.charAt(0);
	if(q=='A')
	{
		InputDescriptors=A;
	}
	if(q=='R')
	{
		InputDescriptors=R;
	}
	if(q=='N')
	{
		
		InputDescriptors=N;
		
	}
	if(q=='D')
	{
		
		InputDescriptors=D;
	}
	if(q=='C')
	{
		
		InputDescriptors=C;
	}
	if(q=='Q')
	{
		
		InputDescriptors=Q;
	}
	if(q=='E')
	{
	
		InputDescriptors=E;
	}
	if(q=='G')
	{
		
		InputDescriptors=G;
	}
	if(q=='H')
	{
	
		InputDescriptors=H;
	
	}
	if(q=='I')
	{
		
		InputDescriptors=I;
	}
	if(q=='L')
	{
	
		InputDescriptors=L;
	}
	if(q=='K')
	{
	
		InputDescriptors=K;
	}
	if(q=='M')
	{
	
		InputDescriptors=M;
	}
	if(q=='F')
	{
	
		InputDescriptors=F;
	
	}
	if(q=='P')
	{
		
		InputDescriptors=P;
		
	}
	if(q=='S')
	{
	
		InputDescriptors=S;
	}
	if(q=='T')
	{
		
		InputDescriptors=T;
		
	}
	if(q=='W')
	{
		
		InputDescriptors=W;
	}
	if(q=='Y')
	{
	
		InputDescriptors=Y;
	}
	if(q=='V')
	{
		InputDescriptors=V;
	}	
	
p.print(position+";");
System.out.print(position+";");
for(int i=0;i<6;i++){
System.out.print(InputDescriptors[i]+";");
p.print(InputDescriptors[i]+";");
}
System.out.println(act);
p.println(act);
System.out.println("Wanna enter another sequence: Y or N");
b=br.readLine();
}while(a.equals(b));
}
}

