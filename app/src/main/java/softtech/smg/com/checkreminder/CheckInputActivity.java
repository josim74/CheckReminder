package softtech.smg.com.checkreminder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class CheckInputActivity extends AppCompatActivity {

    private EditText etProviderName, etHolderName, etDate, etAmount, etCheckNumber;
    private Spinner spinnerBanks;
    private RadioButton radioButtonPayable, radioButtonRecievable;

    private Button btnSave;

    private List<PayableAndRecievableModel> payableAndRecievableModelList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_input);

        payableAndRecievableModelList = new ArrayList<>();

        radioButtonPayable = findViewById(R.id.rdbtn_payable_CheckInput);
        radioButtonRecievable = findViewById(R.id.rdbtn_payable_CheckInput);

        etProviderName = findViewById(R.id.et_providerName_CheckInput);
        etHolderName = findViewById(R.id.et_holderName_CheckInput);
        etDate = findViewById(R.id.et_date_CheckInput);
        etAmount = findViewById(R.id.et_amount_CheckInput);
        etCheckNumber = findViewById(R.id.et_checkNumber_CheckInput);
        spinnerBanks = findViewById(R.id.spinner_banks_CheckInput);

        btnSave = findViewById(R.id.btn_save_CheckInput);

    }
}
