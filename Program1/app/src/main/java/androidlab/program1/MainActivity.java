package androidlab.program1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText rollno = (EditText)findViewById(R.id.rollno);
        final EditText name = (EditText)findViewById(R.id.name);
        Button btn = (Button)findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int rn = Integer.parseInt(rollno.getText().toString());
                String nm = name.getText().toString();
                Intent ind = new Intent(getApplicationContext(), OutputActivity.class);
                ind.putExtra("rollno", rn);
                ind.putExtra("name", nm);
                startActivity(ind);
            }
        });
    }
}
