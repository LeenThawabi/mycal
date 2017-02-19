import java.awt.*;



import javax.swing.*;







public class view extends JFrame{

	

	protected JButton[] buttons;

	

	protected static final String[] names={"7","8","9","/","4","5","6","*","1","2","3","+",

			"0","C","CE","-","="};

	protected JTextField result ;

	protected JPanel keys;

	

	public view(){

		

		super("Calculator");

		keys =new JPanel();

		

		keys.setLayout(new GridLayout(5,4));

		buttons=new JButton[names.length];

		for(int i=0;i<names.length; i++){

			

			buttons[i]=	new JButton(names[i]);

			keys.add(buttons[i]);	

		}

		

		result= new JTextField("0");

		

		result.setEditable(false);

		

		result.setHorizontalAlignment(JTextField.RIGHT);

		add(result,BorderLayout.NORTH);

		add(keys,BorderLayout.CENTER);

		

		

		

	}//end constructor

	



		

	

}//end Frame