package com.muhammadamirulhaq.tugasmobile2.activities;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import com.muhammadamirulhaq.tugasmobile2.R;

public class IndoActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_indo);
	}
  public void keHalBarat2(View view) {
		Intent i = new Intent(this,BaratActivity.class);
		startActivity(i);
	}

  public void keHalBeranda2(View view) {
		Intent i = new Intent(this,MainActivity.class);
		startActivity(i);
	}
	
}
