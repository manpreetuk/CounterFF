package com.example.rappygatwali.counterf;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

public class MainActivity extends AppCompatActivity {
    TextView v1;
    Button b1;
    AdView banner1,banner2,banner3,banner4,banner5,banner6;
    InterstitialAd fulladd1,fulladd2,fulladd3,fulladd4,fulladd5,fulladd6,fulladd7,fulladd8,fulladd9,fulladd10,fulladd11,fulladd12,fulladd13,fulladd14;
    Button adds;
    int counter=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        v1=(TextView)findViewById(R.id.textView);
        b1=(Button)findViewById(R.id.button);
        adds=(Button)findViewById(R.id.button3);

        // Sample AdMob app ID: ca-app-pub-3940256099942544~3347511713
        MobileAds.initialize(this, "ca-app-pub-1051910356030770~2943345810");

        //banner adds
        banner1=(AdView)findViewById(R.id.adView);
        banner1.loadAd(new AdRequest.Builder().build());

        banner2=(AdView)findViewById(R.id.adView2);
        banner2.loadAd(new AdRequest.Builder().build());

        banner3=(AdView)findViewById(R.id.adView3);
        banner3.loadAd(new AdRequest.Builder().build());

        banner4=(AdView)findViewById(R.id.adView4);
        banner4.loadAd(new AdRequest.Builder().build());

        banner5=(AdView)findViewById(R.id.adView5);
        banner5.loadAd(new AdRequest.Builder().build());

        banner6=(AdView)findViewById(R.id.adView6);
        banner6.loadAd(new AdRequest.Builder().build());

        //full adds
        fulladd1=new InterstitialAd(this);
        fulladd1.setAdUnitId("ca-app-pub-1051910356030770/1522452937");
        fulladd1.loadAd(new AdRequest.Builder().build());
        fulladd1.setAdListener(new AdListener()
        {
            @Override
            public void onAdClosed() {
                fulladd1.loadAd(new AdRequest.Builder().build());
            }
        });

        fulladd2=new InterstitialAd(this);
        fulladd2.setAdUnitId("ca-app-pub-1051910356030770/1522452937");
        fulladd2.loadAd(new AdRequest.Builder().build());
        fulladd2.setAdListener(new AdListener()
        {
            @Override
            public void onAdClosed() {
                fulladd2.loadAd(new AdRequest.Builder().build());
            }
        });

        fulladd3=new InterstitialAd(this);
        fulladd3.setAdUnitId("ca-app-pub-1051910356030770/1522452937");
        fulladd3.loadAd(new AdRequest.Builder().build());
        fulladd3.setAdListener(new AdListener()
        {
            @Override
            public void onAdClosed() {
                fulladd3.loadAd(new AdRequest.Builder().build());
            }
        });

        fulladd4=new InterstitialAd(this);
        fulladd4.setAdUnitId("ca-app-pub-1051910356030770/1522452937");
        fulladd4.loadAd(new AdRequest.Builder().build());
        fulladd4.setAdListener(new AdListener()
        {
            @Override
            public void onAdClosed() {
                fulladd4.loadAd(new AdRequest.Builder().build());
            }
        });

        fulladd5=new InterstitialAd(this);
        fulladd5.setAdUnitId("ca-app-pub-1051910356030770/1522452937");
        fulladd5.loadAd(new AdRequest.Builder().build());
        fulladd5.setAdListener(new AdListener()
        {
            @Override
            public void onAdClosed() {
                fulladd5.loadAd(new AdRequest.Builder().build());
            }
        });

        fulladd6=new InterstitialAd(this);
        fulladd6.setAdUnitId("ca-app-pub-1051910356030770/1522452937");
        fulladd6.loadAd(new AdRequest.Builder().build());
        fulladd6.setAdListener(new AdListener()
        {
            @Override
            public void onAdClosed() {
                fulladd6.loadAd(new AdRequest.Builder().build());
            }
        });

        fulladd7=new InterstitialAd(this);
        fulladd7.setAdUnitId("ca-app-pub-1051910356030770/1522452937");
        fulladd7.loadAd(new AdRequest.Builder().build());
        fulladd7.setAdListener(new AdListener()
        {
            @Override
            public void onAdClosed() {
                fulladd7.loadAd(new AdRequest.Builder().build());
            }
        });

