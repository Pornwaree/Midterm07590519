package th.ac.su.sc.midterm07590519;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);



        Intent intent = getIntent(); //เข้าถึง Intent ที่ส่งมาจากต้นทาง
        String aaa = intent.getStringExtra("aaa"); //อ่านข้อมูลจาก

        Toast t  = Toast.makeText(ProfileActivity.this , "Welcome Pronwaree Soonjirat" , Toast.LENGTH_SHORT);
        t.show();

    }
}
