package com.example.a1795515.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ClassActivity1 extends AppCompatActivity {
    EditText edt_name,edt_lname,edt_email,edt_password;
    Button btn_sub;
    static String TAG =" My app";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class1);

                edt_name = findViewById(R.id.edt_name);
                edt_email = findViewById(R.id.txt_email);
                edt_password = findViewById(R.id.editText);
                btn_sub = findViewById(R.id.btn_submit);
                final Toast tst = Toast.makeText(getApplicationContext(),"Thank you!",Toast.LENGTH_SHORT);
                btn_sub.setOnClickListener(new View.OnClickListener() {


                    @Override
                    public void onClick(View v) {
                String name = edt_name.getText().toString();
                String email = edt_email.getText().toString();

                Log.v(TAG,name);
                Log.v(TAG,email);
                Log.v(TAG,edt_password.getText().toString());

                        Toast.makeText(getApplicationContext(),edt_name.getText().toString(),);

                        tst.setText("clear");
                        tst.setDuration(Toast.LENGTH_LONG);
                        tst.show();

                    }
                });
            }
        }


    }
}
