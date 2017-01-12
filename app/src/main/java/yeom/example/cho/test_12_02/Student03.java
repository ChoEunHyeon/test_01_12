package yeom.example.cho.test_12_02; /**
 * Created by Samsung on 2016-12-09.
 */

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

public class Student03 extends AppCompatActivity {

    ImageSwitcher myImageSwitcher01;
    ImageSwitcher myImageSwitcher02;
    int imageSwitcherImages01[] = {R.drawable.leader_camp_01, R.drawable.leader_camp_02};
    int imageSwitcherImages02[] = {R.drawable.leader_camp_03, R.drawable.leader_camp_04, R.drawable.leader_camp_05, R.drawable.leader_camp_06};

    int switcherImage01 = imageSwitcherImages01.length;
    int switcherImage02 = imageSwitcherImages02.length;
    int counter = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.student03);

        myImageSwitcher01 = (ImageSwitcher)findViewById(R.id.student03_switcher_01);
        Button btn_next_01 = (Button) findViewById(R.id.student03_btn_next_01);
        Button btn_previous_01 = (Button) findViewById(R.id.studen03_btn_previous_01);

        myImageSwitcher01.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView switcherImageView = new ImageView(getApplicationContext());
                switcherImageView.setLayoutParams(new ImageSwitcher.LayoutParams(
                        ActionBar.LayoutParams.MATCH_PARENT, ActionBar.LayoutParams.MATCH_PARENT
                ));

                switcherImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                switcherImageView.setImageResource(R.drawable.leader_camp_01);
                //switcherImageView.setMaxHeight(100);
                return switcherImageView;
            }
        });

        myImageSwitcher02 = (ImageSwitcher)findViewById(R.id.student03_switcher_02);
        Button btn_next_02 = (Button) findViewById(R.id.student03_btn_next_02);
        Button btn_previous_02 = (Button) findViewById(R.id.studen03_btn_previous_02);

        myImageSwitcher02.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView switcherImageView = new ImageView(getApplicationContext());
                switcherImageView.setLayoutParams(new ImageSwitcher.LayoutParams(
                        ActionBar.LayoutParams.MATCH_PARENT, ActionBar.LayoutParams.MATCH_PARENT
                ));

                switcherImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                switcherImageView.setImageResource(R.drawable.leader_camp_03);
                //switcherImageView.setMaxHeight(100);
                return switcherImageView;
            }
        });
    }

    public void btn_next_01(View view) {
        counter++;
        if (counter == switcherImage01)
            counter = 0;
        myImageSwitcher01.setImageResource(imageSwitcherImages01[counter]);

        Animation animationOut = AnimationUtils.loadAnimation(this, android.R.anim.slide_out_right);
        Animation animationIn = AnimationUtils.loadAnimation(this, android.R.anim.slide_in_left);

        myImageSwitcher01.setOutAnimation(animationOut);
        myImageSwitcher01.setInAnimation(animationIn);
    }
    public void btn_previous_01(View view) {

        counter--;
        if (counter == -1 || counter==-2)
            counter = switcherImage01-1;

        myImageSwitcher01.setImageResource(imageSwitcherImages01[counter]);

        Animation animationOut_b = AnimationUtils.loadAnimation(this, android.R.anim.fade_out);
        Animation animationIn_b = AnimationUtils.loadAnimation(this, android.R.anim.fade_in);

        myImageSwitcher01.setOutAnimation(animationOut_b);
        myImageSwitcher01.setInAnimation(animationIn_b);
    }

    public void btn_next_02(View view) {
        counter++;
        if (counter == switcherImage02)
            counter = 0;
        myImageSwitcher02.setImageResource(imageSwitcherImages02[counter]);

        Animation animationOut = AnimationUtils.loadAnimation(this, android.R.anim.slide_out_right);
        Animation animationIn = AnimationUtils.loadAnimation(this, android.R.anim.slide_in_left);

        myImageSwitcher02.setOutAnimation(animationOut);
        myImageSwitcher02.setInAnimation(animationIn);
    }
    public void btn_previous_02(View view) {

        counter--;
        if (counter == -1 || counter==-2)
            counter = switcherImage02-1;

        myImageSwitcher02.setImageResource(imageSwitcherImages02[counter]);

        Animation animationOut_b = AnimationUtils.loadAnimation(this, android.R.anim.fade_out);
        Animation animationIn_b = AnimationUtils.loadAnimation(this, android.R.anim.fade_in);

        myImageSwitcher02.setOutAnimation(animationOut_b);
        myImageSwitcher02.setInAnimation(animationIn_b);
    }
}