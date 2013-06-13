package com.theappchicks.crystal.ball;

import java.util.Random;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        //Declare our View Variables and assign them views from the layout file
        final TextView answerLabel = (TextView) findViewById(R.id.textView1);
        Button getAnswerButton = (Button) findViewById(R.id.button1);
        
        getAnswerButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// The button was clicked, so set the text in the answer label with the answer
				String answer="";
				
				//Randomly select one of the answers: Yes, No, Maybe
				Random randomGenerator = new Random(); //Construct a random number generator
				int randomNumber = randomGenerator.nextInt(3);
				answer = Integer.toString(randomNumber);
				
				//Update the label with our dynamic answer
				answerLabel.setText(answer);
				
			}
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
