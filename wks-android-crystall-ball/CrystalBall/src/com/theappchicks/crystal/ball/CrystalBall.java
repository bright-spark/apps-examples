package com.theappchicks.crystal.ball;

import java.util.Random;

public class CrystalBall {
	//Member variables (properties about the object)
	public String[] mAnswers = {
			"It is certain",
			"It is decidedly so",
			"All signs say YES",
			"The stars are not aligned",
			"My reply is no",
			"It is doubtful",
			"Better not tell you now",
			"Concentrate and ask again",
			"Unable to answer now", 
			"It is hard to say"
			};
	
	//Methods (abilities: things the object can do)
	public String getAnAnswer() {
			String answer="";
			Random randomGenerator = new Random(); //Construct a random number generator
			int randomNumber = randomGenerator.nextInt(mAnswers.length);
			
			//now get the random answer from the answers array from above, give me the element at index randomNumber
			answer = mAnswers[randomNumber];
			
			return answer;
	}
	

}
