import javax.swing.*;
import java.io.*;
class NetPredict2{
public static void main(String args[])throws IOException {

while (true) {

		// recreate the net
		Randomizer randomizer = new Randomizer();
		System.out.println("Recreating the net");
		NeuralNet mynet = new NeuralNet("Config2.nnc", randomizer);
		mynet.LoadWeights("example1.nnw");
		
		// and test it
double position;
String aa,d;
int f=0,k=0;


            d= JOptionPane.showInputDialog(null, "Enter the position to be mutated in the  bacteriocin sequence or CANCEL.");
            if (d == null) break;   // Exit if Cancel or close box clicked.

 position = Double.parseDouble(d);
	if(position>41){
		f=0;
	   		while(f!=1){

		JOptionPane.showMessageDialog(null, "The length of bacteriocin is 41. The position you entered is invalid!!!!","Warning", 1);
		d= JOptionPane.showInputDialog(null, "Enter the position to be mutated in the  bacteriocin sequence or CANCEL.");
                if (d == null) break;   // Exit if Cancel or close box clicked.
		position = Double.parseDouble(d);
			if(position<=41)
			f=1;
			}
		}

 aa= JOptionPane.showInputDialog(null, "Enter the amino acid with which you wanna mutate that position or CANCEL.");
            if (aa== null) break;   // Exit if Cancel or close box clicked.

           else {
if((aa.equals("A"))||(aa.equals("R"))||(aa.equals("N"))||(aa.equals("D"))||(aa.equals("C"))||(aa.equals("E"))||(aa.equals("Q"))||(aa.equals("G"))||(aa.equals("H"))||(aa.equals("I"))||(aa.equals("L"))||(aa.equals("K"))||(aa.equals("M"))||(aa.equals("F"))||(aa.equals("P"))||(aa.equals("S"))||(aa.equals("T"))||(aa.equals("W"))||(aa.equals("Y"))||(aa.equals("V")))
          k=1; 

	  else{
k=0;
		while(k!=1){
		JOptionPane.showMessageDialog(null, "The amino acid entered is either not valid or you might have not entered it in small letters!!!!!\n  Try again!!!!!!","Warning", 1);
		aa= JOptionPane.showInputDialog(null, "Enter the amino acid with which you wanna mutate that position or CANCEL.");
            	if (aa== null) break;   // Exit if Cancel or close box clicked.
		if((aa.equals("A"))||(aa.equals("R"))||(aa.equals("N"))||(aa.equals("D"))||(aa.equals("C"))||(aa.equals("E"))||(aa.equals("Q"))||(aa.equals("G"))||(aa.equals("H"))||(aa.equals("I"))||(aa.equals("L"))||(aa.equals("K"))||(aa.equals("M"))||(aa.equals("F"))||(aa.equals("P"))||(aa.equals("S"))||(aa.equals("T"))||(aa.equals("W"))||(aa.equals("Y"))||(aa.equals("V")))
          k=1;
}
}
}

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

char q;
double InputDescriptors[]= new double[6];
q=aa.charAt(0);

if(q=='A')
	{
		InputDescriptors=A;
	}
	else if(q=='R')
	{
		InputDescriptors=R;
	}
	else if(q=='N')
	{
		
		InputDescriptors=N;
		
	}
	else if(q=='D')
	{
		
		InputDescriptors=D;
	}
	else if(q=='C')
	{
		
		InputDescriptors=C;
	}
	else if(q=='Q')
	{
		
		InputDescriptors=Q;
	}
	else if(q=='E')
	{
	
		InputDescriptors=E;
	}
	else if(q=='G')
	{
		
		InputDescriptors=G;
	}
	else if(q=='H')
	{
	
		InputDescriptors=H;
	
	}
	else if(q=='I')
	{
		
		InputDescriptors=I;
	}
	else if(q=='L')
	{
	
		InputDescriptors=L;
	}
	else if(q=='K')
	{
	
		InputDescriptors=K;
	}
	else if(q=='M')
	{
	
		InputDescriptors=M;
	}
	else if(q=='F')
	{
	
		InputDescriptors=F;
	
	}
	else if(q=='P')
	{
		
		InputDescriptors=P;
		
	}
	else if(q=='S')
	{
	
		InputDescriptors=S;
	}
	else if(q=='T')
	{
		
		InputDescriptors=T;
		
	}
	else if(q=='W')
	{
		
		InputDescriptors=W;
	}
	else if(q=='Y')
	{
	
		InputDescriptors=Y;
	}
	else if(q=='V')
	{
		InputDescriptors=V;
	}	
	

	else
	{
		System.out.println("Not an amino acid");
	}
double[] inputs= new double[7];

for(int i=0;i<7;i++)
{
if(i==0)
inputs[i]=position;
else
inputs[i]=InputDescriptors[i-1];
}
		double[] outputs = mynet.Output(inputs); // Although there will be only one output.
		int ix = (int)(outputs[0] * 1000.0); // scale it
double dbl2 = ((double)ix)/1000.0;
	if(aa != null)
         JOptionPane.showMessageDialog(null, "The predicted activity of bacteriocin is : " + dbl2, "Activity", 1);
        else
          JOptionPane.showMessageDialog(null, "You pressed cancel button.","Activity", 1);
                mynet = null;
		randomizer = null;
		}  
  	}
}
