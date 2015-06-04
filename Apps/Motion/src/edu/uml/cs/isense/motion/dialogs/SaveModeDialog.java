package edu.uml.cs.isense.motion.dialogs;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import edu.uml.cs.isense.motion.R;

public class SaveModeDialog extends AppCompatActivity {

	Button ok, cancel;

	@Override
	public void onCreate(Bundle b) {
		super.onCreate(b);
		setContentView(R.layout.save_mode_dialog);

		ok = (Button) findViewById(R.id.button1);
		cancel = (Button) findViewById(R.id.button2);

		ok.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				setResult(RESULT_OK);
				finish();

			}
		});

		cancel.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				setResult(RESULT_CANCELED);
				finish();

			}
		});

	}

}
