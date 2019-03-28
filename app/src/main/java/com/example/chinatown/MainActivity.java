package com.example.chinatown;



import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.content.*;
import android.content.ClipboardManager;
import android.graphics.*;
import android.media.*;
import android.net.*;
import android.text.*;
import android.util.*;
import android.webkit.*;
import android.animation.*;
import android.view.animation.*;
import java.util.*;
import java.text.*;



public class MainActivity extends Activity {

    private LinearLayout linear41;
    private LinearLayout linear53;
    private LinearLayout linear52;
    private ScrollView vscroll8;
    private TextView textview15;
    private Button button5;
    private TextView textview12;
    private TextView textview13;
    private TextView textview14;
    private LinearLayout linear49;
    private LinearLayout linear42;
    private LinearLayout linear43;
    private CheckBox c1;
    private CheckBox c2;
    private CheckBox c3;
    private CheckBox c4;
    private CheckBox c5;
    private CheckBox c6;
    private CheckBox c7;
    private CheckBox c8;
    private CheckBox c9;
    private CheckBox c10;
    private CheckBox c11;
    private CheckBox c12;
    private CheckBox c13;
    private CheckBox c14;
    private CheckBox c15;
    private CheckBox c16;
    private CheckBox c17;
    private CheckBox c18;
    private CheckBox c19;
    private CheckBox c20;
    private EditText e1;
    private EditText e2;
    private EditText e3;
    private EditText e4;
    private EditText e5;
    private EditText e6;
    private EditText e7;
    private EditText e8;
    private EditText e9;
    private EditText e10;
    private EditText e11;
    private EditText e12;
    private EditText e13;
    private EditText e14;
    private EditText e15;
    private EditText e16;
    private EditText e17;
    private EditText e18;
    private EditText e19;
    private EditText e20;

    private double total = 0;

    private ArrayList<String> itm = new ArrayList<String>();
    private ArrayList<String> itn = new ArrayList<String>();

