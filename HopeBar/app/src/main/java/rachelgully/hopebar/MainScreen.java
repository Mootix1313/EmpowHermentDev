package rachelgully.hopebar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public class MainScreen extends Activity {

    private ImageButton about;
    private ImageButton thebar;
    private ImageButton impact;
    private ImageButton buy;
    private ImageButton share;
    private int level;
    private int hearts;
    private int boxes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Remove title bar
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        //Remove notification bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);

        /*open about*/
        about = (ImageButton) findViewById(R.id.about);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainScreen.this, About.class);
                startActivity(i);
            }
        });

        /*open thebar*/
        thebar = (ImageButton) findViewById(R.id.thebar);
        thebar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainScreen.this, TheBar.class);
                startActivity(i);
            }
        });

        /*open impact*/
        impact = (ImageButton) findViewById(R.id.impact);
        impact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainScreen.this, Impact.class);
                startActivity(i);
            }
        });

        /*open buy*/
        buy = (ImageButton) findViewById(R.id.buy);
        buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainScreen.this, Buy.class);
                startActivity(i);
            }
        });

        /*open share*/
        share = (ImageButton) findViewById(R.id.share);
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainScreen.this, Share.class);
                startActivity(i);
            }
        });

//        SharedPreferences.Editor editor = getSharedPreferences("hope_preferences", MODE_PRIVATE).edit();
//        editor.putInt("level", 1);
//        editor.putInt("hearts", 0);
//        editor.putInt("boxes", 0);
//        editor.commit();

    }
}
