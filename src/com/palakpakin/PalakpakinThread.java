package com.palakpakin;

import android.graphics.Canvas;
import android.view.SurfaceHolder;

public class PalakpakinThread extends Thread{

	private PalakpakinSurface surface;
	private SurfaceHolder holder;
	
	public PalakpakinThread(PalakpakinSurface ps, SurfaceHolder sh){
		surface = ps;
		holder = sh;
	}
	
	@Override
	public void run(){
		Canvas canvas = null;
		while(true){
			canvas = holder.lockCanvas();
			try{
				synchronized(holder){
					surface.render(canvas);
				}
			}
			finally{
				if (canvas != null){
					holder.unlockCanvasAndPost(canvas);
				}
			}
		}
	}
}
