package rachelgully.hopebar;

import android.app.Activity;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

public class Impact extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        SharedPreferences settings = getSharedPreferences("hope_preferences", MODE_PRIVATE);
        SharedPreferences.Editor editor = settings.edit();
        int level;
        int hearts;
        Uri imageUri;
        ImageView iv;

        super.onCreate(savedInstanceState);

        //Remove title bar
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        //Remove notification bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_impact);

        iv = (ImageView) findViewById(R.id.impact_view);

        level = settings.getInt("level", 1);
        hearts = settings.getInt("hearts", 0);
        if( hearts == 7 ){
            editor.putInt("hearts", 0);
            editor.putInt("boxes", 0);
            editor.commit();
        }
        hearts = settings.getInt("boxes", 0) % settings.getInt("level", 1);

        switch (hearts) {
            case 0:
                iv.setImageResource(R.drawable.h0);
                break;
            case 1:
                iv.setImageResource(R.drawable.h1);
                break;
            case 2:
                iv.setImageResource(R.drawable.h2);
                break;
            case 3:
                iv.setImageResource(R.drawable.h3);
                break;
            case 4:
                iv.setImageResource(R.drawable.h4);
                break;
            case 5:
                iv.setImageResource(R.drawable.h5);
                break;
            case 6:
                iv.setImageResource(R.drawable.h6);
                break;
            case 7:
                iv.setImageResource(R.drawable.h7);
                break;
        }

        editor.commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_impact, menu);
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

        return super.onOptionsItemSelected(item);
    }
}
