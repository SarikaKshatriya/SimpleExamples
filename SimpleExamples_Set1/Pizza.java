package SimpleExamples;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.Border;

public class Pizza extends JFrame
{
	public static void main(String[] args) 
	{
		new Pizza();
	}
	private JButton ok;
	private JRadioButton small,medium,large;
	private JCheckBox veggie,cheese,pepproni;
	
	public Pizza()
	{
		this.setSize(320,200);
		this.setTitle("Order Pizza");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel main=new JPanel();
		JPanel size=new JPanel();
		Border b=BorderFactory.createTitledBorder("Size");
		size.setBorder(b);
		ButtonGroup g= new ButtonGroup();
		
		small= new JRadioButton("Small");
		small.setSelected(true);
		size.add(small);
		g.add(small);
		
		medium= new JRadioButton("Medium");
		size.add(medium);
		g.add(medium);
		
		large= new JRadioButton("Large");
		size.add(large);
		g.add(large);
		
		main.add(size);
		
		JPanel top=new JPanel();
		Border bt=BorderFactory.createTitledBorder("Toppings");
		veggie=new JCheckBox("Veggie");
		top.add(veggie);
		
		cheese=new JCheckBox("Cheese");
		top.add(cheese);
		
		pepproni=new JCheckBox("Pepproni");
		top.add(pepproni);
		
		main.add(top);
		
		ok=new JButton("OK");
		ok.addActionListener(e->OkClick());
		main.add(ok);
		
		this.add(main);
		this.setVisible(true);
		
		
		
	}
	
	public void OkClick()
	{
		String toppings="";
		if(veggie.isSelected())
			toppings+="Veggie";
		if(cheese.isSelected())
			toppings+="Cheese";
		if(pepproni.isSelected())
			toppings+="Pepproni";
		
		String message= "Your Order is:";
		if(small.isSelected())
			message+="small pizza with";
		if(medium.isSelected())
			message+="medium pizza with";
		if(large.isSelected())
			message+="large pizza with";
		
		if(toppings.equals(" "))
			message+=" no toppings";
		else
			message+="following toppings- "+toppings;
		
		JOptionPane.showMessageDialog(ok, message,"Your Order ",JOptionPane.INFORMATION_MESSAGE);
		
		veggie.setSelected(false);
		cheese.setSelected(false);
		pepproni.setSelected(false);
		small.setSelected(true);
		
		
	}
}
