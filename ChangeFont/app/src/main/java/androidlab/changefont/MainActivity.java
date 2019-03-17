package androidlab.changefont;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    float fs = 10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView op = (TextView) findViewById(R.id.op);
        Button changeSize = (Button) findViewById(R.id.changeSize);
        Button changeColor = (Button) findViewById(R.id.changeColor);
        changeSize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                op.setTextSize(3, fs);
                fs = fs > 35 ? 10 : fs + 1;
            }
        });
        changeColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int red = new Random().nextInt(255);
                int green = new Random().nextInt(255);
                int blue = new Random().nextInt(255);
                op.setTextColor(Color.rgb(red, green, blue));
            }
        });
    }
}
