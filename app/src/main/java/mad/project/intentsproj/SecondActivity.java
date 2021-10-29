package mad.project.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    EditText et_n1, et_n2;

//    Button btn_add, btn_substract, btn_multiplication, btn_divide;

    TextView tv_answer;

    String snum1, snum2;

    int num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        et_n1 = findViewById(R.id.et_n1);
        et_n2 = findViewById(R.id.et_n2);

        tv_answer = findViewById(R.id.tv_answer);

        Intent intent = getIntent();
        snum1 = intent.getStringExtra("n1");
        snum2 = intent.getStringExtra("n2");

        et_n1.setText(snum1);
        et_n2.setText(snum2);

        num1 = Integer.parseInt(snum1);
        num2 = Integer.parseInt(snum2);

    }

    public void add(View view){
        tv_answer.setText(snum1 + " + " + snum2 + " = " + (num1 + num2));
    }

    public void substract(View view){
        tv_answer.setText(snum1 + " - " + snum2 + " = " + (num1 - num2));
    }

    public void multiply(View view){
        tv_answer.setText(snum1 + " * " + snum2 + " = " + (num1 * num2));
    }

    public void divide(View view){
        tv_answer.setText(snum1 + " / " + snum2 + " = " + (num1 / num2));
    }
}