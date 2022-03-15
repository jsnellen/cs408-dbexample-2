package edu.jsu.mcis.cs408.dbexample;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

import edu.jsu.mcis.cs408.dbexample.databinding.ContactItemBinding;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private ContactItemBinding binding;
    private List<Contact> data;

    public RecyclerViewAdapter(List<Contact> data) {
        this.data = data;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        binding = ContactItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        ViewHolder holder = new ViewHolder(binding.getRoot());
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.setContact(data.get(position));
        holder.bindData();
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        private Contact contact;
        private TextView nameLabel;
        private TextView addressLabel;

        public ViewHolder(View itemView) {
            super(itemView);
        }

        public Contact getContact() {
            return contact;
        }

        public void setContact(Contact contact) {
            this.contact = contact;
        }

        public void bindData() {

            if (nameLabel == null) {
                nameLabel = (TextView) itemView.findViewById(R.id.contactNameLabel);
            }
            if (addressLabel == null) {
                addressLabel = (TextView) itemView.findViewById(R.id.contactAddressLabel);
            }
            nameLabel.setText(contact.getName());
            addressLabel.setText(contact.getAddress());

        }

    }

}