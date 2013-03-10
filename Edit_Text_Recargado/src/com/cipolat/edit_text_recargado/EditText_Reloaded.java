package com.cipolat.edit_text_recargado;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.util.AttributeSet;
import android.widget.EditText;

public class EditText_Reloaded  extends EditText {

	public EditText_Reloaded(Context context, AttributeSet attrs, int defStyle){
	    super(context, attrs,defStyle);
	}
	 
	public EditText_Reloaded(Context context, AttributeSet attrs) {
	    super(context, attrs);
	}
	 
	public EditText_Reloaded(Context context) {
	    super(context);
	    
	  
	}
	
	
	
	public void onDraw(Canvas canvas)
	{
	//definimos pinceles
	//para el recuadro negro
	Paint p1 = new Paint(Paint.ANTI_ALIAS_FLAG);
	p1.setColor(Color.BLACK);
	p1.setStyle(Style.FILL);

	//para  los numeros
	Paint p2 = new Paint(Paint.ANTI_ALIAS_FLAG);
	p2.setColor(Color.WHITE);
	
	
	    //Llamamos al método de la clase base (EditText)
	    super.onDraw(canvas);
	 
	    //Dibujamos el fondo negro del contador
	    canvas.drawRect(this.getWidth()-30, 5,
	        this.getWidth()-5, 20, p1);
	 
	    //Dibujamos el número de caracteres sobre el contador
	    canvas.drawText("" + this.getText().toString().length(),this.getWidth()-28, 17, p2);
		
		Paint linePaint=new Paint(Paint.ANTI_ALIAS_FLAG);
		linePaint.setColor(Color.BLACK);
		linePaint.setStyle(Style.FILL);
		
		    int count = getLineCount(); 
	        int height = this.getMeasuredHeight(); 
	        int line_height = this.getLineHeight(); 
	        int page_size = height / line_height + 1; 
	        if (count < page_size) { 
	            count = page_size; 
	        } 
	        int posY = 5; 
	        for (int i = 1; i < count; i++) { 
	            posY +=  line_height;
	            
				canvas.drawLine(0, posY, getRight(), posY, linePaint); 
	            canvas.save(); 
	        } 
	      super.onDraw(canvas); 
	      canvas.restore();
}
}