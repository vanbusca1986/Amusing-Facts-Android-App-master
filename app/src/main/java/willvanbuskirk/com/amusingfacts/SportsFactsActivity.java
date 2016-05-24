package willvanbuskirk.com.amusingfacts;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class SportsFactsActivity extends Activity {

    private FactBook FactBook = new FactBook(); //new instance of FactBook class (an object)
    private RandomColors randomColors = new RandomColors(); //new instance of RandomColors class (an object)

    @Override
    protected void onCreate(Bundle savedInstanceState) { //what is displayed on screen when initialized
        super.onCreate(savedInstanceState);
        setContentView(willvanbuskirk.com.amusingfacts.R.layout.activity_sports_facts); //sets content to be displayed


        final TextView sportsFactTextView = (TextView) findViewById(willvanbuskirk.com.amusingfacts.R.id.sportsFactTextView); //TextView variable that displays facts
        final RelativeLayout sportsBackground = (RelativeLayout) findViewById(willvanbuskirk.com.amusingfacts.R.id.sportsBackground); //Background of facts variable
        final Button showNewFactButton = (Button) findViewById(willvanbuskirk.com.amusingfacts.R.id.showNewFactButton); //button variable
        final String factBookType = "sportsFactsType";

        String color = randomColors.getRandomColor(); //creates random color onCreate
        sportsBackground.setBackgroundColor(Color.parseColor(color)); //gives background random color onCreate

        showNewFactButton.setOnClickListener(new View.OnClickListener() { //makes button clickable
            @Override
            public void onClick(View view) { //method that happens when button is clicked
                String snappleFact = FactBook.getFacts(factBookType); //variable receives a fact from FactBook object
                sportsFactTextView.setText(snappleFact); //TextView receives new fact
                String color = randomColors.getRandomColor(); //variable receives new color from RandomColors object
                sportsBackground.setBackgroundColor(Color.parseColor(color)); //Background receives new color
                showNewFactButton.setTextColor(Color.parseColor(color)); //Button text receives new color
            }
        });
    }
}
