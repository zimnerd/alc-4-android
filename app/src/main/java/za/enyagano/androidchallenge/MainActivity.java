package za.enyagano.androidchallenge;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.text);

    }

    public void PageSwitch(View View) {
        String button_text;
        button_text = ((Button) View).getText().toString();
        if (button_text.equals("About ALC")) {
            Intent profile = new Intent(this, SecondActivity.class);
            startActivity(profile);
        } else if (button_text.equals("My Profile")) {
            Intent alc = new Intent(this, ThirdActivity.class);
            startActivity(alc);

        }
    }
}