        fulladd8=new InterstitialAd(this);
        fulladd8.setAdUnitId("ca-app-pub-1051910356030770/1522452937");
        fulladd8.loadAd(new AdRequest.Builder().build());
        fulladd8.setAdListener(new AdListener()
        {
            @Override
            public void onAdClosed() {
                fulladd8.loadAd(new AdRequest.Builder().build());
            }
        });

        fulladd9=new InterstitialAd(this);
        fulladd9.setAdUnitId("ca-app-pub-1051910356030770/1522452937");
        fulladd9.loadAd(new AdRequest.Builder().build());
        fulladd9.setAdListener(new AdListener()
        {
            @Override
            public void onAdClosed() {
                fulladd9.loadAd(new AdRequest.Builder().build());
            }
        });

        fulladd10=new InterstitialAd(this);
        fulladd10.setAdUnitId("ca-app-pub-1051910356030770/1522452937");
        fulladd10.loadAd(new AdRequest.Builder().build());
        fulladd10.setAdListener(new AdListener()
        {
            @Override
            public void onAdClosed() {
                fulladd10.loadAd(new AdRequest.Builder().build());
            }
        });

        fulladd11=new InterstitialAd(this);
        fulladd11.setAdUnitId("ca-app-pub-1051910356030770/1522452937");
        fulladd11.loadAd(new AdRequest.Builder().build());
        fulladd11.setAdListener(new AdListener()
        {
            @Override
            public void onAdClosed() {
                fulladd11.loadAd(new AdRequest.Builder().build());
            }
        });

        fulladd12=new InterstitialAd(this);
        fulladd12.setAdUnitId("ca-app-pub-1051910356030770/1522452937");
        fulladd12.loadAd(new AdRequest.Builder().build());
        fulladd12.setAdListener(new AdListener()
        {
            @Override
            public void onAdClosed() {
                fulladd12.loadAd(new AdRequest.Builder().build());
            }
        });

        fulladd13=new InterstitialAd(this);
        fulladd13.setAdUnitId("ca-app-pub-1051910356030770/1522452937");
        fulladd13.loadAd(new AdRequest.Builder().build());
        fulladd13.setAdListener(new AdListener()
        {
            @Override
            public void onAdClosed() {
                fulladd13.loadAd(new AdRequest.Builder().build());
            }
        });

        fulladd14=new InterstitialAd(this);
        fulladd14.setAdUnitId("ca-app-pub-1051910356030770/1522452937");
        fulladd14.loadAd(new AdRequest.Builder().build());
        fulladd14.setAdListener(new AdListener()
        {
            @Override
            public void onAdClosed() {
                fulladd14.loadAd(new AdRequest.Builder().build());
            }
        });


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                v1.setText(""+counter);





            }
        });



        adds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter=0;
                v1.setText(""+counter);

                if(fulladd1.isLoaded())
                {
                    fulladd1.show();
                }

                if(fulladd2.isLoaded())
                {
                    fulladd2.show();
                }

                if(fulladd3.isLoaded())
                {
                    fulladd3.show();
                }

                if(fulladd4.isLoaded())
                {
                    fulladd4.show();
                }

                if(fulladd5.isLoaded())
                {
                    fulladd5.show();
                }

                if(fulladd6.isLoaded())
                {
                    fulladd6.show();
                }

                if(fulladd7.isLoaded())
                {
                    fulladd7.show();
                }

                if(fulladd8.isLoaded())
                {
                    fulladd8.show();
                }

                if(fulladd9.isLoaded())
                {
                    fulladd9.show();
                }

                if(fulladd10.isLoaded())
                {
                    fulladd10.show();
                }

                if(fulladd11.isLoaded())
                {
                    fulladd11.show();
                }

                if(fulladd12.isLoaded())
                {
                    fulladd12.show();
                }

                if(fulladd13.isLoaded())
                {
                    fulladd13.show();
                }

                if(fulladd14.isLoaded())
                {
                    fulladd14.show();
                }
            }
        });
    }
}
