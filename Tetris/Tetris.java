//Tetris by bosscoding

//imports and functionality of swing stolen from Yahtzee.java(Zaxcoding) skeleton

import java.util.*;
import java.io.*;
import javax.swing.*;
import javax.swing.border.*;	
import java.awt.*;
import java.awt.event.*;

public class Tetris
{
	JFrame theWindow;
	Container thePane;
	MyPanel gamePanel;
	MyPanel array [];				
	MyPanel buttonPanel, leftPanel,rightPanel,nextPanel,timePanel,linesPanel,totalPanel,nextLinePanel,levelPanel;
	JButton newGame,pause,endGame;
	MyListener theListener;

	
	
	public static void main(String [] args)
	{
		new Tetris();
	}
	
	public Tetris()
	{
		setup();
	}
	
	public void setup()
	{
		theWindow = new JFrame("Tetris- by bosscoding");	
		thePane = theWindow.getContentPane();					
		thePane.setLayout(new GridLayout(1, 1));
		
		gamePanel = new MyPanel(500, 500);		
		gamePanel.setLayout(new GridLayout(1, 2));
		
		leftPanel = new MyPanel(100, 500);
		leftPanel.setLayout(new GridLayout(20, 5));
		leftPanel.setBorder(BorderFactory.createLineBorder(Color.black));
		
	
		rightPanel = new MyPanel(400,500);
		rightPanel.setLayout(new GridLayout(5,1));
		
		
		nextPanel = new MyPanel(1,1);
		nextPanel.setLayout(new GridLayout(2,1));
		
		
		timePanel = new MyPanel(100,100);
		timePanel.setLayout(new GridLayout(2,1));
		
		
		linesPanel = new MyPanel(100,100);
		linesPanel.setLayout(new GridLayout(5,1));
		
		
		levelPanel = new MyPanel(100,100);
		levelPanel.setLayout(new GridLayout(2,1));
		
		
		buttonPanel = new MyPanel(100,100);
		buttonPanel.setLayout(new GridLayout(3,1));
		
		
		newGame = new JButton("New Game");
		newGame.setFont(new Font("Serif", Font.ITALIC, 20));
		buttonPanel.add(newGame);
		newGame.addActionListener(theListener);
		
		pause = new JButton("Pause");
		pause.setFont(new Font("Serif", Font.ITALIC, 20));
		buttonPanel.add(pause);
		pause.addActionListener(theListener);
		
		endGame = new JButton("End Game");
		endGame.setFont(new Font("Serif", Font.ITALIC, 20));
		buttonPanel.add(endGame);
		endGame.addActionListener(theListener);
		
		
		JLabel levelText = new JLabel("Level",SwingConstants.CENTER);
		levelText.setFont(new Font("Serif", Font.ITALIC, 20));
		levelText.setBorder(BorderFactory.createLineBorder(Color.gray));
		JLabel currentLevel = new JLabel("0",SwingConstants.CENTER);
		currentLevel.setBorder(BorderFactory.createLineBorder(Color.gray));
		currentLevel.setFont(new Font("Serif", Font.ITALIC, 20));
		levelPanel.add(levelText);
		levelPanel.add(currentLevel);
		
		JLabel lineText = new JLabel("<html><b>Lines</b></html>",SwingConstants.CENTER);
		lineText.setFont(new Font("Serif", Font.ITALIC, 20));
		lineText.setBorder(BorderFactory.createLineBorder(Color.gray));
		JLabel line1Text = new JLabel("Total",SwingConstants.CENTER);
		line1Text.setFont(new Font("Serif", Font.ITALIC, 16));
		line1Text.setBorder(BorderFactory.createLineBorder(Color.gray));
		JLabel line2Text = new JLabel("0",SwingConstants.CENTER);
		line2Text.setFont(new Font("Serif", Font.ITALIC, 16));
		line2Text.setBorder(BorderFactory.createLineBorder(Color.gray));
		JLabel line3Text = new JLabel("Next Level in",SwingConstants.CENTER);
		line3Text.setFont(new Font("Serif", Font.ITALIC, 16));
		line3Text.setBorder(BorderFactory.createLineBorder(Color.gray));
		JLabel line4Text = new JLabel("10",SwingConstants.CENTER);
		line4Text.setFont(new Font("Serif", Font.ITALIC, 16));
		line4Text.setBorder(BorderFactory.createLineBorder(Color.gray));
		linesPanel.add(lineText);
		linesPanel.add(line1Text);
		linesPanel.add(line2Text);
		linesPanel.add(line3Text);
		linesPanel.add(line4Text);
		
		JLabel timeText = new JLabel("Time",SwingConstants.CENTER);
		timeText.setFont(new Font("Serif", Font.ITALIC, 20));
		timeText.setBorder(BorderFactory.createLineBorder(Color.gray));
		JLabel gameTime = new JLabel("0",SwingConstants.CENTER);
		gameTime.setFont(new Font("Serif", Font.ITALIC, 20));
		gameTime.setBorder(BorderFactory.createLineBorder(Color.gray));
		timePanel.add(timeText);
		timePanel.add(gameTime);
		
		JLabel nextText = new JLabel("<html> <center>Next</center></html>",SwingConstants.CENTER);
	    nextText.setFont(new Font("Serif", Font.ITALIC, 20));
	    nextText.setBorder(BorderFactory.createLineBorder(Color.gray));
		JLabel nextPiece = new JLabel("0",SwingConstants.CENTER);
		nextPiece.setFont(new Font("Serif", Font.ITALIC, 20));
	
		nextPanel.add(nextText);
		nextPanel.add(nextPiece);
		
		rightPanel.add(nextPanel);
		rightPanel.add(timePanel);
		rightPanel.add(linesPanel);
		rightPanel.add(levelPanel);
		rightPanel.add(buttonPanel);
		
		array = new MyPanel[200];
		
		for(int i=0;i<200;i++)
		{
			array[i] = new MyPanel(10,10);
			array[i].setBorder(BorderFactory.createLineBorder(Color.gray));
			leftPanel.add(array[i]);
		}
		
		
			
		gamePanel.add(leftPanel);
		
		gamePanel.add(rightPanel);
		
		thePane.add(gamePanel);
		theWindow.pack();
		theWindow.setVisible(true);
		
	}
	
	class MyListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			
		}
	}
}