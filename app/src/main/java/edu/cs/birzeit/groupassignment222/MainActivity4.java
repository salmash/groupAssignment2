
package edu.cs.birzeit.groupassignment222;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Collections;

import edu.cs.birzeit.groupassignment222.models.order;

import static edu.cs.birzeit.groupassignment222.models.order.totalwithtax;


public class MainActivity4 extends AppCompatActivity {
    TextView total;
    TextView taxtotal;
    TextView tax;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);


        RecyclerView recycler = findViewById(R.id.summary_recycler);

        String[] names = new String[order.getOrders().size()];
        int[] ids = new int[order.getOrders().size()];
        int[] prices = new int[order.getOrders().size()];
        int [] quantities = new int [order.getOrders().size()];

        for(int i = 0; i<names.length;i++){
            names[i] = order.getOrders().get(i).getItem().getName();
            ids[i] = order.getOrders().get(i).getItem().getImageID();
            prices[i] = order.getOrders().get(i).getItem().getPrice();
            quantities[i]=order.getOrders().get(i).getChosenQuantity();

        }
        recycler.setLayoutManager(new LinearLayoutManager(this));
        CaptionedImagesAdapter3 adapter = new CaptionedImagesAdapter3(this,names, ids,prices,quantities);
        recycler.setAdapter(adapter);



        total = findViewById(R.id.total);
        tax = findViewById(R.id.tax);
        taxtotal = findViewById(R.id.taxtotal);


        total.setText(""+total.getText()+order.CalculateTotal() + " $");

        tax.setText(""+tax.getText()+order.tax()+ " $");

        DecimalFormat df = new DecimalFormat("#.####");
        df.setRoundingMode(RoundingMode.CEILING);
        taxtotal.setText(""+taxtotal.getText()+df.format(order.totalwithtax())+ " $");


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.home,menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        return true;
    }


    public void buyOnClick(View view) {
        Toast.makeText(this, "Purchase completed successfully", Toast.LENGTH_SHORT).show();
        finishAffinity();
        System.exit(0);

    }
}