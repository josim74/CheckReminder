package softtech.smg.com.checkreminder;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by SMG-ADMIN on 3/27/2018.
 */

public class MyRecyclerAdapterPayable extends RecyclerView.Adapter<MyRecyclerAdapterPayable.MyViewHolder>{

    private Context context;
    private List<PayableAndRecievableModel> payableAndRecievableModelList;

    public MyRecyclerAdapterPayable(Context context, List<PayableAndRecievableModel> payableAndRecievableModelList) {
        this.context = context;
        this.payableAndRecievableModelList = payableAndRecievableModelList;
    }



    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.card_layout_payable, null);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        PayableAndRecievableModel payableAndRecievableModel = payableAndRecievableModelList.get(position);

        holder.tvPersonName.setText(payableAndRecievableModel.getPersonName());
        holder.tvCheckDate.setText(payableAndRecievableModel.getCheckDate());
        holder.tvAmount.setText(payableAndRecievableModel.getAmount());
        holder.tvCheckNumber.setText(payableAndRecievableModel.getCheckNumber());
        holder.tvBankName.setText(payableAndRecievableModel.getBankName());

    }

    @Override
    public int getItemCount() {
        return payableAndRecievableModelList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView tvPersonName,tvCheckDate,tvBankName,tvCheckNumber, tvAmount;
        public MyViewHolder(View itemView) {
            super(itemView);

            tvPersonName = itemView.findViewById(R.id.tv_to_payableCard);
            tvCheckDate = itemView.findViewById(R.id.tv_date_payableCard);
            tvCheckNumber = itemView.findViewById(R.id.tv_checkNumber_payableCard);
            tvBankName = itemView.findViewById(R.id.tv_bankName_payableCard);
            tvAmount = itemView.findViewById(R.id.tv_amount_payableCard);
        }
    }
}
