package com.songmho.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView textView;

    Button [] bt=new Button[16];
    LinearLayout container;

    boolean [] isclicked={false,false,false,false};

    int []color={0xff123abc,0xff321ABC,0XFF54AB12,0XFF126532,0xffe1123a,0xff1A32BC,0XFF5412AB,0XFF651232};

    int [] rand_int=new int[16];            //색깔이 입력될 변수집합

    int time=10;

    int [] save_int={-1,-1};
    int [] check_but=new int[2];

    boolean isfirst=true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt[0]=(Button)findViewById(R.id.bit1);
        bt[1]=(Button)findViewById(R.id.bit2);
        bt[2]=(Button)findViewById(R.id.bit3);
        bt[3]=(Button)findViewById(R.id.bit4);
        bt[4]=(Button)findViewById(R.id.bit5);
        bt[5]=(Button)findViewById(R.id.bit6);
        bt[6]=(Button)findViewById(R.id.bit7);
        bt[7]=(Button)findViewById(R.id.bit8);
        bt[8]=(Button)findViewById(R.id.bit9);
        bt[9]=(Button)findViewById(R.id.bit10);
        bt[10]=(Button)findViewById(R.id.bit11);
        bt[11]=(Button)findViewById(R.id.bit12);
        bt[12]=(Button)findViewById(R.id.bit13);
        bt[13]=(Button)findViewById(R.id.bit14);
        bt[14]=(Button)findViewById(R.id.bit15);
        bt[15]=(Button)findViewById(R.id.bit16);
        textView=(TextView)findViewById(R.id.textView);

        container=(LinearLayout)findViewById(R.id.container);
        container.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        /*
        for(int i=0;i<16;i++){
            if(i==0)
                rand_int[i]=(int)(Math.random()*10)%16;

            if(i>0)

                for(int j=0;j<16;j++){
                    rand_int[]
                }

        }*/

        bt[0].setOnClickListener(this);
        bt[1].setOnClickListener(this);
        bt[2].setOnClickListener(this);
        bt[3].setOnClickListener(this);
        bt[4].setOnClickListener(this);
        bt[5].setOnClickListener(this);
        bt[6].setOnClickListener(this);
        bt[7].setOnClickListener(this);
        bt[8].setOnClickListener(this);
        bt[9].setOnClickListener(this);
        bt[10].setOnClickListener(this);
        bt[11].setOnClickListener(this);
        bt[12].setOnClickListener(this);
        bt[13].setOnClickListener(this);
        bt[14].setOnClickListener(this);
        bt[15].setOnClickListener(this);




        Timer timer=new Timer();

        Timer timer1=new Timer();
        TimerTask timerTask=new MyTimerTask();

            timer.schedule(timerTask,3000,1000);

    }


    @Override
    public void onClick(View v) {

        if(isfirst) {
            switch (v.getId()) {
                case R.id.bit1:
                    save_int[0]=0;
                    check_but[0]=0;
                    v.setBackgroundColor(color[0]);
                    break;
                case R.id.bit2:
                    save_int[0]=1;
                    check_but[0]=1;
                    v.setBackgroundColor(color[1]);
                    break;
                case R.id.bit3:
                    save_int[0]=2;
                    check_but[0]=2;
                    v.setBackgroundColor(color[2]);
                    break;
                case R.id.bit4:
                    save_int[0]=3;
                    check_but[0]=3;
                    v.setBackgroundColor(color[3]);
                    break;
                case R.id.bit5:
                    save_int[0]=4;
                    check_but[0]=4;
                    v.setBackgroundColor(color[4]);
                    break;
                case R.id.bit6:
                    save_int[0]=5;
                    check_but[0]=5;
                    v.setBackgroundColor(color[5]);
                    break;
                case R.id.bit7:
                    save_int[0]=6;
                    check_but[0]=6;
                    v.setBackgroundColor(color[6]);
                    break;
                case R.id.bit8:
                    save_int[0]=7;
                    check_but[0]=7;
                    v.setBackgroundColor(color[7]);
                    break;
                case R.id.bit9:
                    save_int[0]=0;
                    check_but[0]=8;
                    v.setBackgroundColor(color[0]);
                    break;
                case R.id.bit10:
                    save_int[0]=1;
                    check_but[0]=9;
                    v.setBackgroundColor(color[1]);
                    break;
                case R.id.bit11:
                    save_int[0]=2;
                    check_but[0]=10;
                    v.setBackgroundColor(color[2]);
                    break;
                case R.id.bit12:
                    save_int[0]=3;
                    check_but[0]=11;
                    v.setBackgroundColor(color[3]);
                    break;
                case R.id.bit13:
                    save_int[0]=4;
                    check_but[0]=12;
                    v.setBackgroundColor(color[4]);
                    break;
                case R.id.bit14:
                    save_int[0]=5;
                    check_but[0]=13;
                    v.setBackgroundColor(color[5]);
                    break;
                case R.id.bit15:
                    save_int[0]=6;
                    check_but[0]=14;
                    v.setBackgroundColor(color[6]);
                    break;
                case R.id.bit16:
                    save_int[0]=7;
                    check_but[0]=15;
                    v.setBackgroundColor(color[7]);
                    break;
            }
        }

        else{
            switch (v.getId()) {
                case R.id.bit1:
                    save_int[1]=0;
                    check_but[1]=0;
                    v.setBackgroundColor(color[0]);
                    break;
                case R.id.bit2:
                    save_int[1]=1;
                    check_but[1]=1;
                    v.setBackgroundColor(color[1]);
                    break;
                case R.id.bit3:
                    save_int[1]=2;
                    check_but[1]=2;
                    v.setBackgroundColor(color[2]);
                    break;
                case R.id.bit4:
                    save_int[1]=3;
                    check_but[1]=3;
                    v.setBackgroundColor(color[3]);
                    break;
                case R.id.bit5:
                    save_int[1]=4;
                    check_but[1]=4;
                    v.setBackgroundColor(color[4]);
                    break;
                case R.id.bit6:
                    save_int[1]=5;
                    check_but[1]=5;
                    v.setBackgroundColor(color[5]);
                    break;
                case R.id.bit7:
                    save_int[1]=6;
                    check_but[1]=6;
                    v.setBackgroundColor(color[6]);
                    break;
                case R.id.bit8:
                    save_int[1]=7;
                    check_but[1]=7;
                    v.setBackgroundColor(color[7]);
                    break;
                case R.id.bit9:
                    save_int[1]=0;
                    check_but[1]=8;
                    v.setBackgroundColor(color[0]);
                    break;
                case R.id.bit10:
                    save_int[1]=1;
                    check_but[1]=9;
                    v.setBackgroundColor(color[1]);
                    break;
                case R.id.bit11:
                    save_int[1]=2;
                    check_but[1]=10;
                    v.setBackgroundColor(color[2]);
                    break;
                case R.id.bit12:
                    save_int[1]=3;
                    check_but[1]=11;
                    v.setBackgroundColor(color[3]);
                    break;
                case R.id.bit13:
                    save_int[1]=4;
                    check_but[1]=12;
                    v.setBackgroundColor(color[4]);
                    break;
                case R.id.bit14:
                    save_int[1]=5;
                    check_but[1]=13;
                    v.setBackgroundColor(color[5]);
                    break;
                case R.id.bit15:
                    save_int[1]=6;
                    check_but[1]=14;
                    v.setBackgroundColor(color[6]);
                    break;
                case R.id.bit16:
                    save_int[1]=7;
                    check_but[1]=15;
                    v.setBackgroundColor(color[7]);
                    break;
            }

            if(save_int[0]!=save_int[1]){
                bt[check_but[0]].setBackgroundColor(0xffcccccc);
                bt[check_but[1]].setBackgroundColor(0xffcccccc);
            }
            else{

            }
        }


        isfirst=!isfirst;
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



                          /*  bit1.setBackgroundColor(0xffcccccc);
                            bit2.setBackgroundColor(0xffcccccc);
                            bit3.setBackgroundColor(0xffcccccc);
                            bit4.setBackgroundColor(0xffcccccc);
                            */
                            if(time==0) {
                                container.setVisibility(View.VISIBLE);
                                cancel();
                            }
                            textView.setText(""+time);

                            time--;
                        }
                    });
                }
            }.start();
        }
    }
}
