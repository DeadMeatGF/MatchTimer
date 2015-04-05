package uk.co.stevegiller.deadmeatgf.matchtimer;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


public class TeamListActivity extends Activity {
    private static final String TAG = "TeamListActivity";

    private ListView myList;
    private MyAdapter myAdapter;
    private int currentView = -1;
    private String currentString = "";

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.team_list);

        myList = (ListView) findViewById(R.id.listView);
        myList.setItemsCanFocus(true);
        myAdapter = new MyAdapter();
        myList.setAdapter(myAdapter);

    }

    public class MyAdapter extends BaseAdapter {
        private LayoutInflater mInflater;
        public ArrayList myItems = new ArrayList();

        public MyAdapter() {
            mInflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            for (int i = 0; i < 20; i++) {
                ListItem listItem = new ListItem();
                listItem.caption = "Caption" + i;
                myItems.add(listItem);
            }
            notifyDataSetChanged();
        }

        public int getCount() {
            return myItems.size();
        }

        public Object getItem(int position) {
            return position;
        }

        public long getItemId(int position) {
            return position;
        }

        public View getView(int position, View convertView, ViewGroup parent) {
            ViewHolder holder;
            if (convertView == null) {
                holder = new ViewHolder();
                convertView = mInflater.inflate(R.layout.list_player, null);
                holder.caption = (EditText) convertView
                        .findViewById(R.id.player_name);
                convertView.setTag(holder);
            } else {
                holder = (ViewHolder) convertView.getTag();
            }
            //Fill EditText with the value you have in data source
//            holder.caption.setText(myItems.get(position).caption);
            holder.caption.setText("Player Name");
            holder.caption.setTag(R.id.TAG_NAME_PLACEHOLDER_ID, "Player Name");
            holder.caption.setId(position);

            //we need to update adapter once we finish with editing
            holder.caption.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                public void onFocusChange(View v, boolean hasFocus) {
                    final int position = v.getId();
                    final EditText Caption = (EditText) v;
                    Log.d(TAG, "Entry position: " + currentView + " - View position: " + position);
                    if(position != currentView) {
                        if (!hasFocus) {
                            //                        myItems.get(position).caption = Caption.getText().toString();
                            Log.d(TAG, "Does not have focus");
                        }
                        if (hasFocus) {
                            Log.d(TAG, "Does have focus - New player. Last Name: " + currentString + " - New Name: " + Caption.getText().toString());
                            currentString = Caption.getText().toString();
                        }
                        currentView = position;
                        Log.d(TAG, "Exit position: " + currentView);
                    }
                    currentString = Caption.getText().toString();
                }
            });

            return convertView;
        }
    }

    class ViewHolder {
        EditText caption;
    }

    class ListItem {
        String caption;
    }
}
