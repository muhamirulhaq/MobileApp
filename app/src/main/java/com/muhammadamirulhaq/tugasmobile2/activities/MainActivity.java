package com.muhammadamirulhaq.tugasmobile2.activities;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import com.muhammadamirulhaq.tugasmobile2.R;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	public void keHalIndo(View view) {
		Intent i = new Intent(this,IndoActivity.class);
		startActivity(i);
	}

  public void keHalBarat(View view) {
		Intent i = new Intent(this,BaratActivity.class);
		startActivity(i);
	}
	
}
