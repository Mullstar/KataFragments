package kata.bfwi315b.fhdw.de.katafragments;


import android.app.Fragment;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.app.FragmentTransaction;
import android.app.FragmentManager;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends FragmentActivity {

    private FragmentOne fragmentOne;
    private FragmentTwo fragmentTwo;
    private FragmentThree fragmentThree;
    private Button buttonOne;
    private Button buttonTwo;
    private Button buttonThree;

    private int fragmentCounter = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonOne = findViewById(R.id.FragmentButtonOne);
        buttonTwo = findViewById(R.id.FragmentButtonTwo);
        buttonThree = findViewById(R.id.FragmentButtonThree);
        fragmentOne = (FragmentOne) Fragment.instantiate(this, FragmentOne.class.getName(), null);
        fragmentTwo = (FragmentTwo) Fragment.instantiate(this, FragmentTwo.class.getName(), null);
        fragmentThree = (FragmentThree) Fragment.instantiate(this, FragmentThree.class.getName(), null);

        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.FragmentContainer, fragmentOne);
        fragmentTransaction.commit();

        buttonOne.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.FragmentContainer, fragmentOne);
                fragmentTransaction.commit();
            }
        });

        buttonTwo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.FragmentContainer, fragmentTwo);
                fragmentTransaction.commit();
            }
        });

        buttonThree.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.FragmentContainer, fragmentThree);
                fragmentTransaction.commit();
            }
        });
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return super.onCreateOptionsMenu(menu);
//    }

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//
//        if(item.getItemId() == R.id.FragmentButton)
//        {
//            FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
//            if(fragmentCounter % 3 == 0)
//            {
//                fragmentTransaction.replace(R.id.FragmentContainer, fragmentThree);
//            }
//            if(fragmentCounter % 3 == 1)
//            {
//                fragmentTransaction.replace(R.id.FragmentContainer, fragmentOne);
//            }
//            if(fragmentCounter % 3 == 2)
//            {
//                fragmentTransaction.replace(R.id.FragmentContainer, fragmentTwo);
//            }
//            fragmentCounter++;
//            fragmentTransaction.commit();
//        }
//        return super.onOptionsItemSelected(item);
//    }
}
