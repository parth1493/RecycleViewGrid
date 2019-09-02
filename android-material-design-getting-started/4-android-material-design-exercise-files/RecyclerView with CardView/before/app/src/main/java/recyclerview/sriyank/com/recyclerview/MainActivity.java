package recyclerview.sriyank.com.recyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

/**  *
 * Author: Sriyank Siddhartha 
 * Module 4 : Understanding RecyclerViews and CardViews
 *
 * 		 "BEFORE" demo project For Linear RecyclerView with CardView having Vertical Orientation
 **/
public class MainActivity extends AppCompatActivity {

	private Toolbar toolbar;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		toolbar = (Toolbar) findViewById(R.id.toolbar);
		toolbar.setTitle("Home Page");

		toolbar.inflateMenu(R.menu.menu_main);

		setUpRecyclerView();
	}

	private void setUpRecyclerView() {

	}
}
