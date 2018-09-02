package com.arit.demo.demo01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tvMsg) TextView tvMsg;


 /*  private tvmsg  ok uu    */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);



//        final TextView tvMsg = findViewById(R.id.tvMsg);
//
//        Button btnHello = (Button) findViewById(R.id.btnHello);
//        btnHello.setText("Hello John");
//
//        btnHello.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                tvMsg.setText("Hi john this custom massage");
//            }
//        });
    }
  /*  public void onClickHello(View view){this.tvmsg.settexk}*/

  @OnClick(R.id.btnHello)
    public void doClickHell(){
      this.tvMsg.setText (getString(R.string.Himsg));
  }
}
