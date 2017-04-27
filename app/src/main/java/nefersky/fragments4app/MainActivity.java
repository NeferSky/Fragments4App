package nefersky.fragments4app;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements Communicator {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void count(String data){
        FragmentManager fm = getSupportFragmentManager();
        TextFragment textFragment = (TextFragment)fm.findFragmentById(R.id.frgTextMain);
        textFragment.showInfo(data);
    }
}
