package softtech.smg.com.checkreminder;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class RecievableFragment extends Fragment {

    private RecyclerView recyclerView;
    private List<PayableAndRecievableModel> payableAndRecievableModelList;
    private MyRecyclerAdapterRecievable myRecyclerAdapterRecievable;
    private View mView;

    public RecievableFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mView =  inflater.inflate(R.layout.fragment_recievable, container, false);
        payableAndRecievableModelList = new ArrayList<>();

        recyclerView = mView.findViewById(R.id.recyclerView_recievable);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        payableAndRecievableModelList.add(new PayableAndRecievableModel(" Md. Josim Uddin","10-03-2018", "5000", " 112233445566", "DBBL"));
        payableAndRecievableModelList.add(new PayableAndRecievableModel(" Md. Josim Uddin1","11-03-2018", "6000", " 112233445567", "UTTARA"));
        payableAndRecievableModelList.add(new PayableAndRecievableModel(" Md. Josim Uddin2","12-03-2018", "7000", " 112233445568", "DHAKA"));

        myRecyclerAdapterRecievable = new MyRecyclerAdapterRecievable(getContext(), payableAndRecievableModelList);
        recyclerView.setAdapter(myRecyclerAdapterRecievable);

        return mView;
    }

}
