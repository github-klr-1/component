package com.klr.demo1;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.klr.utils.StringUtils;

/**
 * describe
 *
 * @author konglingrong data   19:52
 **/
public class Demo1Activity extends AppCompatActivity {

  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.demo1_activity_layout);
    findViewById(R.id.tv).setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View view) {
        StringUtils.getInstance().toast(Demo1Activity.this, "utils");
      }
    });
  }
}
