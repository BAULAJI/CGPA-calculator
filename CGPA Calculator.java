package Swingpack;
import java.awt.FlowLayout;

import javax.swing.*;
public class Cgpasample {

	public static void main(String[] args) {
        Cgpa c=new Cgpa();
	}

}
class Cgpa extends JFrame
{
	JLabel l,d,r,l1,l2;
	JTextField t;
	JButton b,b1;
	public Cgpa()
	{
		t=new JTextField(20);
		l=new JLabel("Enter the Number Of Subjects");
		b=new JButton("Ok");
	    d=new JLabel(".");
	    r=new JLabel("CGPA is");
	    b1=new JButton("Result");
		add(l);
		add(t);
		add(b);
		add(d);
	
	
		
		b.addActionListener(ae->
		{
		    
			int n=Integer.parseInt(t.getText());
			JTextField t1[]=new JTextField[n];
			JTextField t2[]=new JTextField[n];
			for(int i=0;i<n;i++)
			{
				 t1[i]=new JTextField(20);
				 l1=new JLabel("Enter the Grade for S"+(i+1));
			     t2[i]=new JTextField(20);
				 l2=new JLabel("Enter the Credit for S"+(i+1));
				
				add(l1);
				add(t1[i]);
				add(l2);
				add(t2[i]);
				add(b1);
				add(r);
				
				d.setText("");
			
			
			
			}
			
			b1.addActionListener(ar->
			{

				float result=0,totalcredit=0;

				String Grade[]=new String[n];
				int Credit[]=new int[n];
				for(int i=0;i<n;i++)
				{
				 Grade[i]=t1[i].getText();
				Credit[i]=Integer.parseInt(t2[i].getText());
				
				totalcredit=totalcredit+Credit[i];
			
					if(Grade[i].equals("O"))
			        {
					   
			            result=result+(Credit[i]*10);
			        }
			        else if(Grade[i].equals("A+"))
			        {
			        	 
				         result=result+(Credit[i]*9);
			        }
			        else if(Grade[i].equals("A"))
			        {
			        	
				         result=result+(Credit[i]*8);
			        }
			         else if(Grade[i].equals("B+"))
			        {
			        	 
				         result=result+(Credit[i]*7);
			        }
			         else if(Grade[i].equals("B"))
			        {
			        	
				         result=result+(Credit[i]*6);
			        }
			         else if(Grade[i].equals("C"))
			        {
			        	
				         result=result+(Credit[i]*5);
			        }
			        else if(Grade[i].equals("U")){
			            result=result+0;
			        }	
				}
				r.setText(""+String.format("%.2f",(result/totalcredit)));	
					
				
			}
			
			);
		}
		);
		setTitle("CGPA CALCULATOR");
		setVisible(true);
		setLayout(new FlowLayout());
		setSize(390,530);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
