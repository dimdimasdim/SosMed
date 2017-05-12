package id.co.nbs.android.materialtab.fragment;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import id.co.nbs.android.materialtab.R;
import id.co.nbs.android.materialtab.adapter.FragmentAdapter;
import id.co.nbs.android.materialtab.model.WhatsAppTest;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link ChattingFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link ChattingFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ChattingFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    private ArrayList<WhatsAppTest> whatsAppTests;
    private FragmentAdapter fragmentAdapter;

    @BindView(R.id.rv_list)
    RecyclerView rvList;

    public ChattingFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ChattingFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ChattingFragment newInstance(String param1, String param2) {
        ChattingFragment fragment = new ChattingFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        if (getArguments() != null) {
//            mParam1 = getArguments().getString(ARG_PARAM1);
//            mParam2 = getArguments().getString(ARG_PARAM2);
//        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootView = inflater.inflate(R.layout.fragment_fragment_tab, container, false);
        ButterKnife.bind(this,rootView);
        rvList.setHasFixedSize(true);

        setupDummyMessage();
        fragmentAdapter = new FragmentAdapter(whatsAppTests);
        rvList.setAdapter(fragmentAdapter);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        rvList.setLayoutManager(linearLayoutManager);



        return rootView;
    }

    // TODO: Rename method, update argument and hook method into UI event
//    public void onButtonPressed(Uri uri) {
//        if (mListener != null) {
//            mListener.onFragmentInteraction(uri);
//        }
//    }

//    @Override
//    public void onAttach(Context context) {
//        super.onAttach(context);
//        if (context instanceof OnFragmentInteractionListener) {
//            mListener = (OnFragmentInteractionListener) context;
//        } else {
//            throw new RuntimeException(context.toString()
//                    + " must implement OnFragmentInteractionListener");
//        }
//    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }

    private void setupDummyMessage(){
        whatsAppTests = new ArrayList<>();
        whatsAppTests.add(new WhatsAppTest(R.drawable.pev,R.drawable.ic_check,"Pevita Pearce","Aku kangen kamu, ayo kita balikan","baru saja","4"));
        whatsAppTests.add(new WhatsAppTest(R.drawable.cindy,R.drawable.ic_check,"Cindy Thefani","Kapan Kamu putusin prilly?","13.30","1"));
        whatsAppTests.add(new WhatsAppTest(R.drawable.prilly,R.drawable.ic_check,"Prilly ","KAMU MASIH HUB SAMA PEVITA?!","Minggu","2"));
        whatsAppTests.add(new WhatsAppTest(R.drawable.mas_mas_pulsa,R.drawable.ic_check,"Mas Mas Pulsa","Maaf mas hutang pulsanya kapan di bayarnya ya?","Sabtu","1"));
        whatsAppTests.add(new WhatsAppTest(R.drawable.arieltatum,R.drawable.ic_check,"Ariel Tatum","Besok kita jadi jalan?","Jumat","1"));
        whatsAppTests.add(new WhatsAppTest(R.drawable.chelsea_islan,R.drawable.ic_check,"Chelasea Islan","Aku sayang Kamu, kalo kamu?","Jumat","1"));
        whatsAppTests.add(new WhatsAppTest(R.drawable.nabila,R.drawable.ic_check,"Nabila","Aku udah di depan XXI nih, kamu dimana?","Kamis","1"));
        whatsAppTests.add(new WhatsAppTest(R.drawable.raisa,R.drawable.ic_check,"Raisa","Kamu kok udah gak pernah chat aku lagi?","senin","20"));
        whatsAppTests.add(new WhatsAppTest(R.mipmap.ic_launcher,R.drawable.ic_check,"Dosen Pembimbing","Dimas besok kita gak jadi bimbingan ya, saya mau mancing.","Senin","1"));
        whatsAppTests.add(new WhatsAppTest(R.drawable.sheryl_sheinafia,R.drawable.ic_check,"Sheryl Shenafia"," Love u tooo","Kemarin","1"));
        whatsAppTests.add(new WhatsAppTest(R.drawable.sandra,R.drawable.ic_check,"Sandra Dewi","Aku tak bisa hidup tanpa mu","Kemarin","1"));


    }
}
