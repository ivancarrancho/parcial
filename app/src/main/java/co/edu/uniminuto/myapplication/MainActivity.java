package co.edu.uniminuto.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;


import java.util.ArrayList; 

public class MainActivity extends AppCompatActivity {
    EditText num1, num2;
    int val1, val2;
    ListView listanumeros;
    Integer i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculate(View view) {
        val1 = Integer.parseInt(num1.getText().toString());
        val2 = Integer.parseInt(num2.getText().toString());

        listanumeros = (ListView) findViewById(R.id.listview);
        ArrayList<Integer> numberList = new ArrayList<>();

        for(i=0;i<=val2;i++){
            int numero = (int) (Math.random() * val1) + 1;
            numberList.add(numero);
        }

        ArrayAdapter adaptador = new ArrayAdapter(this, android.R.layout.simple_list_item_1, numberList);
        listanumeros.setAdapter(adaptador);
    }
}
