package jp.mixi.assignment.controller;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * TODO: 課題1
 * {@link Toast#makeText(Context, CharSequence, int)} または
 * {@link Toast#makeText(Context, int, int)} を利用して、各ライフサイクルメソッドがどのような順番で
 * 実行されているかを確認してください。
 * 確認したら、assignments/fundamentals/2nd/Report.md にその順番を記述してください。
 *
 * @author keishin.yokomaku
 */
public class Controller1Activity extends AppCompatActivity {

    /*Activity起動時に実行*/
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_controller1);

        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
        Toast toast = Toast.makeText(this, "1." + methodName, Toast.LENGTH_SHORT);
        toast.show();
    }

    /*Activityの画面が見える状態*/
    @Override
    protected void onStart() {
        super.onStart();
        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
        Toast.makeText(this, "2." + methodName, Toast.LENGTH_SHORT).show();
    }

    /*Activityの画面が操作可能な状態*/
    @Override
    protected void onResume() {
        super.onResume();
        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
        Toast.makeText(this, "3." + methodName, Toast.LENGTH_SHORT).show();
    }

    /*Activityから離れる直前*/
    @Override
    protected void onPause() {
        super.onPause();
        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
        Toast.makeText(this, "4." + methodName, Toast.LENGTH_SHORT).show();
    }

    /*Activityが見えなくなった状態*/
    @Override
    protected void onStop() {
        super.onStop();
        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
        Toast.makeText(this, "5." + methodName, Toast.LENGTH_SHORT).show();
    }

    /*onStop onStartの間*/
    @Override
    protected void onRestart() {
        super.onRestart();
        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
        Toast.makeText(this, "6." + methodName, Toast.LENGTH_SHORT).show();
    }

    /*Activityが破棄される直前*/
    @Override
    protected void onDestroy() {
        super.onDestroy();
        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
        Toast.makeText(this, "6." + methodName, Toast.LENGTH_SHORT).show();
    }
}
