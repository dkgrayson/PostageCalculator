package edu.pitt.cs1635.dkg8.prog1;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import android.widget.Button;
import android.view.KeyEvent;

public class PostageCalculator extends Activity {
	private int radioCheck = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_postage_calculator);
        RadioGroup group = (RadioGroup)findViewById(R.id.type);
        TextView weight = (TextView)findViewById(R.id.editText1);
        group.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId) {
                case R.id.radiobutton1:
                	radioCheck=1;
                    break;
                case R.id.radiobutton2:
                	radioCheck=2;
                    break;
                case R.id.radiobutton3:
                	radioCheck=3;
                    break;
                }
            }
        });
        
        weight.setOnEditorActionListener(new OnEditorActionListener(){
        	public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
        		if(radioCheck==1){
        			Button calc = (Button)findViewById(R.id.button1);
        			calc.setClickable(true);
        		}
				else if(radioCheck==2){
				        			
				}
				else if(radioCheck==3){
					
				}
				else{
					
				}
        		return true;
        	}
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.postage_calculator, menu);
        return true;
    }
    
}
