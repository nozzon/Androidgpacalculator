package com.gpacalculator;



import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class GPACalculator extends Activity {

	EditText ATextField,BTextField,CTextField,DTextField,FTextField;
	TextView GPAtext;
	Button  calculateBtn;
	int A,B,C,D,F;
	double AText, BText, CText, DText, FText, GPA;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_gpacalculator);
		
		ATextField = (EditText)findViewById(R.id.ATextField);
		BTextField = (EditText)findViewById(R.id.BTextField);
		CTextField= (EditText)findViewById(R.id.CTextField);
		DTextField = (EditText)findViewById(R.id.DTextField);
		FTextField = (EditText)findViewById(R.id.FTextField);
		calculateBtn = (Button) findViewById(R.id.calculateBtn);
		GPAtext      = (TextView)findViewById(R.id.GPAText);
		calculateBtn.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) 
            {
            	AText  = Double.parseDouble(ATextField.getText().toString());
        		BText  = Double.parseDouble(BTextField.getText().toString());
        		CText  = Double.parseDouble(CTextField.getText().toString());
        		DText  = Double.parseDouble(DTextField.getText().toString());
        		FText  = Double.parseDouble(FTextField.getText().toString());

        		GPA = ((AText*4.0)+(BText*3)+(CText*2)+(DText)+(FText*0))
        				/((AText)+(BText)+(CText)+(DText)+(FText));
        		GPAtext.setText(""+GPA);
            }
        });
	    
		
	        
	       
		
	}
}
