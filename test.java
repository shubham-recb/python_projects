// class test
// {
	// public static void main(String args[])
	// {
		// System.out.println("Hello java");
	// }
// }

import java.awt.*;
class test
{
	public static void main(String args[])
	{
		Frame fr = new Frame("This is frame");
		fr.setSize(400,200);
		fr.setLayout(new FlowLayout());
		fr.setVisible(true);
		Label l1 = new Label("Ok");
		Label l2 = new Label("Cancle");
		fr.add(l1);
		fr.add(l2);
		
	}
}