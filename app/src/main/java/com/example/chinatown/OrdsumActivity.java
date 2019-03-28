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



public class OrdsumActivity extends Activity {

    private LinearLayout linear4;
    private LinearLayout linear3;
    private TextView textview2;
    private LinearLayout linear9;
    private ListView listview6;
    private LinearLayout linear17;
    private LinearLayout linear13;
    private Button send;
    private TextView textview3;
    private TextView textview4;
    private TextView textview9;
    private TextView textview10;
    private LinearLayout linear12;
    private LinearLayout linear14;
    private LinearLayout linear15;
    private LinearLayout linear16;
    private LinearLayout signiew;
    private EditText edittext1;
    private EditText edittext2;
    private Button login;
    private TextView textview6;
    private TextView textview7;
    private Button signup;
    private EditText name;
    private EditText pass;
    private EditText mob;
    private EditText add;
    private Button go;
    private TextView textview8;
    Random rand=new Random();


    String date = new SimpleDateFormat("ddMMyy",Locale.getDefault()).format(new Date());

    private String mm = "";
    private double count = 0;
    private int bn=0;

    private ArrayList<String> ct = new ArrayList<String>();
    private ArrayList<String> ct1 = new ArrayList<String>();
    private ArrayList<HashMap<String, String>> m = new ArrayList<>();
    private ArrayList<HashMap<String, String>> n = new ArrayList<>();

