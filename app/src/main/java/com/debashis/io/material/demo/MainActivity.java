package com.debashis.io.material.demo;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import com.debashis.io.material.R;
import com.debashis.io.material.toast.DnToast;
import com.debashis.io.material.button.DnButton;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

		Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar);
		setSupportActionBar(toolbar);

    }
	public void onClick(final View v) {
        switch (v.getId()) {
            case R.id.DnButton1:

                DnToast.dn(this, "Nikita", DnToast.LENGTH_SHORT, DnToast.SUCCESS, false).show();

                break;
            case R.id.DnButton2:

                DnToast.dn(this, "Python", DnToast.LENGTH_SHORT, DnToast.SUCCESS, R.drawable.language_python).show();
			default:
				break;

		}
	}
}
/*don't forget to subscribe my YouTube channel for more Tutorial and mod*/
/*
https://youtube.com/channel/UC_lCMHEhEOFYgJL6fg1ZzQA */
