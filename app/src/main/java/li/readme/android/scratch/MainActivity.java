package li.readme.android.scratch;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends BaseActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    TextView helloWorld = (TextView) findViewById(R.id.hello_world);
    helloWorld.setText(stringFromJNI());
    helloWorld.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        startActivity(new Intent(MainActivity.this, SubActivity.class));
      }
    });
    Button finishOnCreate = (Button) findViewById(R.id.finishOnCreate);
    finishOnCreate.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        startActivity(new Intent(MainActivity.this, SubActivity.class).putExtra(SubActivity.KEY_FINISH, SubActivity.FINISH_ONCREATE));
      }
    });
    Button finishOnStart = (Button) findViewById(R.id.finishOnStart);
    finishOnStart.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        startActivity(new Intent(MainActivity.this, SubActivity.class).putExtra(SubActivity.KEY_FINISH, SubActivity.FINISH_ONSTART));
      }
    });
    Button finishOnResume = (Button) findViewById(R.id.finishOnResume);
    finishOnResume.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        startActivity(new Intent(MainActivity.this, SubActivity.class).putExtra(SubActivity.KEY_FINISH, SubActivity.FINISH_ONRESUME));
      }
    });
  }

  /**
   * A native method that is implemented by the 'native-lib' native library,
   * which is packaged with this application.
   */
  public native String stringFromJNI();

  // Used to load the 'native-lib' library on application startup.
  static {
    System.loadLibrary("native-lib");
  }
}
