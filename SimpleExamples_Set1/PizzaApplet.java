package SimpleExamples;

import java.applet.Applet;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class PizzaApplet extends Applet {
	public static void main(String[] args) {
		new PizzaApplet();
	}

	JTextField name, phone, address;
	JButton ok, close;
	JRadioButton small, medium, large, thick, thin;
	JCheckBox veggie, cheese, pepproni;

	public PizzaApplet() {
		this.setSize(320, 200);
	
		JPanel main = new JPanel();
		main.setLayout(new GridBagLayout());
		addItem(main, new JLabel("Name:"), 0, 0, 1, 1, GridBagConstraints.EAST);
		addItem(main, new JLabel("Phone:"), 0, 1, 1, 1, GridBagConstraints.EAST);
		addItem(main, new JLabel("Address:"), 0,2, 1, 1, GridBagConstraints.EAST);
		name = new JTextField(20);
		phone = new JTextField(20);
		address = new JTextField(20);

		addItem(main, name, 1, 0, 2, 1, GridBagConstraints.WEST);
		addItem(main, phone, 1, 1, 1, 1, GridBagConstraints.WEST);
		addItem(main, address, 1, 2, 2, 1, GridBagConstraints.WEST);

		Box size = Box.createVerticalBox();
		small = new JRadioButton("Small");
		medium = new JRadioButton("Medium");
		large = new JRadioButton("Large");
		ButtonGroup s = new ButtonGroup();
		s.add(small);
		size.add(small);
		s.add(medium);
		size.add(medium);
		s.add(large);
		size.add(large);

		size.setBorder(BorderFactory.createTitledBorder("Size"));
		addItem(main, size, 0, 3, 1, 1, GridBagConstraints.NORTH);

		Box style = Box.createVerticalBox();
		thin = new JRadioButton("Thin");
		thick = new JRadioButton("Thick");
		ButtonGroup sg = new ButtonGroup();
		sg.add(thin);
		style.add(thin);
		sg.add(thick);
		style.add(thick);

		style.setBorder(BorderFactory.createTitledBorder("Style"));
		addItem(main, style, 1, 3, 1, 1, GridBagConstraints.NORTH);

		Box top = Box.createVerticalBox();
		veggie = new JCheckBox("Veggie");
		top.add(veggie);
		cheese = new JCheckBox("Cheese");
		top.add(cheese);
		pepproni = new JCheckBox("Pepproni");
		top.add(pepproni);

		top.setBorder(BorderFactory.createTitledBorder("Toppings"));
		addItem(main, top, 2, 3, 1, 1, GridBagConstraints.NORTH);

		Box b = Box.createVerticalBox();
		ok = new JButton("OK");
		close = new JButton("Close");
		b.add(ok);
		b.add(close);
		b.add(Box.createHorizontalStrut(20));
		addItem(main, b, 2, 4, 1, 1, GridBagConstraints.NORTH);

		this.add(main);
		this.setVisible(true);
	

	}

	private void addItem(JPanel p, JComponent c, int x, int y, int w, int h, int a) {
		GridBagConstraints g = new GridBagConstraints();
		g.gridx = x;
		g.gridy = y;
		g.gridwidth = w;
		g.gridheight = h;
		g.weightx = 100.0;
		g.weighty = 100.0;
		g.insets = new Insets(5, 5, 5, 5);
		g.fill = GridBagConstraints.NONE;
		p.add(c, g);
	}
}
