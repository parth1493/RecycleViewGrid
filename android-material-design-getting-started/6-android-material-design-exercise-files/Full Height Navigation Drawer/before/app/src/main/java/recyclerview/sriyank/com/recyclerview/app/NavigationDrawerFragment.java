package recyclerview.sriyank.com.recyclerview.app;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import recyclerview.sriyank.com.recyclerview.R;
import recyclerview.sriyank.com.recyclerview.adapter.NavigationDrawerAdapter;
import recyclerview.sriyank.com.recyclerview.model.NavigationDrawerItem;

public class NavigationDrawerFragment extends Fragment {

	private ActionBarDrawerToggle   mDrawerToggle;
    private DrawerLayout            mDrawerLayout;

	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_navigation_drawer, container, false);

	    setUpRecyclerView(view);

        return view;
    }

	private void setUpRecyclerView(View view) {

		RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.drawerList);

		NavigationDrawerAdapter adapter = new NavigationDrawerAdapter(getActivity(), NavigationDrawerItem.getData());
		recyclerView.setAdapter(adapter);
		recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
	}

	public void setUpDrawer(int fragmentId, DrawerLayout drawerLayout, Toolbar toolbar) {

    }
}
