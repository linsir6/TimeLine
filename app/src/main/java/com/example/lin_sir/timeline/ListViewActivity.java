package com.example.lin_sir.timeline;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListViewActivity extends Activity
{
    private ListView listView;
    private List<String> data;
    private TimelineAdapter timelineAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview_activity);

        listView= (ListView) findViewById(R.id.lv_mainActivity);
        listView.setDividerHeight(0);
        timelineAdapter = new TimelineAdapter(this, getData());
        listView.setAdapter(timelineAdapter);

    }

    private List<Map<String, Object>> getData()
    {

        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("title", "第1条数据");
        list.add(map);

        Map<String, Object> map2 = new HashMap<String, Object>();
        map.put("title", "第2条数据");
        list.add(map);

        Map<String, Object> map3 = new HashMap<String, Object>();
        map.put("title", "第3条数据");
        list.add(map);

        Map<String, Object> map4 = new HashMap<String, Object>();
        map.put("title", "第4条数据");
        list.add(map);


        return list;
    }
}
















