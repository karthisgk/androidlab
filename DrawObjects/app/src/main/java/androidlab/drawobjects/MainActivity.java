package androidlab.drawobjects;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Spinner OT = (Spinner) findViewById(R.id.ObjectType);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.shapes, R.layout.support_simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        OT.setAdapter(adapter);
        final EditText hexColor = (EditText) findViewById(R.id.hexColor);
        Button DrawObject = (Button) findViewById(R.id.DrawObject);
        DrawObject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String hexColorStr = hexColor.getText().toString();
                if(hexColorStr.equals("")){
                    Toast.makeText(getApplicationContext(), "Enter Hex Color Value", Toast.LENGTH_LONG).show();
                    return;
                }
                Intent it = new Intent(getApplicationContext(), OutputActivity.class);
                it.putExtra("hexColor", hexColorStr);
                it.putExtra("shape", OT.getSelectedItem().toString());
                startActivity(it);
            }
        });
    }


}
