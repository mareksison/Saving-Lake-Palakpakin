package com.palakpakin;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public class PalakpakinSurface extends SurfaceView implements SurfaceHolder.Callback {
	
	private PalakpakinThread thread;
	
	private Lake lake;

	public PalakpakinSurface(Context context) {
		super(context);
		getHolder().addCallback(this);
		setFocusable(true);
		
		lake = new Lake(0, 5, 5);
	}

	@Override
	public void surfaceCreated(SurfaceHolder arg0){
		thread = new PalakpakinThread(this, getHolder());
		thread.start();
	}
	
	@Override
	public void surfaceChanged(SurfaceHolder arg0, int arg1, int arg2, int arg3){
	}

	@Override
	public void surfaceDestroyed(SurfaceHolder arg0){
	}
	
	public void render(Canvas c){
		c.drawColor(Color.WHITE);
		Paint p = new Paint();
		p.setColor(Color.BLACK);
		c.drawText("Saving Lake Palakpakin", 150, 200, p);

		//BITMAP.draw(c);
	}
	

}
