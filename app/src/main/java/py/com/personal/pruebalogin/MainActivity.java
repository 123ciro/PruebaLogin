package py.com.personal.pruebalogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       Button btn = findViewById(R.id.ingreso);
       btn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        final EditText user = findViewById(R.id.user);
        final EditText pass = findViewById(R.id.pass);
        if(user.getText().length()<=0 && pass.getText().length()<=0){
            Toast.makeText(this,"Campos Vacios",Toast.LENGTH_SHORT).show();

        }else
        if(user.getText().length()>0 && pass.getText().length()<=0){
            Toast.makeText(this,"Pass Vacio",Toast.LENGTH_SHORT).show();

        }else
        if(user.getText().length()<=0 && pass.getText().length()>0){
            Toast.makeText(this,"User Vacio",Toast.LENGTH_SHORT).show();

        }else
        if(user.getText().toString().equals("Admin") && pass.getText().toString().equals("Admin")){
            Intent intent = new Intent (v.getContext(), index.class);
            startActivityForResult(intent, 0);
        }

    }
}