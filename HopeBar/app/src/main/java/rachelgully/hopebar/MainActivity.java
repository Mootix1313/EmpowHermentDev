package rachelgully.hopebar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends Activity {
    private ImageButton about;
    private ImageButton thebar;
    private ImageButton impact;
    private ImageButton buy;
    private ImageButton share;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*open about*/
        about = (ImageButton) findViewById(R.id.about);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, About.class);
                startActivity(i);
            }
        });

        /*open thebar*/
        thebar = (ImageButton) findViewById(R.id.thebar);
        thebar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, TheBar.class);
                startActivity(i);
            }
        });

        /*open impact*/
        impact = (ImageButton) findViewById(R.id.impact);
        impact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Impact.class);
                startActivity(i);
            }
        });

        /*open buy*/
        buy = (ImageButton) findViewById(R.id.buy);
        buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Buy.class);
                startActivity(i);
            }
        });

        /*open share*/
        share = (ImageButton) findViewById(R.id.share);
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Share.class);
                startActivity(i);
            }
        });
    }
}
