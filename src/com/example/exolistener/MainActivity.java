package com.example.exolistener;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.app.Activity;

public class MainActivity extends Activity {

	public Button bouton;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		bouton = (Button) findViewById(R.id.bouton);
		bouton.setOnTouchListener(new OnTouchListener() {
			
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				float absX = event.getX();
				float absY = event.getY();
				float largeurBouton = ((Button) v).getWidth();
				float hauteurBouton = ((Button) v).getHeight();
				float size = Math.abs(absX - largeurBouton / 2) + Math.abs(absY - hauteurBouton / 2);
				((Button) v).setTextSize(size);
				return true;
			}
		});
		
	}

}
