package app.com.example.android.finalprojectbeginner;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout square_ll = (RelativeLayout) findViewById(R.id.square);
        square_ll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SquareActivity.class);
                startActivity(intent);
            }
        });

        RelativeLayout rectangle_ll = (RelativeLayout) findViewById(R.id.rectangle);
        rectangle_ll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, RectangleActivity.class);
                startActivity(intent);
            }
        });

        RelativeLayout trapezoid_ll = (RelativeLayout) findViewById(R.id.trapezoid);
        trapezoid_ll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TrapezoidActivity.class);
                startActivity(intent);
            }
        });

        RelativeLayout circle_ll = (RelativeLayout) findViewById(R.id.circle);
        circle_ll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CircleActivity.class);
                startActivity(intent);
            }
        });

        RelativeLayout triangle_ll = (RelativeLayout) findViewById(R.id.triangle);
        triangle_ll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TriangleActivity.class);
                startActivity(intent);
            }
        });

        RelativeLayout quiz_ll = (RelativeLayout) findViewById(R.id.quiz);
        quiz_ll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, QuizActivity.class);
                startActivity(intent);
            }
        });
    }
}
