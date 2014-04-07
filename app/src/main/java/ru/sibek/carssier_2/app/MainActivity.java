package ru.sibek.carssier_2.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // находим список
        ListView lvMain = (ListView) findViewById(R.id.lvMain);

        String[] names = { "Заказы", "Расчеты", "Склад", "Персонал", "Справочники", "Отчеты",
                "Настройки"};
        // создаем адаптер
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list_item,
                R.id.text1, names);



        // присваиваем адаптер списку
        lvMain.setAdapter(adapter);

    }

    public void onMyButtonClick(View view) {

                Toast.makeText(MainActivity.this,
                        "Option Button is clicked!", Toast.LENGTH_SHORT).show();

       /* imageButton = (ImageButton) findViewById(R.id.drawer_item_icon2);
        imageButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Toast.makeText(MainActivity.this,
                        "Order In Work Button is clicked!", Toast.LENGTH_SHORT).show();

            }

        });*/
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