    private Intent i = new Intent();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
        initializeLogic();
    }

    private void  initialize() {
        linear41 = (LinearLayout) findViewById(R.id.linear41);
        linear53 = (LinearLayout) findViewById(R.id.linear53);
        linear52 = (LinearLayout) findViewById(R.id.linear52);
        vscroll8 = (ScrollView) findViewById(R.id.vscroll8);
        textview15 = (TextView) findViewById(R.id.textview15);
        button5 = (Button) findViewById(R.id.button5);
        textview12 = (TextView) findViewById(R.id.textview12);
        textview13 = (TextView) findViewById(R.id.textview13);
        textview14 = (TextView) findViewById(R.id.textview14);
        linear49 = (LinearLayout) findViewById(R.id.linear49);
        linear42 = (LinearLayout) findViewById(R.id.linear42);
        linear43 = (LinearLayout) findViewById(R.id.linear43);
        c1 = (CheckBox) findViewById(R.id.c1);
        c2 = (CheckBox) findViewById(R.id.c2);
        c3 = (CheckBox) findViewById(R.id.c3);
        c4 = (CheckBox) findViewById(R.id.c4);
        c5 = (CheckBox) findViewById(R.id.c5);
        c6 = (CheckBox) findViewById(R.id.c6);
        c7 = (CheckBox) findViewById(R.id.c7);
        c8 = (CheckBox) findViewById(R.id.c8);
        c9 = (CheckBox) findViewById(R.id.c9);
        c10 = (CheckBox) findViewById(R.id.c10);
        c11 = (CheckBox) findViewById(R.id.c11);
        c12 = (CheckBox) findViewById(R.id.c12);
        c13 = (CheckBox) findViewById(R.id.c13);
        c14 = (CheckBox) findViewById(R.id.c14);
        c15 = (CheckBox) findViewById(R.id.c15);
        c16 = (CheckBox) findViewById(R.id.c16);
        c17 = (CheckBox) findViewById(R.id.c17);
        c18 = (CheckBox) findViewById(R.id.c18);
        c19 = (CheckBox) findViewById(R.id.c19);
        c20 = (CheckBox) findViewById(R.id.c20);
        e1 = (EditText) findViewById(R.id.e1);
        e2 = (EditText) findViewById(R.id.e2);
        e3 = (EditText) findViewById(R.id.e3);
        e4 = (EditText) findViewById(R.id.e4);
        e5 = (EditText) findViewById(R.id.e5);
        e6 = (EditText) findViewById(R.id.e6);
        e7 = (EditText) findViewById(R.id.e7);
        e8 = (EditText) findViewById(R.id.e8);
        e9 = (EditText) findViewById(R.id.e9);
        e10 = (EditText) findViewById(R.id.e10);
        e11 = (EditText) findViewById(R.id.e11);
        e12 = (EditText) findViewById(R.id.e12);
        e13 = (EditText) findViewById(R.id.e13);
        e14 = (EditText) findViewById(R.id.e14);
        e15 = (EditText) findViewById(R.id.e15);
        e16 = (EditText) findViewById(R.id.e16);
        e17 = (EditText) findViewById(R.id.e17);
        e18 = (EditText) findViewById(R.id.e18);
        e19 = (EditText) findViewById(R.id.e19);
        e20 = (EditText) findViewById(R.id.e20);



        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                total = (Double.parseDouble(e1.getText().toString()) * 20) + ((Double.parseDouble(e2.getText().toString()) * 30) + ((Double.parseDouble(e3.getText().toString()) * 30) + ((Double.parseDouble(e4.getText().toString()) * 40) + ((Double.parseDouble(e5.getText().toString()) * 70) + ((Double.parseDouble(e6.getText().toString()) * 90) + ((Double.parseDouble(e7.getText().toString()) * 120) + ((Double.parseDouble(e8.getText().toString()) * 60) + ((Double.parseDouble(e9.getText().toString()) * 80) + ((Double.parseDouble(e10.getText().toString()) * 110) + ((Double.parseDouble(e11.getText().toString()) * 120) + ((Double.parseDouble(e12.getText().toString()) * 110) + ((Double.parseDouble(e13.getText().toString()) * 30) + ((Double.parseDouble(e14.getText().toString()) * 20) + ((Double.parseDouble(e15.getText().toString()) * 40) + ((Double.parseDouble(e16.getText().toString()) * 60) + ((Double.parseDouble(e17.getText().toString()) * 80) + ((Double.parseDouble(e18.getText().toString()) * 20) + ((Double.parseDouble(e19.getText().toString()) * 25) + (Double.parseDouble(e20.getText().toString()) * 150)))))))))))))))))));
                i.putExtra(c1.getText().toString(), e1.getText().toString());
                i.putExtra(c2.getText().toString(), e2.getText().toString());
                i.putExtra(c3.getText().toString(), e3.getText().toString());
                i.putExtra(c4.getText().toString(), e4.getText().toString());
                i.putExtra(c5.getText().toString(), e5.getText().toString());
                i.putExtra(c6.getText().toString(), e6.getText().toString());
                i.putExtra(c7.getText().toString(), e7.getText().toString());
                i.putExtra(c8.getText().toString(), e8.getText().toString());
                i.putExtra(c9.getText().toString(), e9.getText().toString());
                i.putExtra(c10.getText().toString(), e10.getText().toString());
                i.putExtra(c11.getText().toString(), e11.getText().toString());
                i.putExtra(c12.getText().toString(), e12.getText().toString());
                i.putExtra(c13.getText().toString(), e13.getText().toString());
                i.putExtra(c14.getText().toString(), e14.getText().toString());
                i.putExtra(c15.getText().toString(), e15.getText().toString());
                i.putExtra(c16.getText().toString(), e16.getText().toString());
                i.putExtra(c17.getText().toString(), e17.getText().toString());
                i.putExtra(c18.getText().toString(), e18.getText().toString());
                i.putExtra(c19.getText().toString(), e19.getText().toString());
                i.putExtra(c20.getText().toString(), e20.getText().toString());
                i.putExtra("1", String.valueOf((long)(total)));
                startActivity(i);
            }
        });
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (c1.isChecked()) {
                    e1.setEnabled(true);
                }
                else {
                    if (!(Double.parseDouble(e1.getText().toString()) == 0)) {
                        e1.setText("0");
                        e1.setEnabled(false);
                    }
                    else {
                        e1.setEnabled(false);
                    }
                }
            }
        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (c2.isChecked()) {
                    e2.setEnabled(true);
                }
                else {
                    if (!(Double.parseDouble(e2.getText().toString()) == 0)) {
                        e2.setText("0");
                        e2.setEnabled(false);
                    }
                    else {
                        e2.setEnabled(false);
                    }
                }
            }
        });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (c3.isChecked()) {
                    e3.setEnabled(true);
                }
                else {
                    if (!(Double.parseDouble(e3.getText().toString()) == 0)) {
                        e3.setText("0");
                        e3.setEnabled(false);
                    }
                    else {
                        e3.setEnabled(false);
                    }
                }
            }
        });
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (c4.isChecked()) {
                    e4.setEnabled(true);
                }
                else {
                    if (!(Double.parseDouble(e4.getText().toString()) == 0)) {
                        e4.setText("0");
                        e4.setEnabled(false);
                    }
                    else {
                        e4.setEnabled(false);
                    }
                }
            }
        });
        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (c5.isChecked()) {
                    e5.setEnabled(true);
                }
                else {
                    if (!(Double.parseDouble(e5.getText().toString()) == 0)) {
                        e5.setText("0");
                        e5.setEnabled(false);
                    }
                    else {
                        e5.setEnabled(false);
                    }
                }
            }
        });
        c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (c6.isChecked()) {
                    e6.setEnabled(true);
                }
                else {
                    if (!(Double.parseDouble(e6.getText().toString()) == 0)) {
                        e6.setText("0");
                        e6.setEnabled(false);
                    }
                    else {
                        e6.setEnabled(false);
                    }
                }
            }
        });
        c7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (c7.isChecked()) {
                    e7.setEnabled(true);
                }
                else {
                    if (!(Double.parseDouble(e7.getText().toString()) == 0)) {
                        e7.setText("0");
                        e7.setEnabled(false);
                    }
                    else {
                        e7.setEnabled(false);
                    }
                }
            }
        });
        c8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (c8.isChecked()) {
                    e8.setEnabled(true);
                }
                else {
                    if (!(Double.parseDouble(e8.getText().toString()) == 0)) {
                        e8.setText("0");
                        e8.setEnabled(false);
                    }
                    else {
                        e8.setEnabled(false);
                    }
                }
            }
        });
        c9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (c9.isChecked()) {
                    e9.setEnabled(true);
                }
                else {
                    if (!(Double.parseDouble(e9.getText().toString()) == 0)) {
                        e9.setText("0");
                        e9.setEnabled(false);
                    }
                    else {
                        e9.setEnabled(false);
                    }
                }
            }
        });
        c10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (c10.isChecked()) {
                    e10.setEnabled(true);
                }
                else {
                    if (!(Double.parseDouble(e10.getText().toString()) == 0)) {
                        e10.setText("0");
                        e10.setEnabled(false);
                    }
                    else {
                        e10.setEnabled(false);
                    }
                }
            }
        });
        c11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (c11.isChecked()) {
                    e11.setEnabled(true);
                }
                else {
                    if (!(Double.parseDouble(e11.getText().toString()) == 0)) {
                        e11.setText("0");
                        e11.setEnabled(false);
                    }
                    else {
                        e11.setEnabled(false);
                    }
                }
            }
        });
        c12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (c12.isChecked()) {
                    e12.setEnabled(true);
                }
                else {
                    if (!(Double.parseDouble(e12.getText().toString()) == 0)) {
                        e12.setText("0");
                        e12.setEnabled(false);
                    }
                    else {
                        e12.setEnabled(false);
                    }
                }
            }
        });
        c13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (c13.isChecked()) {
                    e13.setEnabled(true);
                }
                else {
                    if (!(Double.parseDouble(e13.getText().toString()) == 0)) {
                        e13.setText("0");
                        e13.setEnabled(false);
                    }
                    else {
                        e13.setEnabled(false);
                    }
                }
            }
        });
        c14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (c14.isChecked()) {
                    e14.setEnabled(true);
                }
                else {
                    if (!(Double.parseDouble(e14.getText().toString()) == 0)) {
                        e14.setText("0");
                        e14.setEnabled(false);
                    }
                    else {
                        e14.setEnabled(false);
                    }
                }
            }
        });
        c15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (c15.isChecked()) {
                    e15.setEnabled(true);
                }
                else {
                    if (!(Double.parseDouble(e15.getText().toString()) == 0)) {
                        e15.setText("0");
                        e15.setEnabled(false);
                    }
                    else {
                        e15.setEnabled(false);
                    }
                }
            }
        });
        c16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (c16.isChecked()) {
                    e16.setEnabled(true);
                }
                else {
                    if (!(Double.parseDouble(e16.getText().toString()) == 0)) {
                        e16.setText("0");
                        e16.setEnabled(false);
                    }
                    else {
                        e16.setEnabled(false);
                    }
                }
            }
        });
        c17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (c17.isChecked()) {
                    e17.setEnabled(true);
                }
                else {
                    if (!(Double.parseDouble(e17.getText().toString()) == 0)) {
                        e17.setText("0");
                        e17.setEnabled(false);
                    }
                    else {
                        e17.setEnabled(false);
                    }
                }
            }
        });
        c18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (c18.isChecked()) {
                    e18.setEnabled(true);
                }
                else {
                    if (!(Double.parseDouble(e18.getText().toString()) == 0)) {
                        e18.setText("0");
                        e18.setEnabled(false);
                    }
                    else {
                        e18.setEnabled(false);
                    }
                }
            }
        });
        c19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (c19.isChecked()) {
                    e19.setEnabled(true);
                }
                else {
                    if (!(Double.parseDouble(e19.getText().toString()) == 0)) {
                        e19.setText("0");
                        e19.setEnabled(false);
                    }
                    else {
                        e19.setEnabled(false);
                    }
                }
            }
        });
        c20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (c20.isChecked()) {
                    e20.setEnabled(true);
                }
                else {
                    if (!(Double.parseDouble(e20.getText().toString()) == 0)) {
                        e20.setText("0");
                        e20.setEnabled(false);
                    }
                    else {
                        e20.setEnabled(false);
                    }
                }
            }
        });

    }

    private void  initializeLogic() {
        total = 0;
        if (!c1.isChecked()) {
            e1.setEnabled(false);
        }
        if (!c2.isChecked()) {
            e2.setEnabled(false);
        }
        if (!c3.isChecked()) {
            e3.setEnabled(false);
        }
        if (!c4.isChecked()) {
            e4.setEnabled(false);
        }
        if (!c5.isChecked()) {
            e5.setEnabled(false);
        }
        if (!c6.isChecked()) {
            e6.setEnabled(false);
        }
        if (!c7.isChecked()) {
            e7.setEnabled(false);
        }
        if (!c8.isChecked()) {
            e8.setEnabled(false);
        }
        if (!c9.isChecked()) {
            e9.setEnabled(false);
        }
        if (!c10.isChecked()) {
            e10.setEnabled(false);
        }
        if (!c11.isChecked()) {
            e11.setEnabled(false);
        }
        if (!c12.isChecked()) {
            e12.setEnabled(false);
        }
        if (!c13.isChecked()) {
            e13.setEnabled(false);
        }
        if (!c14.isChecked()) {
            e14.setEnabled(false);
        }
        if (!c15.isChecked()) {
            e15.setEnabled(false);
        }
        if (!c16.isChecked()) {
            e16.setEnabled(false);
        }
        if (!c17.isChecked()) {
            e17.setEnabled(false);
        }
        if (!c18.isChecked()) {
            e18.setEnabled(false);
        }
        if (!c19.isChecked()) {
            e19.setEnabled(false);
        }
        if (!c20.isChecked()) {
            e20.setEnabled(false);
        }
        i.setClass(getApplicationContext(), OrdsumActivity.class);
    }






    // created automatically
    private void showMessage(String _s) {
        Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
    }

    private int getRandom(int _minValue ,int _maxValue){
        Random random = new Random();
        return random.nextInt(_maxValue - _minValue + 1) + _minValue;
    }

    public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
        ArrayList<Double> _result = new ArrayList<Double>();
        SparseBooleanArray _arr = _list.getCheckedItemPositions();
        for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
            if (_arr.valueAt(_iIdx))
                _result.add((double)_arr.keyAt(_iIdx));
        }
        return _result;
    }

    private float getDip(int _input){
        return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
    }

    private int getDisplayWidthPixels(){
        return getResources().getDisplayMetrics().widthPixels;
    }

    private int getDisplayHeightPixels(){
        return getResources().getDisplayMetrics().heightPixels;
    }


}
