package py.com.personal.pruebalogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class index extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);


        Button btn = findViewById(R.id.salir);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Intent intent = new Intent (v.getContext(), MainActivity.class);
        startActivityForResult(intent, 0);

    }
}
