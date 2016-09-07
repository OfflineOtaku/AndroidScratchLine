package li.readme.android.scratch.lifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import li.readme.android.scratch.R;

public class MainActivity extends BaseActivity {
  private static final String TAG = "MainActivity";

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    TextView helloWorld = (TextView) findViewById(R.id.hello_world);
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
}
