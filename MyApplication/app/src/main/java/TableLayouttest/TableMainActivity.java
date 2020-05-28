package TableLayouttest;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioGroup;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.chip.ChipGroup;
import com.zzh.xiaodao.myapplication.R;

import static com.zzh.xiaodao.myapplication.R.id.TableLayout;
import static com.zzh.xiaodao.myapplication.R.id.edittext2;

//onCreate
public class TableMainActivity extends AppCompatActivity {
    private CheckBox checkBox1;
    private EditText editText1;
    @SuppressLint("ResourceType")
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(TableLayout);
        editText1 = (EditText)findViewById(R.id.edittext2);
        checkBox1 = (CheckBox)findViewById(R.id.checkBox1);
        checkBox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    editText1.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                }else{
                    editText1.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
            }
        });


    }
}
