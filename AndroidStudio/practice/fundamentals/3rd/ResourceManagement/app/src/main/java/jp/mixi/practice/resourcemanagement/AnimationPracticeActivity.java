package jp.mixi.practice.resourcemanagement;

import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by takafumi.nanao on 2015/02/05.
 */
public class AnimationPracticeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.animation_practice);
    }

    @Override
    protected void onResume() {
        super.onResume();

        ImageView imageview = (ImageView) findViewById(R.id.imageView);
        TransitionDrawable transitionDrawable = (TransitionDrawable) imageview.getBackground();

        transitionDrawable.setCrossFadeEnabled(true);
        transitionDrawable.startTransition(10000);
        transitionDrawable.reverseTransition(15000);
        //transitionDrawable.resetTransition();

    }
}
