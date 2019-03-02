/*
Encryption method tester
by Andrew Dempsey
A1100501
TM470-19B
*/

//import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Tester extends JFrame
{
    private JButton encryptButton, decryptButton;

	private JLabel inputLabel, outputLabel;

	private JTextArea inputText, outputText;

	private String textToEncode;

	public Tester()
	{
		setLayout(null);
		setSize(480, 240);
		setTitle("Encryption Method Tester");

		addWindowListener(new CloseProgram());

		encryptButton = new JButton("Encrypt");
		encryptButton.addActionListener(new ButtonWatcher());
		encryptButton.setBounds(145, 155, 84, 32);

        decryptButton = new JButton("Decrypt");
		decryptButton.addActionListener(new ButtonWatcher());
		decryptButton.setBounds(252, 155, 84, 32);

		inputText = new JTextArea();
		inputText.setBounds(78, 31, 150, 120);

		outputText = new JTextArea();
		outputText.setBounds(252, 31, 150, 120);
		outputText.setEditable(false);

		add(encryptButton);
		add(decryptButton);
		add(inputText);
		add(outputText);
	}
	
	public void runProgram()
	{
		setVisible(true);
    }

	private String encrypt(String text)
	{
		return text.toUpperCase();
	}

	private class CloseProgram extends WindowAdapter
    {
        public void windowClosing(WindowEvent e)
        {
            System.exit(0);
        }
    }

    private class ButtonWatcher implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{

			if(e.getSource() == encryptButton)
			{
				outputText.setText(encrypt(inputText.getText()));
			}

            if(e.getSource() == decryptButton)
			{
			}

		}
	}
}