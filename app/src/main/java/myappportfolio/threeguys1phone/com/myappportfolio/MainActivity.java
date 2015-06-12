package myappportfolio.threeguys1phone.com.myappportfolio;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity {

    Button button,button1,button2,button3,button4,button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button)findViewById(R.id.button);
        setButtonToast(button);
        button1 = (Button)findViewById(R.id.button1);
        setButtonToast(button1);
        button2 = (Button)findViewById(R.id.button2);
        setButtonToast(button2);
        button3 = (Button)findViewById(R.id.button3);
        setButtonToast(button3);
        button4 = (Button)findViewById(R.id.button4);
        setButtonToast(button4);
        button5 = (Button)findViewById(R.id.button5);
        setButtonToast(button5);


    }

    public void setButtonToast(Button thisButton) {
        thisButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Toast toast;

                Button ThisButton = (Button)(arg0);

                toast = Toast.makeText(getApplicationContext(), "This button will launch " + ThisButton.getText().toString(), Toast.LENGTH_SHORT);
                if(toast != null) {
                    toast.show();
                }
            }

        });
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        // Add Touch events to buttons to Toast Message

        return super.onOptionsItemSelected(item);
    }
}
