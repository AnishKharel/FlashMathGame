package mathPractice;

import java.util.Random;

public class Methods {
	int scores = 0;
	
	public String incorrectResponse() {
		Random number = new Random();
		switch(number.nextInt(4)) {
		case 1:
			return ("Try Again");
		case 2:
			return ("Nope! you'll get it next time.");
		case 3:
			return ("Wrong! Don't give up, you can do it.");
		case 4:
			return ("Wrong! you gotta try a little harder.");
		}
		return ("Wrong! you gotta try a little harder.");
	}
	
	public String correctResponse() {
		Random number = new Random();
		switch(number.nextInt(4)) {
		case 1:
			return ("Awesome Job!");
		case 2:
			return ("100% Correct!");
		case 3:
			return ("Correct answer!!");
		case 4:
			return ("Great Work! ");
		}
		return ("Awesome Job!");
	}
	public int highestScore(int score) {
		
			if (score > scores){
				scores = score;
			}
			return scores;
		
	}
}
