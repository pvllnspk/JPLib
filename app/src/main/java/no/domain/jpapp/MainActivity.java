package no.domain.jpapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import no.domain.jplib.PrintManager;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		PrintManager.print();
	}
}
