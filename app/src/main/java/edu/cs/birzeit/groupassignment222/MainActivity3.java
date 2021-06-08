package edu.cs.birzeit.groupassignment222;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import edu.cs.birzeit.groupassignment222.models.order;


public class MainActivity3 extends AppCompatActivity {

    order order = new order ();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

//        System.out.println(order.getOrders());

        RecyclerView recycler = findViewById(R.id.shoppingcart_recycler);

        String[] names = new String[order.getOrders().size()];
        int[] ids = new int[order.getOrders().size()];
        int[] prices = new int[order.getOrders().size()];
        String [] colors = new String [order.getOrders().size()];
        int [] sizes = new int [order.getOrders().size()];
        int [] quantities = new int [order.getOrders().size()];

        for(int i = 0; i<names.length;i++){
            names[i] = order.getOrders().get(i).getItem().getName();
            ids[i] = order.getOrders().get(i).getItem().getImageID();
            prices[i] = order.getOrders().get(i).getItem().getPrice();
            colors [i] = order.getOrders().get(i).getChosenColor();
            sizes[i] = order.getOrders().get(i).getChosenSize();
            quantities[i]=order.getOrders().get(i).getChosenQuantity();

        }
        recycler.setLayoutManager(new GridLayoutManager(this,2));
        CaptionedImagesAdapter2 adapter = new CaptionedImagesAdapter2(this,names, ids,prices,colors,quantities,sizes);
        recycler.setAdapter(adapter);


    }

    public void backOnClick(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.mainpage_menu,menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.items:
                Intent intent = new Intent(this,MainActivity.class);
//                intent.putExtra("DATA2", orders);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }



//    public void check_OnClick(View view) {
//        Intent intent = new Intent(this, MainActivity4.class);
//        startActivity(intent);
//    }
//
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        MenuInflater inflater = getMenuInflater();
//        inflater.inflate(R.menu.home,menu);
//        return true;
//    }
//
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        Intent intent = new Intent(this, MainActivity.class);
//        startActivity(intent);
//        return true;
//    }
}