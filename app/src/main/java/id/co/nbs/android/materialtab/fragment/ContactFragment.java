package id.co.nbs.android.materialtab.fragment;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import id.co.nbs.android.materialtab.R;
import id.co.nbs.android.materialtab.adapter.ContactAdapter;
import id.co.nbs.android.materialtab.model.Contact;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link ContactFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link ContactFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ContactFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    private ArrayList<Contact> contacts;
    private ContactAdapter contactAdapter;
    @BindView(R.id.rv_contact)
    RecyclerView rvContact;

    public ContactFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ContactFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ContactFragment newInstance(String param1, String param2) {
        ContactFragment fragment = new ContactFragment();
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

        View rootView = inflater.inflate(R.layout.fragment_contact, container, false);
        ButterKnife.bind(this,rootView);
        rvContact.setHasFixedSize(true);

        setupDummyContact();
        contactAdapter = new ContactAdapter(contacts);
        rvContact.setAdapter(contactAdapter);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(),2);
        rvContact.setLayoutManager(gridLayoutManager);


        return rootView;
    }

    // TODO: Rename method, update argument and hook method into UI event
//    public void onButtonPressed(Uri uri) {
//        if (mListener != null) {
//            mListener.onFragmentInteraction(uri);
//        }
//    }
//
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
//
//    @Override
//    public void onDetach() {
//        super.onDetach();
//        mListener = null;
//    }

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

    private void setupDummyContact(){
        contacts = new ArrayList<>();
        contacts.add(new Contact(R.drawable.pev,"Pevita Pearce"));
        contacts.add(new Contact(R.drawable.cindy,"Cindy Thefani"));
        contacts.add(new Contact(R.drawable.prilly,"Prilly "));
        contacts.add(new Contact(R.drawable.mas_mas_pulsa,"Mas Mas Pulsa"));
        contacts.add(new Contact(R.drawable.arieltatum,"Ariel Tatum"));
        contacts.add(new Contact(R.drawable.chelsea_islan,"Chelasea Islan"));
        contacts.add(new Contact(R.drawable.nabila,"Nabila"));
        contacts.add(new Contact(R.drawable.raisa,"Raisa"));
        contacts.add(new Contact(R.drawable.sheryl_sheinafia,"Sheryl Shenafia"));
        contacts.add(new Contact(R.drawable.sandra,"Sandra Dewi"));
    }
}