    private Intent i = new Intent();
    private SharedPreferences user;
    private SharedPreferences data;
    private SharedPreferences data2;
    private SharedPreferences bnn;
    private AlertDialog.Builder Sens;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ordsum);
        initialize();
        initializeLogic();
    }

    private void  initialize() {
        linear4 = (LinearLayout) findViewById(R.id.linear4);
        linear3 = (LinearLayout) findViewById(R.id.linear3);
        textview2 = (TextView) findViewById(R.id.textview2);
        linear9 = (LinearLayout) findViewById(R.id.uyu);
        listview6 = (ListView) findViewById(R.id.listview6);
        linear17 = (LinearLayout) findViewById(R.id.linear17);
        linear13 = (LinearLayout) findViewById(R.id.linear13);
        send = (Button) findViewById(R.id.send);
        textview3 = (TextView) findViewById(R.id.textview3);
        textview4 = (TextView) findViewById(R.id.textview4);
        textview9 = (TextView) findViewById(R.id.textview9);
        textview10 = (TextView) findViewById(R.id.textview10);
        linear12 = (LinearLayout) findViewById(R.id.linear12);
        linear14 = (LinearLayout) findViewById(R.id.linear14);
        linear15 = (LinearLayout) findViewById(R.id.linear15);
        linear16 = (LinearLayout) findViewById(R.id.linear16);
        signiew = (LinearLayout) findViewById(R.id.signiew);
        edittext1 = (EditText) findViewById(R.id.edittext1);
        edittext2 = (EditText) findViewById(R.id.edittext2);
        login = (Button) findViewById(R.id.login);
        textview6 = (TextView) findViewById(R.id.textview6);
        textview7 = (TextView) findViewById(R.id.textview7);
        signup = (Button) findViewById(R.id.signup);
        name = (EditText) findViewById(R.id.name);
        pass = (EditText) findViewById(R.id.pass);
        mob = (EditText) findViewById(R.id.mob);
        add = (EditText) findViewById(R.id.add);
        go = (Button) findViewById(R.id.go);
        textview8=(TextView)findViewById((R.id.textview8));


        user = getSharedPreferences("user", Activity.MODE_PRIVATE);
        data = getSharedPreferences("data", Activity.MODE_PRIVATE);
        data2 = getSharedPreferences("data2", Activity.MODE_PRIVATE);
        Sens = new AlertDialog.Builder(this);

        bnn=getSharedPreferences("bn",Activity.MODE_PRIVATE);
        if(!bnn.contains("bn"))bnn.edit().putInt("bn",0);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (!edittext1.getText().toString().equals("") && !edittext2.getText().toString().equals("")) {
                    if (edittext1.getText().toString().equals(user.getString(edittext2.getText().toString(), ""))) {
                        textview6.setText(data.getString(edittext1.getText().toString(), ""));
                        textview7.setText(data2.getString(textview6.getText().toString(), ""));
                        showMessage("Yay !!");
                        count++;
                        textview8.setText("Booking no:\n"+(char)edittext1.getText().charAt(0)+(char)edittext1.getText().charAt(1)+date+textview6.getText().charAt(0)+textview6.getText().charAt(textview6.getText().length()-1)+rand.nextInt());

                    }
                    else {
                        showMessage("signup");
                    }
                }
                else {
                    showMessage("fill all");
                }
            }
        });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                signiew.setVisibility(View.VISIBLE);
            }
        });
        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (!name.getText().toString().equals("") && !pass.getText().toString().equals("")) {
                    if (!name.getText().toString().equals(user.getString(pass.getText().toString(), ""))) {
                        user.edit().putString(pass.getText().toString(), name.getText().toString()).commit();
                        data.edit().putString(name.getText().toString(), mob.getText().toString()).commit();
                        data2.edit().putString(mob.getText().toString(), add.getText().toString()).commit();
                        signiew.setVisibility(View.INVISIBLE);
                        name.setText("");
                        pass.setText("");
                        mob.setText("");
                        add.setText("");
                    }
                    else {
                        showMessage("existing");
                    }
                }
                else {
                    showMessage("fill all");
                }
            }
        });
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (count > 0) {
                    Sens.create().show();
                    count = 0;
                }
                else {
                    showMessage("Log In first");

                }
            }
        });

    }

    private void  initializeLogic() {
        if (Double.parseDouble(getIntent().getStringExtra("Veg Momos__________________20/6")) > 0) {
            {
                HashMap<String, String> _item = new HashMap<String, String>();
                _item.put("item1", "Veg Momos__________________20/6");
                m.add(_item);
            }

            {
                HashMap<String, String> _item = new HashMap<String, String>();
                _item.put("item", getIntent().getStringExtra("Veg Momos__________________20/6"));
                n.add(_item);
            }

            ct.add("Veg Momos__________________20/6"+" * "+getIntent().getStringExtra("Veg Momos__________________20/6"));

        }
        if (Double.parseDouble(getIntent().getStringExtra("Paneer Momos_______________30/6")) > 0) {
            {
                HashMap<String, String> _item = new HashMap<String, String>();
                _item.put("item1", "Paneer Momos_______________30/6");
                m.add(_item);
            }

            {
                HashMap<String, String> _item = new HashMap<String, String>();
                _item.put("item", getIntent().getStringExtra("Paneer Momos_______________30/6"));
                n.add(_item);
            }

            ct.add("Paneer Momos_______________30/6"+" * "+getIntent().getStringExtra("Paneer Momos_______________30/6"));

        }
        if (Double.parseDouble(getIntent().getStringExtra("Fried Momos_________________30/6")) > 0) {
            {
                HashMap<String, String> _item = new HashMap<String, String>();
                _item.put("item1", "Fried Momos_________________30/6");
                m.add(_item);
            }

            {
                HashMap<String, String> _item = new HashMap<String, String>();
                _item.put("item", getIntent().getStringExtra("Fried Momos_________________30/6"));
                n.add(_item);
            }

            ct.add("Fried Momos_________________30/6"+" * "+getIntent().getStringExtra("Fried Momos_________________30/6"));

        }
        if (Double.parseDouble(getIntent().getStringExtra("Paneer Fried Momos_________40/6")) > 0) {
            {
                HashMap<String, String> _item = new HashMap<String, String>();
                _item.put("item1", "Paneer Fried Momos_________40/6");
                m.add(_item);
            }

            {
                HashMap<String, String> _item = new HashMap<String, String>();
                _item.put("item", getIntent().getStringExtra("Paneer Fried Momos_________40/6"));
                n.add(_item);
            }

            ct.add("Paneer Fried Momos_________40/6"+" * "+
                    getIntent().getStringExtra("Paneer Fried Momos_________40/6"));
        }
        if (Double.parseDouble(getIntent().getStringExtra("Veg Chowmein________________70/-")) > 0) {
            {
                HashMap<String, String> _item = new HashMap<String, String>();
                _item.put("item1", "Veg Chowmein________________70/-");
                m.add(_item);
            }

            {
                HashMap<String, String> _item = new HashMap<String, String>();
                _item.put("item", getIntent().getStringExtra("Veg Chowmein________________70/-"));
                n.add(_item);
            }

            ct.add("Veg Chowmein________________70/-"+" * "+
                    getIntent().getStringExtra("Veg Chowmein________________70/-"));
        }
        if (Double.parseDouble(getIntent().getStringExtra("Paneer Chowmein_____________90/-")) > 0) {
            {
                HashMap<String, String> _item = new HashMap<String, String>();
                _item.put("item1", "Paneer Chowmein_____________90/-");
                m.add(_item);
            }

            {
                HashMap<String, String> _item = new HashMap<String, String>();
                _item.put("item", getIntent().getStringExtra("Paneer Chowmein_____________90/-"));
                n.add(_item);
            }

            ct.add("Paneer Chowmein_____________90/-"+" * "+
                    getIntent().getStringExtra("Paneer Chowmein_____________90/-"));
        }
        if (Double.parseDouble(getIntent().getStringExtra("Chik'n Chowmein____________120/-")) > 0) {
            {
                HashMap<String, String> _item = new HashMap<String, String>();
                _item.put("item1", "Chik'n Chowmein____________120/-");
                m.add(_item);
            }

            {
                HashMap<String, String> _item = new HashMap<String, String>();
                _item.put("item", getIntent().getStringExtra("Chik'n Chowmein____________120/-"));
                n.add(_item);
            }

            ct.add("Chik'n Chowmein____________120/-"+" * "+
                    getIntent().getStringExtra("Chik'n Chowmein____________120/-"));
        }
        if (Double.parseDouble(getIntent().getStringExtra("Veg Noodles__________________60/-")) > 0) {
            {
                HashMap<String, String> _item = new HashMap<String, String>();
                _item.put("item1", "Veg Noodles__________________60/-");
                m.add(_item);
            }

            {
                HashMap<String, String> _item = new HashMap<String, String>();
                _item.put("item", getIntent().getStringExtra("Veg Noodles__________________60/-"));
                n.add(_item);
            }

            ct.add("Veg Noodles__________________60/-"+" * "+
                    getIntent().getStringExtra("Veg Noodles__________________60/-"));
        }
        if (Double.parseDouble(getIntent().getStringExtra("Paneer Noodles_______________80/-")) > 0) {
            {
                HashMap<String, String> _item = new HashMap<String, String>();
                _item.put("item1", "Paneer Noodles_______________80/-");
                m.add(_item);
            }

            {
                HashMap<String, String> _item = new HashMap<String, String>();
                _item.put("item", getIntent().getStringExtra("Paneer Noodles_______________80/-"));
                n.add(_item);
            }

            ct.add("Paneer Noodles_______________80/-"+" * "+
                    getIntent().getStringExtra("Paneer Noodles_______________80/-"));
        }
        if (Double.parseDouble(getIntent().getStringExtra("Chik'nNoodles_______________110/-")) > 0) {
            {
                HashMap<String, String> _item = new HashMap<String, String>();
                _item.put("item1", "Chik'nNoodles_______________110/-");
                m.add(_item);
            }

            {
                HashMap<String, String> _item = new HashMap<String, String>();
                _item.put("item", getIntent().getStringExtra("Chik'nNoodles_______________110/-"));
                n.add(_item);
            }

            ct.add("Chik'nNoodles_______________110/-"+" * "+
                    getIntent().getStringExtra("Chik'nNoodles_______________110/-"));
        }
        if (Double.parseDouble(getIntent().getStringExtra("Hakka Noodles______________120/-")) > 0) {
            {
                HashMap<String, String> _item = new HashMap<String, String>();
                _item.put("item1", "Hakka Noodles______________120/-");
                m.add(_item);
            }

            {
                HashMap<String, String> _item = new HashMap<String, String>();
                _item.put("item", getIntent().getStringExtra("Hakka Noodles______________120/-"));
                n.add(_item);
            }

            ct.add("Hakka Noodles______________120/-"+" * "+
                    getIntent().getStringExtra("Hakka Noodles______________120/-"));
        }
        if (Double.parseDouble(getIntent().getStringExtra("Pan Fried Noodles___________110/-")) > 0) {
            {
                HashMap<String, String> _item = new HashMap<String, String>();
                _item.put("item1", "Pan Fried Noodles___________110/-");
                m.add(_item);
            }

            {
                HashMap<String, String> _item = new HashMap<String, String>();
                _item.put("item", getIntent().getStringExtra("Pan Fried Noodles___________110/-"));
                n.add(_item);
            }

            ct.add("Pan Fried Noodles___________110/-"+" * "+
                    getIntent().getStringExtra("Pan Fried Noodles___________110/-"));
        }
        if (Double.parseDouble(getIntent().getStringExtra("SpringRoll____________________30/-")) > 0) {
            {
                HashMap<String, String> _item = new HashMap<String, String>();
                _item.put("item1", "SpringRoll____________________30/-");
                m.add(_item);
            }

            {
                HashMap<String, String> _item = new HashMap<String, String>();
                _item.put("item", getIntent().getStringExtra("SpringRoll____________________30/-"));
                n.add(_item);
            }

            ct.add("SpringRoll____________________30/-"+" * "+
                    getIntent().getStringExtra("SpringRoll____________________30/-"));
        }
        if (Double.parseDouble(getIntent().getStringExtra("Burger(small)_________________20/-")) > 0) {
            {
                HashMap<String, String> _item = new HashMap<String, String>();
                _item.put("item1", "Burger(small)_________________20/-");
                m.add(_item);
            }

            {
                HashMap<String, String> _item = new HashMap<String, String>();
                _item.put("item", getIntent().getStringExtra("Burger(small)_________________20/-"));
                n.add(_item);
            }

            ct.add("Burger(small)_________________20/-"+" * "+
                    getIntent().getStringExtra("Burger(small)_________________20/-"));
        }
        if (Double.parseDouble(getIntent().getStringExtra("Burger (medium)______________40/-")) > 0) {
            {
                HashMap<String, String> _item = new HashMap<String, String>();
                _item.put("item1", "Burger (medium)______________40/-");
                m.add(_item);
            }

            {
                HashMap<String, String> _item = new HashMap<String, String>();
                _item.put("item", getIntent().getStringExtra("Burger (medium)______________40/-"));
                n.add(_item);
            }
            //by Appy

            ct.add("Burger (medium)______________40/-"+" * "+
                    getIntent().getStringExtra("Burger (medium)______________40/-"));
        }
        if (Double.parseDouble(getIntent().getStringExtra("Burger (large)_________________60/-")) > 0) {
            {
                HashMap<String, String> _item = new HashMap<String, String>();
                _item.put("item1", "Burger (large)_________________60/-");
                m.add(_item);
            }

            {
                HashMap<String, String> _item = new HashMap<String, String>();
                _item.put("item", getIntent().getStringExtra("Burger (large)_________________60/-"));
                n.add(_item);
            }

            ct.add("Burger (large)_________________60/-"+" * "+
                    getIntent().getStringExtra("Burger (large)_________________60/-"));
        }
        if (Double.parseDouble(getIntent().getStringExtra("Burger(XL)____________________80/-")) > 0) {
            {
                HashMap<String, String> _item = new HashMap<String, String>();
                _item.put("item1", "Burger(XL)____________________80/-");
                m.add(_item);
            }

            {
                HashMap<String, String> _item = new HashMap<String, String>();
                _item.put("item", getIntent().getStringExtra("Burger(XL)____________________80/-"));
                n.add(_item);
            }

            ct.add("Burger(XL)____________________80/-"+" * "+
                    getIntent().getStringExtra("Burger(XL)____________________80/-"));
        }
        if (Double.parseDouble(getIntent().getStringExtra("Maggi________________________20/-")) > 0) {
            {
                HashMap<String, String> _item = new HashMap<String, String>();
                _item.put("item1", "Maggi________________________20/-");
                m.add(_item);
            }

            {
                HashMap<String, String> _item = new HashMap<String, String>();
                _item.put("item", getIntent().getStringExtra("Maggi________________________20/-"));
                n.add(_item);
            }

            ct.add("Maggi________________________20/-"+" * "+
                    getIntent().getStringExtra("Maggi________________________20/-"));
        }
        if (Double.parseDouble(getIntent().getStringExtra("Vegetable Maggi______________25/-")) > 0) {
            {
                HashMap<String, String> _item = new HashMap<String, String>();
                _item.put("item1", "Vegetable Maggi______________25/-");
                m.add(_item);
            }

            {
                HashMap<String, String> _item = new HashMap<String, String>();
                _item.put("item", getIntent().getStringExtra("Vegetable Maggi______________25/-"));
                n.add(_item);
            }

            ct.add("Vegetable Maggi______________25/-"+" * "+
                    getIntent().getStringExtra("Vegetable Maggi______________25/-"));
        }
        if (Double.parseDouble(getIntent().getStringExtra("SPECIAL____________________150/-")) > 0) {
            {
                HashMap<String, String> _item = new HashMap<String, String>();
                _item.put("item1", "SPECIAL____________________150/-");
                m.add(_item);
            }

            {
                HashMap<String, String> _item = new HashMap<String, String>();
                _item.put("item", getIntent().getStringExtra("SPECIAL____________________150/-"));
                n.add(_item);
            }

            ct.add("SPECIAL____________________150/-"+" * "+
                    getIntent().getStringExtra("SPECIAL____________________150/-"));
        }
        listview6.setAdapter(new Listview6Adapter(m));
        ((BaseAdapter)listview6.getAdapter()).notifyDataSetChanged();
        signiew.setVisibility(View.INVISIBLE);
        textview10.setText(getIntent().getStringExtra("1"));
        //by Apoorv Mishra
        CharSequence s=edittext1.getText();
        CharSequence s1=textview6.getText();

        Sens.setTitle("Send");
        Sens.setMessage("\nChoose a mode of order");
        Sens.setPositiveButton("Text Message", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface _dialog, int _which) {
                StringBuilder sb = new StringBuilder();
                for (String s : ct) {
                    sb.append(s);
                    sb.append("\n");
                }
                Uri uri = Uri.parse("smsto:7599900388");
                Intent it = new Intent(Intent.ACTION_SENDTO, uri);
                it.putExtra("sms_body", sb.toString()+"\nName:"+edittext1.getText()+"\nMobile:"+textview6.getText()+"\nAddress:"+textview7.getText()+"\n"+textview8.getText());

                startActivity(it);

            }
        });
        Sens.setNegativeButton("Email", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface _dialog, int _which) {
                String [] m={"apoorvmishra05@gmail.com"};
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setData(Uri.parse("mailto:"));
                intent.setType("*/*");
                intent.putExtra(Intent.EXTRA_EMAIL,m);
                StringBuilder sb = new StringBuilder();
                for (String s : ct) {
                    sb.append(s);
                    sb.append("\n");
                }


                intent.putExtra(Intent.EXTRA_TEXT, sb.toString()+"\nName:"+edittext1.getText()+"\nMobile:"+textview6.getText()+"\nAddress:"+textview7.getText()+"\n"+textview8.getText());

                if(intent.resolveActivity(getPackageManager())!=null){
                    startActivity(intent);


                }}
        });
    }




    public class Listview6Adapter extends BaseAdapter {		ArrayList<HashMap<String, String>> _data;
        public Listview6Adapter(ArrayList<HashMap<String, String>> _arr) {
            _data = _arr;
        }

        @Override
        public int getCount() {
            return _data.size();
        }

        @Override
        public HashMap<String, String> getItem(int _i) {
            return _data.get(_i);
        }

        @Override
        public long getItemId(int _i) {
            return _i;
        }
        @Override
        public View getView(final int _position, View _view, ViewGroup _viewGroup) {
            LayoutInflater _inflater = (LayoutInflater)getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View _v = _view;
            if (_v == null) {
                _v = _inflater.inflate(R.layout.uyu, null);
            }
            final LinearLayout linear4 = (LinearLayout) _v.findViewById(R.id.linear4);
            final TextView textview3 = (TextView) _v.findViewById(R.id.textview3);
            final TextView textview4 = (TextView) _v.findViewById(R.id.textview4);

            textview4.setText(n.get((int)_position).get("item"));
            textview3.setText(m.get((int)_position).get("item1"));

            return _v;
        }
    }

    // created automatically by Andro.id
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
