package com.example.a15521.animationtestone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

//视图动画
public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button mAlpha, mTranslate, mScale, mRotate, mSet;
    private ImageView mImage;

    AlphaAnimation alpha;
    TranslateAnimation translate;
    ScaleAnimation scale;
    RotateAnimation rotate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAlpha = findViewById(R.id.btn_alpha);
        mAlpha.setOnClickListener(this);
        mTranslate = findViewById(R.id.btn_translate);
        mTranslate.setOnClickListener(this);
        mScale = findViewById(R.id.btn_scale);
        mScale.setOnClickListener(this);
        mRotate = findViewById(R.id.btn_rotate);
        mRotate.setOnClickListener(this);
        mSet = findViewById(R.id.btn_set);
        mSet.setOnClickListener(this);
        mImage = findViewById(R.id.iv_fixed_position);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            //以下是用xml实现动画

            case R.id.btn_alpha:
                Animation alpha = AnimationUtils.loadAnimation(this, R.anim.alpha);
                mImage.startAnimation(alpha);
                break;
            case R.id.btn_translate:
                Animation translate = AnimationUtils.loadAnimation(this, R.anim.translate);
                mImage.startAnimation(translate);
                break;
            case R.id.btn_scale:
                Animation scale = AnimationUtils.loadAnimation(this, R.anim.scale);
                mImage.startAnimation(scale);
                break;
            case R.id.btn_rotate:
                Animation rotate = AnimationUtils.loadAnimation(this, R.anim.rotate);
                mImage.startAnimation(rotate);
                break;
            case R.id.btn_set:
                Animation set = AnimationUtils.loadAnimation(this, R.anim.anim_set);
                mImage.startAnimation(set);
                break;


            //以下是用代码实现动画
            /*
            case R.id.btn_alpha:
                alpha = new AlphaAnimation(1.0f, 0.0f);
                alpha.setStartOffset(1000);
                alpha.setDuration(3000);
                //监听动画
                alpha.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {
                        Toast.makeText(MainActivity.this, "动画开始", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        Toast.makeText(MainActivity.this, "动画结束", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
                mImage.startAnimation(alpha);
                break;
            case R.id.btn_translate:
                translate = new TranslateAnimation(0, 100, 0, 100);
                translate.setDuration(3000);
                mImage.startAnimation(translate);
                break;
            case R.id.btn_scale:
                scale = new ScaleAnimation(1, 2, 1, 2, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
                scale.setDuration(3000);
                mImage.startAnimation(scale);
                break;
            case R.id.btn_rotate:
                rotate = new RotateAnimation(0, 360, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
                rotate.setDuration(8000);
                mImage.startAnimation(rotate);
                break;
                //与用xml实现的效果不太一样
                //用xml实现组合更好
            case R.id.btn_set:
                alpha = new AlphaAnimation(1.0f, 0.0f);
                alpha.setDuration(3000);
                translate = new TranslateAnimation(0, 100, 0, 100);
                translate.setDuration(3000);
                scale = new ScaleAnimation(1, 2, 1, 2, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
                scale.setDuration(3000);
                rotate = new RotateAnimation(0, 360, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
                rotate.setDuration(3000);
                AnimationSet set = new AnimationSet(true);
                set.addAnimation(alpha);
                set.addAnimation(translate);
                set.addAnimation(scale);
                set.addAnimation(rotate);
                mImage.startAnimation(set);
                break;
            */
            default:
                break;
        }
    }
}
