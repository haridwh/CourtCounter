package com.skday.courtcounter;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.skday.courtcounter.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private int scoreA = 0;
    private int scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setVm(this);
        setSupportActionBar(binding.toolBar);
        getSupportActionBar().setTitle(R.string.app_name);
    }

    public void reset(View view) {
        binding.scoreA.setText("0");
        binding.scoreB.setText("0");
        scoreA=0;
        scoreB=0;
        Toast.makeText(this, "Score Berhasil Di Reset", Toast.LENGTH_SHORT).show();
    }

    public void tiga(View view) {
        Button v = (Button) view;
        switch (v.getId()) {
            case R.id.btn_kanan_tiga:
                scoreB += 3;
                binding.scoreB.setText(String.valueOf(scoreB));
                break;
            case R.id.btn_kanan_min_tiga:
                if ((scoreB-3) >= 0) {
                    scoreB -= 3;
                    binding.scoreB.setText(String.valueOf(scoreB));
                }
                break;
            case R.id.btn_kiri_tiga:
                scoreA += 3;
                binding.scoreA.setText(String.valueOf(scoreA));
                break;
            case R.id.btn_kiri_min_tiga:
                if ((scoreA-3) >= 0) {
                    scoreA -= 3;
                    binding.scoreA.setText(String.valueOf(scoreA));
                }
                break;
        }
    }

    public void dua(View view) {
        Button v = (Button) view;
        switch (v.getId()) {
            case R.id.btn_kanan_dua:
                scoreB += 2;
                binding.scoreB.setText(String.valueOf(scoreB));
                break;
            case R.id.btn_kanan_min_dua:
                if ((scoreB - 2) >= 0) {
                    scoreB -= 2;
                    binding.scoreB.setText(String.valueOf(scoreB));
                } else {
                    Toast.makeText(this, "Nilai Tidak Valid", Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.btn_kiri_dua:
                scoreA += 2;
                binding.scoreA.setText(String.valueOf(scoreA));
                break;
            case R.id.btn_kiri_min_dua:
                if ((scoreA-2) >= 0) {
                    scoreA -= 2;
                    binding.scoreA.setText(String.valueOf(scoreA));
                }
                break;
        }
    }

    public void satu(View view) {
        Button v = (Button) view;
        switch (v.getId()) {
            case R.id.btn_kanan_satu:
                scoreB += 1;
                binding.scoreB.setText(String.valueOf(scoreB));
                break;
            case R.id.btn_kanan_min_satu:
                if ((scoreB-1) >= 0) {
                    scoreB -= 1;
                    binding.scoreB.setText(String.valueOf(scoreB));
                }
                break;
            case R.id.btn_kiri_satu:
                scoreA += 1;
                binding.scoreA.setText(String.valueOf(scoreA));
                break;
            case R.id.btn_kiri_min_satu:
                if ((scoreA-1) >= 0) {
                    scoreA -= 1;
                    binding.scoreA.setText(String.valueOf(scoreA));
                }
                break;
        }
    }
}
