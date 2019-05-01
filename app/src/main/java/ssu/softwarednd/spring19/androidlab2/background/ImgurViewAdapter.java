package ssu.softwarednd.spring19.androidlab2.background;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ssu.softwarednd.spring19.androidlab2.R;
import java.util.List;

import ssu.softwarednd.spring19.androidlab2.models.ImgurModel;

public class ImgurViewAdapter extends RecyclerView.Adapter<ImgurViewHolder> {

    private List<ImgurModel> imgurmodel;

    public ImgurViewAdapter(List<ImgurModel> collection) {
        imgurmodel = collection;
    }

    @NonNull
    @Override
    public ImgurViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflatedView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item, parent, false);
        return new ImgurViewHolder(inflatedView);
    }

    @Override
    public void onBindViewHolder(@NonNull ImgurViewHolder imgurViewHolder, int position) {
        ImgurModel model = imgurmodel.get(position);
        imgurViewHolder.bindView(model);
    }

    @Override
    public int getItemCount() {
        return imgurmodel.size();
    }
}
