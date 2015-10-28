package com.songmho.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    Button bit1;
    Button bit2;
    Button bit3;
    Button bit4;
    TextView textView;

    boolean [] isclicked={false,false,false,false};

    int []color={0xff123abc,0xff321ABC,0XFF54AB12,0XFF126532};
    int time=10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bit1=(Button)findViewById(R.id.bit1);
        bit2=(Button)findViewById(R.id.bit2);
        bit3=(Button)findViewById(R.id.bit3);
        bit4=(Button)findViewById(R.id.bit4);
        textView=(TextView)findViewById(R.id.textView);


        bit1.setBackgroundColor(color[(int)((Math.random()*10)%4)]);
        bit2.setBackgroundColor(color[(int)((Math.random()*10)%4)]);
        bit3.setBackgroundColor(color[(int)((Math.random()*10)%4)]);
        bit4.setBackgroundColor(color[(int)((Math.random()*10)%4)]);

        Timer timer=new Timer();

        Timer timer1=new Timer();
        TimerTask timerTask=new MyTimerTask();

        timer.schedule(timerTask,3000,1000);

        bit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isclicked[0]) {
                    bit1.setBackgroundColor(0xffff0033);
                    isclicked[0]=true;
                }
                else{
                    bit1.setBackgroundColor(0xffcccccc);
                    isclicked[0]=false;
                }
            }
        });
    }

    private class MyTimerTask extends TimerTask {
        @Override
        public void run() {
            new Thread(){
                @Override
                public void run() {
                    super.run();
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {



                            bit1.setBackgroundColor(0xffcccccc);
                            bit2.setBackgroundColor(0xffcccccc);
                            bit3.setBackgroundColor(0xffcccccc);
                            bit4.setBackgroundColor(0xffcccccc);
                            if(time==0)
                                cancel();

                            textView.setText(""+time);

                            time--;
                        }
                    });
                }
            }.start();
        }
    }
}
