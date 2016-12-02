package app.com.example.android.finalprojectbeginner;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class QuizActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        Button back = (Button) findViewById(R.id.back_btn);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        Button answer_btn = (Button) findViewById(R.id.answer_btn);
        answer_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Boolean all_correct = true;
                TextView answer = (TextView) findViewById(R.id.square_answer);
                all_correct = all_correct && answer.getText().toString().equals("100");
                answer.setBackgroundColor(answer.getText().toString().equals("100") ? 0x00000000 : 0xFFFF9999);

                answer = (TextView) findViewById(R.id.rectangle_answer);
                all_correct = all_correct && answer.getText().toString().equals("200");
                answer.setBackgroundColor(answer.getText().toString().equals("200") ? 0x00000000 : 0xFFFF9999);

                answer = (TextView) findViewById(R.id.trapezoid_answer);
                all_correct = all_correct && answer.getText().toString().equals("125");
                answer.setBackgroundColor(answer.getText().toString().equals("125") ? 0x00000000 : 0xFFFF9999);

                answer = (TextView) findViewById(R.id.circle_answer);
                all_correct = all_correct && answer.getText().toString().equals("616");
                answer.setBackgroundColor(answer.getText().toString().equals("616") ? 0x00000000 : 0xFFFF9999);

                answer = (TextView) findViewById(R.id.triangle_answer);
                all_correct = all_correct && answer.getText().toString().equals("75");
                answer.setBackgroundColor(answer.getText().toString().equals("75") ? 0x00000000 : 0xFFFF9999);

                Context context = getApplicationContext();
                CharSequence text;
                text = all_correct ? "Great ! All answers are correct" : "Oops. Still meet some mistakes (red background)";

                InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(view.getWindowToken(), InputMethodManager.RESULT_UNCHANGED_SHOWN);

                Toast toast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }
}
