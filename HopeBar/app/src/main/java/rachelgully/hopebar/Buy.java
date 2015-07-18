package rachelgully.hopebar;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;





public class Buy extends Activity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy);
        Button order = (Button) findViewById(R.id.order);
        order.setOnClickListener(Buy.this);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_buy, menu);
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

    public void onClick (View v) {
        switch (v.getId()) {
            case R.id.order: EditText no = (EditText)findViewById(R.id.no);
                int tb;


                try{
                    tb = Integer.parseInt(no.getText().toString())*30;

                    Log.e("App","A"+tb);
                }
                catch(Exception e) {
                    tb = 0;
                }

                Intent intent = new Intent(this, Purchase.class);
                intent.putExtra("total_bars",tb);

                startActivity(intent);
                break;

        }
    }

}