package rachelgully.hopebar;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.paypal.android.sdk.payments.PayPalAuthorization;
import com.paypal.android.sdk.payments.PayPalConfiguration;
import com.paypal.android.sdk.payments.PayPalFuturePaymentActivity;
import com.paypal.android.sdk.payments.PayPalPayment;
import com.paypal.android.sdk.payments.PayPalService;
import com.paypal.android.sdk.payments.PaymentActivity;
import com.paypal.android.sdk.payments.PaymentConfirmation;

import org.json.JSONException;
import org.json.JSONObject;

import java.math.BigDecimal;


public class Purchase extends Activity implements View.OnClickListener {
    private static final String CONFIG_ENVIRONMENT = PayPalConfiguration.ENVIRONMENT_SANDBOX;
    private static final String CONFIG_CLIENT_ID = "AVZEpnJQTuon_UivxJeORyHL6d8gmP0eePlDbBypEalKj2rUionkp43Ua8IQnvV15ZWz9kJzve4-iuRo";
    private static final int REQUEST_CODE_PAYMENT = 1;
    private static final int REQUEST_CODE_FUTURE_PAYMENT = 2;

    private static PayPalConfiguration config = new PayPalConfiguration()
            .environment(CONFIG_ENVIRONMENT)
            .clientId(CONFIG_CLIENT_ID);
    private int tb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Remove title bar
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        //Remove notification bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_purchase);
        tb = getIntent().getIntExtra("total_bars",0);
        float cost = tb*75/30;
        tb = tb/30;

        Button pay = (Button) findViewById(R.id.pay);
        pay.setOnClickListener(Purchase.this);
        Intent intent = new Intent(this, PayPalService.class);
        intent.putExtra(PayPalService.EXTRA_PAYPAL_CONFIGURATION,config);
        startService(intent);
    }



    public void onClick (View v) {
        switch (v.getId()) {
            case R.id.pay:
                Number number = tb*75;
                BigDecimal big = new BigDecimal(number.toString());
                PayPalPayment item = new PayPalPayment(big,"USD","emSquared",PayPalPayment.PAYMENT_INTENT_AUTHORIZE );
                Intent in =new Intent(Purchase.this, PaymentActivity.class);
                in.putExtra(PaymentActivity.EXTRA_PAYMENT, item);
                startActivityForResult(in, REQUEST_CODE_PAYMENT);
                break;
        }
    }
    protected void onActivityResult(int requestCode,int resultCode,Intent data) {
        if (requestCode == REQUEST_CODE_PAYMENT) {
            if (resultCode == Activity.RESULT_OK) {
                PaymentConfirmation confirm = data.getParcelableExtra(PaymentActivity.EXTRA_RESULT_CONFIRMATION);
                if (confirm != null) {
                    try {
                        int boxes;
                        SharedPreferences settings = getSharedPreferences("hope_preferences", MODE_PRIVATE);
                        SharedPreferences.Editor editor = settings.edit();

                        System.out.println("Responses" + confirm);
                        Log.i("PayPal Example Payments", confirm.toJSONObject().toString(4));
                        JSONObject obj = new JSONObject(confirm.toJSONObject().toString());
                        String paymentID = obj.getJSONObject("response").getString("id");
                        System.out.println("payment id:==" + paymentID);

                        boxes = settings.getInt("boxes", 0);
                        boxes += tb;
                        editor.putInt("boxes", boxes);

                        editor.commit();

                    } catch (JSONException e) {
                        Log.e("Payment Demo", "failure occured", e);
                    }
                } else if (resultCode == PaymentActivity.RESULT_EXTRAS_INVALID) {
                    Log.i("paymentExample", "An invalid payment was submitted. Please see the docs.");
                }
            } else if (requestCode == REQUEST_CODE_FUTURE_PAYMENT)
            {
                if(resultCode == Activity.RESULT_OK)
                {
                    PayPalAuthorization auth = data.getParcelableExtra(PayPalFuturePaymentActivity.EXTRA_RESULT_AUTHORIZATION);
                    if(auth!=null)
                    {
                        try{
                            Log.i("FuturePaymentExample", auth.toJSONObject().toString(4));
                            String authorization_code = auth.getAuthorizationCode();
                            sendAuthorizationToServer(auth);

                        }catch (JSONException e){
                            Log.e("FuturePaymentExample", "an extremely unlikely failure occurred: ", e);
                        }
                    }
                } else if (resultCode == Activity.RESULT_CANCELED) {
                    Log.i("FuturePaymentExample", "The user canceled.");
                } else if (resultCode == PayPalFuturePaymentActivity.RESULT_EXTRAS_INVALID) {
                    Log.i("FuturePaymentExample",
                            "Probably the attempt to previously start the PayPalService had an invalid PayPalConfiguration. Please see the docs.");
                }
            }

        }

    }

    private void sendAuthorizationToServer(PayPalAuthorization authorization) {


        // Sene authorization response to your server, where it can exchange the authorization code
        // for OAuth access and refresh tokens.
        //
        // Your server must then store these tokens, so that your server code can execute payments
        // for this user in the future.

    }
    public void onFuturePaymentPurchasePressed(View pressed) {
        // Get the Application Correlation ID from the SDK
        String correlationId = PayPalConfiguration.getApplicationCorrelationId(this);

        Log.i("FuturePaymentExample", "Application Correlation ID: " + correlationId);

        // TODO: Send correlationId and transaction details to your server for processing with
        // PayPal...
        Toast.makeText(getApplicationContext(), "App Correlation ID received from SDK",
                Toast.LENGTH_LONG).show();
    }
}
