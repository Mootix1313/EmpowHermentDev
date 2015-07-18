package rachelgully.hopebar;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Activity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;

import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Gallery;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import static java.lang.System.currentTimeMillis;
import android.os.Bundle;

public class Share extends Activity {

    private Uri imageUri;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Remove title bar
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        //Remove notification bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_share);

        ImageButton b1 = (ImageButton) findViewById(R.id.pic1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageUri = Uri.parse("android.resource://" + getPackageName() + "/drawable/emsquared1");
                Intent shareIntent = new Intent();
                shareIntent.setAction(Intent.ACTION_SEND);
                shareIntent.putExtra(Intent.EXTRA_TEXT, "Every bar you buy feeds a hungry child. http://www.hopebar.com");
                shareIntent.putExtra(Intent.EXTRA_STREAM, imageUri);
                shareIntent.setType("*/*");
                startActivity(Intent.createChooser(shareIntent, "Share!"));
            }
        });

        ImageButton b2 = (ImageButton) findViewById(R.id.pic2);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageUri = Uri.fromFile(new File("android.resource://rachelgully.hopebar/drawable/emsquared8"));
                Intent shareIntent = new Intent();
                shareIntent.setAction(Intent.ACTION_SEND);
                shareIntent.putExtra(Intent.EXTRA_TEXT, "Every bar you buy feeds a hungry child. http://www.hopebar.com");
                shareIntent.putExtra(Intent.EXTRA_STREAM, imageUri);
                shareIntent.setType("*/*");
                startActivity(Intent.createChooser(shareIntent, "Share!"));
            }
        });

        ImageButton b3 = (ImageButton) findViewById(R.id.pic3);

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageUri = Uri.fromFile(new File("android.resource://" + getPackageName() + "/drawable/emsquared16"));
                Intent shareIntent = new Intent();
                shareIntent.setAction(Intent.ACTION_SEND);
                shareIntent.putExtra(Intent.EXTRA_STREAM, imageUri);
                shareIntent.putExtra(Intent.EXTRA_TEXT, "Every bar you buy feeds a hungry child. http://www.hopebar.com");
                shareIntent.setType("*/*");
                startActivity(Intent.createChooser(shareIntent, "Share!"));
            }
        });

        ImageButton b4 = (ImageButton) findViewById(R.id.pic4);

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageUri = Uri.parse("android.resource://" + getPackageName() + "/drawable/emsquared2");
                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.putExtra(Intent.EXTRA_STREAM, imageUri);
                shareIntent.putExtra(Intent.EXTRA_TEXT, "Every bar you buy feeds a hungry child. http://www.hopebar.com");
                shareIntent.setType("*/*");
                startActivity(Intent.createChooser(shareIntent, "Share!"));
            }
        });

        ImageButton b5 = (ImageButton) findViewById(R.id.pic5);

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageUri = Uri.parse("android.resource://" + getPackageName() + "/drawable/emsquared3");
                Intent shareIntent = new Intent();
                shareIntent.setAction(Intent.ACTION_SEND);
                shareIntent.putExtra(Intent.EXTRA_TEXT, "Every bar you buy feeds a hungry child. http://www.hopebar.com");
                shareIntent.putExtra(Intent.EXTRA_STREAM, imageUri);
                shareIntent.setType("*/*");
                startActivity(Intent.createChooser(shareIntent, "Share!"));
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_share, menu);
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
