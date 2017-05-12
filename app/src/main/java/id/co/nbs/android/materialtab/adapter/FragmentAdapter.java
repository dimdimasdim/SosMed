package id.co.nbs.android.materialtab.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import id.co.nbs.android.materialtab.R;
import id.co.nbs.android.materialtab.model.WhatsAppTest;

/**
 * Created by Sidiq on 30/04/2017.
 */

public class FragmentAdapter extends RecyclerView.Adapter<FragmentAdapter.FragmentViewHolder>{

    private List<WhatsAppTest> whatsAppTests;

    public FragmentAdapter(List<WhatsAppTest> whatsAppTests) {
        this.whatsAppTests = whatsAppTests;
    }

    @Override
    public FragmentViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);
        return new FragmentViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(FragmentViewHolder holder, int position) {
        WhatsAppTest whatsAppTest = whatsAppTests.get(position);

        holder.imgUser.setImageResource(whatsAppTest.getImgUser());
        holder.userName.setText(whatsAppTest.getNameUser());
        holder.pesanUser.setText(whatsAppTest.getMessageUser());
        holder.imgStatus.setImageResource(whatsAppTest.getImgStatus());
        holder.waktuPesan.setText(whatsAppTest.getTimeMessageUser());
        holder.notifikasiPesan.setText(whatsAppTest.getNotificationMessageUser());
    }

    @Override
    public int getItemCount() {
        return whatsAppTests.size();
    }

    public class FragmentViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.img_user)
        ImageView imgUser;
        @BindView(R.id.tv_name_contact)
        TextView userName;
        @BindView(R.id.tv_pesan_user)
        TextView pesanUser;
        @BindView(R.id.img_status)
        ImageView imgStatus;
        @BindView(R.id.tv_waktu_pesan)
        TextView waktuPesan;
        @BindView(R.id.tv_notifikasi_pesan)
        TextView notifikasiPesan;


        public FragmentViewHolder(View itemView) {
            super(itemView);

            ButterKnife.bind(this, itemView);
        }
    }
}
