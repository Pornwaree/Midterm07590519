package th.ac.su.sc.midterm07590519;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import th.ac.su.sc.midterm07590519.Model.Auth;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        Button LoginButton = findViewById(R.id.login_button);
        MyListener Listener = new MyListener();
        LoginButton.setOnClickListener(Listener);
    }
    private class MyListener implements View.OnClickListener{
        @Override
        public void onClick(View view) {


            Intent intent = new Intent(LoginActivity.this,ProfileActivity.class);
            intent.putExtra("aaa", "111");
            startActivity(intent);

        }



    }
}
