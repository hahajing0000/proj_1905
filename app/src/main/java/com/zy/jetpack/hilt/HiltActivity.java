package com.zy.jetpack.hilt;

import androidx.appcompat.app.AppCompatActivity;
import dagger.hilt.android.AndroidEntryPoint;
import retrofit2.Retrofit;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.zy.jetpack.R;

import javax.inject.Inject;

@AndroidEntryPoint
public class HiltActivity extends AppCompatActivity {
    private Button btnHiltTest1;

    @Inject
    public TestUtils testUtils;

    @Inject
    public Retrofit mRetrofit;

    @Person2Ann
    @Inject
    public IPerson person;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hilt);

        btnHiltTest1 = (Button) findViewById(R.id.btn_hilt_test1);

        btnHiltTest1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                testUtils.TestMethod1();
                if (mRetrofit!=null){
                    Log.d("123", "onClick: ....");
                }
            }
        });
    }
}