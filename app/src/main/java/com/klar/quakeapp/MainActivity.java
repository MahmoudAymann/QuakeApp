package com.klar.quakeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.klar.quakeapp.models.quake.QuakeModel;
import com.klar.quakeapp.network.ApiParser;
import com.klar.quakeapp.network.MyRetrofit;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static android.view.View.GONE;
import static android.view.View.VISIBLE;
import static android.widget.Toast.LENGTH_LONG;
import static android.widget.Toast.LENGTH_SHORT;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    ApiParser apiParser;

    @BindView(R.id.progressBar)
    ProgressBar progressBar;
    @BindView(R.id.mainTxt)
    TextView mainTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        apiParser = MyRetrofit.getBase().create(ApiParser.class);
    }

    private void showProgress() {
        progressBar.setVisibility(VISIBLE);
    }

    private void hideProgress() {
        progressBar.setVisibility(GONE);
    }

    @Override
    protected void onStart() {
        super.onStart();
        serverQuakes();
    }

    private void serverQuakes(){
        showProgress();
        callGetQuakes().enqueue(new Callback<QuakeModel>() {
            @Override
            public void onResponse(Call<QuakeModel> call, Response<QuakeModel> response) {
                if (response.isSuccessful()) {
                    if (response.body() != null) {
                        Log.d(TAG, "onResponse: " + "success");
                        if (response.body().getFeatures()!= null) {
                            mainTxt.setText("Features size: " + response.body().getFeatures().size());
                        }
                    }

                } else
                    Toast.makeText(MainActivity.this, "response not success", LENGTH_LONG).show();
                hideProgress();
            }

            @Override
            public void onFailure(Call<QuakeModel> call, Throwable t) {
                hideProgress();
                t.printStackTrace(); //this will show in Debug mode log
                Toast.makeText(MainActivity.this, "" + t.getMessage(), LENGTH_LONG).show();
                Log.d(TAG, "onFailure: "+t.getMessage());
            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
        callGetQuakes().cancel();
    }

    private Call<QuakeModel> callGetQuakes() {
        return apiParser.get_quakes("geojson", 1);
    }
}
