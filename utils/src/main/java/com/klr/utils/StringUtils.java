package com.klr.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * describe
 *
 * @author konglingrong data   19:56
 **/
public class StringUtils {

  public static StringUtils getInstance() {
    return new StringUtils();
  }
  public void toast(Context context,String string) {
    Toast.makeText(context, string, Toast.LENGTH_LONG).show();
  }
}
