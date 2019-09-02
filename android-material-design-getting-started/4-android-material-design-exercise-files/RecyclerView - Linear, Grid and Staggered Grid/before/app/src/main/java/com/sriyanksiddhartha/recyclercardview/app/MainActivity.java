package com.sriyanksiddhartha.recyclercardview.app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.sriyanksiddhartha.recyclercardview.R;
import com.sriyanksiddhartha.recyclercardview.adapter.RecyclerAdapter;
import com.sriyanksiddhartha.recyclercardview.model.Animal;

/**
 * Author : Sriyank Siddhartha
 * Module 4 : Understanding RecyclerViews and CardViews
 *
 * 		"BEFORE" demo project for :-
 *
 * 1. Linear Horizontal RecyclerView,
 * 2. Linear Vertical Recycler View
 * 3. Grid View,
 * 4. Staggered Grid View Horizontal and,
 * 5. Staggered Grid View Vertical
 *
 * */
public class MainActivity extends AppCompatActivity implements Toolbar.OnMenuItemClickListener {

	private Toolbar toolbar;
	private RecyclerView recyclerView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		toolbar = (Toolbar) findViewById(R.id.toolbar);
		toolbar.setTitle("Home Page");
		toolbar.inflateMenu(R.menu.menu_main);
		toolbar.setOnMenuItemClickListener(this); // Another way to implement onClick on Menu items

		setUpRecyclerView();
	}

	private void setUpRecyclerView() {

		recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
		RecyclerAdapter adapter = new RecyclerAdapter(this, Animal.getData());
		recyclerView.setAdapter(adapter);

		LinearLayoutManager mLinearLayoutManagerVertical = new LinearLayoutManager(this); // (Context context, int spanCount)
		mLinearLayoutManagerVertical.setOrientation(LinearLayoutManager.VERTICAL);
		recyclerView.setLayoutManager(mLinearLayoutManagerVertical);
	}

	@Override
	public boolean onMenuItemClick(MenuItem item) {

        int id = item.getItemId();

        switch (id) {
            case R.id.linearViewHorizontal:

                break;

            case R.id.linearViewVertical:

                break;
            case R.id.gridView:

				break;
            case R.id.staggeredViewHorizontal:

				break;
            case R.id.staggeredViewVertical:

				break;
        }
		return true;
	}
}