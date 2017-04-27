package nefersky.fragments4app;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class ButtonFragment extends Fragment implements View.OnClickListener {

    private int mCounter = 0;

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("counter", mCounter);
    }

    private Communicator mCommunicator;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(savedInstanceState == null) {
            mCounter = 0;
        } else {
            mCounter = savedInstanceState.getInt("counter", 0);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_button, container, false);

        Button btnCount = (Button) rootView.findViewById(R.id.btnCount);
        btnCount.setOnClickListener(this);

        return rootView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mCommunicator = (Communicator)getActivity();
        //mCommunicator.count("Я насчитал " + mCounter + " котов!");
    }

    @Override
    public void onClick(View view){
        ++mCounter;
        mCommunicator.count("Я насчитал " + mCounter + " котов!");
    }
}
