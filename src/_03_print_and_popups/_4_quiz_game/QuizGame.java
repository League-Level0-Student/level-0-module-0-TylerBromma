package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int score = 0;
		// ASK A QUESTION AND CHECK THE ANSWER
		
				// 2.  Ask the user a question 
				String question1 = JOptionPane.showInputDialog("What is my favorite color?");
				// 3.  Use an if statement to check if their answer is correct
				if(question1.equals("red")) {
					score++;
				}
				// 4.  if the user's answer was correct, add one to their score 
		String question2 = JOptionPane.showInputDialog("What is my name?");
		
		if(question2.equals("Tyler")) {
			score++;
		}
		String question3 = JOptionPane.showInputDialog("What is my favorite food?");
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		if(question3.equals("mangoes")) {
			score++;
		}
		
		// After all the questions have been asked, tell the user their final score 
		JOptionPane.showMessageDialog(null, "Your score is " + score);
	}
}
