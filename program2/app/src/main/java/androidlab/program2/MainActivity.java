package androidlab.program2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText num1 = (EditText) findViewById(R.id.num1);
        final EditText num2 = (EditText) findViewById(R.id.num2);
        Button b1 = (Button) findViewById(R.id.add);
        Button b2 = (Button) findViewById(R.id.sub);
        Button b3 = (Button) findViewById(R.id.mul);
        Button b4 = (Button) findViewById(R.id.div);
        final TextView outputText = (TextView) findViewById(R.id.outputText);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float n1,n2,ans;
                n1 = Float.parseFloat(num1.getText().toString());
                n2 = Float.parseFloat(num2.getText().toString());
                ans = n1 + n2;
                outputText.setText("Result: " + n1  + " + " + n2 + " = " + ans );
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float n1,n2,ans;
                n1 = Float.parseFloat(num1.getText().toString());
                n2 = Float.parseFloat(num2.getText().toString());
                ans = n1 - n2;
                outputText.setText("Result: " + n1  + " - " + n2 + " = " + ans );
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float n1,n2,ans;
                n1 = Float.parseFloat(num1.getText().toString());
                n2 = Float.parseFloat(num2.getText().toString());
                ans = n1 * n2;
                outputText.setText("Result: " + n1  + " * " + n2 + " = " + ans );
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float n1,n2,ans;
                n1 = Float.parseFloat(num1.getText().toString());
                n2 = Float.parseFloat(num2.getText().toString());
                ans = n1 / n2;
                outputText.setText("Result: " + n1  + " / " + n2 + " = " + ans );
            }
        });
    }
}
