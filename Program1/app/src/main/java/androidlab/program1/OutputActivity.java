package androidlab.program1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class OutputActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output);
        TextView outputText = (TextView)findViewById(R.id.outputText);
        String output = "Roll No: " + getIntent().getStringExtra("name");
        output += "\nName: " + getIntent().getIntExtra("rollno", 00);
        outputText.setText(output);
    }
}
