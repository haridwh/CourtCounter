package com.skday.courtcounter;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.skday.courtcounter.databinding.ActivityInputBinding;

public class InputActivity extends BaseActivity {

    ActivityInputBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_input);
        binding.setVm(this);
        setSupportActionBar(binding.toolBar);
        getSupportActionBar().setTitle("Input");
    }

    @Override
    protected void onResume() {
        super.onResume();
        binding.edTeamA.setText("");
        binding.edTeamB.setText("");
    }

    public void input(View view){
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("team_a", binding.edTeamA.getText().toString());
        intent.putExtra("team_b", binding.edTeamB.getText().toString());
        startActivity(intent);
    }
}
