package nefersky.fragments4app;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class TextFragment extends Fragment {
    private String mData;
    private TextView lblText;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_text, container, false);

        lblText = (TextView)rootView.findViewById(R.id.lblText);
        if(savedInstanceState != null){
            mData = savedInstanceState.getString("text", "");
        }
        lblText.setText(mData);

        return rootView;
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("text", mData);
    }

    public void showInfo(String data) {
        mData = data;
        lblText.setText(data);
    }
}
