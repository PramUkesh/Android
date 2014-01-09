package edu.uml.cs.isense.proj;

import edu.uml.cs.isense.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ProjectNameDialog extends Activity {
	
	private EditText nameInput;
	private Button ok,cancel;
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.new_project_name);
		
		nameInput = (EditText) findViewById(R.id.new_proj_name);
		ok = (Button) findViewById(R.id.okB);
		cancel = (Button) findViewById(R.id.clB);
		
		ok.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				String name = nameInput.getText().toString();
				if (name.equals("")){
					nameInput.setError("Project Name Cannot Be Empty");
				} else {
					nameInput.setError(null);
					Intent data = new Intent();
					data.putExtra("new_proj_name", name);
					setResult(RESULT_OK, data);
					finish();
				}
				
			}
		});
		
		cancel.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				setResult(RESULT_CANCELED);
				finish();
				
			}
		});
	}

}
