package com.example.fragement;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;

public class FragmentOne extends Fragment implements OnClickListener {
	private Button mBtn;
	public static final String TAG = "FragmentOne";
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		Log.e(TAG, "onCreateView");
		View view = inflater.inflate(R.layout.fragment_one, container, false);  
        mBtn = (Button) view.findViewById(R.id.id_fragment_one_btn);  
        mBtn.setOnClickListener(this);  
        return view;
	}

	@Override
	public void onClick(View v) {
		FragmentTwo fTwo = new FragmentTwo();  
        FragmentManager fm = getFragmentManager();  
        FragmentTransaction tx = fm.beginTransaction();  
        /*tx.hide(this);
        tx.add(R.id.id_content,fTwo, "TWO");*/
        tx.replace(R.id.id_content, fTwo, "TWO");  
        tx.addToBackStack(null);  
        tx.commit(); 
	}
	
	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
		Log.e(TAG, "onAttach");
	}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e(TAG, "onCreate");
    }
    
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.e(TAG, "onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.e(TAG, "onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e(TAG, "onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.e(TAG, "onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.e(TAG, "onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.e(TAG, "onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.e(TAG, "onDetach");
    }

}
