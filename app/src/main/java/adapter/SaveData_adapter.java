package adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ayubbaba.passwordsaver.passwordsaver.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.realm.RealmResults;
import pojo.SaveDataPojo;

/**
 * Created by ayub on 19-Jan-17.
 */

public class SaveData_adapter extends RecyclerView.Adapter<SaveData_adapter.SaveData_ViewHolder> {
    RealmResults<SaveDataPojo> saveDataPojos;

    public SaveData_adapter(RealmResults<SaveDataPojo> saveDataPojos) {
        this.saveDataPojos = saveDataPojos;
    }

    @Override
    public SaveData_ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View saveview = LayoutInflater.from(parent.getContext()).inflate(R.layout.save_data_row, parent, false);
        return new SaveData_ViewHolder(saveview);
    }

    @Override
    public void onBindViewHolder(SaveData_ViewHolder holder, int position) {
        SaveDataPojo savepojo = saveDataPojos.get(position);
        holder.name.setText(savepojo.getEmail());
        holder.password.setText(savepojo.getPassword());
    }

    @Override
    public int getItemCount() {
        return saveDataPojos.size();
    }

    public static class SaveData_ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.name)
        TextView name;
        @BindView(R.id.password)
        TextView password;

        public SaveData_ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
